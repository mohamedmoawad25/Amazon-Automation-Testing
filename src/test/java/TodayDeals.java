import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TodayDeals {
    WebDriver driver = null;
    TodayDealspage todaydeals;
    SearchPage search;
    SoftAssert soft;
    @BeforeTest
    public void OpenBrowser() throws InterruptedException {
        String chromePath = System.getProperty("user.dir") +"\\src\\main\\resources\\chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.navigate().to("https://www.amazon.com/");
        Dimension dimension = new Dimension(1024, 768);
        driver.manage().window().setSize(dimension);
        //driver.manage().window().maximize();
        Thread.sleep(2000);
        todaydeals = new TodayDealspage();
        soft = new SoftAssert();
        search = new SearchPage();
    }
    @Test
    public void searchproduct() throws InterruptedException {
        Thread.sleep(15000);
        //todaydeals.continuePOM(driver).click();
        todaydeals.dismissPOM(driver).click();
        todaydeals.todaydealsPOM(driver).click();
        todaydeals.groceryPOM(driver).click();
        todaydeals.headphonesPOM(driver).click();
        todaydeals.tenandmorethanPOM(driver).click();
        Thread.sleep(2000);
        String url = "https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb&deals-widget=%257B%2522version%2522%253A1%252C%2522viewIndex%2522%253A0%252C%2522presetId%2522%253A%25224BECF583092A5BE4F3F278C0F2900B75%2522%252C%2522discountRanges%2522%253A%255B%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252210%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A10%252C%2522to%2522%253Anull%252C%2522selected%2522%253Atrue%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252225%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A25%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252250%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A50%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252270%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A70%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%255D%252C%2522departments%2522%253A%255B%252216310101%2522%252C%2522172541%2522%255D%252C%2522sorting%2522%253A%2522FEATURED%2522%257D";


        soft.assertEquals(driver.getCurrentUrl(),url,"the filtration is successful");
//        soft.assertAll();
        Thread.sleep(2000);

    }
    @Test
    public void goToFourthPage() throws InterruptedException {
        Thread.sleep(15000);
        todaydeals.dismissPOM(driver).click();
        todaydeals.todaydealsPOM(driver).click();
        todaydeals.headphonesPOM(driver).click();
        todaydeals.healthPOM(driver).click();
        todaydeals.tenandmorethanPOM(driver).click();
        String url ="https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb&deals-widget=%257B%2522version%2522%253A1%252C%2522viewIndex%2522%253A0%252C%2522presetId%2522%253A%25224BECF583092A5BE4F3F278C0F2900B75%2522%252C%2522discountRanges%2522%253A%255B%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252210%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A10%252C%2522to%2522%253Anull%252C%2522selected%2522%253Atrue%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252225%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A25%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252250%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A50%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252270%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A70%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%255D%252C%2522departments%2522%253A%255B%25223760901%2522%252C%2522172541%2522%255D%252C%2522sorting%2522%253A%2522FEATURED%2522%257D";
        soft.assertEquals(driver.getCurrentUrl(),url,"the fourth page ");
        Thread.sleep(4000);
        todaydeals.nextPagePOM(driver).click();
        Thread.sleep(4000);
        todaydeals.nextPagePOM(driver).click();
        Thread.sleep(4000);
        String urlFourthPage ="https://www.amazon.com/gp/goldbox?ref_=nav_cs_gb&deals-widget=%257B%2522version%2522%253A1%252C%2522viewIndex%2522%253A180%252C%2522presetId%2522%253A%25224BECF583092A5BE4F3F278C0F2900B75%2522%252C%2522discountRanges%2522%253A%255B%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252210%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A10%252C%2522to%2522%253Anull%252C%2522selected%2522%253Atrue%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252225%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A25%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252250%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A50%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%252C%257B%2522sectionText%2522%253A%2522Discount%2522%252C%2522optionText%2522%253A%252270%2525%2520off%2520or%2520more%2522%252C%2522from%2522%253A70%252C%2522to%2522%253Anull%252C%2522selected%2522%253Afalse%257D%255D%252C%2522departments%2522%253A%255B%25223760901%2522%252C%2522172541%2522%255D%252C%2522sorting%2522%253A%2522FEATURED%2522%257D";soft.assertEquals(driver.getCurrentUrl(),urlFourthPage,"the filtration is successful");
        Thread.sleep(4000);
        todaydeals.selectItemPOM(driver).click();
        Thread.sleep(2000);
        search.addtocartPOM(driver).click();
        Thread.sleep(1000);
    }
    @AfterTest
    public void CloseDriver() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
