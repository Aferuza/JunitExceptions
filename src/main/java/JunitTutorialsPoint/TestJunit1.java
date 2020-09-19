package JunitTutorialsPoint;
import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

        public class TestJunit1{
            String message = "Robert";
            MessageUtil messageUtil = new MessageUtil(message);

            @Test
            public void testPrintMessage(){
                System.out.println("Inside testPrint Messag");
                assertEquals(message, messageUtil.printMessage());
            }
        }



