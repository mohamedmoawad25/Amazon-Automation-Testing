import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TodayDealspage {
    public WebElement todaydealsPOM(WebDriver driver) {
        return driver.findElement(By.linkText("Today's Deals"));
    }
    public WebElement dismissPOM(WebDriver driver) {
        return driver.findElement(By.xpath("//input[@data-action-params='{\"toasterType\":\"AIS_INGRESS\"}']"));
    }
    public WebElement healthPOM(WebDriver driver) {
        return driver.findElement(By.xpath("(//input[@type='checkbox'])[29]"));
    }
    public WebElement headphonesPOM(WebDriver driver) {
        return driver.findElement(By.xpath("(//input[@type='checkbox'])[28]"));
    }
    public WebElement groceryPOM(WebDriver driver) {
        return driver.findElement(By.xpath("(//input[@type='checkbox'])[27]"));
    }
    public WebElement nextPagePOM(WebDriver driver) {
        return driver.findElement(By.xpath("//li[@class='a-last']//a[@href='#']"));
    }
    /*public WebElement page3POM(WebDriver driver) {
        return driver.findElement(By.xpath("//a[normalize-space()='3']"));
    }
    public WebElement page4POM(WebDriver driver) {
        return driver.findElement(By.xpath("(//a[normalize-space()='4'])[1]"));
    }*/
    public WebElement selectItemPOM(WebDriver driver) {
        return driver.findElement(By.xpath("//div[normalize-space()='SetSail Extra-Long Dusters with Extension Pole']"));
    }
    public WebElement tenandmorethanPOM(WebDriver driver) {
        return driver.findElement(By.linkText("10% off or more"));
    }
   /* public WebElement continuePOM(WebDriver driver){
        return driver.findElement(By.className("a-button-text"));
    }*/
}
