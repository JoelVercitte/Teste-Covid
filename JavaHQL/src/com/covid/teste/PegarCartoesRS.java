package com.covid.teste;

import java.util.List;
import java.util.Scanner;

import com.covid.entidade.Cartao;
import com.covid.repositorio.RepositorioCartao;

public class PegarCartoesRS {
	public static void main(String[] args) {
		RepositorioCartao repositorioCartao = new RepositorioCartao();
		Scanner in = new Scanner(System.in);
		List<Cartao> cartoes = repositorioCartao.listarTodos();
		boolean continuar;
		do {
			System.out.println("Insira o valor minimo de saldo que deseja roubar hoje");
			
			double saldomin = in.nextDouble();
			
			for (Cartao cartao : cartoes) {
				if(cartao.getSaldo() >= saldomin) {
					System.out.println(cartao.toString());
				}
			}
			
			System.out.println(" ");
			System.out.println(" ");
			
			System.out.println("Deseja fazer uma nova consulta? True/False");
			continuar = in.nextBoolean();
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
			System.out.println(" ");
		}while(continuar);
		
		System.out.println("App fechou!!!");
		in.close();
	}
}
