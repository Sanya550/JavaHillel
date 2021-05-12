package HW27.myInterface;

public interface SecondInterface extends FirstInterface {

    boolean negativeDigital(int a);

    int average(int a, int b);

    static void print(String string) {
        System.out.println(string);
    }

    default void defaultPrint(String string) {
        System.out.println("It is SecondInterface" + string);
    }
}
