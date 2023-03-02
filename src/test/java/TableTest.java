import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class TableTest {
    WebDriver wd; //переменная

    @BeforeMethod
    public void preTest(){
        wd = new ChromeDriver();
        wd.navigate().to("https://www.w3schools.com/css/css_table.asp");
    }
@Test
public void tableTest() {
//    WebElement row = wd.findElement(By.cssSelector("#customers"));
    List<WebElement> trs = wd.findElements(By.cssSelector("#customers tr"));//1
    System.out.println(trs.size());
    List<WebElement> ths = wd.findElements(By.cssSelector("#customers th"));//2
    System.out.println(ths);
    WebElement tr3 = wd.findElement(By.cssSelector("#customers tr:nth-child(3)"));//3
    System.out.println(tr3.getText());
    WebElement lastColumn = wd.findElement (By.cssSelector("#customers tr th:last-child"));//4
    System.out.println(lastColumn.getText());
}
}
