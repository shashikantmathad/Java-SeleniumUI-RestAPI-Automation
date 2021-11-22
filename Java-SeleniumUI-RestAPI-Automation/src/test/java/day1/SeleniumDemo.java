package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Assert;


public class SeleniumDemo {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32 (2)\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.get("https://www.libertyinsurance.in/products/motor-insurance/private-car-renewal");

//        String x = driver.getTitle();
//        System.out.println(x);
//        driver.quit();

        //Navigate to URL:
        driver.get("https://www.interviewbit.com");
        driver.navigate().to("https://www.interviewbit.com");

        //Refresh page:
        driver.navigate().refresh();

        //Navigate forward in browser history:
        driver.navigate().forward();

        //Navigate backward in browser history:
        driver.navigate().back();

//// Navigate to a web page
//        driver.get("http://www.foo.com");
//
//// Enter text to submit the form
//        WebElement usernameElement = driver.findElement(By.name("username"));
//        WebElement passwordElement = driver.findElement(By.name("password"));
//        WebElement formElement = driver.findElement(By.id("loginForm"));
//
//        usernameElement.sendKeys("Scaler Academy");
//        passwordElement.sendKeys("Raw");
//
//        formElement.submit();      // submit by form element
//
//
////Putting an explicit wait
//        WebDriverWait wait = new WebDriverWait(driver, 10);
//        WebElement messageElement = wait.until(
//                ExpectedConditions.presenceOfElementLocated(By.id("loginResponse"))
//        );
//
//// Run a test
////        String message = messageElement.getrept();
////        String successMsg = "Welcome to foo. You logged in successfully.”;
////        Assert.assertEquals(message, successMsg);

// Conclude a test
        driver.quit();
    }


}

