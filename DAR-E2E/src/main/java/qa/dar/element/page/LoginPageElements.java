package qa.dar.element.page;

import org.openqa.selenium.support.PageFactory;
import qa.dar.base.page.BaseTest;

public class LoginPageElements extends BaseTest {

	// Initializing the Page Objects:
	public LoginPageElements() {
		PageFactory.initElements(driver, this);
	}
}
