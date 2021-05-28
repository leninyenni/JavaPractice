package seleniumPrograms.XpathRelated;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetEnabledOnes {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "D:\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        driver.manage().window().maximize();

        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("admin123");
        driver.findElement(By.id("btnLogin")).click();

        driver.findElement(By.id("menu_admin_viewAdminModule")).click();
        driver.findElement(By.id("menu_admin_UserManagement")).click();
        driver.findElement(By.id("menu_admin_viewSystemUsers")).click();

        int rowcount = driver.findElements(By.xpath("//table[@id='resultTable']//tbody/tr")).size();
        System.out.println(rowcount);
        int statuscount = 0;
        for(int i=1; i<= rowcount; i++){
            String status = driver.findElement(By.xpath("//table[@id='resultTable']//tbody/tr["+i+"]/td[5]")).getText();
            if(status.equals("Enabled")){
                statuscount = statuscount + 1;
            }
        }
        System.out.println("No of Employees Enabled : " + statuscount);
        driver.close();
    }
}
