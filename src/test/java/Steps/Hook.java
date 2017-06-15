package Steps;

import Base.BaseUtil;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Acer on 14/06/2017.
 */
public class Hook extends BaseUtil {

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }


    @Before
    public void InitializeTest()
    {
        System.out.println("Opening Browser : Chrome ");
        base.Driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(base.Driver, 60);


    }

    @After
    public void TearDownTest()
    {
        System.out.println("Closing Browser : Chrome ");
        Driver.quit();

    }

}
