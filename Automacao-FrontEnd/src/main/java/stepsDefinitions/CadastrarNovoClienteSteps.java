package stepsDefinitions;

import static commons.ConexaoApp.driver;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import pageObjects.CadastrarNovoClientePage;

public class CadastrarNovoClienteSteps {

	CadastrarNovoClientePage cnv = new CadastrarNovoClientePage(driver);

	@E("informar o nome {string}")
	public void informarONome(String nome) {
		cnv.escreverNome(nome);
	}

	@E("informar o RG {string}")
	public void informarORG(String rg) {
		cnv.escreverRg(rg);
	}

	@E("informar o CPF {string}")
	public void informarOCPF(String cpf) {
		cnv.escreverCpf(cpf);
	}

	@E("informar a data de nascimento {string}")
	public void informarADataDeNascimento(String dataNascimento) {
		cnv.escreverDataNascimento(dataNascimento);
	}

	@E("informar o endereco {string}")
	public void informarOEndereco(String endereco) {
		cnv.escreverEndereco(endereco);
	}

	@E("informar o numero {string}")
	public void informarONumero(String numero) {
		cnv.escreverNumeroCasa(numero);
	}

	@E("informar o bairro {string}")
	public void informarOBairro(String bairro) {
		cnv.escreverBairro(bairro);
	}

	@E("informar o cep {string}")
	public void informarOCep(String cep) {
		cnv.escreverCep(cep);
	}

	@E("informar a cidade {string}")
	public void informarACidade(String cidade) {
		cnv.escreverCidade(cidade);
	}

	@E("selecionar o estado {string}")
	public void selecionarOEstado(String estado) throws Exception {
		cnv.selecionarEstado(estado);
	}

	@E("informar o telefone {string}")
	public void informarOTelefone(String telefone) {
		cnv.escreverTelefone1(telefone);
	}

	@E("informar o email {string}")
	public void informarOEmail(String email) {
		cnv.escreverEmail(email);
	}

	@E("clicar no botao Salvar")
	public void clicarNoBotaoSalvar() {
		cnv.clicarBtnSalvar();
	}

	@Entao("^deve ser exibido a mensagem \"([^\"]*)\"$")
	public void deveSerExibidoAMensagem(String messageEsperada) {
		cnv.validarMessageCadastroSucess(messageEsperada);
	}
	
	@Entao("deve ser exibido as opcoes {string} e {string}")
	public void deveSerExibidoAsOpcoesE(String basico, String completo) {
		cnv.validarOpcoesCadastro(basico, completo);
	}
	
	@E("clicar no botao Ok")
	public void clicarNoBotaoOk() {
	    cnv.clicarBtnOk();
	}
	
	@E("voltar para a tela inicial do aplicativo")
	public void voltarParaATelaInicialDoAplicativo() {
		driver.navigate().back();
	}
	
	@E("clicar no botao excluir")
	public void clicarNoBotaoExcluir() {
		cnv.clicarBtnExcluir();
	}
	
	@E("confirmar a exclusao do cliente")
	public void confirmarAExclusaoDoCliente() {
	    cnv.clicarBtnSim();
	}

}
