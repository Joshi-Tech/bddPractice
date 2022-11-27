package pageObject;

import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILink;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TodayTixHomePage extends Form {
    private final static By FORM_LOCATOR = By.xpath("//*[@content='TodayTix']");
    private WebDriver driver;
    private final IButton loginIcon = getElementFactory().getButton(
            By.xpath("//*[@id='userAccount']/div/button"),"Login icon");
    private final ILink loginLink = getElementFactory().getLink(
            By.xpath("//*[@id='navBarLoginButton']"),"Login icon");
    private final IButton loginBtn = getElementFactory().getButton(
            By.id("sign-in-submit"),"Login button");
    private final IButton emailBtn = getElementFactory().getButton(
            By.xpath("//*[text()='Email']"),"Email button");
    private final ITextBox emailTxtBx = getElementFactory().getTextBox(
            By.xpath("//*[@name='username']"),"user name");
    private final ITextBox passwordTxtBx = getElementFactory().getTextBox(
            By.xpath("//*[@name='password']"),"user name");
    public TodayTixHomePage(){
        super (FORM_LOCATOR, "Home page");
        //driver = new EdgeDriver();

    }
    public void clickLoginIcon(){
        loginIcon.click();
    }
    public void clickLoginLink(){
        loginLink.click();
    }
    public void clickLoginBtn(){
        loginBtn.click();
    }
    public void clickEmailBtn(){
        emailBtn.click();
    }
    public void typeEmailId(String email){
        emailTxtBx.sendKeys(email);
    }
    public void typePassword(String email){
        passwordTxtBx.sendKeys(email);
    }
}
