package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String message="";
        String numerator = number.toString();
        message = lookupFizz(number, message, numerator);
        message = lookupBuzz(number, message, numerator);
        message = lookupDeluxe(number, message, numerator);

        if(message.isEmpty()) {
            message = numerator;
        }
        return message;
    }

    private String lookupDeluxe(Integer number, String message, String numerator) {
        if((number%3 == 0 && numerator.contains("3")) || (number%5 == 0 && numerator.contains("5"))) {
            int i=0;
            String div="";

            if(number%2 != 0) {
                if(message.isEmpty()) {
                    message = "fake deluxe";
                }else {
                    message += " fake deluxe";
                } 
            }else {
                if(message.isEmpty()) {
                    message ="deluxe";
                }else {
                    message += " deluxe";
                } 
            }
        }
        return message;
    }

    private String lookupBuzz(Integer number, String message, String numerator) {
        if(number%5 == 0 || numerator.contains("5")) {
            if(message.isEmpty()) {
                message ="buzz";
            }else {
                message += " buzz";
            }
        }
        return message;
    }

    private String lookupFizz(Integer number, String message, String numerator) {
        if (number%3 == 0 || numerator.contains("3")) {
            message ="fizz";
        }
        return message;
    }

}
