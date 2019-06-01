package sample;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class PickingRoot {
    public static Integer[] picking(int a, int b, int c, int lowerLimit, int upperLimit) throws ExecutionException, InterruptedException {
        Integer[] result = new Integer[2];
        List<MyThread> pickingTread = new ArrayList<MyThread>();

        for (int i = lowerLimit ; i < upperLimit; i++ ) {
            MyThread myThread = new MyThread(a, b, c, i);
            pickingTread.add(myThread);
            myThread.run();
        }

        for (int i = 0, index = 0; index < 2 && i < upperLimit - lowerLimit; i++) {
            if (pickingTread.get(i).getResult() == 0) {
                result[index] = i + lowerLimit;
                index++;
            }
        }
        return  result;
    }
}