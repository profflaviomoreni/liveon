package br.com.fiap.live.models;

public class RiscoPesoModel {

	
	private int idRisco;
	private String nomeRisco;
	
	
	
	public RiscoPesoModel() {
		super();
	}

	public RiscoPesoModel(int idRisco, String nomeRisco) {
		super();
		this.idRisco = idRisco;
		this.nomeRisco = nomeRisco;
	}
	
	public int getIdRisco() {
		return idRisco;
	}
	public void setIdRisco(int idRisco) {
		this.idRisco = idRisco;
	}
	public String getNomeRisco() {
		return nomeRisco;
	}
	public void setNomeRisco(String nomeRisco) {
		this.nomeRisco = nomeRisco;
	}
	
	
	
}
