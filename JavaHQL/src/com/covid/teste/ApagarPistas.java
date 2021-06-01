package com.covid.teste;

import java.util.Scanner;

import com.covid.entidade.Cartao;
import com.covid.repositorio.RepositorioCartao;

public class ApagarPistas {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RepositorioCartao repositorioCartao = new RepositorioCartao();
		System.out.println("Insira o ID da vitima para ser removida");
		Cartao cartao = repositorioCartao.obterPorId(in.nextInt());
		repositorioCartao.remover(cartao);
		in.close();
	}

}
