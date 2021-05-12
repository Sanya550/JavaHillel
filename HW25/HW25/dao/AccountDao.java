package HW25.dao;

import HW25.entity.Account;

public interface AccountDao {
    void insert(Account account);

    void update(Account account);

    Account getById(long id);

    void delete(long id);
}
