package HW25.service;

import HW25.dao.ClientDao;
import HW25.dao.ClientDaoImpl;
import HW25.entity.Client;
import HW25.util.LoggerUtil;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class ClientServiceImpl implements ClientService {
    Logger logger = LoggerUtil.getLogger(ClientServiceImpl.class);

    @Override
    public void insert(Client client) {
        logger.log(Level.DEBUG, client.toString());

        ClientDao clientDao = new ClientDaoImpl();
        client.setName(client.getName());
        client.setEmail(client.getEmail());
        client.setPhone(client.getPhone());
        client.setAbout(client.getAbout());
        clientDao.insert(client);
    }

    @Override
    public void update(Client client) {
        logger.log(Level.DEBUG, client.toString());

        ClientDao clientDao = new ClientDaoImpl();
        client.setId(client.getId());
        client.setName(client.getName());
        client.setEmail(client.getEmail());
        client.setPhone(client.getPhone());
        client.setAbout(client.getAbout());
        clientDao.update(client);
    }

    @Override
    public Client getById(long id) {
        logger.log(Level.DEBUG, id);

        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.getById(id);
    }

    @Override
    public void delete(long id) {
        logger.log(Level.DEBUG, id);
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.delete(id);
    }

    @Override
    public Client getByPhone(long phone) {
        logger.log(Level.DEBUG, phone);
        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.getByPhone(phone);
    }
}
