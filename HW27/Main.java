package HW27;

import HW27.myInterface.*;
import static HW27.helper.Helper.optionalHelper;
import java.io.IOException;
import java.util.Optional;

public class Main {
    public static void main(String[] args) throws Throwable {

        FirstAndSecondInterfaceImpl firstAndSecondInterface = new FirstAndSecondInterfaceImpl();
        ThirdAndFourthInterfaceImpl thirdAndFourthInterface = new ThirdAndFourthInterfaceImpl();

        FirstInterface.print("some text 1");
        SecondInterface.print("some text 2");
        ThirdInterface.print("some text 3");
        FourthInterface.print("some text 4");

        System.out.println("-------------------------------------------");
        System.out.println(firstAndSecondInterface.positiveDigital(4));
        System.out.println(firstAndSecondInterface.random());
        System.out.println(firstAndSecondInterface.negativeDigital(4));
        System.out.println(firstAndSecondInterface.average(16, 8));
        firstAndSecondInterface.defaultPrint("...");

        System.out.println("-------------------------------------------");
        System.out.println(thirdAndFourthInterface.lengthOfString("some"));
        System.out.println(thirdAndFourthInterface.concat("la la", " ta ta"));
        System.out.println(thirdAndFourthInterface.summary(5, 4));
        System.out.println(thirdAndFourthInterface.subtraction(5, 4));
        thirdAndFourthInterface.defaultPrint("...");
        System.out.println("-------------------------------------------");


        Optional optional1 = optionalHelper("Hello@ukr.net");
        System.out.println(optional1);

        Optional optional = optionalHelper(" ");
        optional.orElseThrow(IOException::new);
    }
}
