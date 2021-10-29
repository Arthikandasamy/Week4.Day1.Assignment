package Week4assignmentday1;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		WebElement webele=driver.findElement(By.xpath("//iframe[@src='default.html']"));
		File src=webele.getScreenshotAs(OutputType.FILE);
		File dst=new File("./snaps/pic1.png");
		FileUtils.copyFile(src, dst);
		List<WebElement> findElements = driver.findElements(By.tagName("iframe"));
		int size=findElements.size();
		System.out.println("The size is:" +size);
	}

}
