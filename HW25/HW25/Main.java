package HW25;

import HW25.dao.AccountDao;
import HW25.dao.AccountDaoImpl;
import HW25.entity.Account;
import HW25.entity.Client;
import HW25.entity.Status;
import HW25.service.ClientService;
import HW25.service.ClientServiceImpl;
import HW25.service.StatusService;
import HW25.service.StatusServiceImpl;


public class Main {
    public static void main(String[] args) {

        Client client = new Client();
        ClientService clientService = new ClientServiceImpl();

//insert:
//        client.setName("George");
//        client.setEmail("122@gmail.com");
//        client.setPhone(3809712039443L);
//        client.setAbout("I am from Germany");
//        clientService.insert(client);

//update:
//        client.setId(3);
//        client.setName("Gora");
//        client.setEmail("g12@gmail");
//        client.setPhone(380971303047L);
//        client.setAbout("I am from England");
//        clientService.update(client);

//delete:
//        clientService.delete(3);

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
