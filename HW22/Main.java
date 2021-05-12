package HW22;

import HW22.dao.AccountDao;
import HW22.dao.AccountDaoImpl;
import HW22.entity.Account;
import HW22.entity.Client;
import HW22.entity.Status;
import HW22.service.ClientService;
import HW22.service.ClientServiceImpl;
import HW22.service.StatusService;
import HW22.service.StatusServiceImpl;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        ClientService clientService = new ClientServiceImpl();

//insert:
//        client.setName("George");
//        client.setEmail("george@gmail");
//        client.setPhone(380971203943L);
//        client.setAbout("I am from Germany");
//        clientService.insert(client);

//update:
//        client.setId(10);
//        client.setName("Gora");
//        client.setEmail("g@gmail");
//        client.setPhone(380971303947L);
//        client.setAbout("I am from England");
//        clientService.update(client);

//delete:
//        clientService.delete(16);

//getById:
//        Client id = clientService.getById(3);
//        System.out.println(id);

//getByPhone:
//        System.out.println(clientService.getByPhone(380988887765L));

        Status status = new Status();
        StatusService statusService = new StatusServiceImpl();

//insert:
//        status.setAlias("some text");
//        status.setDescription("some text");
//        statusService.insert(status);

//update:
//        status.setId(4);
//        status.setAlias("some text");
//        status.setDescription("some text");
//        statusService.update(status);


//getById:
//        System.out.println(statusService.getById(4));

//delete
//        statusService.delete(4);

        Account account = new Account();
        AccountDao accountDao = new AccountDaoImpl();

//insert:
//        account.setClient_id(5);
//        account.setNumber("123456786345679");
//        account.setValue(654);
//        accountDao.insert(account);

//update:
//        account.setId(12);
//        account.setClient_id(5);
//        account.setNumber("123456786845679");
//        account.setValue(655);
//        accountDao.update(account);

//getById:
//        System.out.println(accountDao.getById(12));

//delete:
//        accountDao.delete(12);
    }
}
