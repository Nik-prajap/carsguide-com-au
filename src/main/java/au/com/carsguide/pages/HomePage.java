package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());
    @CacheLookup
    @FindBy(linkText = "buy + sell")
    WebElement buyAndSellLink;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Search Cars']")
    WebElement carSearchLink;

    @CacheLookup
    @FindBy(xpath = "//a[text()='Used']")
    WebElement usedCarLink;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Find a Dealer')]")
    WebElement findDealerLink;

    public void mouseHoverOnBuyAndSellLink(){
        mouseHoverToElement(buyAndSellLink);
    }
    public void clickOnCarSearchLink(){
        clickOnElement(carSearchLink);
    }
    public void clickOnUsedCarLink(){
        clickOnElement(usedCarLink);
    }

    public void clickOnFindDealerLink()
    {
        clickOnElement(findDealerLink);
    }
}
