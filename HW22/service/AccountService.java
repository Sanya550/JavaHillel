package HW22.service;

import HW22.entity.Account;

public interface AccountService {
    void insert(Account account);

    void update(Account account);

    Account getById(long id);

    void delete(long id);
}
