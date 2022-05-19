package fr.epitech.hub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainClass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,
        Duration.ofSeconds(10));
        try {
            driver.get("https://coinmarketcap.com/fr/currencies/ethereum/");
            Thread.sleep(100);
            String element = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div/div[2]/div[1]/div/span")).getText();
            String element_rank = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div/div[1]/div[2]/div/div[1]/div[2]/div[1]")).getText();
            System.out.println(element + " " + element_rank);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}
