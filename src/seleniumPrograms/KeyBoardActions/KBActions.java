package seleniumPrograms.KeyBoardActions;


public class KBActions {

	public static void main(String[] args) throws Exception {
		Utilities WM = new Utilities();
		WM.openBrowser("https://www.google.com/advanced_search");
		Thread.sleep(3000);
		WM.MaximizeBrowser();
		Thread.sleep(3000);
	}
}
