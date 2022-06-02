package br.com.fiap.liveon.controllers.pesousuario;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.live.models.PesoModel;
import br.com.fiap.liveon.dao.PesoDAO;

@WebServlet("/peso-usuario-listar")
public class PesoUsuarioListarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PesoDAO pesoDAO;
       
    public PesoUsuarioListarServlet() {
        super();
        pesoDAO = new PesoDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final int PESSOA_SELECIONADA = 2; // recuperar da sessao
		
		List<PesoModel> pesos;
		
		try {

			pesos = pesoDAO.getAllByPessoa(PESSOA_SELECIONADA);
			request.setAttribute("pesosUsuario", pesos);
			
			request.getRequestDispatcher("/peso-usuario/peso-usuario-listar.jsp")
					.forward(request, response);
			
		} catch (SQLException e) {
			request
				.getRequestDispatcher("/error/erro-geral.jsp")
				.forward(request, response);
		}
		
	}
	

}
