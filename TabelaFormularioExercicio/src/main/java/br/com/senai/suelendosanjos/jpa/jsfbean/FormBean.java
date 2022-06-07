package br.com.senai.suelendosanjos.jpa.jsfbean;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;

import br.com.senai.suelendosanjos.apllication.model.Despesas;


public class FormBean {

	@EJB
	private DespesaBean despesaBean;

	@Inject
	private FacesContext context;
	
	private UIComponent searchInputText;
	
	private Integer despesaId;
	
	private Despesas despesas;
	
	
	public void gravar(AjaxBehaviorEvent event) {
		if(despesas.getId()==null) {
			despesaBean.inserir(despesas);
		}else {
			despesaBean.atualizar(despesas);
		}		
	}
	
	public void pesquisar(AjaxBehaviorEvent event) {
		despesas = despesaBean.carregar(despesaId);
		
		if(despesas == null) {
			context.addMessage(searchInputText.getClientId(context),
					new FacesMessage("Despesas n�o encontrada"));
		}
		despesaId = null;		
	}
	
	public void excluir(AjaxBehaviorEvent event) {
		despesaBean.excluir(despesas);
		despesas = null;
	}
	
	
	
	public Despesas getDespesas() {
		if(despesas==null) {
			despesas = new Despesas();
		}
		return despesas;
	}

	public UIComponent getSearchInputText() {
		return searchInputText;
	}

	public void setSearchInputText(UIComponent searchInputText) {
		this.searchInputText = searchInputText;
	}

	public Integer getDespesasId() {
		return despesaId;
	}

	public void setDespesasId(Integer despesaId) {
		this.despesaId = despesaId;
	}
	
	
	
	

}
