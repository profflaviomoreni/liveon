package br.com.fiap.liveon.controllers.pesousuario;

import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.live.models.PesoModel;
import br.com.fiap.liveon.dao.PesoDAO;

@WebServlet("/peso-usuario-editar")
public class PesoUsuarioEditarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private PesoDAO pesoDAO;
       
    public PesoUsuarioEditarServlet() {
        super();
        pesoDAO = new PesoDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int idPesoSelecionado = Integer.parseInt(request.getParameter("idPeso"));
		
		try {

			PesoModel peso = pesoDAO.findById(idPesoSelecionado);
			request.setAttribute("peso", peso);
			
			request.getRequestDispatcher("/peso-usuario/peso-usuario-editar.jsp")
					.forward(request, response);
			
		} catch (SQLException e) {
			request
				.getRequestDispatcher("/error/erro-geral.jsp")
				.forward(request, response);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		SimpleDateFormat dateFormatter = new SimpleDateFormat("dd/MM/yyyy");
		final int PESSOA_SELECIONADA = 2; // recuperar da sessao
		
		try {
			
			// Capturando os dados que o user preencheu na tela
			int idPeso = Integer.parseInt(request.getParameter("idPeso"));
			double peso = Double.parseDouble(request.getParameter("peso"));
			double imc = Double.parseDouble(request.getParameter("imc"));
			double gorduraCorporal = Double.parseDouble(request.getParameter("gorduraCorporal"));
			Date data = dateFormatter.parse(request.getParameter("data"));
			
			PesoModel pesoModel = new PesoModel(idPeso,PESSOA_SELECIONADA, peso, imc, gorduraCorporal, data);
					
			//pesoDAO.update(pesoModel);
			
			request.setAttribute("peso", pesoModel);
			
			request.getRequestDispatcher("/peso-usuario/peso-usuario-editar-sucesso.jsp")
				.forward(request, response);
			
			
		} catch (Exception e) {
			request
				.getRequestDispatcher("/error/erro-geral.jsp")
				.forward(request, response);
		}
		
	}
	
}
