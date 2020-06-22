import com.epam.pages.HomePage;
import com.epam.pages.ResultPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class GoogleSearch {
    private WebDriver driver;
    private static final String GOOGLE_URL = "https://google.com.ua";

    @BeforeTest
    public void start(){
        System.setProperty("webdriver.chrome.driver", "src\\main\\resources\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(GOOGLE_URL);
    }

    @Test
    public void searchText(){
        HomePage homePage = new HomePage(driver);
        ResultPage resultPage = homePage.search("automated testing info");
        assertTrue(resultPage.getLinkText().contains("automated"));
    }

    @AfterTest
    public void tearDown(){
        driver.close();
    }

}
