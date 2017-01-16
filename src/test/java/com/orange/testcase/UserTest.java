package com.orange.testcase;

import org.testng.annotations.Test;

import com.orange.pageext.BottomToolbarExt;
import com.orange.pageext.LoginPageExt;
import com.orange.pageext.SetupPageExt;
import com.orange.pageext.UserPageExt;
import com.orange.pageext.WelcomePageExt;
import com.paypal.selion.annotations.MobileTest;
import com.paypal.selion.platform.utilities.WebDriverWaitUtils;
import com.paypal.selion.reports.runtime.SeLionReporter;

public class UserTest {

	private WelcomePageExt welcomePageExt;
	private LoginPageExt loginPageExt;
	private BottomToolbarExt bottomToolbarExt;
	private UserPageExt userPageExt;
	private SetupPageExt setupPageExt;
	
	private String account = "wh10000";
	private String authcode = "000000";
	
	@Test
	@MobileTest
	public void testUser() {
		init();
		welcomePageExt.gotoLoginPage(); 
		loginPageExt.login(account, authcode);
		bottomToolbarExt.gotoUserPage();
		userPageExt.gotoSetupPage();
		setupPageExt.clearVideo();		
		WebDriverWaitUtils.waitUntilElementIsVisible(setupPageExt.getClearCacheElement());
		SeLionReporter.log("clear video successfully, at setup page now", true);
		
		setupPageExt.clearCache();
		WebDriverWaitUtils.waitUntilElementIsVisible(setupPageExt.getClearCacheElement());
		SeLionReporter.log("clear cache successfully, at setup page now", true);
		
		setupPageExt.quit();
		WebDriverWaitUtils.waitUntilElementIsVisible(loginPageExt.getLoginButton());
		SeLionReporter.log("quit successfully, at login page now", true);	
	}
	
	public void init() {
		welcomePageExt = new WelcomePageExt();
		loginPageExt = new LoginPageExt();
		bottomToolbarExt = new BottomToolbarExt();
		userPageExt = new UserPageExt();
		setupPageExt = new SetupPageExt();
	}
	
}
