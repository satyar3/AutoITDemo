package AutoITDemo.AutoITDemo;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
    	String filePath = "C:\\Back Up\\P Workspace\\AutoITDemo\\Resources\\FIle.txt";
        System.setProperty("webdriver.chrome.driver", "C:\\Back Up\\P Workspace\\AutoITDemo\\Resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("file:///C:/Back%20Up/P%20Workspace/AutoITDemo/Resources/Browse.html");
        driver.findElement(By.id("1")).click();
        
        Runtime.getRuntime().exec("C:\\Back Up\\P Workspace\\AutoITDemo\\Resources\\FileUpload.exe");
        Runtime.getRuntime().exec("C:\\Back Up\\P Workspace\\AutoITDemo\\Resources\\AnyBrowser.exe" + " "+ filePath);
    }
}
