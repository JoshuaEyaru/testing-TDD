public class TestingPrimenumbers{

    public static void main(String[] args) {
        TestingPrimenumbers.isPrime_ReturnsTrue_WithPrimeInput();
        TestingPrimenumbers.isPrime_ReturnsFalse_WithNonPrimeInput();
    }

    public static boolean isPrime(int number){
        if (number <= 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void isPrime_ReturnsTrue_WithPrimeInput(){
        // set up any information needed
        int testvalue = 9;

        // run the method that is being tested
        boolean actual = isPrime(testvalue);
        boolean expected = true;

        // compare actual versus expected results
        if (actual == expected){
            System.out.println("The test isPrime_ReturnsTrue_WithPrimeInput passed!");
        } else {
            System.out.println("The test isPrime_ReturnsTrue_WithPrimeInput failed!");
            System.out.println("Expected: " + expected + ", Actual: " + actual);
        }

    }

    public static void isPrime_ReturnsFalse_WithNonPrimeInput(){
        // set up any information needed
        int testvalue = 7;

        // run the method that is being tested
        boolean actual = isPrime(testvalue);
        boolean expected = false;

        // compare actual versus expected results
        if (actual == expected){
            System.out.println("The test isPrime_ReturnsTrue_WithPrimeInput passed!");
        } else {
            System.out.println("The test isPrime_ReturnsFalls_WithNonPrimeInput failed!");
            System.out.println("Expected: " + expected + ", Actual: " + actual);
        }
    }
}