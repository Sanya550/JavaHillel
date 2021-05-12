package HW27.myInterface;

public interface FourthInterface extends ThirdInterface {

    boolean lengthOfString(String string);

    String concat(String string1, String string2);

    static void print(String string) {
        System.out.println(string);
    }

    default void defaultPrint(String string) {
        System.out.println("It is FourthInterface" + string);
    }
}
