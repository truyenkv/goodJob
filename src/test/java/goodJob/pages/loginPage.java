package goodJob.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebElement;

public class loginPage extends PageObject {

	@FindBy(id="inputEmail")
	WebElement emailField;
	
	@FindBy(id="inputPassword")
	WebElement passField;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement loginBtn;
	
	@FindBy(xpath="//div[contains(text(),'Unable to log in. Invalid email and/or password')]")
	WebElement errMess;
	
	public void enterEmail(String email) {
		emailField.sendKeys(email);
	}
	public void enterPass(String password) {
		passField.sendKeys(password);
		
	}
	public void clickLoginBtn() {
		loginBtn.click();
		
	}
	public String getErr() {
		return errMess.getText();
	}

}
