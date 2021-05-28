package javaLearning.ConstructorRelated;

import org.openqa.selenium.WebDriver;

public class UsingSel extends SelPerspective {
    public WebDriver heredriver;
    public UsingSel(String browser) {
        super(browser);
        this.heredriver=driver;
    }
    public void launchSite()
    {
        heredriver.get("https://www.flipkart.com");
    }

    public static void main(String[] args) {
        UsingSel usingSel= new UsingSel("firefox");
        usingSel.launchSite();
    }

}
