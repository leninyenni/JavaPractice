package seleniumPrograms.WebDriverArchitecture;

public class test {
    public static void main(String[] args) {
        webdriver chdriver=new chromedriver();
        chdriver.get("hello chrome");

        webdriver ffdriver=new firefoxdriver();
        ffdriver.get("hello ff");

        webdriver iedriver= new iedriver();
        iedriver.get("hello ie");

        webdriver safaridriver= new safaridriver();
        safaridriver.get("hello safari");
    }
}
