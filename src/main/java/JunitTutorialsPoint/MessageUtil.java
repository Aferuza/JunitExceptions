package JunitTutorialsPoint;

public class MessageUtil {
    /*
     * This class prints the given message on console.
     */

        private String message;

        //Constructor
        //@param message to be printed
        public MessageUtil(String message){
            this.message = message;
        }

        // prints the message
        public String printMessage(){
            System.out.println(message);
            return message;
        }

        // add "Hi!" to the message
        public String salutationMessage(){
            message = "Hi!" + message;
            System.out.println(message);
            return message;
        }
    }

