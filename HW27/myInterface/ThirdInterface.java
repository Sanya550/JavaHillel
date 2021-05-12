package HW27.myInterface;

public interface ThirdInterface {

    int summary(int a, int b);

    int subtraction(int a, int b);

    static void print(String string) {
        System.out.println(string);
    }

    default void defaultPrint(String string) {
        System.out.println("It is ThirdInterface" + string);
    }
}
