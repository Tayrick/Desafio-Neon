package pageObjects;

import static org.junit.Assert.assertFalse;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TelaInicialPage {
	
	public TelaInicialPage (AppiumDriver<?> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Cadastrar Novo']")
	private MobileElement optionCadastrarNovo;

	@AndroidFindBy(xpath = "//android.widget.ImageButton[@index='0']")
	private MobileElement btnMais;
	
	@AndroidFindBy(xpath = "//android.widget.TextView[@text='Isadora Oliveira']")
	private MobileElement clientIsadora;
	
	
	
	public void clicarBtnMais() {
		btnMais.click();
	}
	
	public void clicarOptionCadastrarNovo() {
		optionCadastrarNovo.click();
	}
	
	public void clicarClienteTelaInicial() {
		clientIsadora.click();
	}
	
	public void validarExclusaoCliente() {
		assertFalse(String.valueOf(clientIsadora), false);
	}
	
}
