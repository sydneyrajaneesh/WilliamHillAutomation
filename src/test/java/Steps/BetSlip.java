package Steps;

import Base.BaseUtil;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;


import java.util.Set;

/**
 * Created by Acer on 14/06/2017.
 */
public class BetSlip extends BaseUtil {

    private BaseUtil base;

    public BetSlip(BaseUtil base) {
        this.base = base;
    }



    @Then("^I should see the bet slips with the details of the bet$")
    public void iShouldSeeTheBetSlipsWithTheDetailsOfTheBet() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        base.Driver.findElement(By.cssSelector("div#app a.SideBar_button_l8p.SideBar_buttonSelected_3Yl > span:nth-child(2)")).click();
        System.out.println("I am in the Bet Slip menu");
        Assert.assertEquals("Horse Racing",base.Driver.findElement(By.cssSelector("div#app a > div > span")).isDisplayed(), true);
        Assert.assertEquals("10.50",base.Driver.findElement(By.cssSelector("div#app div.Ticket_stakeBlock_aP9 > div > div > input")).isDisplayed(), true);

    }

    @And("^I click on the Add to Bet Slip button$")
    public void iClickOnTheAddToBetSlipButton() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in the Betting Menu");
        base.Driver.findElement(By.cssSelector(" div.BetView_footer_5K4 > button.Button_root_3Zd.Button_center_1Yv.Button_fullWidth_2af.Button_white_1pH")).click();
        try {
            Set<String> winHandles = base.Driver.getWindowHandles();
            for (String wHandle : winHandles) {
                base.Driver.switchTo().window(wHandle);
                break;
            }
        } catch (Exception e) {
        }
    }


    @Given("^I navigate to the Racing page$")
    public void iNavigateToTheRacingPage() throws Throwable {
        // Write code here that turns the phrase above into concrete actions

        System.out.println("I am in the first page");
        base.Driver.navigate().to("https://www.williamhill.com.au/");

    }


    @And("^I click on the first available HORSERACE$")
    public void iClickOnTheFirstAvailableHORSERACE() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in the Placing Bets Page");
        base.Driver.findElement(By.cssSelector("div#app div:nth-child(1) > div.Grid_grid_zK0 > div.Grid_content_2gS > div > div:nth-child(1) > a:nth-child(1)")).click();


    }

    @And("^I Click on the first available QUICKBET$")
    public void iClickOnTheFirstAvailableQUICKBET() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in the Quick Bet menu");

        base.Driver.findElement(By.cssSelector("div#app div:nth-child(1) > div.RaceCardList_bodyRight_11J.RaceCardList_gridRight_11B > div.RaceCardList_paneOpen_2NK.RaceCardList_pane_2Mi > div.RaceCardList_buttonPair_16a.RaceCardList_blueBackground_2je > div > button[type=\"button\"]:nth-child(1)")).click();

        }

    @And("^I Click on the Racing Menu$")
    public void iClickOnTheRacingMenu() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in the Sports menu");
        base.Driver.findElement(By.cssSelector("div#app nav > div > div > div.Scroll_content_3Qr > div:nth-child(1) > div.MenuItem_header_1eR > a:nth-child(1) > span")).click();
    }

    @And("^I select Racing for Tomorrow$")
    public void iSelectRacingForTomorrow() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am in the Game Selection page");
       // base.Driver.findElement(By.cssSelector("div#app div.Header_header_2t6 > div > a:nth-child(3)")).click();
       // base.Driver.findElement(By.xpath("(//a[@class='Header_link_Pud'])[2]")).click();


    }

    @And("^I enter the betting amount$")
    public void iEnterTheBettingAmount() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        try {
            Set<String> winHandles = base.Driver.getWindowHandles();
            for (String wHandle : winHandles) {
                base.Driver.switchTo().window(wHandle);
            }
        } catch (Exception e) {
        }
        base.Driver.findElement(By.cssSelector("div.ScreenKeyboard_keyboard_3Rm.ScreenKeyboard_open_9Lp > div:nth-child(5)")).click();
        base.Driver.findElement(By.cssSelector("div.ScreenKeyboard_keyboard_3Rm.ScreenKeyboard_open_9Lp > div:nth-child(1)")).click();

    }
}


