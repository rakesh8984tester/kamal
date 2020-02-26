package pomAnnotation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnnotationLogin 
{
	@FindBy(id ="username" )
	private WebElement usernameTextfield;
	
	@FindBy(name="pwd")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepLoggedInCheckBoxCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButtonLink;
	@FindBy(xpath = "//a[.='Forgot your password?']")
	private WebElement ForgotyourpasswordLink;
	
	public AnnotationLogin(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void LoginMethod() throws InterruptedException
	{
		usernameTextfield.sendKeys("admin");
		passwordTextfield.sendKeys("manager");
		keepLoggedInCheckBoxCheckbox.click();
		loginButtonLink.click();
		Thread.sleep(6000);
	}


}
