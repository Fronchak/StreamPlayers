package model.services;

import model.entities.Jogador;

public class InputPlayerComma implements InputPlayer {

	@Override
	public Jogador instantiatePlayer(String info) {
		
		String[] aux = info.split(",");
		return new Jogador(aux[0], aux[1], getInt(aux[2]), aux[3], getInt(aux[4]));
		
	}
	
	private Integer getInt(String aux) {
		return Integer.parseInt(aux);
	}
	
}
