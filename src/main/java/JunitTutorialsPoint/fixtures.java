package JunitTutorialsPoint;
import org.junit.*;

public class fixtures {

    @Before
    public void setUp(){
        System.out.println("Code before code goed here");
    }
    @BeforeClass
    public static void setUpClass(){
        System.out.println("Code for before class goes hhere");
    }
    @Test
    public void test1(){
        System.out.println("Code for test 1 goes hehre");
    }
    @After
    public void tearDown(){
        System.out.println("Code for after method goes here");
    }
    @AfterClass
    public static void tearDownClass(){
        System.out.println("Code for afterClass goes here");
    }
}

