package br.com.fiap.liveon.controllers.cliente;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.live.models.ClienteModel;

@WebServlet("/cliente-novo")
public class ClienteNovoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ClienteNovoServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request
			.getRequestDispatcher("/cliente/cliente-novo.jsp")
			.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("nomeCliente");
		String email = request.getParameter("email");
		
		ClienteModel clienteModel = new ClienteModel();
		clienteModel.setNomeCliente(nome);
		clienteModel.setEmailCliente(email);
		
		//int codigoGerado = daoCliente.insert(clienteModel);
		System.out.println(" INSERT INTO CLIENTE VALUES " + nome + "," + email );
		
		
		clienteModel.setIdCliente(9879789); // Fake
		
		// Importante
		request.setAttribute("clienteModelAttr", clienteModel);
		
		request
			.getRequestDispatcher("/cliente/cliente-novo-sucesso.jsp")
			.forward(request, response);
		
	}

}
