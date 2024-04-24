import org.junit.Assert;
import org.junit.Test;

public class atest {
    @Test 
    public void test(){
        a gre = new a();
        Assert.assertEquals("hello", gre.Say());
    }
}
