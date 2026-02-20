package testbase;

import org.openqa.selenium.WebDriver;
import pageobjects.AddCustomerPage;
import pageobjects.LoginPage;
import org.apache.logging.log4j.Logger;   //Log4j
import java.util.Properties;


public class BaseClass {

    protected WebDriver driver;
    protected LoginPage loginPage;
    protected AddCustomerPage addCustomerPage;
    protected static  Logger logger;
    protected Properties p;

    //testing Push



}