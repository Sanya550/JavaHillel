package HW22.dao;

import HW22.entity.Client;

import java.util.List;

public interface ClientDao {

    void insert(Client client);

    void update(Client client);

    void delete(long id);

    Client getById(long id);

    Client getByPhone(long phone);
}
