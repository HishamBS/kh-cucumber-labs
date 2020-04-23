package pages;

import org.openqa.selenium.WebDriver;

public class MyAccountPage extends Page {
    public static final String PATH_SIGN_OUT = "#header > div.nav > div > div > nav > div:nth-child(2) > a";


    public MyAccountPage(WebDriver driver) {
        super(driver, "My account - My Store");
    }
    public void signOut() {
        super.cssClick(PATH_SIGN_OUT);
    }

}
