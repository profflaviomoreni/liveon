package br.com.fiap.liveon.controllers.cliente;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fiap.live.models.ClienteModel;
import br.com.fiap.live.models.PesoModel;
import br.com.fiap.liveon.dao.PesoDAO;

@WebServlet("/cliente-listar")
public class ClienteListarServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ClienteListarServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//List cliente = daoCliente.findByAll();
		
		List<ClienteModel> clientes = new ArrayList<>();
		clientes.add( new ClienteModel(1,"Flavio","fmoreni@gmail.com") );
		clientes.add( new ClienteModel(2,"Pedro","fmoreni@gmail.com") );
		clientes.add( new ClienteModel(3,"Guilherme","fmoreni@gmail.com") );
		clientes.add( new ClienteModel(4,"Marco","fmoreni@gmail.com") );
		
		request.setAttribute("listaClientes", clientes);
		
		
		request
			.getRequestDispatcher("/cliente/cliente-listar.jsp")
			.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
