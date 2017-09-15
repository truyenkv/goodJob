package goodJob.steps;

import goodJob.pages.loginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class loginStep extends ScenarioSteps {
	
	loginPage logPage;
	@Step
	public void openUrl() {
		logPage.open();
	}
	@Step
	public void input_username(String email) {
		logPage.enterEmail(email);
		
	}
	@Step
	public void input_password(String password) {
		logPage.enterPass(password);
		
	}
	@Step
	public void click_Login() {
		logPage.clickLoginBtn();
		
	}
	@Step
	public String get_error_message() {
		return logPage.getErr();
		
	}
	

}
