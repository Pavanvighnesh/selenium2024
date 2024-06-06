package selenium2024.cucumber2024;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class vpack {


		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://omayo.blogspot.com/");
			System.out.println(driver.getTitle());

		}

	}



