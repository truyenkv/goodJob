package goodJob.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends PageObject{

	@FindBy(id="basic-nav-dropdown")
	WebElementFacade userIcon;
	
	@FindBy(className="gj-title-text")
	WebElementFacade authen;
	
	@FindBy(xpath=".//img[@alt='Logo'][@src='/assets/images/logo.809dc668205f6879f9f80d43482539f0.svg']")
	WebElementFacade logo;
	
	@FindBy(xpath="//*[@id='menuCollapse']//a[@href='/userprofile']")
	WebElementFacade userProfile;
	
	@FindBy(xpath="//button[contains(text(),'Save')]")
	WebElement saveBtn;
	
	WebElementFacade formControlsFirstName;
	WebElementFacade formControlsLastName;
		
	
	public void click_On_User() {
//		WebDriverWait wait = new WebDriverWait(getDriver(), 10000);
//		wait.until(ExpectedConditions.visibilityOf(logo));
		waitForAllTextToAppear("Authorized Companies");
		userIcon.click();
		
	}
	public void open_Update_Profile_screen() {
		withAction().moveToElement(userProfile).click().perform();
	}

	
	public void input_First_Name(String fistNa) {
		typeInto(formControlsFirstName, fistNa);
	}
	
	public void input_Last_Name(String lastNa) {
		typeInto(formControlsLastName, lastNa);
	}
	
	public void click_On_Save() {
		saveBtn.click();		
	}

	
	
}
