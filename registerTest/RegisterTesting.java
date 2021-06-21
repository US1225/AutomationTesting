package com.selenium.registerTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


class testing {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uttam.singh\\Downloads\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Thread.sleep(1000);	
		
		String fnames[] = {"","d@js@&^%","5656567646","Uttam"};
		String lnames[] = {"","d@js@&^%","5656567646","Singh"};
		String addr[] = {"","@#$%^&#$%","876567898765","Maven wave soft Pvt Ltd"};
		String em[] = {"","@dhfjkdfhgmail.com","uttamsingh@gmail..com.","uttamsingh1225@gmail.com"};
		String ph[] = {"","14745745","54545","8506030603"};
		String fpass[] = {"","dfghj","234567899876","Uttam@123"};
		String cpass[] = {"","d@js@&^%","5656567646","Uttam@123"};
		String cBox[] = {"checkbox1","checkbox2","checkbox3","checkbox1"};	
		
		InterruptedException errorCollector = new InterruptedException();
		
		try {
		
			//clicking register button
			driver.findElement(By.linkText("Register")).click();
			Thread.sleep(1000);
			
			for(int i=0;i<em.length;++i)
			{
				//Entering First name
				WebElement fn = driver.findElement(By.xpath("//input[@type=\"text\"]"));
				fn.sendKeys(fnames[i]);
				Thread.sleep(1000);
				
				//Entering last name
				WebElement ln = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input"));
				ln.sendKeys(lnames[i]);
				Thread.sleep(1000);
				
				//Entering Address
				WebElement add = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[2]/div/textarea"));
				add.sendKeys(addr[i]);
				Thread.sleep(1000);
				
				//Entering Email
				WebElement emm = driver.findElement(By.xpath("//input[@type=\"email\"]"));
				emm.sendKeys(em[i]);
				Thread.sleep(1000);
				
				//Entering Phone number
				WebElement phh = driver.findElement(By.xpath("//input[@type=\"tel\"]"));
				phh.sendKeys(ph[i]);
				Thread.sleep(1000);
				
												
				//checking the condition so that first time this won't run
				if(i>0)          
				{
					//selecting radio button
					WebElement radio1= driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[5]/div/label[1]/input"));
					radio1.click();
					Thread.sleep(1000);
				
					//selecting checkboxes
					WebElement option1 = driver.findElement(By.id(cBox[i]));
					option1.click();
					Thread.sleep(1000);
				
	  				//clicking on language drop-down icon
					WebElement dropdown_arrow = driver.findElement(By.xpath("//*[@id=\"msdd\"]"));
					dropdown_arrow.click();
					Thread.sleep(1000);
				
					//selecting language
					WebElement dropdown_value = driver.findElement(By.xpath("//*[@id=\"basicBootstrapForm\"]/div[7]/div/multi-select/div[2]/ul/li[16]/a"));
					dropdown_value.click();
					Thread.sleep(1000);
					
					//clicking in random area to close drop-down menu
					WebElement rc = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form"));
					rc.click();
					Thread.sleep(1000);
					
					//clicking on skills
					WebElement sk = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[8]/div/select"));
					sk.click();
					Thread.sleep(1000);
					
					//selecting skills
					WebElement skills = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[8]/div/select/option[3]"));
					skills.click();
					Thread.sleep(1000);
					
					//clicking in random area to close drop-down menu
					WebElement rc1 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form"));
					rc1.click();
					Thread.sleep(1000);
					
					//clicking on country
					WebElement cs = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[9]/div/select"));
					cs.click();
					Thread.sleep(1000);
				
					//selecting country
					WebElement country = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[9]/div/select/option[106]"));
					country.click();
					Thread.sleep(1000);
					
					//clicking in random area to close drop-down menu
					WebElement rc2 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form"));
					rc2.click();
					Thread.sleep(1000);
				
					//clicking country again 
					WebElement sc = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[10]/div/span/span[1]/span/span[2]/b"));
					sc.click();
					Thread.sleep(1000);
				
					//selecting country again
					WebElement sc1 = driver.findElement(By.xpath("/html/body/span/span/span[2]/ul/li[6]"));
					sc1.click();
					Thread.sleep(1000);
					
					//clicking in random area to close drop-down menu
					WebElement rc3 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form"));
					rc3.click();
					Thread.sleep(1000);
					
					//clicking on year tab
					WebElement year = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select"));
					year.click();
					Thread.sleep(1000);
				
					//selecting year
					WebElement yy = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[1]/select/option[10]"));
					yy.click();
					Thread.sleep(1000);
					
					//clicking in random area to close drop-down menu
					WebElement rc4 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form"));
					rc4.click();
					Thread.sleep(1000);
			
					//clicking on month tab
					WebElement month = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select"));
					month.click();
					Thread.sleep(1000);
					
					//selecting month
					WebElement mm = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[2]/select/option[13]"));
					mm.click();
					Thread.sleep(1000);
					
					//clicking in random area to close drop-down menu
					WebElement rc5 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form"));
					rc5.click();
					Thread.sleep(1000);
					
					//clicking on date tab
					WebElement date = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select"));
					date.click();
					Thread.sleep(1000);
				
					//selecting date
					WebElement dd = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[11]/div[3]/select/option[26]"));
					dd.click();
					
					//clicking in random area to close drop-down menu
					WebElement rc6 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form"));
					rc6.click();
					Thread.sleep(1000);
				} 
				 
				//Entering password
				WebElement fp = driver.findElement(By.id("firstpassword"));
				fp.sendKeys(fpass[i]);
				Thread.sleep(1000);
				
				//Entering confirm password
				WebElement lp = driver.findElement(By.id("secondpassword"));
				lp.sendKeys(cpass[i]);
				Thread.sleep(1000);
				
				if(i>0)
				{
					//selecting image
					WebElement imgg = driver.findElement(By.xpath("//*[@id=\"imagesrc\"]"));
					imgg.sendKeys("C:\\Users\\Uttam.singh\\Downloads");
				}
				Thread.sleep(1000);
				
				//clicking on submit button
				WebElement sub = driver.findElement(By.id("submitbtn"));
				sub.click();
				Thread.sleep(5000);
				
				//clicking on refresh button to run loop again with new values
				if(i<3)
				{
					WebElement ref  = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/form/div[14]/div/button[2]"));
					ref.click();
				}
				
			}
		
		}catch(Throwable e) {
		
			errorCollector.addSuppressed(e);
		}
		
		driver.close();
	
	}

	
}

