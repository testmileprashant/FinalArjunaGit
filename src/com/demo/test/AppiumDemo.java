package com.demo.test;

import arjunasdk.uiauto.factories.UiDriverFactory;
import arjunasdk.uiauto.interfaces.UiDriver;
import unitee.annotations.TestClass;
import unitee.annotations.TestMethod;

@TestClass
public class AppiumDemo {
	

	@TestMethod
	public void sampleTest() throws Exception {
		System.out.println("Execution started!!");

		
		
		//web
		UiDriver driver = UiDriverFactory.getMobileWebUiDriver();
		driver.goTo("https://www.google.com");
		
		
		/*UiDriver driver = UiDriverFactory.getMobileNativeUiDriver("E:\\Arjuna_Pro\\For_Championship\\apks\\API Demos_com.example.android.apis.apk");
		driver.elementWithId("android:id/text1").click();*/
		
		
		
		
		
		//
		
		/*capa.setCapability(MobileCapabilityType.APP, "E:\\Arjuna_Pro\\For_Championship\\apks\\API Demos_com.example.android.apis.apk");
		capa.setCapability("appPackage", "com.example.android.apis");
		capa.setCapability("appActivity", "ApiDemos");
		driver.findElement(By.id("android:id/text1")).click();
		HardCoded.sleep("", 3);
		driver.findElement(By.id("android:id/text1")).click();
		HardCoded.sleep("", 3);
		WebElement checkBox = driver.findElement(By.xpath("//android.widget.TextView[@text = 'Conquer World']/following-sibling::android.widget.CheckBox[@resource-id = 'com.example.android.apis:id/tasklist_finished']"));
		checkBox.click();*/
		
		
		
		
		//
		/*DesiredCapabilities cap = new DesiredCapabilities();
		cap.setPlatform(Platform.ANDROID);
		cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "ZY223Z7DZG");
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(cap);
		driver.get("https://www.google.co.in");*/
		
		
		/*UiElement searchField = driver.elementWithCss("input[name='q']");
		searchField.enterText("Test Mile");
		AndroidDriver<WebElement>  baseDriver = (AndroidDriver<WebElement>) driver.getUnderlyingEngine();
		baseDriver.findElement(By.cssSelector("input[name='q']")).sendKeys(Keys.ESCAPE);
		Thread.sleep(3000);
		List<UiElement> searchButtonList = driver.elementWithXPath("//button[@aria-label = 'Google Search']/div").getAllInstances();
		System.out.println(searchButtonList.size());
		for (UiElement webElement : searchButtonList) {
			if (webElement.isVisible()) {
				webElement.click();
				break;
			}
		}
		*/
		
//		WebElement searchField = driver.findElement(By.cssSelector("input[name='q']"));
//		searchField.sendKeys("Test Mile");
//		searchField.sendKeys(Keys.ESCAPE);
		
		/*List<WebElement> searchButtonList = driver.findElements(By.xpath("//button[@aria-label = 'Google Search']/div"));
		System.out.println(searchButtonList.size());
		for (WebElement webElement : searchButtonList) {
			if (webElement.isDisplayed()) {
				webElement.click();
				break;
			}
		}*/
		/*List<WebElement> searchResult = driver.findElements(By.cssSelector("div[class = 'srg']>div>div>div>div>div>div>h3>a"));
		WebElement firstSearch = searchResult.get(0);
		String linkTitle = firstSearch.getAttribute("text");
		System.out.println(linkTitle);
		firstSearch.click();
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		if (linkTitle.equals(pageTitle)) {
			System.out.println("Both titles are equal");
		} else {
			System.out.println("Both titles are not equal");
		}

		System.out.println("Execution completed!!");*/

	//}
}

}