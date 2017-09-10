package webDriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoqa {

	public static void main(String[] args) {
		// open chrome browser
		WebDriver driver = new ChromeDriver();
		// launch http://demoqa.com
		driver.get("http://demoqa.com");
		//Click on Registration
		driver.findElement(By.id("menu-item-374")).click();
       // Enter Firstname, Lastname, select Marital Status, Check Hobby. Select Country, Select Date of Birth, phone number, username, Email, About yourself, Password. Confirm Password
		driver.findElement(By.name("first_name")).sendKeys("abebb");
		driver.findElement(By.name("last_name")).sendKeys("bekell");
		driver.findElement(By.name("radio_4[]"));
		driver.findElement(By.name("checkbox_5[]")).click();
		driver.findElement(By.name("dropdown_7")).sendKeys("ethiopa");
		driver.findElement(By.name("date_8[date][mm]")).sendKeys("6");
		driver.findElement(By.name("phone_9")).sendKeys("0911676852");
		driver.findElement(By.name("username")).sendKeys("kebe");
		driver.findElement(By.name("e_mail")).sendKeys("beke899@gmail.com");
		driver.findElement(By.name("description")).sendKeys("i am 25 years old");
		driver.findElement(By.id("password_2")).sendKeys("4567890n");
		driver.findElement(By.id("confirm_password_password_2")).sendKeys("4567890n");
		//Click on Submit button
		driver.findElement(By.name("pie_submit")).click();
		driver.close();
		
	}

}
