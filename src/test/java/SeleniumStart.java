import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class SeleniumStart {

    WebDriver wd;

    @BeforeMethod
    public void preCondition() {
        System.out.println("Opening web-site");
        wd = new ChromeDriver();
//    wd.get("https://telranedu.web.app/home");
//        wd.navigate().to("https://telranedu.web.app/home");
        wd.navigate().to("https://telranedu.web.app/login");
//    wd.navigate().forward();
//    wd.navigate().back();
    }

    @Test
    public void testLogin() {
//        System.out.println("Test is over");
        WebElement element = wd.findElement(By.tagName("a"));
        WebElement form = wd.findElement(By.tagName("form"));
        List<WebElement> elements = wd.findElements(By.tagName("a"));
        System.out.println(elements.size());
        WebElement root = wd.findElement(By.id("root"));
        WebElement clName = wd.findElement(By.className("navbar-component_nav__1X_4m"));

//--------------------HW_6___CSS______

        WebElement rootcss = wd.findElement(By.cssSelector("#root"));
        WebElement element4 = wd.findElement(By.cssSelector("[name= 'login']"));
            WebElement element5 = wd.findElement(By.cssSelector("[class='navbar-component_nav__1X_4m']"));
            WebElement element6 = wd.findElement(By.cssSelector(".login_login__3EHKB"));
        WebElement current = wd.findElement(By.cssSelector("[aria-current='page']"));
        WebElement element7 = wd.findElement(By.cssSelector("[name = 'email']"));

//--------------------HW_7---xPath-------------------

        WebElement element10 = wd.findElement(By.xpath("//*[@class='navbar-component_nav__1X_4m']"));
        WebElement element11 = wd.findElement(By.xpath("//div/a"));
        wd.findElement(By.xpath("//a[text()='LOGIN']"));
        wd.findElement(By.xpath("//a[@class = 'active']"));
        WebElement root1 = wd.findElement(By.xpath("//div[@id ='root']"));

        WebElement password = wd.findElement(By.xpath("//input[@name='password']"));
        WebElement email = wd.findElement(By.xpath("//input [@name='email']"));
        WebElement element16 = wd.findElement(By.xpath("//*[@aria-current='page']"));
        WebElement elbut = wd.findElement(By.xpath("//button [@type ='submit']"));

    }
                 @AfterMethod
    public void postCondition() {
//    wd.close();
//   wd.quit();
    }
}
