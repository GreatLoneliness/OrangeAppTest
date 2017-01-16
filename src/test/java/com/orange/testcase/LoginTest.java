package com.orange.testcase;

import org.testng.annotations.Test;

import com.orange.pageext.HomePageExt;
import com.orange.pageext.LoginPageExt;
import com.orange.pageext.WelcomePageExt;
import com.paypal.selion.annotations.MobileTest;
import com.paypal.selion.platform.utilities.WebDriverWaitUtils;
import com.paypal.selion.reports.runtime.SeLionReporter;

public class LoginTest {	

	private WelcomePageExt welcomePageExt;
	private LoginPageExt loginPageExt;
	private HomePageExt homePageExt;
	
	private String account = "wh10000";
	private String authcode = "000000";
	
	@Test
	@MobileTest
	public void testLogin() {
		init();
		welcomePageExt.gotoLoginPage();
		loginPageExt.login(account, authcode);
		
		WebDriverWaitUtils.waitUntilElementIsVisible(homePageExt.getNoticeLabel());
		SeLionReporter.log("login successfully, at home page now", true);
	}

	public void init() {
		welcomePageExt = new WelcomePageExt();
		loginPageExt = new LoginPageExt();
		homePageExt = new HomePageExt();
	}

}
