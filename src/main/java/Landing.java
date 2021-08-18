import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Landing {
    private WebDriver driver;
    @Before
    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Google\\Chrome\\Application\\chromedriver.exe");
        System.out.println("dsadas");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.EAGER);
        driver = new ChromeDriver(chromeOptions);
        driver.manage().window().maximize();
        try{
            driver.get("icode.kz");
            Thread.sleep(1000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        Thread.sleep(1000);

    }
    @After
    public void cleanUp(){
        System.out.println("Close browser");

        if (driver != null)
            driver.quit();
    }
    @Test
    public void openLanding(){
        System.out.println("Open Landing Page");

        Assert.assertEquals("dasd", "dddd");
        assert true;

        driver.findElement(By.xpath("dsda")).click();
    }
}
