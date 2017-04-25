package BrowserUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Administrator on 2017/4/23.
 */
public class StartBrowser {
    WebDriver driver;
    public StartBrowser(int drivertype){
        setDriver(drivertype);
        maxBrowser();
    }


    public  void  setDriver(int drivertype){
        switch (drivertype){
            case 1:chrome();
            break;
            case 2:firfox();
            break;
        }

    }
    public  void maxBrowser(){
        driver.manage().window().maximize();
    }

    public void chrome(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Administrator\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
        driver=new ChromeDriver();

    }
    public void firfox(){
        System.setProperty("webdriver.gecko.driver","C:\\Program Files (x86)\\Mozilla Firefox\\geckodriver.exe");
      driver= new FirefoxDriver();

    }

    public static void main(String[] args) {
        StartBrowser d=new StartBrowser(2);
    }

}
