package com.ts.qa.pages;

import com.ts.qa.base.TestBase;

public class HomePage extends TestBase {

	

    public String ValidateDashboardtitle() throws InterruptedException
    {
    	Thread.sleep(3000);
    	return driver.getTitle();

    }
}
