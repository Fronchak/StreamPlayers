package model.services;

import java.util.List;
import java.util.Map;
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
	
	public static Integer getSumGols(List<Jogador> list) {
		return list.stream().mapToInt(Jogador::getGolsMarcados).sum();
	}
	
	public static Map<String, List<Jogador>> groupByTeam(List<Jogador> list) {
		Map<String, List<Jogador>> map = list.stream().collect(Collectors.groupingBy(Jogador::getTimeAtual));
		//List<Jogador> list2 = 
		//System.out.println(map);
		map.get("Vasco").stream().forEach(System.out::println);
		return map;
	}
}
