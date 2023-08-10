package githubpull;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class home {
	Actions act;
@FindBy (xpath="//div[@id='container_tasks']")
private WebElement Task ;

@FindBy (xpath="//*[text()='Time-Track']")
private WebElement TimeTrack;

@FindBy (xpath="//*[text()='Reports']")
private WebElement Report;

@FindBy(xpath="//*[text()='Users']")
private WebElement User;

@FindBy (xpath="//*[text()='Logout']")
private WebElement Logout;

public home(WebDriver driver){
		PageFactory.initElements(driver,this );
		act=new Actions(driver);
	}
	
//	public void allmethods() {
//		Task.click();
//		TimeTrack.click();
//		Report.click();
//		User.click();
//		Logout.click();
//	}
public void clickonTasks(){
	Task.click();

}
public void clickonTimeTrack() {
	TimeTrack.click();

}
public void clickonreport() {
	Report.click();
}
public void clickonUser() {
	User.click();
}
public void clickonlogout() {
	Logout.click();
}

}
