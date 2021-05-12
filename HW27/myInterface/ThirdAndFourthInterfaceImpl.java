package HW27.myInterface;

public class ThirdAndFourthInterfaceImpl implements ThirdInterface, FourthInterface {
    @Override
    public boolean lengthOfString(String string) {
        if (string.length() > 5) {
            return true;
        }
        return false;
    }

    @Override
    public String concat(String string1, String string2) {
        return string1.concat(string2);
    }

    @Override
    public int summary(int a, int b) {
        return a + b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a - b;
    }
}
