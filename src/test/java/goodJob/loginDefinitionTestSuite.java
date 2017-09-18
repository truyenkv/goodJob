package goodJob;


import goodJob.steps.loginStep;
import net.thucydides.core.annotations.Steps;

import org.junit.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginDefinitionTestSuite {
	
	@Steps
	loginStep logSteps;
	@Given("^I go to login page$")
	public void i_go_to_login_page()  {
	   logSteps.openUrl();
	}

	@When("^I input user name is \"([^\"]*)\"$")
	public void i_input_user_name_is(String username) {
	   logSteps.input_username(username);
	}

	@When("^I input password is \"([^\"]*)\"$")
	public void i_input_password_is(String password) {
	   logSteps.input_password(password);
	}
	
	@When("^I click on Login button$")
	public void I_click_on_Login_button() {
	   logSteps.click_Login();
	}

	@Then("^Show me message \"([^\"]*)\"$")
	public void show_me_message(String actual)  {
	   Assert.assertEquals(logSteps.get_error_message(), actual);
	}
	
	@Then("^Show me message Title \"([^\"]*)\"$")
	public void show_me_message_Title(String title){
		Assert.assertEquals(logSteps.get_title(), title);
	}
	
	@Given("^Open company is company$")
	public void open_company_is_company() {
		logSteps.open_company_detail();
	}

	@Then("^Show me \"([^\"]*)\"$")
	public void show_me_ADDITIONAL_INFORMATION(String addition){
		Assert.assertEquals(logSteps.get_addition(), addition);
	}

	@When("^Clicking on Download button$")
	public void clicking_on_Download_button(){
	    logSteps.click_download_button();
	}

	@Then("^Open Test Download (\\d+)k$")
	public void open_Test_Download_k(int arg1){
	    logSteps.Open_down_detail_company();
	}


	
}
	  


