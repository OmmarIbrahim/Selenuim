package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;
import java.time.Duration;
import java.util.Set;

public class Automation {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/windows");

        String FirstPage = driver.getWindowHandle();

        driver.findElement(By.linkText("Click Here")).click() ;

        Set<String> ALLPages = driver.getWindowHandles();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)) ;
        try {
            Thread.sleep(29);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (String s : ALLPages)
        {
            if(s.equals(FirstPage))
             driver.switchTo().window(s);

        }


        driver.get("https://www.tqniait.com/?language=arabic");

        WebElement login = driver.findElement(By.xpath("/html/body/section[3]/div/ul/li[4]/a"));

    /*  driver.get("https://duckduckgo.com/");


        driver.manage().window().maximize();


      WebElement Search = driver.findElement(By.name("q"));

      Search.sendKeys("panda");

        WebElement searchButton = driver.findElement(By.cssSelector("button[type='submit']"));

        searchButton.click();



      WebElement x=   driver.findElement(By.xpath("//a[@href='/?t=h_&q=panda&ia=images&iax=images']"));

x.click();

WebElement z =      driver.findElement(By.xpath("//a[@href='/?t=h_&q=panda&ia=videos&iax=videos']"));

         z.click();

*/














    }
}
