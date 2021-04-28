package seleniumPrograms.KeyBoardActions;


public class KBActions extends Utilities {

	public KBActions(String browser){
		super(browser);
	}
	public static void main(String[] args) throws Exception {
		new KBActions("firefox");
		openBrowser("https://www.google.com/advanced_search");
		Thread.sleep(3000);
		MaximizeBrowser();
		Thread.sleep(3000);
	}
}
