package goodJob.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class homePage extends PageObject{

	@FindBy(xpath="//*[@id='basic-nav-dropdown']")
	WebElement userIcon;
	
	@FindBy(xpath="//a[@href='/userprofile']")
	WebElement userProfile;
	
	@FindBy(xpath="//*[@id='formControlsFirstName']")
	WebElement firstNameTxt;
	
	@FindBy(xpath="//*[@id='formControlsLastName']")
	WebElement lastNameTxt;
	
	@FindBy(xpath="//button[@type='button']")
	WebElement saveBtn;
	
	public void click_On_User() {
		userIcon.click();
	}
	public void open_Update_Profile_screen() {
		userProfile.click();
	}
	public void clear_First_Name() {
		firstNameTxt.clear();
	}
	public void input_First_Name(String fistNa) {
		firstNameTxt.sendKeys(fistNa);
	}
	public void clear_Last_Name() {
		lastNameTxt.clear();		
	}
	public void input_Last_Name(String lastNa) {
		lastNameTxt.sendKeys(lastNa);
	}
	public void click_On_Save() {
		saveBtn.click();		
	}

	
	
}
