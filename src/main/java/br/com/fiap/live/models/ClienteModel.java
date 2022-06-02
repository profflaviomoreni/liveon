package br.com.fiap.live.models;

public class ClienteModel {

	
	private int idCliente;
	private String nomeCliente;
	private String emailCliente;
	
	public ClienteModel() {
		super();
	}

	public ClienteModel(int idCliente, String nomeCliente, String emailCliente) {
		super();
		this.idCliente = idCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
	}

	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}



	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}
	
	
	
	
	
	
}
