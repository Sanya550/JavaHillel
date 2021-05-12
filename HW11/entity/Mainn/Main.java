package com.company.HW11.entity.Mainn;

import com.company.HW11.entity.Client;
import com.company.HW11.entity.exception.WrongFieldException;
import com.company.HW11.entity.exception.WrongSumException;
import com.company.HW11.entity.service.ServiceOfTransaction;
import com.company.HW11.entity.util.Helper;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {


        Client client = new Client();
        Helper helper = new Helper();
        ServiceOfTransaction service = new ServiceOfTransaction();
        String client1;
        String client2;

        while (true) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Введите идентификатор аккаунта клиента: ");
            client1 = scanner1.nextLine();


            try {
                helper.method1(client1);
                System.out.println("Подтвержденно...");

                break;
            } catch (WrongFieldException e) {
                System.out.println("Ваш идентификатор аккаунта неправильный. Попробуйте еще раз.");

            }
        }


        while (true) {
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Введите идентификатор аккаунта клиента, которому Вы хотите отправить: ");
            client2 = scanner2.nextLine();

            try {
                helper.method1(client2);
                System.out.println("Подтвержденно...");

                break;
            } catch (WrongFieldException e) {
                System.out.println("Ошибка. Попробуйте еще раз.");

            }
        }


        while (true) {
            Scanner scanner3 = new Scanner(System.in);
            System.out.println("Введите сумму перевода(не больше 1000, но не меньше 0): ");
            double summary = scanner3.nextDouble();

            try {
                helper.method2(summary);
                System.out.println("Ваша сумма перевода равна: " + summary);
                break;
            } catch (WrongSumException e) {
                System.out.println("Ошибка.Введите сумму не больше 1000, но больше 0 ");
            }
        }

        service.transaction(client1, client2);
        System.out.println("Перевод средств прошел успешно!!!");
    }

}