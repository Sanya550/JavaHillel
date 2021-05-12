package HW27.myInterface;

import java.util.Random;

public class FirstAndSecondInterfaceImpl implements FirstInterface, SecondInterface {
    @Override
    public boolean positiveDigital(int a) {
        if (a > 0) {
            return true;
        }
        return false;
    }

    @Override
    public int random() {
        Random random = new Random();
        int a = random.nextInt(10);
        return a;
    }

    @Override
    public boolean negativeDigital(int a) {
        if (a < 0) {
            return true;
        }
        return false;
    }

    @Override
    public int average(int a, int b) {
        int average = (a + b) / 2;
        return average;
    }
}
