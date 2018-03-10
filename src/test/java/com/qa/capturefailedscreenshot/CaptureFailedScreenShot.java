package com.qa.capturefailedscreenshot;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class CaptureFailedScreenShot {
	
	
	@Test
	public void sample1Test()
	{
		Assert.assertTrue(false);
	}

	@Test
	public void sample2Test()
	{
		Assert.assertTrue(true);
	}
	
	@AfterMethod
	public void afterMethod(ITestResult t) throws Exception
	{
		if(!t.isSuccess())
		{
			System.out.println(""+t.getName());
			
			captureScreenShot(t.getName());
			
		}
		
	}
	
	public void captureScreenShot(String methodName) throws Exception
	{		
		System.out.println("Capturing Screenshot for failed test '"+methodName+"'...");		
		String screenshotFilePath = "Resources\\Screenshot\\"+methodName+".png";

		Robot robot = new Robot();
		
		Rectangle screenRect = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
		BufferedImage screenFullImage  = robot.createScreenCapture(screenRect);
		ImageIO.write(screenFullImage, "png", new File(screenshotFilePath));				
	}
	
}
