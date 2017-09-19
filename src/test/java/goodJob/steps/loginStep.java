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
	@Step
	public String get_title() {
		return logPage.get_title_company();
	}
	@Step
	public void open_company_detail() {
		logPage.open_company();
		
	}
	@Step
	public String get_addition() {
		return logPage.getAddi();
	}
	@Step
	public void click_download_button() {
		logPage.open_download_screen();
		
	}
	@Step
	public void Open_down_detail_company() {
		logPage.open_com_detail();
		
	}
	public void Show_User_Profile_Menu() {
		
		
	}
	

	
}
