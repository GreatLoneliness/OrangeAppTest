package com.orange.pageext;

import com.paypal.selion.platform.utilities.WebDriverWaitUtils;
import com.zhijin.orange.BottomToolbar;

public class BottomToolbarExt extends BottomToolbar {

	public void gotoUserPage() {
		WebDriverWaitUtils.waitUntilElementIsVisible(getUserElement());
		getUserElement().tap();
	}
}
