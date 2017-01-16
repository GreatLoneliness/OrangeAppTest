package com.orange.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.paypal.selion.platform.grid.Grid;
import com.paypal.selion.platform.html.support.HtmlElementUtils;

public class WaitUtils {
	
	public static void waitUntilElementIsVisible(final String elementLocator, long timeoutInSeconds) {
        By by = HtmlElementUtils.resolveByType(elementLocator);
        ExpectedCondition<WebElement> condition = ExpectedConditions.visibilityOfElementLocated(by);       
        new WebDriverWait(Grid.driver(), timeoutInSeconds).until(condition);
	}    
    
    public static void waitUntilElementIsInvisible(final String elementLocator, long timeoutInSeconds) {
        By by = HtmlElementUtils.resolveByType(elementLocator);
        ExpectedCondition<Boolean> condition = ExpectedConditions.invisibilityOfElementLocated(by);
        new WebDriverWait(Grid.driver(), timeoutInSeconds).until(condition);
    }
	
	
}
