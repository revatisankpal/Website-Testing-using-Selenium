package com.tka.utilities;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableContent {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://javabykiran.com/liveproject/pages/examples/links.html");
		
		List<WebElement>numberofRows=driver.findElements(By.xpath("//table[@class='table table-hover']//tr"));
		List<WebElement> numberOfColumns=driver.findElements(By.xpath("//table[@class='table table-hover']//tr/th"));
		
		for(int i=2;i<=numberofRows.size();i++)
		{
			for(int j=1;j<=numberOfColumns.size();j++)
			{
				String text=driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(text);
			}
			System.out.println();
		}
		
	}

}
