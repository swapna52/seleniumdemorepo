package mpack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Demo {
    public static void main(String[] args) {

        WebDriver driver =new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//a[@title='My Account']")).click();
        driver.findElement(By.linkText("Login")).click();
        driver.findElement(By.id("input-email")).sendKeys("arun.selenium5@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("Second@123");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        System.out.println(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='Account']")).isDisplayed());
        driver.findElement(By.name("search")).sendKeys("iphone");
        driver.findElement(By.cssSelector(".fa.fa-search")).click();
        System.out.println(driver.findElement(By.xpath("//*[@class='product-thumb']//a[text()='iPhone']")).isDisplayed());
        driver.findElement(By.xpath("//*[@class='product-thumb']//a[text()='iPhone']")).click();
        System.out.println(driver.findElement(By.xpath("//ul[@class='breadcrumb']//a[text()='iPhone']")).isDisplayed());
        WebElement quantity = driver.findElement(By.id("input-quantity"));
        quantity.clear();
        quantity.sendKeys("2");
        driver.findElement(By.id("button-cart")).click();
      System.out.println(driver.findElement(By.cssSelector("div[class*='alert-success']")).getText().contains("Success: You have added iPhone to your shopping cart!"));
       driver.findElement(By.xpath("//a[text()='shopping cart']")).click();
       System.out.println(driver.findElement(By.xpath("///ul[@class='breadcrumb']//a[text()='iPhone']]")).isDisplayed());
       driver.findElement(By.cssSelector("//a[text()='Checkout']")).click();

    }
}
