package com.covid.teste;

import java.util.List;
import java.util.Scanner;

import com.covid.entidade.Cartao;
import com.covid.entidade.Telefone;
import com.covid.repositorio.RepositorioCartao;
import com.covid.repositorio.RepositorioTelefone;

public class TelefoneCLI {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Inserir Telefone: 1");
		System.out.println("Deletar Telefone: 2");
		System.out.println("Atualizar Telefone: 3");
		System.out.println("Consultar Telefones: 4");
		
		int escolha = in.nextInt();
		
		switch (escolha) {
			case 1: {
				Telefone t = new Telefone();
				System.out.println("Insira o DDD:");
				String ddd;
				ddd = in.next();
				t.setDdd(ddd);
				System.out.println("Insira o numero sem DDD:");
				String nsddd;
				nsddd = in.next();
				t.setNumero(nsddd);
				RepositorioCartao rc = new RepositorioCartao();
				System.out.println("Insira o id da pessoa:");
				Cartao c = rc.obterPorId(in.nextInt());
				t.setCartao(c);
				RepositorioTelefone rt = new RepositorioTelefone();
				rt.salvar(t);
				break;
			}
			case 2: {
				RepositorioTelefone rt = new RepositorioTelefone();
				System.out.println("Insira o Id do Telefone");
				int id;
				id = in.nextInt();
				Telefone t = rt.obterPorId(id);
				rt.remover(t);
				break;
			}
			case 3: {
				RepositorioTelefone rt = new RepositorioTelefone();
				System.out.println("Insira o Id do Telefone");
				int id;
				id = in.nextInt();
				Telefone t = rt.obterPorId(id);
				System.out.println("Insira o novo Numero de Telefone:");
				String nm;
				nm = in.next();
				t.setNumero(nm);
				System.out.println("Insira o novo DDD:");
				String ddd;
				ddd = in.next();
				t.setDdd(ddd);
				System.out.println("Deseja mesmo atualizar o numero para: "+t.toString());
				rt.salvar(t);
				break;
			}
			case 4: {
				RepositorioTelefone rt = new RepositorioTelefone();
				List<Telefone> telefones = rt.listarTodos();
				for (Telefone telefone : telefones) {
					System.out.println(telefone.toString());
				}
				break;
			}
			default:
				in.close();
				throw new IllegalArgumentException("Unexpected value: " + escolha);
		}
		in.close();
	}

}
