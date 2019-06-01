package sample;

public class MyThread extends Thread {
    private int aValue;
    private int bValue;
    private int cValue;
    private int root;
    private int result;

    public MyThread(int a, int b, int c, int i){
        aValue = a;
        bValue = b;
        cValue = c;
        root = i;
    }
    @Override
    public void run() {
        result = aValue*root*root + bValue*root + cValue;
    }

    public int getResult(){
        return  result;
    }

}