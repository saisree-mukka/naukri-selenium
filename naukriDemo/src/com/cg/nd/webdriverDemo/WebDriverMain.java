package com.cg.nd.webdriverDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMain {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\Saisree Mukka\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.naukri.com");
		
		
		 WebElement element1=driver.findElement(By.id("p0widget"));
		 WebElement tblUsers = element1.findElement(By.xpath(".//div/div[1]/div/input"));
		 tblUsers.click();
		
		 WebElement element2=driver.findElement(By.id("flowBifurcation"));
		 WebElement ele=element2.findElement(By.xpath(".//div[2]/form/div[1]/div/button"));
		 ele.click();
		 
		 WebElement element3=driver.findElement(By.id("fname")); 
		 element3.sendKeys("Saisree");
		 
		 WebElement element4=driver.findElement(By.id("email"));
		 element4.sendKeys("saisree@gmail.com");
		 
		 WebElement element5=driver.findElement(By.id("basicDetailForm"));
		 WebElement ele1=element5.findElement(By.xpath(".//div[3]/div[1]/div/input"));
		 ele1.sendKeys("saisree@169");
		 
		 WebElement element6=driver.findElement(By.id("basicDetailForm"));
		 WebElement ele2=element6.findElement(By.xpath(".//div[4]/div[1]/div/input[2]"));
		 ele2.sendKeys("9640178686");
		 
		 WebElement element7=driver.findElement(By.id("basicDetailForm"));
		 WebElement ele3=element7.findElement(By.xpath(".//resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input"));
		 ele3.sendKeys("Ahmedabad");
		 
		 WebElement element8=driver.findElement(By.id("basicDetailForm"));
		 WebElement ele4=element8.findElement(By.xpath(".//resman-uploader/div/div[1]/span[1]/input"));
		 ele4.sendKeys("D:\\Saisree Mukka\\Module 3\\resume.docx");
		 
		 WebElement element9=driver.findElement(By.id("basicDetailForm"));
		 WebElement ele5=element9.findElement(By.xpath(".//div[5]/div/div/div[2]/button"));
		 ele5.submit();
		 
		
		 
		 
		 
}
}
