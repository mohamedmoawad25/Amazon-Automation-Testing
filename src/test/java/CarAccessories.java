import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class CarAccessories {
    WebDriver driver = null;
    SearchPage search;
    SoftAssert soft;
    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com");
        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);
        //driver.manage().window().maximize();
        Thread.sleep(2000);
        search = new SearchPage();
        soft = new SoftAssert();
    }

    @Test(priority = 2)
    public void searchproduct() throws InterruptedException {
        Thread.sleep(10000);
       // search.continuePOM(driver).click();
        search.searchSteps(driver,"car accessories");
        search.choosePOM(driver).click();
        search.addtocartPOM(driver).click();
        String expectedResult ="Added to Cart";
        String actualResult = search.actualResultPOM(driver).getText();
                //driver.findElement(By.xpath("//h1[normalize-space()='Added to Cart']")).getText();
        soft.assertTrue(actualResult.equals(expectedResult));
        Thread.sleep(1000);
        search.gotocartPOM(driver).click();

        soft.assertAll();
        Thread.sleep(2000);

    }

    @AfterTest
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
