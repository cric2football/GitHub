package com.GitHub;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GithubTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver myObj = new ChromeDriver();
System.setProperty("webdriver.chrome.driver", "‪C:\\Test\\chromedriver.exe");
myObj.get("https://www.google.com");
myObj.close();


	}

}

//Webdriver.Chrome.Driver", "C:\\Users\\12407\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe
//121.0.6167.161 (Official Build) (64-bit)