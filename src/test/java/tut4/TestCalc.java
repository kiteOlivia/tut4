package tut4;
import org.junit.Assert;
import org.junit.Test;
public class TestCalc {
 @Test
    public void addTest(){
     Calc c = new Calc();
     int add  = c.add(10,10);
     Assert.assertEquals(20,add);
 }
    @Test
    public void subtractTest(){
        Calc s = new Calc();
        int subtract  = s.subtract(10,10);
        Assert.assertEquals(0,subtract);
    }

}
