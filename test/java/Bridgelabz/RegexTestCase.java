package Bridgelabz;

import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class RegexTestCase {
    private static Regex regex;

    @BeforeClass
    public static void setUp(){
        regex = new Regex();
    }

    @Test
    public void validFirstName() {
        //Regex regex = new Regex();
        boolean valid = regex.firstName("Ravi");
        Assert.assertEquals(true, valid);
    }

    @Test
    public void validLastName() {
        //Regex regex = new Regex();
        boolean valid = regex.lastName("Adam");
        Assert.assertEquals(true, valid);
    }

    @Test
    public void validMobileNumber() {
       // Regex regex = new Regex();
        boolean valid = regex.mobile_number("9595417312");
        Assert.assertEquals(true, valid);
    }

    @Test
    public void validPassword() {
       // Regex regex = new Regex();
        boolean valid = regex.password("Pra95@");
        Assert.assertEquals(true, valid);
    }

    @Test
    public void validEmail() {
       // Regex regex = new Regex();
        boolean valid = regex.email("prat959@gmail.com");
        Assert.assertEquals(true, valid);
    }
}

