package sample;

import org.junit.Assert;
import org.junit.Test;


public class PickingRootTest {
    @Test
    public void picking(){
        try {
            Integer ms[] = PickingRoot.picking(1, -70, 600, 1, 100);
            Integer test[] = {10,60};
            Assert.assertEquals(test, ms);
        }
        catch (Exception exeption){}
    }
}
