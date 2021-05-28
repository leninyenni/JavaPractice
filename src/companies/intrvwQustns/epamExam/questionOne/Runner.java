package companies.intrvwQustns.epamExam.questionOne;

public class Runner{
    public static void main(String[] args) {
        BasePage basePage= new HomePage();
        String pageurl=basePage.getPageUrl();
        System.out.println(pageurl);

    }
}
