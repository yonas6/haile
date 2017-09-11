package webDriverpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Phptravelss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//open Chrome browser 
		WebDriver driver = new ChromeDriver();
		//open  http://www.phptravels.net/
		driver.get(" http://www.phptravels.net/");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[2]/a")).click();
        driver.findElement(By.name("firstname")).sendKeys("kebede");
        driver.findElement(By.name("lastname")).sendKeys("abebe");
        driver.findElement(By.name("phone")).sendKeys("703 567 2345");
        driver.findElement(By.name("email")).sendKeys("kebe78@gmail.com");
        driver.findElement(By.name("password")).sendKeys("1234567yH");
        driver.findElement(By.name("confirmpassword")).sendKeys("1234567yH");
        driver.findElement(By.xpath("//*[@id='headersignupform']/div[9]/button")).click();
        driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/ul/li[2]/ul/li[2]/a)")).click();
	}

}
