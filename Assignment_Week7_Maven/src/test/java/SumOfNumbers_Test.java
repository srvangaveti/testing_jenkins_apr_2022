import org.junit.Assert;
import org.junit.Test;

public class SumOfNumbers_Test {

    SumOfNumbers sn = new SumOfNumbers();

    @Test
    public void generate_test1(){
        int actResult = sn.generate(5);
        int expResult = 15; // using the formula n(n+1)/2 to figure out expected result
        Assert.assertEquals(expResult,actResult);
    }

    @Test
    public void generate_test2(){
        int actResult = sn.generate(26);
        int expResult = 351;
        Assert.assertEquals(expResult,actResult);
    }

    @Test
    public void generate_test3(){
        int actResult = sn.generate(-90);
        int expResult = 0;
        Assert.assertEquals(expResult,actResult);
    }

    @Test
    public void generate_test4(){
        Assert.fail();
    }
}
