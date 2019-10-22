package befaster.solutions.FIZ;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        String message="";
        if (number%3 == 0) {
            message ="fizz";
        }
        if(number%5 == 0) {
            if(message.isEmpty()) {
                message ="buzz";
            }else {
                message += " buzz";
            }
        }
        if(message.isEmpty()) {
            message = number.toString();
        }
        return message;
    }

}

