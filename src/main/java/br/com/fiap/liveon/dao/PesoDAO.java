package br.com.fiap.liveon.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.fiap.live.models.PesoModel;
import br.com.fiap.liveon.controllers.pesousuario.PesoUsuarioEditarServlet;

public class PesoDAO {

	
	private static ConnectionManager connectionManager;
	
	
	public PesoDAO() {
		connectionManager = ConnectionManager.getInstance(); 
	}
	
	
	public boolean insert(PesoModel registro) throws SQLException {
		try {
			
			String sql = "INSERT INTO t_reg_peso (cd_registro, t_pessoa_cd_conta, nr_peso, nr_gordura, dt_registro) " +
						 " 	VALUES (SQ_REG_PESO.nextval, ?, ?, ?, ?)";
			
			PreparedStatement stmt = connectionManager.getConnection().prepareStatement(sql);
			stmt.setInt(1, registro.getIdPessoa());
			stmt.setDouble(2, registro.getPeso());
			stmt.setDouble(3, registro.getGorduraCorporal());
			stmt.setDate(4, new java.sql.Date(registro.getData().getTime()));
			
			return stmt.execute();
			
		} catch (SQLException e) {
			throw new SQLException("Erro no cadatro do peso. " + e);
		} finally {
			connectionManager.closeConnection();
		}
	}
	
	
	
	public PesoModel findById(int id) throws SQLException {
		PesoModel pesoModel;
		
		pesoModel = new PesoModel(1,2,71,12,15,new Date());
		pesoModel.setIdRisco(2);
		
		/*
		try {
			
			String sql = "SELECT cd_registro, t_pessoa_cd_conta,  nr_peso, nr_gordura, dt_registro FROM t_reg_peso WHERE cd_registro = ?";
			
			PreparedStatement stmt = connectionManager.getConnection().prepareStatement(sql);
			stmt.setInt(1, id);
			
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				
				pesoModel = new PesoModel();
				pesoModel.setIdPeso(rs.getInt("cd_registro"));
				pesoModel.setIdPessoa(rs.getInt("t_pessoa_cd_conta"));
				pesoModel.setData(rs.getDate("dt_registro"));
				pesoModel.setGorduraCorporal(rs.getDouble("nr_gordura"));
				pesoModel.setPeso(rs.getDouble("nr_peso"));
				
			} else {
				throw new SQLException("Nenhum registro de peso foi encontrado");
			}
			
			
		} catch (SQLException e) {
			throw new SQLException(e);
		} finally {
			connectionManager.closeConnection();
		}
		*/
		
		return pesoModel;
	}
	
	
	
	public List<PesoModel> getAllByPessoa(int idPessoa) throws SQLException {
		
		List<PesoModel> pesos = new ArrayList<>();
		pesos.add(new PesoModel(1,2,71,12,15,new Date()));
		pesos.add(new PesoModel(2,2,72,12,15,new Date()));
		pesos.add(new PesoModel(3,2,73,12,15,new Date()));
		pesos.add(new PesoModel(4,2,74,12,15,new Date()));
		pesos.add(new PesoModel(5,2,75,12,15,new Date()));
		
		/*
		try {
			
			String sql = "SELECT cd_registro, t_pessoa_cd_conta,  nr_peso, nr_gordura, dt_registro FROM t_reg_peso WHERE t_pessoa_cd_conta = ? ORDER BY dt_registro DESC";

			PreparedStatement stmt = connectionManager.getConnection().prepareStatement(sql);
			stmt.setInt(1, idPessoa);
			ResultSet rs = stmt.executeQuery();
			
			while (rs.next()) {
				PesoModel pesoModel = new PesoModel();
				pesoModel.setIdPeso(rs.getInt("cd_registro"));
				pesoModel.setIdPessoa(rs.getInt("t_pessoa_cd_conta"));
				pesoModel.setData(rs.getDate("dt_registro"));
				pesoModel.setGorduraCorporal(rs.getDouble("nr_gordura"));
				pesoModel.setPeso(rs.getDouble("nr_peso"));
				pesos.add(pesoModel);
			}
			
		} catch (SQLException e) {
			throw new SQLException(e);
		} finally {
			connectionManager.closeConnection();
		}
		*/
		
		return pesos;
		
	}
	
	
	public PesoModel getLastByPessoa(int idPessoa) throws SQLException {
		PesoModel pesoModel = new PesoModel();
		
		try {
			
			String sql = "SELECT cd_registro, t_pessoa_cd_conta,  nr_peso, nr_gordura, dt_registro FROM t_reg_peso WHERE t_pessoa_cd_conta = ? ORDER BY dt_registro DESC";

			PreparedStatement stmt = connectionManager.getConnection().prepareStatement(sql);
			stmt.setInt(1, idPessoa);
			ResultSet rs = stmt.executeQuery();
			
			if (rs.next()) {
				
				pesoModel.setIdPeso(rs.getInt("cd_registro"));
				pesoModel.setIdPessoa(rs.getInt("t_pessoa_cd_conta"));
				pesoModel.setData(rs.getDate("dt_registro"));
				pesoModel.setGorduraCorporal(rs.getDouble("nr_gordura"));
				pesoModel.setPeso(rs.getDouble("nr_peso"));
			}
			
		} catch (SQLException e) {
			throw new SQLException(e);
		} finally {
			connectionManager.closeConnection();
		}
		
		return pesoModel;
	}

	
	
}
