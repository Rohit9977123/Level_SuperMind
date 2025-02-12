package LevelApp;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;


import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import LevelA.Caps;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class LevelApp extends Caps {

    AndroidDriver<AndroidElement> driver;

    // Setup method to initialize driver before running tests
    @BeforeTest
    public void setup() throws MalformedURLException {
        driver = cap(); // Call the capability setup method from Caps class
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    // Positive Test: Login using a valid phone number
    @Test(priority = -1)
    public void login_with_valid_phone_number() throws InterruptedException {
        System.out.println("Level SuperMind App is Open");

        // Click on the initial button to start login process
        driver.findElement(MobileBy.xpath("//android.widget.Button")).click();
        driver.findElement(MobileBy.AccessibilityId("Arrow Right")).click();

        // Enter phone number and proceed
        driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Enter your phone number']")).click();
        driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("9977840383");
        driver.findElement(MobileBy.xpath("(//android.view.View[@content-desc='Arrow Right'])[1]"))
              .click();

        Thread.sleep(3000); // Wait for the OTP screen to load
    }

    // Positive Test: Login using a valid email
    @Test(priority = 0)
    public void login_with_valid_email() throws InterruptedException {
        System.out.println("Testing Login with Email");
        System.out.println("Level SuperMind App is Open");

        // Click on the button to start login process
        driver.findElement(MobileBy.xpath("//android.widget.Button")).click();
        driver.findElement(MobileBy.id("d33fb434-ca6a-482d-9c50-782ac5799a1c")).click();

        // Enter email and proceed
        driver.findElement(MobileBy.xpath("//android.widget.TextView[@text='Enter your email']")).click();
        driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("rohitchouhankgn11@gmail.com");
        driver.findElement(MobileBy.xpath("(//android.view.View[@content-desc='Arrow Right'])[1]"))
              .click();

        Thread.sleep(3000); // Wait for the OTP screen to load
    }

    // Positive Test: Enter a valid OTP
    @Test(priority = 1)
    public void enter_valid_otp() throws InterruptedException {
        // Enter valid OTP and proceed
        driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("195450");
        driver.findElement(MobileBy.xpath("(//android.view.View[@content-desc='Arrow Right'])"))
              .click();

        Thread.sleep(3000); // Wait for the next screen to load
    }

    // Negative Test: Attempt login with an invalid phone number
    @Test(priority = 2)
    public void login_with_invalid_phone_number() throws InterruptedException {
        System.out.println("Testing Login with Invalid Phone Number");

        // Enter invalid phone number and try to proceed
        driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("12345");
        driver.findElement(MobileBy.xpath("(//android.view.View[@content-desc='Arrow Right'])[1]"))
              .click();

        Thread.sleep(2000); // Wait for error message
    }

    // Negative Test: Attempt to enter an invalid OTP
    @Test(priority = 3)
    public void enter_invalid_otp() throws InterruptedException {
        System.out.println("Testing Invalid OTP");

        // Enter invalid OTP and try to proceed
        driver.findElement(MobileBy.className("android.widget.EditText")).sendKeys("123456");
        driver.findElement(MobileBy.xpath("(//android.view.View[@content-desc='Arrow Right'])"))
              .click();

        Thread.sleep(2000); // Wait for error message
    }
}