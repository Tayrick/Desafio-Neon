package stepsDefinitions;

import io.cucumber.java.pt.Dado;
import pageObjects.BasePage;
import static commons.ConexaoApp.*;

public class BaseSteps {

	BasePage bp = new BasePage(driver);
	
	@Dado("^que o usuario tenha dado as permissoes ao aplicativo$")
	public void queOUsuarioTenhaDadoAsPermissoesAoAplicativo() {
		bp.clicarBtnAllow();
	}
	
}
