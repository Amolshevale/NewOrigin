package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class No_Basetest {
	public static WebDriver driver;
	public static String user;
	public static String pass;


	@BeforeClass
	public void init() throws IOException {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\config.properties";

		FileInputStream fis = new FileInputStream(path);

		Properties prop = new Properties();
		prop.load(fis);

		driver.get(prop.getProperty("url"));
		
		 user=prop.getProperty("username");
		 pass=prop.getProperty("password");


		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7000));

	}

	@AfterSuite
	public void tearDown() {

		driver.close();

	}
}
