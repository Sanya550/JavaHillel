package HW27.helper;

import java.util.Optional;

public class Helper {
    public static Optional optionalHelper(String string) {
        if (string == null || string.isBlank() || !string.matches("\\w*\\@ukr.net$")) {
            return Optional.empty();
        }
        return Optional.of(string);
    }
}
