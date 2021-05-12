package HW28;

import HW28.functionalInterface.ConsumerInterface;
import HW28.functionalInterface.FunctionInterface;
import HW28.functionalInterface.PredicateInterface;
import HW28.functionalInterface.SupplierInterface;

public class Main {
    public static void main(String[] args) {
        PredicateInterface<Double> predicateInterface = a -> {
            if (a > 1500.0) {
                return true;
            }
            return false;
        };
        System.out.println(predicateInterface.digit(300.0));
        System.out.println(predicateInterface.digit(2000.0));


        ConsumerInterface<String> consumerInterface = string -> {
            char[] arr = string.toCharArray();
            for (int i = 0; i < string.length(); i++) {
                System.out.print("[ " + arr[i] + " ]" + ", ");
            }

        };
        consumerInterface.refactoring("Hello World");
        System.out.println();


        FunctionInterface<Integer, String> functionalInterface = integer -> {
            switch (integer) {
                case 1:
                    return "one";
                case 2:
                    return "two";
                case 3:
                    return "three";
                case 4:
                    return "four";
                case 5:
                    return "five";
                case 6:
                    return "six";
                case 7:
                    return "seven";
                case 8:
                    return "eight";
                case 9:
                    return "nine";
                default:
                    return "unknown";
            }
        };
        System.out.println(functionalInterface.apply(3));
        System.out.println(functionalInterface.apply(11));


        SupplierInterface<String> supplierInterface = () -> "Hello world";
        System.out.println(supplierInterface.get());
    }
}
