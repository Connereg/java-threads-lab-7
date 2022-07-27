import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws Exception {
        Integer integer = getCallableInteger().call();
        System.out.println(integer);
    }
    public static Callable<Integer> getCallableInteger() {
        // your code here
        Callable<Integer> myCallable = ()  -> {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please Input an Integer: ");
            Integer userInput = scanner.nextInt();
            return userInput;
        };

    return myCallable;
    }
}

