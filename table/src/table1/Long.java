package table1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class Long {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ssss\\Desktop\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver smart = new ChromeDriver(options);
		
		
		String baseUrl = "http://www.facebook.com/";
		String expectedTitle = "Welcome.Facebook";
		String actualTitle = "";
		
		smart.get(baseUrl);
		actualTitle = smart.getTitle();
		
		if(actualTitle.contentEquals(expectedTitle)) {
			System.out.println("Right");
		}else {
			System.out.println("Wrong");
		}	
		
		WebElement UserNameBox = smart.findElement(By.id("email"));
		
		UserNameBox.sendKeys("anticbaby@gmail.com");
		smart.findElement(By.id("pass")).sendKeys("qaclass123");
		smart.findElement(By.name("login")).click();
		smart.manage().window().maximize();
		smart.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		smart.findElement(By.xpath("//*[@id=\"mount_0_0\"]/div/div[1]/div[1]/div[3]/div/div/div[1]/div[1]/div/div[2]/div/div/div[3]/div/div[2]/div/div/div/div[1]/a/div[1]/div")).click();
		smart.findElement(By.xpath("//a[text()='Friends']")).click();


		 
	    List <WebElement> AllFriends =smart.findElements(By.xpath("//div[@class='buofh1pr hv4rvrfc']/div/a"));
	    
		 System.out.println(AllFriends.size());
		 
		
		 for (int i =0; i<AllFriends.size(); i++) {
			 System.out.println(AllFriends.get(i).getText());
		 }
		
		
		 
	
	
	
		
		
		
		
		
		

	}

}
