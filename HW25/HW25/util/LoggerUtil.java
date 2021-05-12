package HW25.util;

import java.io.IOException;
import java.util.logging.LogManager;
import org.apache.log4j.Logger;


public class LoggerUtil {
    public static <T> org.apache.log4j.Logger getLogger(Class<T> tClass) {
        try {
            LogManager.getLogManager().readConfiguration(
                    tClass.getResourceAsStream("/log4j.properties"));
            return Logger.getLogger(tClass.getName());
        } catch (IOException e) {
            System.err.println("Could not setup logger configuration: " + e.toString());
        }
        return null;
    }
}
