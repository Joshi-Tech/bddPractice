package testP;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IElementFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import io.github.bonigarcia.wdm.managers.EdgeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pageObject.TodayTixHomePage;

public class BaseTest {
   WebDriverManager webDriverManager;
    WebDriver driver;
   private static TodayTixHomePage todayTixHomePage;
    protected final IElementFactory elementFactory;

    protected BaseTest() {
        elementFactory = AqualityServices.getElementFactory();
    }

    @Test
    public void setUpLaunch() {
        //webDriverManager = new ChromeDriverManager();
        webDriverManager = new EdgeDriverManager();
        webDriverManager.setup();
        todayTixHomePage = new TodayTixHomePage();
        driver = new EdgeDriver();
        driver.get("https://webviewer:Cd3qTV%@qaweb.todaytix.com/");
        driver.manage().window().maximize();
        //todayTixHomePage = new TodayTixHomePage();
        //driver = new ChromeDriver();
    }

    /*@BeforeTest
    public void launchPage() {
        driver = new ChromeDriver();
        driver.get("https://webviewer:Cd3qTV%@qaweb.todaytix.com/");
        driver.manage().window().maximize();
    }*/

    @Test
   public void login(){
       TodayTixHomePage todayTixHomePage = new TodayTixHomePage();
       todayTixHomePage.clickLoginIcon();
       todayTixHomePage.clickLoginLink();
       todayTixHomePage.clickEmailBtn();
       todayTixHomePage.typeEmailId("laxmi.kantjoshi@todaytixgroup.com");
       todayTixHomePage.typePassword("J41Shr1R4m");
       todayTixHomePage.clickLoginBtn();
    }
}