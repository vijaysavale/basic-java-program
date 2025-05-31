package Automation.Automationtest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class IrctcLogin {
    public static void main(String[] args) {
        // Set path to chromedriver
      //  System.setProperty("webdriver.chrome.driver", "path/to/chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Open IRCTC website
            driver.get("https://www.irctc.co.in/nget/train-search");
            driver.manage().window().maximize();

            // Wait for the Disha chatbot iframe
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            // Find the iframe by checking multiple possible IDs or tags
            WebElement iframe = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//iframe[contains(@title, 'Disha')]")
            ));
            
            // Switch to the Disha iframe
            driver.switchTo().frame(iframe);
            
            // Close the chatbot
            WebElement closeButton = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//div[@id='disha-chatbot']//*[text()='X']")
            ));
            closeButton.click();

            // Switch back to the main page
            driver.switchTo().defaultContent();

            // Click on "Book Train Ticket"
            WebElement bookTrainTicket = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(@href, 'train-search') and text()='Book Train Ticket']")
            ));
            bookTrainTicket.click();

            System.out.println("Successfully clicked on 'Book Train Ticket' after closing Disha chatbot.");

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
