/**
 * This class represents the least common multiple of two arguments.
 * The lowest argument gets added its value until it either is higher or has the same value as the other argument.
 *  Example: 6 and 9 - 6 12 then 9 18 then 18. First argument and second are the same (18).
 */
public class LCM {
    public static void main(String[] args) {

        final int firstNumber = Integer.parseInt(args[0]);
        final int secondNumber = Integer.parseInt(args[1]);

        int tempAnsFirstNumber = firstNumber;
        int tempAnsSecondNumber = secondNumber;

        /**
         * While the first number is unequal the second number the first number - if smaller - gets added its original
         * value (firstNumber). If not the second number gets added its original value (secondNumber).
         * This goes on until the least common multiple of two numbers is found.
         */
        while (tempAnsFirstNumber != tempAnsSecondNumber) {
            if (tempAnsFirstNumber < tempAnsSecondNumber) {
                tempAnsFirstNumber += firstNumber;
            } else {
                tempAnsSecondNumber += secondNumber;
            }
        }

        System.out.println(tempAnsFirstNumber);
    }
}
