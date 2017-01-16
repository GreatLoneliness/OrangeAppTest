package com.orange.pageext;

import com.paypal.selion.platform.utilities.WebDriverWaitUtils;
import com.paypal.selion.reports.runtime.SeLionReporter;
import com.zhijin.orange.LoginPage;

public class LoginPageExt extends LoginPage {
	
	public void login(String account, String password) {
		WebDriverWaitUtils.waitUntilElementIsVisible(getSelectSchoolElement());
		SeLionReporter.log("at login page now", true);
		
//		getSelectSchoolElement().tap();
		WebDriverWaitUtils.waitUntilElementIsVisible(getTestServerElement());
		getTestServerElement().tap(getAccountTextField());
		getAccountTextField().setText(account);
		getPasswordTextField().setText(password);
		getLoginButton().tap();
	}

}
