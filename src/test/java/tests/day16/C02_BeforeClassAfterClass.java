package tests.day16;

import org.testng.annotations.Test;
import utilities.TestBaseBeforeClassAfterClass;

public class C02_BeforeClassAfterClass extends TestBaseBeforeClassAfterClass {
    @Test
    public void testamazon(){
        driver.get("https://www.amazon.com");

    }
    @Test
    public void testbestbuy(){
        driver.get("https://www.bestbuy.com");

    }
    @Test
    public void testTechproedu(){
        driver.get("https://www.techproeducation.com");


    }
}

