package com.epam.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ResultPage extends BasePage{

    @FindBy(xpath = "//div[@id='search']//h3[(text()='automated-testing.info - русскоязычное сообщество №1 по ...')]\n")
    private WebElement firstLink;

    ResultPage(WebDriver driver){
        super(driver);
    }
    public String getLinkText(){
        //return driver.findElement(By.xpath("//div[@id=\"search\"]//h3[(text()='automated-testing.info - русскоязычное сообщество №1 по ...')]\n")).getText();
        return firstLink.getText();
    }
}
