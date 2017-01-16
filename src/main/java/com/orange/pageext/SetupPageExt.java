package com.orange.pageext;

import com.paypal.selion.platform.utilities.WebDriverWaitUtils;
import com.zhijin.orange.SetupPage;

public class SetupPageExt extends SetupPage {

	public void clearVideo() {
		WebDriverWaitUtils.waitUntilElementIsVisible(getClearVideoElement());
		getClearVideoElement().tap(getYesElement());
		getYesElement().tap();
	}
	
	public void clearCache() {
		WebDriverWaitUtils.waitUntilElementIsVisible(getClearCacheElement());
		getClearCacheElement().tap(getYesElement());
		getYesElement().tap();
	}
	
	public void quit() {
		WebDriverWaitUtils.waitUntilElementIsVisible(getQuitButton());
		getQuitButton().tap();
	}
}
