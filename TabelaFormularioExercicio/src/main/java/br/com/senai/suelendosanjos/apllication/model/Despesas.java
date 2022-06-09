package br.com.senai.suelendosanjos.apllication.model;

import java.util.List;

import br.com.senai.suelendosanjos.apllication.model.*;

public class Despesas {

	private Integer id;
	
	private String data;
	private String descricao;
	private Double valor;
	private Boolean edit;
	
	
	private List<Produto> produtos;		
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Boolean getEdit() {
		return edit;
	}
	public void setEdit(Boolean edit) {
		this.edit = edit;
	}
	
	
	public Despesas(String data, String descricao, Double valor) {
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
	}

	public Despesas() {
		this.data = data;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	
}
