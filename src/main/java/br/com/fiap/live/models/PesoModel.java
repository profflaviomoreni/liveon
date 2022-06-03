package br.com.fiap.live.models;

import java.util.Date;

public class PesoModel {

	private int idPeso;
	private int idPessoa;
	private double peso;
	private double imc;
	private double gorduraCorporal;
	private Date data;
	private int idRisco;
	
	
	public PesoModel() {
		super();
	}


	public PesoModel(int idPeso, int idPessoa, double peso, double imc, double gorduraCorporal, Date data) {
		super();
		this.idPeso = idPeso;
		this.idPessoa = idPessoa;
		this.peso = peso;
		this.imc = imc;
		this.gorduraCorporal = gorduraCorporal;
		this.data = data;
	}

	

	public PesoModel(int idPeso, int idPessoa, double peso, double imc, double gorduraCorporal, Date data,
			int idRisco) {
		super();
		this.idPeso = idPeso;
		this.idPessoa = idPessoa;
		this.peso = peso;
		this.imc = imc;
		this.gorduraCorporal = gorduraCorporal;
		this.data = data;
		this.idRisco = idRisco;
	}


	public int getIdPessoa() {
		return idPessoa;
	}


	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}


	public int getIdPeso() {
		return idPeso;
	}


	public void setIdPeso(int idPeso) {
		this.idPeso = idPeso;
	}


	public double getPeso() {
		return peso;
	}


	public void setPeso(double peso) {
		this.peso = peso;
	}


	public double getImc() {
		return imc;
	}


	public void setImc(double imc) {
		this.imc = imc;
	}


	public double getGorduraCorporal() {
		return gorduraCorporal;
	}


	public void setGorduraCorporal(double gorduraCorporal) {
		this.gorduraCorporal = gorduraCorporal;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public int getIdRisco() {
		return idRisco;
	}


	public void setIdRisco(int idRisco) {
		this.idRisco = idRisco;
	}


	@Override
	public String toString() {
		return "PesoModel [idPeso=" + idPeso + ", idPessoa=" + idPessoa + ", peso=" + peso + ", imc=" + imc
				+ ", gorduraCorporal=" + gorduraCorporal + ", data=" + data + "]";
	}
	
	
	
	
	
	
}
