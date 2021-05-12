package HW21;

import HW21.database.Database;
import HW21.entity.Account;
import HW21.entity.Client;
import HW21.entity.Status;
import HW21.service.AccountService;
import HW21.service.ClientService;
import HW21.service.StatusService;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Client clients = new Client();
        ClientService clientService = new ClientService();

//read:
//        System.out.println(clientService.read());

//insert:
//        clients.setId(15);
//        clients.setName("Dana");
//        clients.setEmail("111@gmail.com");
//        clients.setPhone(3809777777L);
//        clientService.create(clients);

// update:
//        clients.setName("Sashkooo");
//        clients.setEmail("Sashko@11gmail.com");
//        clients.setPhone(322112561785L);
//        clients.setAbout("I am from Mukachevo");
//        clients.setId(7);
//        clientService.update(clients);

//delete:
//        clients.setId(11);
//        clientService.delete(clients);

//findByPhone
//       System.out.println(clientService.findByPhone(380679213321L));

        Account account = new Account();
        AccountService accountService = new AccountService();

//read:
//        System.out.println(accountService.read());

//insert:
//        account.setClient_id(21);
//        account.setNumber("234567");
//        account.setValue(5400);
//        accountService.create(account);

//update:
//        account.setClient_id(25);
//        account.setNumber("12345676789342");
//        account.setValue(887);
//        account.setId(5);
//        accountService.update(account);

//delete:
//        account.setId(11);
//        accountService.delete(account);

//findNumberByValue:
//        System.out.println(accountService.getPhoneByValue(5500));

//getByClientId:
//        System.out.println(accountService.getByClientId());

//getClientStatus:
//        System.out.println(clientService.getClientStatus());

        Status status = new Status();
        StatusService statusService = new StatusService();

//read:
//        System.out.println(statusService.read());

//insert:
//        status.setAlias("bla bla");
//        status.setDescription("text");
//        statusService.create(status);

//update:
//        status.setAlias("some text");
//        status.setDescription("some text");
//        status.setId(18);
//        statusService.update(status);

//delete:
//        status.setId(18);
//        statusService.delete(status);


    }
}
