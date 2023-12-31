package au.com.carsguide.pages;

import au.com.carsguide.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class UsedCarPAge extends Utility {
    private static final Logger log = LogManager.getLogger(NewAndUsedCarSearchPage.class.getName());

    @CacheLookup
    @FindBy(xpath = "//select[@id='makes']")
    WebElement usedCarMake;
    @CacheLookup
    @FindBy(xpath = "//select[@id='models']")
    WebElement usedCarModel;
    @CacheLookup
    @FindBy(xpath = "//select[@id='locations']")
    WebElement usedCarLocation;
    @CacheLookup
    @FindBy(xpath = "//select[@id='priceTo']")
    WebElement usedCarPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='search-submit']")
    WebElement findMyNextUsedCar;

    public void selectUsedCarMake(String make){
        selectByVisibleTextFromDropDown(usedCarMake,make);
    }
    public void selectUsedCarModel(String model){
        selectByVisibleTextFromDropDown(usedCarModel, model);
    }
    public void selectUsedCarLocation(String location){
        selectByVisibleTextFromDropDown(usedCarLocation, location);
    }
    public void selectUsedCarPrice(String price){
        selectByVisibleTextFromDropDown(usedCarPrice, price);
    }
    public void clickOnFindMyNextUsedCar(){
        clickOnElement(findMyNextUsedCar);
    }
}
