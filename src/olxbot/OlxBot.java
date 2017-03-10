package olxbot;

import java.util.Iterator;
import java.util.concurrent.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.*;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.*;
import org.openqa.selenium.*;



public class OlxBot {
    
  

    public static void main(String[] args) throws InterruptedException {
        
        // Variaveis uteis
        String username = "rafapardal07@hotmail.com";
        String password = "Rafa-1811994";
        
        System.out.println(PATH);
        
        // Settings iniciais
        /* Chrome 
        
        System.setProperty("webdriver.chrome.driver", "selenium/chromedriver"); 
        WebDriver browser = new ChromeDriver();
        */
        /* Firefox*/
        System.setProperty("webdriver.gecko.driver", "selenium/geckodriver");
        WebDriver browser = new FirefoxDriver();
        
        browser.get("https://www.olx.pt/account/");
        
        // dados do login e submit
        browser.findElement(By.id("userEmail")).sendKeys(username);
        browser.findElement(By.id("userPass")).sendKeys(password);
        browser.findElement(By.id("se_userLogin")).click();
 
        // remover produtos
        //criar funçao que recebe o numero de anuncios 
        try {
        browser.findElement(By.className("remove-link")).click(); 
            Thread.sleep(500);
            ((JavascriptExecutor)browser).
                    executeScript("document.getElementsByName('reson')[0].click()");
        } catch (Exception e) {
        }
    
        //adicionar anuncio
        //criar função que tem os anuncios e cria um por um
        browser.navigate().to("https://www.olx.pt/anunciar/?bs=myaccount_adding");
        Thread.sleep(500);
        browser.findElement(By.cssSelector("#add-file-1 .block.tcenter"))
                .sendKeys("/home/rafa/Pictures/freeletics.jpeg");
           
    }
}
     