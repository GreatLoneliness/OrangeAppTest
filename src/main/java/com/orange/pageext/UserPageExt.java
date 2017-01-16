package com.orange.pageext;

import com.paypal.selion.platform.utilities.WebDriverWaitUtils;
import com.zhijin.orange.UserPage;

public class UserPageExt extends UserPage {

	public void gotoSetupPage() {
		WebDriverWaitUtils.waitUntilElementIsVisible(getSetupElement());
		getSetupElement().tap();
	}
}
