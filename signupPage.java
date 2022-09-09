package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class signupPage {
    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    public
    WebElement btnsignin;

    @FindBy(id = "email_create")
    WebElement txtemail;

    @FindBy(id = "SubmitCreate")
    WebElement btnsubmit;

    @FindBy(id = "id_gender1")
    WebElement radiomale;

    @FindBy(id = "id_gender2")
    WebElement radiofemale;

    @FindBy (id = "customer_firstname")
    WebElement customerfirstname;

    @FindBy (id = "customer_lastname")
    WebElement customerlastname;

    @FindBy (id = "email")
    WebElement txtmail;

    @FindBy(id = "passwd")
    WebElement txtpassword;

    @FindBy(id = "days")
    WebElement dday;

    @FindBy(id = "months")
    WebElement mmonth;

    @FindBy(id = "years")
    WebElement yyears;

    @FindBy(id = "firstname")
    WebElement myfirstnamee;

    @FindBy(id = "lastname")
    WebElement mylastname;

    @FindBy(id = "company")
    WebElement mycompany;

    @FindBy(id = "address1")
    WebElement myaddress;


    @FindBy(id = "city")
    WebElement mycity;


    @FindBy(id = "id_state")
    WebElement zipcode;

    @FindBy(id = "id_country")
    WebElement country;

    @FindBy (id = "phone_mobile")
    WebElement phonenumber;

    @FindBy(id = "submitAccount")
    WebElement register;

    WebDriver driver;
    public signupPage(WebDriver driver){
        this.driver= driver;
        // PageFactory.initElements(driver.this);
    }

}
