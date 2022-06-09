package br.com.senai.suelendosanjos.apllication.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named("login") // NOME A NOSSO BEAN
@RequestScoped //É CRIADO PARA REQUISISÃO E COMPARTILHAR TODOS OS BEANS, QUE INJETA ATRAVES DO MESMO REQUEST.
public class LoginBean implements Serializable{
	private String nome;
	private String senha;
	
	
	@PostConstruct //QUE CONTÉM TODOS OS BEANS, ELE CRIA INSTÂCIAS,PROCESSA AS ANOTAÇÕES, INJETA AS DEPENDÊNCIAS 
	public void onCreate() {
		System.out.println("Bean criado");
	}
	
	@PreDestroy //METODO CHAMADO ELE PERMITE QUE ELE SIRVA, CICLO DE VIDA DO APP
	public void onDestroy() {
		System.out.println("Bean será Destruído");
	}
	
	
	public String doLogin() {
		if("abc".equals(nome) && "123".equals(senha)) {
			System.out.println("qqqqq");
			return "despesas";
		}
		return null;
	}
	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

}
