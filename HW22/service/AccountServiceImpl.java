package HW22.service;

import HW22.dao.AccountDao;
import HW22.dao.AccountDaoImpl;
import HW22.entity.Account;

public class AccountServiceImpl implements AccountService {

    @Override
    public void insert(Account account) {
        AccountDao accountDao = new AccountDaoImpl();
        account.setClient_id(account.getClient_id());
        account.setNumber(account.getNumber());
        account.setValue(account.getValue());
        accountDao.insert(account);
    }

    @Override
    public void update(Account account) {
        AccountDao accountDao = new AccountDaoImpl();
        account.setId(account.getId());
        account.setClient_id(account.getClient_id());
        account.setNumber(account.getNumber());
        account.setValue(account.getValue());
        accountDao.update(account);
    }

    @Override
    public Account getById(long id) {
        AccountDao accountDao = new AccountDaoImpl();
        return accountDao.getById(id);
    }

    @Override
    public void delete(long id) {
        AccountDao accountDao = new AccountDaoImpl();
        accountDao.delete(id);
    }
}
