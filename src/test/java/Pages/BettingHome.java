package Pages;

import Base.BaseUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Acer on 15/06/2017.
 */
public class BettingHome extends BaseUtil{

    private BaseUtil base;

    public BettingHome()
    {
        this.base = base;
        this.Driver=Driver;
    }

     public BettingHome  clickonSportsMenu() {
        base.Driver.findElement(By.xpath("div#app nav > div > div > div.Scroll_content_3Qr > div:nth-child(1) > div.MenuItem_header_1eR > a:nth-child(1) > span")).click();
        return this ;
    }

}
