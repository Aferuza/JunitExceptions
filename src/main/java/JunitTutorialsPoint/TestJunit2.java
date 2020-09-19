package JunitTutorialsPoint;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestJunit2 {
    String message ="Robert";
   MessageUtil messageUtil = new MessageUtil(message);
    @Test
    public void testPrintMessage(){
        System.out.println("Hi" + "Robert");
        assertEquals(message, messageUtil.salutationMessage());
}}
