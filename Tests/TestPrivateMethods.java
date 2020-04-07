import org.junit.Test;
import java.lang.reflect.Field;
import static org.junit.Assert.*;

public class TestPrivateMethods {

    //Methods to test private classes in Loan.java

    //Test setAmount(double amount)
    @Test
    public void TestSetAmount() throws IllegalAccessException, NoSuchFieldException {
        Loan amountTest = new Loan(600, 2);
        Class privateClass = amountTest.getClass();
        Field f = privateClass.getDeclaredField("loanAmount");
        f.setAccessible(true);
        double result = f.getDouble(amountTest);

        assertEquals(600, result, 0);
    }

    //Test setPeriod(int periodInYears)
    @Test
    public void TestSetPeriod() throws NoSuchFieldException, IllegalAccessException {
        Loan periodTest = new Loan(600,2);
        Class privateClass = periodTest.getClass();
        Field f = privateClass.getDeclaredField("numberOfPayments");
        f.setAccessible(true);
        double result = f.getInt(periodTest);

        assertEquals(24, result, 0);
    }

    //Test setRate(int period)
    @Test
    public void TestSetRate() throws IllegalAccessException, NoSuchFieldException {
        Loan rateTest = new Loan(600,2);
        Class privateClass = rateTest.getClass();
        Field f = privateClass.getDeclaredField("annualRate");
        f.setAccessible(true);
        double result = f.getDouble(rateTest);

        assertEquals(10, result, 0);

    }

}
