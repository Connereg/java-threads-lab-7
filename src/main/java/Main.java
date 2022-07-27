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

//import java.util.concurrent.*;
//
//class Example {
//    public static void main(String[] args) throws Exception {
//        ExecutorService executor = Executors.newFixedThreadPool(5);
//
//        Future<Integer> num1 = executor.submit(()-> {
//            try {
//                Thread.sleep(3000);
//                return 1000;
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        Future<Integer> num2 = executor.submit(()-> {
//            try {
//                Thread.sleep(500);
//                return 2000;
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        int result = num1.get() * num2.get();
//        System.out.println(result); // 2000000
//
//        executor.shutdown();
//    }
//}