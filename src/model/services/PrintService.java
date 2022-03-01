package model.services;

import java.util.Comparator;
import java.util.List;

import model.entities.Jogador;

public class PrintService {

	public static void printPlayer(List<Jogador> list) {
		System.out.println();
		System.out.println("================ALL PLAYERS==================");
		list.stream().forEach(System.out::println);
	}
	
	public static void printPlayer(List<Jogador> list, String time) {
		System.out.println();
		System.out.println("================ALL PLAYERS FROM " + time + "=================");
		list.stream().filter(p -> p.getTimeAtual().equals(time)).forEach(System.out::println);
	}
	
	public static void printPlayer(List<Jogador> list, String time, Integer gols) {
		System.out.println();
		System.out.println("===========ALL PLAYERS FROM " + time + " WITH MORE THAN " + gols + " GOLS===============");
		list.stream().filter(p -> p.getTimeAtual().equals(time) && p.getGolsMarcados() > gols).forEach(System.out::println);
	}
	
	public static void printPlayerByTime(List<Jogador> list) {
		System.out.println();
		System.out.println("================ALL PLAYERS ORDEM BY TEAM==================");
		list.stream().sorted(Comparator.comparing(Jogador::getTimeAtual)).forEach(System.out::println);
	}
	
	public static void printAverageAge(List<Jogador> list) {
		System.out.println();
		System.out.println("================AVERAGE AGE==================");
		System.out.println(String.format("%.2f", PlayerService.getAverageAge(list)));
	}
	
	public static void printOldestPlayer(List<Jogador> list) {
		System.out.println();
		System.out.println("================OLDEST PLAYER==================");
		Jogador player = list.stream().max(Comparator.comparingInt(p -> p.getIdade())).get();
		System.out.println(player);
	}
	
	public static void printYoungestPlayer(List<Jogador> list) {
		System.out.println();
		System.out.println("================YOUGEST PLAYER==================");
		Jogador player = list.stream().min(Comparator.comparing(Jogador::getIdade)).get();
		System.out.println(player);
	}
	
	public static void printPlayerWithMostGols(List<Jogador> list) {
		System.out.println();
		System.out.println("================PLAYER WITH MOST GOLS==================");
		Jogador player = list.stream().max(Comparator.comparingInt(Jogador::getGolsMarcados)).get();
		System.out.println(player);
	}
	
	public static void printSumGols(List<Jogador> list) {
		System.out.println();
		System.out.println("================TOTAL GOLS==================");
		System.out.println(PlayerService.getSumGols(list) + " GOLS");
		int gols = list.stream().map(Jogador::getGolsMarcados).reduce(0, (x, y) -> x + y);
		System.out.println(gols + " GOLS");
	}
	
	
}
