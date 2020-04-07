import org.junit.Test;
import static org.junit.Assert.*;

public class TestLoan {

    Loan newLoan = new Loan(500, 1);

    @Test
    public void TestGetAmount() {
        assertEquals(500, newLoan.getAmount(), 0);
    }

    @Test
    public void TestGetPeriod() {

        assertEquals(1,newLoan.getPeriod(),0);
    }

    @Test
    public void TestGetRate() {

        assertEquals(10, newLoan.getRate(),0);
    }

    @Test
    public void TestGetMonthlyPayment() {

        assertEquals(43, newLoan.getMonthlyPayment(),1);
    }

    @Test
    public void TestGetTotalPayment() {

        assertEquals(527, newLoan.getTotalPayment(),1);
    }
}
