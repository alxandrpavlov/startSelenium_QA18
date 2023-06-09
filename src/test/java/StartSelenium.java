import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class StartSelenium {

    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        wd = new ChromeDriver();
//        wd.get("https://telranedu.web.app/home");
//        wd.navigate().to("https://telranedu.web.app/home");
        wd.navigate().to("https://telranedu.web.app/login");
//        wd.navigate().forward();
//        wd.navigate().back();

    }

    @Test
    public void testName() {
//        System.out.println("TEST IS OVER");
        WebElement element = wd.findElement(By.tagName("a"));
        WebElement form = wd.findElement(By.tagName("form"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());

        WebElement root = wd.findElement(By.id("root"));
        WebElement element1 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        wd.findElements(By.linkText("LOGIN"));
//        wd.findElement(By.cssSelector("*[name^='Lo']"));
        wd.findElements(By.tagName("password"));
        wd.findElements(By.partialLinkText("regi"));



    }

    @AfterMethod
    public void postCondition() {
//        wd.close();
//        wd.quit();

    }

}
