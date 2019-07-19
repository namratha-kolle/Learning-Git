package testng;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseClass2 {

	public static String Key="webdriver.chrome.driver";
	public static String Value="./driver/chromedriver.exe";
	
	public static WebDriver driver;
	public static Workbook read;
	public static String path=null;
	public static Sheet sheet;
	public static Row row;
	public static JavascriptExecutor jse;
	public static WebElement un=null;
	public static WebElement pw= null;
	
}
