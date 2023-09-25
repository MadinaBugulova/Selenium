package Class02;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumHW {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
                driver.manage().window().maximize();

        WebElement userName=driver.findElement(By.name("username"));
        userName.sendKeys("abc");

        Thread.sleep(2000);

        userName.sendKeys(Keys.CONTROL + "a");

        Thread.sleep(2000);

        userName.sendKeys("Admin");

        Thread.sleep(2000);

        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("admin123");

        WebElement login = driver.findElement(By.tagName("button"));
        String text=login.getText();
        System.out.println(text);


        login.click();
    }
}
