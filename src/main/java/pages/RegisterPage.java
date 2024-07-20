package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.CommonUtils;
import utils.ElementUtils;

public class RegisterPage {

	WebDriver driver;
	private ElementUtils elementUtils;

	public RegisterPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
		elementUtils = new ElementUtils(driver);
	}

	@FindBy(id = "input-firstname")
	private WebElement FirstNameField;

	@FindBy(id = "input-lastname")
	private WebElement LastNameField;

	@FindBy(id = "input-email")
	private WebElement emailAddressField;

	@FindBy(id = "input-telephone")
	private WebElement TelephoneField;

	@FindBy(id = "input-password")
	private WebElement PasswordField;

	@FindBy(id = "input-confirm")
	private WebElement PasswordConfirmField;

	@FindBy(name = "agree")
	private WebElement PrivacyPolicyOption;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement ContinueButton;

	@FindBy(xpath = "//input[@name='newsletter'][@value='1']")
	private WebElement YesToNewsLetterOption;

	@FindBy(xpath = "//div[contains(@class,'alert-dismissible')]")
	private WebElement WarningMessage;

	@FindBy(xpath = "//input[@id='input-firstname']/following-sibling::div")
	private WebElement FirstNameWarning;

	@FindBy(xpath = "//input[@id='input-lastname']/following-sibling::div")
	private WebElement LastNameWarning;

	@FindBy(xpath = "//input[@id='input-email']/following-sibling::div")
	private WebElement EmailAddressWarning;

	@FindBy(xpath = "//input[@id='input-telephone']/following-sibling::div")
	private WebElement TelephoneWarning;

	@FindBy(xpath = "//input[@id='input-password']/following-sibling::div")
	private WebElement PassowrdWarning;

	// Actions

	public void enterFirstName(String fisrtNameText) {

		elementUtils.typeTextIntoElement(FirstNameField, fisrtNameText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterLastName(String lastNameText) {

		elementUtils.typeTextIntoElement(LastNameField, lastNameText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterEmailAddress(String emailText) {

		elementUtils.typeTextIntoElement(emailAddressField, emailText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterTelephoneNumber(String telephoneText) {

		elementUtils.typeTextIntoElement(TelephoneField, telephoneText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterPassword(String passwordText) {

		elementUtils.typeTextIntoElement(PasswordField, passwordText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void enterConfirmPassword(String passwordText) {

		elementUtils.typeTextIntoElement(PasswordConfirmField, passwordText, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public void selectPrivacyPolicy() {

		elementUtils.clickOnElement(PrivacyPolicyOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public AccountSuccessPage clickOnContinueButton() {

		elementUtils.clickOnElement(ContinueButton, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);
		return new AccountSuccessPage(driver);
	}

	public void selectYesNewsLetterOption() {

		elementUtils.clickOnElement(YesToNewsLetterOption, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public String getWarningText() {

		return elementUtils.getTextFromElement(WarningMessage, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public String firstNameWarningText() {

		return elementUtils.getTextFromElement(FirstNameWarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public String lastNameWarningText() {

		return elementUtils.getTextFromElement(LastNameWarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public String emailAddressWarningText() {

		return elementUtils.getTextFromElement(EmailAddressWarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public String telephoneWarningText() {

		return elementUtils.getTextFromElement(TelephoneWarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

	public String passwordWarningText() {

		return elementUtils.getTextFromElement(PassowrdWarning, CommonUtils.EXPLICIT_WAIT_BASIC_TIME);

	}

}
