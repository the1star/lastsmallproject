package arrivalimagesreviewpom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeautomationPOM {
	WebDriver driver;

	By Shop=By.xpath("//a[contains(text(),'Shop')]");
	By Home=By.xpath("//a[contains(text(),'Home')]");
	By Image=By.xpath("//li[@class='post-160 product type-product status-publish has-post-thumbnail product_cat-selenium product_tag-ruby product_tag-selenium has-post-title no-post-date has-post-category has-post-tag has-post-comment has-post-author first instock downloadable taxable shipping-taxable purchasable product-type-simple']//img[@class='attachment-shop_catalog size-shop_catalog wp-post-image']");
	By Addtocart=By.xpath("//button[@class='single_add_to_cart_button button alt']");
	By Description=By.xpath("//a[contains(text(),'Description')]");
	public PracticeautomationPOM(WebDriver driver){
		this.driver=driver;
	}
	
	public void Shop(){
		driver.findElement(Shop).click();
		}
	
	public void Home(){
		driver.findElement(Home).click();
		}
	public void Image(){
		driver.findElement(Image).click();
		}
	public void Addtocart(){
		driver.findElement(Addtocart).click();
		}
	public void Description(){
		driver.findElement(Description).click();
		}
	
}
