import org.junit.Test;
import static org.junit.Assert.*;

public class TestBoundaries {

    //*****************Positive Test Cases*****************

    //Test Case 1...Expected Interest Rate = 10%
    Loan year500 = new Loan(500,1);
    @Test
    public void TestGetRate() {
        assertEquals(10, year500.getRate(),0);
    }

    //Test Case 2..Expected Interest Rate = 5%
    Loan fiveYear10000 = new Loan(10000, 5);
    @Test
    public void TestGetRate1() {
        assertEquals(5, fiveYear10000.getRate(),0);
    }

    //Test Case 8: Amount: 7500, period: 2 years. Expected Rate: 8%
    Loan anotherLoan = new Loan(7500,2);
    @Test
    public void TestGetRate2() {
        assertEquals(8, anotherLoan.getRate(),0);
    }

    //Test Case 9: Amount: 2500, period: 4 years. Expected Rate: 6%
    Loan fourYearLoan = new Loan(2500,4);

    @Test
    public void TestGetRate3() {
        assertEquals(6, fourYearLoan.getRate(),0);
    }


    //*****************Negative Test Cases*****************

    //Test Case 3: Amount: 499, period: 0 years. Expected Rate: N/A
    @Test(expected=IllegalArgumentException.class)
    public void negTest1(){

        Loan negLoan1 = new Loan(499, 0);
    }

    //Test Case 4: Amount: 10001, period: 6 years. Expected Rate: N/A
    @Test(expected=IllegalArgumentException.class)
    public void negTest2(){

        Loan negLoan2 = new Loan(10001, 6);
    }

    //Test Case 5: Amount: 0, period: 0 years. Expected Rate: N/A
    @Test(expected=IllegalArgumentException.class)
    public void negTest3() {

        Loan negLoan3 = new Loan(0,0);
    }

    //Test case 6: Amount: "five", period: "one". Expected Rate: N/A
    @Test(expected=IllegalArgumentException.class)
    public void negTest4() {

        Loan negLoan4 = new Loan(Double.parseDouble("five"),Integer.parseInt("one"));
    }

    //Test case 7: Amount: null, period: null. Expected Rate: N/A
    @Test(expected = NullPointerException.class)
    public void negTest5() {
        Loan newLoan5 = new Loan(Double.parseDouble(null), Integer.parseInt(null));
    }

    //Test case 10: Amount: "Five Hundred", period: 5. Expected Rate: N/A
    @Test(expected = IllegalArgumentException.class)
    public void negTest6() {
        Loan newLoan6 = new Loan(Double.parseDouble("Five Hundred"), 5);
    }

    //Test case 11: Amount: 4, period: "Three". Expected Rate: N/A
    @Test(expected = IllegalArgumentException.class)
    public void negTest7() {
        Loan newLoan7 = new Loan(4, Integer.parseInt("Three"));
    }

}
