package model.services;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import model.entities.Jogador;

public class PlayerService {

	private InputPlayer inputPlayer;
	
	public PlayerService(InputPlayer inputPlayer) {
		this.inputPlayer = inputPlayer;
	}
	
	public List<Jogador> getListPlayer(Stream<String> stream) {
		return stream.map(inputPlayer::instantiatePlayer).collect(Collectors.toList());
	}
	
	public static Double getAverageAge(List<Jogador> list) {
		return list.stream().mapToInt(Jogador::getIdade).average().getAsDouble();
	}
}
