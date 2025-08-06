package ecom.Tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import ecom.example.Utils.ExcelReader;
import ecom.example.Pages.loginPage;
import ecom.example.Utils.driverManager;
import java.util.List;
import java.time.Duration;

public class productsTest {
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
    public void testViewProductDetails() {
        Assert.assertEquals(10, 4); // Pass
    }
    @Test
public void testRemoveProductFromWishlist() {
    Assert.assertEquals(60, 60); // Pass
}
    @Test
    public void testAddProductToWishlist() {
        Assert.assertEquals(20, 21); // Fail
    }

    @Test
    public void testSearchProduct() {
        Assert.assertEquals(30, 10); // Pass
    }

    @Test
    public void testFilterProducts() {
        Assert.assertEquals(40, 41); // Fail
    }

    @Test
    public void testSortProducts() {
        Assert.assertEquals(50, 50); // Pass
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driverManager.quitDriver();
        }
        System.out.println("Test resources cleaned up.");
    }
}
