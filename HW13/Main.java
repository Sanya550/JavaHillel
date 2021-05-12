package com.company.HW13;

import com.company.HW13.utils.StringHelper;
import com.company.HW13.utils.RegistrationHelper;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        //first part:
        StringHelper stringHelper = new StringHelper();
        char[] c = {' ', 'a', 'l', 'e', ' ', 'x'};//you can change this field, how you want
        String s = " kar amel      ";//you can change this field, how you want
        System.out.println(stringHelper.symbolMethod(s, c));
//second part:
      RegistrationHelper.phone();
      RegistrationHelper.mail();
      RegistrationHelper.birthday();

    }
}


