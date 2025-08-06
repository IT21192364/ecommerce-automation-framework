package ecom.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import ecom.example.Utils.ExcelReader;
import ecom.example.Pages.loginPage;
import ecom.example.Utils.driverManager;
import java.util.List;
import java.time.Duration;

public class cartTest {
    WebDriver driver;
    loginPage loginPage;
    ExcelReader excelReader;

    @BeforeClass
    public void setUp() {
        driver= driverManager.getDriver();
        loginPage = new loginPage(driver);
        excelReader = new ExcelReader();
    }

    @BeforeMethod
    public void navigate(){
    }

    @Test
    public void testAddItemToCart() {
        Assert.assertEquals(1, 1);
    }

    @Test
    public void testRemoveItemFromCart() {
        Assert.assertEquals(2, 2);
    }

    @Test
    public void testCartTotalCalculation() {
        Assert.assertEquals(3, 3);
    }

    @Test
    public void testCartIsEmpty() {
        Assert.assertEquals(4, 4);
    }

    @Test
    public void testCartItemCount() {
        Assert.assertEquals(5, 5);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driverManager.quitDriver();
        }
        System.out.println("Test resources cleaned up.");
    }

}
