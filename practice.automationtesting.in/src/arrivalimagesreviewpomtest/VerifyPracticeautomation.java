package arrivalimagesreviewpomtest;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import arrivalimagesreviewpom.PracticeautomationPOM;

public class VerifyPracticeautomation {
		@Test
		public void checklogin() throws InterruptedException{
			System.setProperty("webdriver.chrome.driver", "E:\\seleniumGH20software\\chromedriver_win32 (1)\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.navigate().to("http://practice.automationtesting.in");
			driver.manage().window().maximize();
			
			PracticeautomationPOM practice=new PracticeautomationPOM(driver);
			//Thread.sleep(2000);
			practice.Shop();
			//Thread.sleep(1000);
			practice.Home();
			
			
			
			
			
			
			List<WebElement> linklist=driver.findElements(By.className("woocommerce-LoopProduct-link"));
		    System.out.println("no of link: "+linklist.size());
		  /*  int count=0;
			for(int i=0;i<linklist.size();i++){        
				System.out.println("no of link: "+linklist.get(i).getText());
			          count++;
			}  
			
			if(count==3)
			{			    
				System.out.println("correct");
			}
			*/
			
			//Thread.sleep(1000);
		/*	String actual=driver.findElement(By.xpath("//h3[contains(text(),'Selenium Ruby')]")).getText();
			String expected = "Selenium Ruby";
			Assert.assertEquals(actual, expected);
			System.out.println(actual);
			
			String actual2=driver.findElement(By.xpath("//h3[contains(text(),'Thinking in HTML')]")).getText();
			String expected2="Thinking in HTML";
			Assert.assertEquals(actual2, expected2);
			System.out.println(actual2);
			
			String actual3=driver.findElement(By.xpath("//h3[contains(text(),'Mastering JavaScript')]")).getText();
			String expected3="Mastering JavaScript";
			Assert.assertEquals(actual3, expected3);
			System.out.println(actual3);*/
			
			////li[@class='post-163 product type-product status-publish has-post-thumbnail product_cat-html product_tag-html has-post-title no-post-date has-post-category has-post-tag has-post-comment has-post-author first instock sale downloadable taxable shipping-taxable purchasable product-type-simple']//a[@class='button product_type_simple add_to_cart_button ajax_add_to_cart'][contains(text(),'Add to basket')]
			practice.Image();
			//Thread.sleep(2000);
			String title2=driver.getTitle();
			String expectdtitle2="Selenium Ruby – Automation Practice Site";
			Assert.assertEquals(expectdtitle2, title2);
			System.out.println(expectdtitle2);
			practice.Addtocart();
			Thread.sleep(2000);
		/*	String actual4=driver.findElement(By.xpath("//div[@class='woocommerce-message']")).getText();
			String expected4="VIEW BASKET “Selenium Ruby” has been added to your basket.";
			Assert.assertEquals(actual4, expected4);
			System.out.println(actual4);*/
			practice.Description();
			Thread.sleep(2000);
			String actual5=driver.findElement(By.xpath("//h2[contains(text(),'Product Description')]")).getText();
			String expected5="Product Description";
			Assert.assertEquals(actual5, expected5);
			System.out.println(actual5);
			driver.close();
		
		}
}
