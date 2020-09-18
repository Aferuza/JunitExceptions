package myExExcept;

public class Method {
    public static class Main {
        public static void main(String[]args){
//            Bank obj = new Bank(-12);

            Bank obj1 = new Bank(458);
            try {
                obj1.withdraw(23);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }


    }

}
