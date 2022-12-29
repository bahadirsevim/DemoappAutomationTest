import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BaseTest {

    protected WebDriver driver;
    PracticeFormPage practiceFormPage;


    @BeforeAll
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        // System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("Test initiated");
        practiceFormPage = new PracticeFormPage(driver);
    }

    @AfterAll
    public void tearDown(){
        driver.quit();
        System.out.println("Test finished");
    }


}
