package br.com.fiap.liveon.dao;

import java.util.ArrayList;
import java.util.List;

import br.com.fiap.live.models.RiscoPesoModel;

public class RiscoPesoDAO {

	public List<RiscoPesoModel> findAll(){
		
		List<RiscoPesoModel> riscos = new ArrayList<>();
		riscos.add( new RiscoPesoModel(1,"Baixo") );
		riscos.add( new RiscoPesoModel(2,"Medio") );
		riscos.add( new RiscoPesoModel(3,"Alto") );
		
		return riscos;
	}
	
}
