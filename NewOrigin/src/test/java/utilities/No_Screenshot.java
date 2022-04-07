package utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class No_Screenshot {
	
	

	public void screen(WebDriver driver, String name) throws IOException {
		TakesScreenshot tss=(TakesScreenshot) driver;
		
		File capturescreen=	tss.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(System.getProperty("user.dir")+"\\ScreenShot\\"+name+".png");
		
		FileHandler.copy(capturescreen, dest);
		
	}

}
