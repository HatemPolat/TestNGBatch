package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C03_Priority extends TestBaseBeforeClassAfterClass {
    @Test(priority = 1)
    public void testamazon(){
        driver.get("https://www.youtube.com");

    }
    @Test(priority = 3)
    public void testbestbuy(){
        driver.get("https://www.bestbuy.com");

    }
    @Test(priority=2)
    public void testTechproedu(){
        driver.get("https://www.techproeducation.com");


    }
}
