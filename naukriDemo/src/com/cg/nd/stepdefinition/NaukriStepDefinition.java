package com.cg.nd.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NaukriStepDefinition {

	
	private WebDriver driver;
	@Before(order=1)
	public void setupStepENV() {
		System.out.println("setupStepENV");
		System.setProperty("webdriver.chrome.driver","D:\\Saisree Mukka\\chromedriver.exe");
	}
	
	@Given("^user want to access 'www\\.naukri\\.com'$")
	public void user_want_to_access_www_naukri_com() throws Throwable {
		driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
	}

	@When("^User chooses to get registered$")
	public void user_chooses_to_get_registered() throws Throwable {
		 WebElement element1=driver.findElement(By.id("p0widget"));
		 WebElement tblUsers = element1.findElement(By.xpath(".//div/div[1]/div/input"));
		 tblUsers.click();
	}

	@When("^user chooses to register as fresher$")
	public void user_chooses_to_register_as_fresher() throws Throwable {
		
		WebElement element2=driver.findElement(By.id("flowBifurcation"));
		 WebElement ele=element2.findElement(By.xpath(".//div[2]/form/div[1]/div/button"));
		 ele.click();
	}

	@When("^user enters Name$")
	public void user_enters_Name() throws Throwable {
		WebElement element3=driver.findElement(By.id("fname")); 
		 element3.sendKeys("Saisree");
	}

	@When("^user enters email$")
	public void user_enters_email() throws Throwable {
		WebElement element4=driver.findElement(By.id("email"));
		 element4.sendKeys("saisree@gmail.com");
		 
	}

	@When("^user enters password$")
	public void user_enters_password() throws Throwable {
		WebElement element5=driver.findElement(By.id("basicDetailForm"));
		 WebElement ele1=element5.findElement(By.xpath(".//div[3]/div[1]/div/input"));
		 ele1.sendKeys("saisree@169");
	}

	@When("^user enters mobile number$")
	public void user_enters_mobile_number() throws Throwable {
		 WebElement element6=driver.findElement(By.id("basicDetailForm"));
		 WebElement ele2=element6.findElement(By.xpath(".//div[4]/div[1]/div/input[2]"));
		 ele2.sendKeys("9640178686");
	}

	@When("^user enters his current Location$")
	public void user_enters_his_current_Location() throws Throwable {
		WebElement element7=driver.findElement(By.id("basicDetailForm"));
		 WebElement ele3=element7.findElement(By.xpath(".//resman-location/div/div/div[1]/div/div[1]/ul/li/div/label/input"));
		 ele3.sendKeys("Ahmedabad");
	}

	@When("^user the uploads his/her resume$")
	public void user_the_uploads_his_her_resume() throws Throwable {
		WebElement element8=driver.findElement(By.id("basicDetailForm"));
		 WebElement ele4=element8.findElement(By.xpath(".//resman-uploader/div/div[1]/span[1]/input"));
		 ele4.sendKeys("D:\\Saisree Mukka\\Module 3\\resume.docx");
	}

	@When("^user then clicks register$")
	public void user_then_clicks_register() throws Throwable {
		 WebElement element9=driver.findElement(By.id("basicDetailForm"));
		 WebElement ele5=element9.findElement(By.xpath(".//div[5]/div/div/div[2]/button"));
		 ele5.submit();
	}

	@Then("^user successfully opens 'www\\.naukri\\.com' and display the success message$")
	public void user_successfully_opens_www_naukri_com_and_display_the_success_message() throws Throwable {
	   
	}


	@When("^User chooses to get registered in 'www\\.naukri\\.com'$")
	public void user_chooses_to_get_registered_in_www_naukri_com() throws Throwable {
		WebElement e1=driver.findElement(By.id("p0widget"));
		 WebElement tblUsers1 = e1.findElement(By.xpath(".//div/div[1]/div/input"));
		 tblUsers1.click();
	}

	@When("^user chooses to register as professional$")
	public void user_chooses_to_register_as_professional() throws Throwable {
		 WebElement e2=driver.findElement(By.id("flowBifurcation"));
		 WebElement web2=e2.findElement(By.xpath(".//div[2]/form/div[2]/div/button"));
		 web2.click();
	}

	@When("^user enters his/her Name$")
	public void user_enters_his_her_Name() throws Throwable {
		WebElement e3=driver.findElement(By.id("fname")); 
		 e3.sendKeys("Chinni");
	}
	@When("^user enters his/her email$")
	public void user_enters_his_her_email() throws Throwable {
		WebElement e4=driver.findElement(By.id("email"));
		 e4.sendKeys("chinni@gmail.com");
	}

	@When("^user enters his/her password$")
	public void user_enters_his_her_password() throws Throwable {
		
		WebElement e5=driver.findElement(By.id("basicDetailForm"));
		 WebElement web1=e5.findElement(By.xpath(".//div[3]/div[1]/div/input"));
		 web1.sendKeys("chinni@169");
	}

	@When("^user enters his/her mobile number$")
	public void user_enters_his_her_mobile_number() throws Throwable {
		WebElement e6=driver.findElement(By.id("basicDetailForm"));
		WebElement web2=e6.findElement(By.xpath(".//div[4]/div[1]/div/input[2]"));
		web2.sendKeys("9490358686");
	}

	@When("^user enters his/her total work experience in years$")
	public void user_enters_his_her_total_work_experience_in_years() throws Throwable {
		WebElement e7=driver.findElement(By.id("basicDetailForm"));
		WebElement web3=e7.findElement(By.xpath(".//resman-experience/div/div[1]/div/div[1]/div[1]/ul/li/div/label/input"));
		web3.sendKeys("1");
	}

	@When("^user enters his/her total work experience in months$")
	public void user_enters_his_her_total_work_experience_in_months() throws Throwable {
		WebElement e8=driver.findElement(By.id("basicDetailForm"));
		WebElement web4=e8.findElement(By.xpath(".//resman-experience/div/div[1]/div/div[2]/div[1]/ul/li/div/label/input"));
		web4.sendKeys("1");
	}

	@When("^user then uploads his/her resume$")
	public void user_then_uploads_his_her_resume() throws Throwable {
		WebElement e9=driver.findElement(By.id("basicDetailForm"));
		 WebElement web5=e9.findElement(By.xpath(".//resman-uploader/div/div[1]/span[1]/input"));
		 web5.sendKeys("D:\\Saisree Mukka\\Module 3\\resume.docx");
	}

	@When("^user then clicks register on professional Page$")
	public void user_then_clicks_register_on_professional_Page() throws Throwable {
		 WebElement e10=driver.findElement(By.id("basicDetailForm"));
		 WebElement web6=e10.findElement(By.xpath(".//div[5]/div/div/div[2]/button"));
		 web6.submit();
		 
		 
		 WebElement e11=driver.findElement(By.id("typePassword"));
		    e11.sendKeys("chinni@169");
		    
		    WebElement e12=driver.findElement(By.id("emailExistBox"));
		    WebElement e13=e12.findElement(By.xpath(".//div/div[2]/form/div[2]/button"));
		    e13.submit();
	}

	@Then("^user successfully opens 'www\\.naukri\\.com' and display the success message of registration$")
	public void user_successfully_opens_www_naukri_com_and_display_the_success_message_of_registration() throws Throwable {
	   
	}


}
