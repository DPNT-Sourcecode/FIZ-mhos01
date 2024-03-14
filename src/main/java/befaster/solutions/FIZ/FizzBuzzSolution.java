package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizzBuzz(Integer number) {

        if((number % 3 == 0 || number.toString().contains("3")) && (number % 5 == 0 || number.toString().contains("5"))){
            return "fizz buzz";
        }else if( number % 3 == 0 || number.toString().contains("3")){
            return "fizz";
        }else if(number % 5 == 0 || number.toString().contains("5")){
            return "buzz";
        }
        return number.toString();
    }

}


