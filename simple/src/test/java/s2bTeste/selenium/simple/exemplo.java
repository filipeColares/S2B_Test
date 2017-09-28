package s2bTeste.selenium.simple;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class exemplo {

	@Test
	public void test(){
		WebDriver driver;
		driver = new ChromeDriver();
		
		driver.navigate().to("http://iepmoinhos.com/testehpv/Account?ReturnUrl=%2ftestehpv");
		
	}

}
