//import java.util.Scanner;
//
//import static org.testng.AssertJUnit.assertEquals;
//
//
//        public class try_catch_ex {
//        public static void main (String[]args){
//            Integer age = 17;
//            String ageAsString = age.toString();
//            String yourAge = "U are " + ageAsString + " years old";
//            System.out.println(yourAge);
//        }
//        @Test
//        public void throwNullPointExceptiont(){
//            Integer age = null;
//            String ageAsStr = age.toString();
//            String yourAge = "U are " + ageAsStr + " years old";
//            System.out.println(yourAge);
//        }
//
//        @Test
//        public void catchullPointExceptiont(){
//            Integer ageF= null;
//            String ageString;
//            String yourAge ="";
//
//            try{
//                ageString = ageF.toString();
//            }
//            catch(NullPointerException e) {
//                ageF = 18;
//                ageString = ageF.toString();
//                yourAge = "U are " + ageF.toString() + " years old";
//                //Assert.assertEquals("U are 18 years old", yourAge);
//                System.out.println(yourAge);
//
//
//                System.out.println("get Message " + e.getMessage());
//                System.out.println("get StackTrace " + e.getStackTrace());
//                System.out.println("print stack trace ");
//                e.printStackTrace();
//            }
//            finally {
//                yourAge = "You are " + ageF.toString() + " years old";
//
//            }
//            assertEquals("Y are 18 years old", yourAge);
//        }
//
//        @Test
//
//        public void illegArgumentExcep(String password) {
//
//            if (password.length() < 7) {
//                throw new IllegalArgumentException("Passw must be < 6 chars");
//
//                // this.password() = password;
//
//            }
//            // throw new illegArgumentExcep("Passwo shd be > 6 chars");
//        }
//
//        public static class SelWebExceptions {
//            public static void main (String[]args) {
//
//
//                try {
//                    int[] a= {3,5,7};
//                    System.out.println(a[0]);
//                }
//                catch (Exception e){
//                    System.out.println("Exept happened");
//
//
//                    Scanner scan = new Scanner(System.in);
//                    System.out.println("Whts ur fav color?");
//                    int n = scan.nextInt();
//                    System.out.println(n);
//
//                    try {
//                        int[] a = null;
//                        int[] ab = {4};
//
//                        System.out.println(ab[1]);
//                    } catch (NullPointerException ex) {
//                        System.out.println("U entered incorrect index value");
//                    }
//                    catch (ArrayIndexOutOfBoundsException eBounds) {
//                        System.out.println("Out of bounds.");
//
//
//                    }}}}}
//
//
//
//
//
