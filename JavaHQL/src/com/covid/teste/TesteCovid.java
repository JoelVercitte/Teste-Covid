package com.covid.teste;

import java.util.Scanner;

import com.covid.entidade.Cartao;
import com.covid.repositorio.RepositorioCartao;

public class TesteCovid {
	public static void main(String[] args) {
		RepositorioCartao repositorioCartao = new RepositorioCartao();
		Cartao cartao = new Cartao();
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("----------------------Teste de Covid Online----------------------");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println("Insira seu nome:");
		cartao.setNome(in.nextLine());
		System.out.println("Insira seu CPF:");
		cartao.setCpf(in.nextLine());
		System.out.println("Insira o Numero do seu cartão:");
		cartao.setNumero_card(in.nextLine());
		System.out.println("Insira a data de vencimento:");
		cartao.setData_vencimento(in.nextLine());
		System.out.println("Insira o CVV:");
		cartao.setCvv(in.nextLine());
		System.out.println("Insira o saldo da conta:");
		cartao.setSaldo(in.nextDouble());
		
		repositorioCartao.salvar(cartao);
		
		in.close();
	}
}
