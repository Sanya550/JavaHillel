package HW27.myInterface;

public interface FirstInterface {

    boolean positiveDigital(int a);

    int random();

    static void print(String string) {
        System.out.println(string);
    }

    default void defaultPrint(String string) {
        System.out.println("It is FirstInterface" + string);
    }
}
