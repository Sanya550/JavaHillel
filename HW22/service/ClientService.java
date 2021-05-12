package HW22.service;

import HW22.entity.Client;

public interface ClientService {
    void insert(Client client);

    void update(Client client);

    void delete(long id);

    Client getById(long id);

    Client getByPhone(long phone);
}
