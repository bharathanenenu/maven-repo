package com.virphy.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.virphy.common.BrowserHooks;

public class SelHomePage {
	
	public WebDriver driver;

	// Globar variable defined to all page level webelement address through Xpath locators.
	String PageTitle="Selenium - Web Browser Automation";
	
	By SearchSelenium			= By.xpath("//input[@id='q']");
	By GO						= By.xpath("//input[@value='Go']");
	By ProjectTab				= By.xpath("//li[@id='menu_projects']/a");
	By DownloadTab				= By.xpath("//li[@id='menu_download']/a");
	By DocumentationTab			= By.xpath("//li[@id='menu_documentation']/a");
	By SupportTab				= By.xpath("//li[@id='menu_support']/a");
	By AboutTab					= By.xpath("//li[@id='menu_about']/a");
	
 
	public SelHomePage(WebDriver driver) {
		this.driver= driver;
	}
	
	public void searchSelenium(String enterTxt) {
		driver.findElement(SearchSelenium).sendKeys(enterTxt);
		driver.findElement(GO).click();
	}
	
	public void clickProjectTab() {
		driver.findElement(ProjectTab).click();
	}
	
	public void clickDownloadTab() {
		driver.findElement(DownloadTab).click();
	}
	
	public void clickDocumentTab() {
		driver.findElement(DocumentationTab).click();
	}
	
	public void clickSupportTab() {
		driver.findElement(SupportTab).click();
	}
	
	public void clickAboutTab() {
		driver.findElement(AboutTab).click();
	}
	
	public void getPageTitle() {
		String actualTitle= driver.getTitle();
		if(PageTitle.equals(actualTitle)) {
			System.out.println("Title matches.."+actualTitle);
		}
	}
	
	
	
	

}
