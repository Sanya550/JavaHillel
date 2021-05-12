package HW22.service;

import HW22.dao.ClientDao;
import HW22.dao.ClientDaoImpl;
import HW22.entity.Client;

import java.util.List;

public class ClientServiceImpl implements ClientService {

    @Override
    public void insert(Client client) {
        ClientDao clientDao = new ClientDaoImpl();
        client.setName(client.getName());
        client.setEmail(client.getName());
        client.setPhone(client.getPhone());
        client.setAbout(client.getAbout());
        clientDao.insert(client);
    }

    @Override
    public void update(Client client) {
        ClientDao clientDao = new ClientDaoImpl();
        client.setId(client.getId());
        client.setName(client.getName());
        client.setEmail(client.getName());
        client.setPhone(client.getPhone());
        client.setAbout(client.getAbout());
        clientDao.update(client);
    }

    @Override
    public Client getById(long id) {
        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.getById(id);
    }

    @Override
    public void delete(long id) {
        ClientDao clientDao = new ClientDaoImpl();
        clientDao.delete(id);
    }

    @Override
    public Client getByPhone(long phone) {
        ClientDao clientDao = new ClientDaoImpl();
        return clientDao.getByPhone(phone);
    }
}
