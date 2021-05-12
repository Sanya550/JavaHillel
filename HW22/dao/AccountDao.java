package HW22.dao;

import HW22.entity.Account;

public interface AccountDao {
    void insert(Account account);

    void update(Account account);

    Account getById(long id);

    void delete(long id);
}
