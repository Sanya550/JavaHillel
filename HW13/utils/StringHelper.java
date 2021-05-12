package com.company.HW13.utils;

import com.company.HW13.exception.StringFormatException;

import java.io.IOException;

public class StringHelper {
    public String symbolMethod(String symbol, char[] chars) throws IOException {
//3.1:
        String str2;
        if (chars.length == 0) {
            System.out.println("Your char is empty");
            throw new NullPointerException();
        } else {
            str2 = new String(chars);
        }
//3.2, 3.3, 3.4, 3.5:
        if (symbol.isBlank() || str2.isBlank()) {
            throw new StringFormatException();
        } else {
            symbol = symbol.toUpperCase().trim();
            str2 = str2.toLowerCase().trim();
        }
        String result = symbol.concat(" ").concat(str2);
//3.6:
        if (result.length() % 2 == 0) {
            result = result.substring(0, result.length() / 2 - 1)
                    .concat(result.substring(result.length() / 2 + 1, result.length()));
        } else {
            result = result.substring(0, result.length() / 2)
                    .concat(result.substring(result.length() / 2 + 1, result.length()));
        }
        return result;
    }
}
