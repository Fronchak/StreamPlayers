package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

import model.entities.Jogador;
import model.services.InputPlayerComma;
import model.services.PlayerService;
import model.services.PrintService;

public class Program {

	public static void main(String[] args) {

		PlayerService playerService = new PlayerService(new InputPlayerComma());
		Path path = Paths.get("jogadores.txt");
		
		try(BufferedReader br = new BufferedReader(new FileReader("jogadores.txt"))) {
			
			Stream<String> lines = br.lines();
			List<Jogador> list = playerService.getListPlayer(lines);
			PrintService.printPlayer(list);
			PrintService.printPlayer(list,"Vasco");
			PrintService.printPlayer(list,"Corinthians",15);
			PrintService.printPlayerByTime(list);
			PrintService.printAverageAge(list);
			PrintService.printOldestPlayer(list);
			PrintService.printYoungestPlayer(list);
			PrintService.printPlayerWithMostGols(list);
			PrintService.printSumGols(list);
			PlayerService.groupByTeam(list);
			System.out.println(path.getFileName());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

	}

}
