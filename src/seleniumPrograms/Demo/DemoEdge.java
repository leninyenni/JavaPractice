package seleniumPrograms.Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DemoEdge {
    
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Execution after setting EdgeDriver path in System Variables on Windows!!");
        System.setProperty("webdriver.edge.driver","C:\\Users\\91939\\edgedriver\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get("https://demoqa.com");
        Thread.sleep(3000);
        driver.quit();
        System.out.println("Execution complete on Windows");

    }
}
