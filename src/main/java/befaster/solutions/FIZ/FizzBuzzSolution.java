package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String message="";
        String numerator = number.toString();
        if (number%3 == 0 || numerator.contains("3")) {
            message ="fizz";
        }
        if(number%5 == 0 || numerator.contains("5")) {
            if(message.isEmpty()) {
                message ="buzz";
            }else {
                message += " buzz";
            }
        }
        if(number > 10) {
            int i=0;
            String div="";
            while(i<numerator.length()){
                div+="1";
                i+=1;
            }
            if(number%Integer.parseInt(div) == 0) {
                if(message.isEmpty()) {
                    message ="deluxe";
                }else {
                    message += " deluxe";
                } 
            }
            
        }

        if(message.isEmpty()) {
            message = numerator;
        }
        return message;
    }

}
