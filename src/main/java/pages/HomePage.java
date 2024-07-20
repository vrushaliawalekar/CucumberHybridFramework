package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class HomePage {
	
	WebDriver driver;
	private ElementUtils elementUtils;
	
	public HomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}
	
	@FindBy(xpath="//span[text()='My Account']")
	private WebElement myAccountDropMenu;
	
	@FindBy(linkText="Login")
	private WebElement LoginOption;
	
	@FindBy(linkText="Register")
	private WebElement RegisterOption;
	
	@FindBy(name="search")
	private WebElement SearchBoxFiled;
	
   @FindBy(xpath="//button[@class='btn btn-default btn-lg']")
	private WebElement SearchButton;

   	
	
	
	//Actions
	
	public void clickOnMyAccount() {
		
		elementUtils.clickOnElement(myAccountDropMenu, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);		
	}
	
	public LoginPage selectLoginOption() {
		
		elementUtils.clickOnElement(LoginOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new LoginPage(driver);
	}
	
	
	public RegisterPage selectRegisterOption() {
		
		elementUtils.clickOnElement(RegisterOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new RegisterPage(driver);
	}
	
	public void enterProductIntoSearchBoxFiled(String ProductText) {
		
		elementUtils.typeTextIntoElement(SearchBoxFiled, ProductText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);		
	}
	
	public SearchResultPage clickOnSearchButton() {
		
		elementUtils.clickOnElement(SearchButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new SearchResultPage(driver);
	}
	
	
}
