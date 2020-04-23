package pages;

import automationpractice.User;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends Page {
    private User user;
    public static final String PATH_SIGN_IN = "#SubmitLogin > span";


    public AuthenticationPage(WebDriver driver, User user) {
        super(driver, "Login - My Store");
        this.user = user;
    }

    public void createAnAccount() {
        fill("email_create", user.generateEmail());
        submit();
    }

    public void submit() {
        click("SubmitCreate");
    }


    public void enterCredintials() {
        fill("email", user.getEmail());
        fill("passwd", user.getPassword());
        cssClick(PATH_SIGN_IN);
    }
    public void enterWrongCredintials() {
        fill("email", user.getEmail());
        fill("passwd", "231123341231");
        cssClick(PATH_SIGN_IN);
    }

    



}
