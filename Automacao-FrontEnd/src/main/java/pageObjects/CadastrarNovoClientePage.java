package pageObjects;

import static commons.ConexaoApp.driver;
import static org.junit.Assert.assertEquals;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.Utils;

public class CadastrarNovoClientePage {

	public CadastrarNovoClientePage(AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Nome']")
	private MobileElement inputNome;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='RG']")
	private MobileElement inputRg;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='CPF']")
	private MobileElement inputCpf;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Data de Nascimento']")
	private MobileElement inputDataNascimento;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Endereço']")
	private MobileElement inputEndereco;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='N°']")
	private MobileElement inputNumeroCasa;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Bairro']")
	private MobileElement inputBairro;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='CEP']")
	private MobileElement inputCep;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Cidade']")
	private MobileElement inputCidade;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='Telefone 1']")
	private MobileElement inputTelefone1;

	@AndroidFindBy(xpath = "//android.widget.EditText[@text='E-mail']")
	private MobileElement inputEmail;

	@AndroidFindBy(xpath = "//android.widget.Button[@text='SALVAR']")
	private MobileElement btnSalvar;

	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Cadastro efetuado com sucesso']")
	private MobileElement messageCadastroSucess;

	@AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Básico']")
	private MobileElement optionBasico;

	@AndroidFindBy(xpath = "//android.widget.RadioButton[@text='Completo']")
	private MobileElement optionCompleto;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='OK']")
	private MobileElement btnOk;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='EXCLUIR']")
	private MobileElement btnExcluir;
	
	@AndroidFindBy(xpath = "//android.widget.Button[@text='SIM']")
	private MobileElement btnSim;

	
	
	public void escreverNome(String nome) {
		inputNome.sendKeys(nome);
	}

	public void escreverRg(String rg) {
		inputRg.sendKeys(rg);
	}

	public void escreverCpf(String cpf) {
		inputCpf.sendKeys(cpf);
	}

	public void escreverDataNascimento(String dataNascimento) {
		inputDataNascimento.sendKeys(dataNascimento);
	}

	public void escreverEndereco(String endereco) {
		inputEndereco.sendKeys(endereco);
	}

	public void escreverNumeroCasa(String numero) {
		inputNumeroCasa.sendKeys(numero);
	}

	public void escreverBairro(String bairro) {
		inputBairro.sendKeys(bairro);
	}

	public void escreverCep(String cep) {
		inputCep.sendKeys(cep);
	}

	public void escreverCidade(String cidade) {
		inputCidade.sendKeys(cidade);
	}

	public void selecionarEstado(String estado) throws Exception {

		MobileElement abrirSelect = (MobileElement) driver
				.findElement(MobileBy.xpath("//android.widget.TextView[@text='AC']"));
		abrirSelect.click();
		Utils.scrollPage();
		MobileElement selectEstado = (MobileElement) driver
				.findElement(MobileBy.xpath("//android.widget.TextView[@text='MS']"));
		selectEstado.click();

	}

	public void escreverTelefone1(String telefone) {
		inputTelefone1.sendKeys(telefone);
	}

	public void escreverEmail(String email) {
		inputEmail.sendKeys(email);
	}

	public void clicarBtnSalvar() {
		btnSalvar.click();
	}

	public void validarMessageCadastroSucess(String messageEsperada) {
		assertEquals(messageEsperada, messageCadastroSucess.getText());
	}

	public void validarOpcoesCadastro(String basico, String completo) {
		assertEquals(basico, optionBasico.getText());
		assertEquals(completo, optionCompleto.getText());
	}
	
	public void clicarBtnOk() {
		btnOk.click();
	}
	
	public void clicarBtnExcluir() {
		btnExcluir.click();
	}
	
	public void clicarBtnSim() {
		btnSim.click();
	}

}
