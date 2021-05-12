package HW25.dao;

import HW25.entity.Client;

public interface ClientDao {

    void insert(Client client);

    void update(Client client);

    void delete(long id);

    Client getById(long id);

    Client getByPhone(long phone);
}
