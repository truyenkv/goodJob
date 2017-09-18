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
	
	@FindBy(xpath="//*[@class='gj-title-text']")
	WebElement titleMenu;
	
	@FindBy(xpath="//a[contains(text(),'200rows')]")
	WebElement company;
	
	@FindBy(xpath="//*[@class='gj-section-view-text']")
	WebElement companyDetail;
	
	@FindBy(xpath="//a[@href='/downloadfilter']")
	WebElement downloadBtn;
	
	@FindBy(xpath="//a[contains(text(),'Test Download 50k')]")
	WebElement downName;
	
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
	public String get_title_company() {
		return titleMenu.getText();
	}
	public void open_company() {
		company.click();
		
	}
	public String getAddi() {
		return companyDetail.getText();
	}
	public void open_download_screen() {
		downloadBtn.click();
		
	}
	public void open_com_detail() {
		downName.click();
		
	}


}
