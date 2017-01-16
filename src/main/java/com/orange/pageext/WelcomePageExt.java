package com.orange.pageext;

import com.orange.utils.WaitUtils;
import com.paypal.selion.platform.mobile.android.UiList;
import com.paypal.selion.platform.utilities.WebDriverWaitUtils;
import com.paypal.selion.reports.runtime.SeLionReporter;
import com.zhijin.orange.WelcomePage;

public class WelcomePageExt extends WelcomePage {
	
	public void gotoLoginPage() {
		WebDriverWaitUtils.waitUntilElementIsVisible(getImageList());
		SeLionReporter.log("at welcome page now, the first page", true);
		UiList list = new UiList(getImageList().getLocator());
		
		while (isInvisible(getStartButton().getLocator(), 3)) {
			list.swipeLeft();
		}
		getStartButton().tap();
	}
	
	public boolean isInvisible(String elementLocator, long timeoutInSeconds) {
		try {
			WaitUtils.waitUntilElementIsVisible(elementLocator, timeoutInSeconds);
			return false;
		} catch (Exception e) {
			return true;
		}
		
	}
	

    
}
