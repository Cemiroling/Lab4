package sample;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class MyThreadTest {
    private MyThread myThread;

    @Before
    public void setUp(){
        myThread = new MyThread(1,1,1,1);
    }

    @Test
    public void run(){
        myThread.run();
        int result = myThread.getResult();
        Assert.assertEquals(3, result);
    }

    @Test
    public void getResult(){
        int result = myThread.getResult();
        Assert.assertEquals(0, result);
        myThread.run();
        result = myThread.getResult();
        Assert.assertEquals(3, result);
    }
}
