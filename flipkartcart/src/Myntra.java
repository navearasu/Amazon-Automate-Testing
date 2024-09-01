import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Myntra {
        public static void main(String[] args) throws InterruptedException {
                // Setting path for chrome driver
                System.setProperty("webdriver.chrome.driver",
                                "C:\\Users\\mnave\\Desktop\\Testing\\flipkartcart\\src\\driver\\chromedriver.exe");
                // Creating an object for webdriver
                WebDriver driver = new ChromeDriver();
                // Used to minimize or maximize the chrome tab
                driver.manage().window().maximize();
                // Set the URL
                driver.get("https://www.myntra.com/");

                WebElement Search = driver
                                .findElement(By.xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/input"));
                Search.sendKeys("Headphone");
                Thread.sleep(2000);
                Actions action = new Actions(driver);
                action.sendKeys(Keys.ENTER).perform();
                Thread.sleep(1000);
                WebElement First = driver.findElement(By.xpath(
                                "/html/body/div[2]/div/main/div[3]/div[2]/div/div[2]/section/ul/li[1]/a/div[1]/div/div/div/picture/img"));
                First.click();
                Thread.sleep(1000);
                WebElement AddtoBag = driver
                                .findElement(By.xpath(
                                                "/html/body/div[2]/div/div[1]/main/div[2]/div[2]/div[2]/div[3]/div/div[1]"));
                AddtoBag.click();
                // Thread.sleep(1000);
                AddtoBag.click();
                WebElement pincode = driver.findElement(
                                By.xpath("/html/body/div[2]/div/div[1]/main/div[2]/div[2]/div[2]/div[5]/div/div/form/input[1]"));
                pincode.sendKeys("627042");
                action.sendKeys(Keys.ENTER).perform();
        }
}