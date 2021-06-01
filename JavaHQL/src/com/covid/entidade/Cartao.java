package com.covid.entidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cartoes")
public class Cartao {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column
	private String nome;
	private String cpf;
	private String numero_card;
	private String data_vencimento;
	private String cvv;
	private double saldo;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNumero_card() {
		return numero_card;
	}
	public void setNumero_card(String numero_card) {
		this.numero_card = numero_card;
	}
	public String getData_vencimento() {
		return data_vencimento;
	}
	public void setData_vencimento(String data_vencimento) {
		this.data_vencimento = data_vencimento;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	@Override
	public String toString() {
		return "Cartao [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", numero_card=" + numero_card
				+ ", data_vencimento=" + data_vencimento + ", cvv=" + cvv + ", saldo=" + saldo + "]";
	}
	
}
