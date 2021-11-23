import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class LoginTest {

    @Test
    public void imageVerify() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//jasme//driver96//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com/shop/buy-iphone/iphone-13");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        WebElement image = driver.findElement(By.className("rf-flagship-main-image"));
                //div[3]/div[2]/div[3]/div/div/img"));
        //System.out.println((String)image);
        String url = image.getAttribute("src");
        System.out.println("Image url: " + url);
        String image_info = url.substring(url.lastIndexOf("/")+1);
        System.out.println("Image info: " + image_info);
        assertEquals("iphone-13-family-select-2021?wid=940&hei=1112&fmt=jpeg&qlt=80&.v=1629842667000", image_info);
        driver.close();

    }

    @Test
    public void video_test() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C://Users//jasme//driver96//chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.apple.com/airpods/");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);
        WebElement image = driver.findElement(By.xpath("//video[@id='airpods-3rd-gen-video']"));
        System.out.println(image.getAttribute("src"));
        assertNotNull(image,"video is playing");
        driver.close();
    }
}
