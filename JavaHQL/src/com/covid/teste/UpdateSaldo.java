package com.covid.teste;

import java.util.Scanner;

import com.covid.entidade.Cartao;
import com.covid.repositorio.RepositorioCartao;

public class UpdateSaldo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		RepositorioCartao repositorioCartao = new RepositorioCartao();
		System.out.println("Selecione o id da vitima");
		Cartao cartao = repositorioCartao.obterPorId(in.nextInt());
		System.out.println("Quanto você roubou dessa vitima?");
		double roubado = in.nextDouble();
		cartao.setSaldo(cartao.getSaldo()-roubado);
		repositorioCartao.salvar(cartao);
		System.out.println("Saldo Alterado");
		in.close();
		
	}
}
