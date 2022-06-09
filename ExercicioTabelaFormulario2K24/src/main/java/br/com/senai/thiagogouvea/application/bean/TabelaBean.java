package br.com.senai.thiagogouvea.application.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import br.com.senai.thiagogouvea.jpa.model.Despesas;

@SuppressWarnings("serial")
@Named("tabela")
@SessionScoped
public class TabelaBean implements Serializable{

	String date;
	String desc;
	Double valor2;
	Boolean back = false;
	
	
	
	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Double getValor2() {
		return valor2;
	}

	public void setValor2(Double valor2) {
		this.valor2 = valor2;
	}

	public Boolean getBack() {
		return back;
	}

	public void setBack(Boolean back) {
		this.back = back;
	}

	
	
	
	
	
	
	
	
	
	private List<Despesas> despesas = new ArrayList<>();

	public String inserir(String data, String desc, Double valor) {
		Despesas despesa = new Despesas(data, desc, valor);
		despesa.setEdit(true);
		back = true;
		despesas.add(despesa);
		date = null;
		desc = null;
		valor = null;
		return null;
	}
	
	public String excluir(Despesas despesa) {
		despesas.remove(despesa);
		return null;
	}
	
	public String editar(Despesas despesa) {
		despesa.setEdit(true);
		return null;
	}
	
	public String gravar (Despesas despesa) {
		despesa.setEdit(false);
		
		return null;
	}
	
	public List<Despesas> getDespesas() {
		return despesas;
	}
}
