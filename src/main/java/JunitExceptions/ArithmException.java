package JunitExceptions;

import org.junit.Test;

public class ArithmException {
    int x;
    int y;
    int c;

    public void setup() {
        x=5;
        y=0;
    }
    @Test(expected = java.lang.ArrayStoreException.class)
    public void test(){
        c=x/y;
        System.out.println(c +"is the result");
    }
}
