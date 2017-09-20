package goodJob.steps;

import goodJob.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class HomeStep extends ScenarioSteps{
	HomePage homePages;
	
	@Step
	public void Show_User_Profile_Menu() {
		homePages.click_On_User();
	}
	@Step
	public void Choosing_User_Profile_screen() {
		homePages.open_Update_Profile_screen();
	}
	@Step
	public void update_First_Name(String userName) {
		homePages.input_First_Name(userName);
		
	}
	@Step
	public void update_Last_Name(String lastName) {
		homePages.input_Last_Name(lastName);
	}
	@Step
	public void click_On_Save() {
		homePages.click_On_Save();
	}
	
	
}
