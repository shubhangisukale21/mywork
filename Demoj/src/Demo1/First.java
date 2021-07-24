package Demo1;

import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.Select;
@Test
public class First {
		jayesh@06
		ChromeDriver driver;
		//@Test
		//public void verifyTitleValid() {
	 
			
			//System.setProperty("webdriver.chrome.driver","C://Users//samsung//Desktop//7pm_folder//chromedriver.exe");	
	        //driver = new ChromeDriver();
			//driver.get("https://www.seleniumeasy.com/test/basic-first-form-demo.html");
			//driver.manage().window().maximize();
			
			//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			
			//driver.findElement(By.xpath("//*[@id=\"user-message\"]")).sendKeys("shubhangi");
			
			//driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[1]/div[2]/form/button")).click();
		
			//String getresult = driver.findElement(By.xpath("//*[@id=\"display\"]")).getText();
			//System.out.println(getresult);
			//Assert.assertEquals(getresult, "shubhangi");
			//driver.findElement(By.xpath("//*[@id=\"sum1\"]")).sendKeys("10");
			//driver.findElement(By.xpath("//*[@id=\"sum2\"]")).sendKeys("20");
			//driver.findElement(By.xpath("//*[@id=\"gettotal\"]/button")).click();
			//String getresult = driver.findElement(By.xpath("//*[@id=\"displayvalue\"]")).getText();
			//System.out.println(getresult);
			//Assert.assertEquals(getresult, "30");
			
			//driver.close();
		//}

/*@Test
public void verifyCheckboxValid(){

	
	System.setProperty("webdriver.chrome.driver","C://Users//samsung//Desktop//7pm_folder//chromedriver.exe");	
    driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
	driver.manage().window().maximize();
	if ( !driver.findElement(By.xpath("//*[@id=\"isAgeSelected\"]")).isSelected() )
	{
	 driver.findElement(By.xpath("//*[@id=\"isAgeSelected\"]")).click();
	}
	String getresult = driver.findElement(By.xpath("//*[@id=\"txtAge\"]")).getText();
	System.out.println(getresult);
	driver.findElement(By.xpath("//*[@id=\"check1\"]")).click();
}*/
	
/*@Test
public void verifyradiobuttonValid()
{

	
	System.setProperty("webdriver.chrome.driver","C://Users//samsung//Desktop//7pm_folder//chromedriver.exe");	
    driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-radiobutton-demo.html");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/label[2]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"buttoncheck\"]")).click();

	String getresult = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[3]")).getText();
	System.out.println(getresult);
	Assert.assertEquals(getresult, "Radio button 'Female' is checked");
	
	
	driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[1]/label[2]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/div[2]/label[3]/input")).click();
	driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/button")).click();
	String getresult1 = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[2]/div[2]/p[2]")).getText();
	getresult1.toString().contains("Sex : Female");
	getresult1.toString().contains("Age group: 15 - 50");
	
}
}*/


	
/*@Test
public void verifydropdownValid(){

	
	System.setProperty("webdriver.chrome.driver","C://Users//samsung//Desktop//7pm_folder//chromedriver.exe");	
    driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/basic-select-dropdown-demo.html");
	driver.manage().window().maximize();



	Select drpday = new Select(driver.findElement(By.id("select-demo")));
	drpday.selectByVisibleText("Sunday");
	String getresult = driver.findElement(By.xpath("//*[@id=\"easycont\"]/div/div[2]/div[1]/div[2]/p[2]")).getText();
	System.out.println(getresult);
	Assert.assertEquals(getresult, "Day selected :- Sunday");
	
	driver.findElement(By.xpath("//*[@id=\"multi-select\"]/option[1]")).click();
	driver.findElement(By.xpath("//*[@id=\"printMe\"]")).click();
	//driver.findElement(By.xpath("//*[@id=\"multi-select\"]")).click();
	//driver.findElement(By.xpath("//*[@id=\"printAll\"]")).click();
}*/


/*@Test
public void verifyinputformdemoValid(){

	
	System.setProperty("webdriver.chrome.driver","C://Users//samsung//Desktop//7pm_folder//chromedriver.exe");	
    driver = new ChromeDriver();
	driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[1]/div/div/input")).sendKeys("Rani");
	driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[2]/div/div/input")).sendKeys("patil");
	driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[3]/div/div/input")).sendKeys("test21@gmail.com");
	driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[4]/div/div/input")).sendKeys("6742390865");
	driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[5]/div/div/input")).sendKeys("puneqwerts");
	driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[6]/div/div/input")).sendKeys("pune");
	Select drpday = new Select(driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[7]/div/div/select")));
	drpday.selectByVisibleText("Iowa");
	driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[8]/div/div/input")).sendKeys("1102");
	driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[9]/div/div/input")).sendKeys("https://www.seleniumeasy.com/test/input-form-demo.html");

	driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[10]/div/div[1]/label/input")).click();
	driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/div/textarea")).sendKeys("test");
	String getresult1 = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[11]/div/small[1]")).getText();
	System.out.println(getresult1);
	Assert.assertEquals(getresult1, "Please enter at least 10 characters and no more than 200");
	driver.findElement(By.xpath("//*[@id=\"contact_form\"]/fieldset/div[13]/div/button")).click();
	
}
}*/
		
	/*@Test
	public void verifysubmitformdemoValid(){

			
			System.setProperty("webdriver.chrome.driver","C://Users//samsung//Desktop//7pm_folder//chromedriver.exe");	
		    driver = new ChromeDriver();
			driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//*[@id=\"title\"]")).sendKeys("Raj");
			driver.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("test");
			driver.findElement(By.xpath("//*[@id=\"btn-submit\"]")).click();
	}
}*/

	@Test
	public void verifydropdownsearchdemovalid(){
				
				System.setProperty("webdriver.chrome.driver","C://Users//samsung//Desktop//7pm_folder//chromedriver.exe");	
			    driver = new ChromeDriver();
				driver.get("https://www.seleniumeasy.com/test/jquery-dropdown-search-demo.html");
				driver.manage().window().maximize();
				Select drpday = new Select(driver.findElement(By.id("")));
				drpday.selectByVisibleText("India");
	}
}
				
				
				
				
				
				
				