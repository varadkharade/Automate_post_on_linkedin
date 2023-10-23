package demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class TestCases {
    ChromeDriver driver;
    public TestCases()
    {
        System.out.println("Constructor: TestCases");
        WebDriverManager.chromedriver().timeout(30).setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

    }

    public void endTest()
    {
        System.out.println("End Test: TestCases");
        driver.close();
        driver.quit();

    }

    
    public  void testCase01() throws InterruptedException{
         System.out.println("Start Test case: testCase03");
        // "Navigate to url  ""https://in.linkedin.com/"
        driver.get("https://www.linkedin.com/");
        Thread.sleep(3000);

        // Click on Email and give Email  Using Locator "XPath" //input[@autocomplete='username'].sendKeys("spamvarad@gmail.com")
        driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("spamvarad@gmail.com");

        // Click on Password and give Password Using Locator "XPath" //input[@autocomplete='current-password'].sendKeys(Testing@5228)
        driver.findElement(By.xpath("//input[@autocomplete='current-password']")).sendKeys("Testing@5228");
        Thread.sleep(3000);

        //click on sign in button using xpath //button[@data-id='sign-in-form__submit-btn']
        driver.findElement(By.xpath("//button[@data-id='sign-in-form__submit-btn']")).click();

        // Wait for the page to load and the user dashboard to appear 
        Thread.sleep(10000);

        // "Find and click the Name Area
        //  Using Locator ""xpath"" //div[text()='Test User']"
        driver.findElement(By.xpath("//div[text()='Test User']")).click();
        Thread.sleep(3000);

        // Print the count of "Who's viewed your profile" Using Locator "XPath" //*[@id="ember3045"]/div[3]/ul/li[1]/div/div[2]/div/a/div/div/div/div/span[1]
        // String ProfileView = driver.findElement(By.xpath("//*[@id='ember3045']/div[3]/ul/li[1]/div/div[2]/div/a/div/div/div/div/span[1]")).getText();
        // System.out.println(ProfileView);
        // // Print the count of "Impressions of your post" Using Locator "XPath" //*[@id='ember3045']/div[3]/ul/li[2]/div/div[2]/div/a/div/div/div/div/span[1]
        // String Impressions = driver.findElement(By.xpath("//*[@id='ember3045']/div[3]/ul/li[2]/div/div[2]/div/a/div/div/div/div/span[1]")).getText();
        // System.out.println(Impressions);
       
        // click the "Create a Post" button and Enter your post content in the provided text area Using Locator "XPath" //span[text()='Create a post']
        driver.findElement(By.xpath("//span[text()='Create a post']")).click();
        Thread.sleep(3000);
        
        // "Click on Post to Anyone and select connections only and click done Using Locator ""ID"" ember1086
        driver.findElement(By.xpath("/html/body/div[3]/div/div/div/div[1]/div/h2/button/div/div[2]/div[2]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//strong[text()='Connections only']")).click();
        Thread.sleep(2000);
        
        // Xpath //strong[text()='Connections only']
        // //span[text()='Done']"
        driver.findElement(By.xpath("//span[text()='Done']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//div[@role='textbox']")).sendKeys("Adding this Post as part of Automation Script using selenium");
        
        // Click the "Post" button to post your update Using Locator "XPath" //span[text()='Post']
        driver.findElement(By.xpath("//span[text()='Post']")).click();
        Thread.sleep(3000);
        
        // Wait for the post to be successfully published  3000ms
        // If the post is successfully published, print a confirmation message Using Locator "XPath" //span[text()='Post successful.'].isDiaplayed
        // If the post fails to be published, print an error message  Posst failed
        WebElement PostSuccess = driver.findElement(By.xpath("//span[text()='Post successful.']"));
        if(PostSuccess.isDisplayed()){
            System.out.println("Post is published successfully");
        }else{
            System.out.println("Post is not published ");
        }
        System.out.println("End Test case: testCase03");
    }


}
