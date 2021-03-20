package Docker;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Chrome4 {

    @Test
    public void test() throws MalformedURLException {
        DesiredCapabilities ds = DesiredCapabilities.chrome();
        URL url = new URL("http://localhost:4444/wd/hub");

        RemoteWebDriver driver = new RemoteWebDriver(url, ds);

        driver.get("https://www.gmail.com/");

        System.out.println("Title of the page " + driver.getTitle());


        driver.quit();
    }
}
