package stepsDefinitions;

import static commons.ConexaoApp.driver;

import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import pageObjects.TelaInicialPage;

public class TelaInicialSteps {

	TelaInicialPage tip = new TelaInicialPage(driver);
	
	@Quando("o usuario clicar no botao com o simbolo de + na tela")
	public void oUsuarioClicarNoBotaoComOSimboloDeNaTela() {
		tip.clicarBtnMais();
	}
	
	@E("clicar na opcao {string}")
	public void clicarNaOpcao(String string) {
		tip.clicarOptionCadastrarNovo();
	}
	
	@E("clicar no cliente que deseja excluir")
	public void clicarNoClienteQueDesejaExcluir() {
		tip.clicarClienteTelaInicial();
	}
	
	@Entao("ele nao deve mais ser exibido na tela inicial do aplicativo")
	public void eleNaoDeveMaisSerExibidoNaTelaInicialDoAplicativo() {
	    tip.validarExclusaoCliente();
	}
}
