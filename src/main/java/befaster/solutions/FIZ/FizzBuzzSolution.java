package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {
        if ((number % 3 == 0 || number.toString().contains("3")) && (number % 5 == 0 || number.toString().contains("5"))) {
            return "fizz buzz" + checkDigit(number);
        } else if (number % 3 == 0 || number.toString().contains("3")) {
            return "fizz"  + checkDigit(number);
        } else if (number % 5 == 0 || number.toString().contains("5")) {
            return "buzz"  + checkDigit(number);
        }if(!checkDigit(number).isEmpty()){
            return "deluxe";
        }
        return number.toString();
    }

    public String checkDigit(Integer number) {
        int tempNum = number;
        int digit = tempNum % 10;
        while (tempNum != 0) {
            int currentDigit = tempNum % 10;
            tempNum /= 10;

            if (currentDigit != digit) {
                return "";
            }
        }
        if (number > 10) {
            return " deluxe";
        }
        return "";
    }
}
