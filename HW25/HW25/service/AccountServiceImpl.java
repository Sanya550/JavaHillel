package HW25.service;

import HW25.dao.AccountDao;
import HW25.dao.AccountDaoImpl;
import HW25.entity.Account;
import HW25.util.LoggerUtil;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;


public class AccountServiceImpl implements AccountService {
    static Logger logger = LoggerUtil.getLogger(AccountServiceImpl.class);

    @Override
    public void insert(Account account) {
        logger.log(Level.DEBUG, account.toString());

        AccountDao accountDao = new AccountDaoImpl();
        account.setClient_id(account.getClient_id());
        account.setNumber(account.getNumber());
        account.setValue(account.getValue());
        accountDao.insert(account);
    }

    @Override
    public void update(Account account) {
        logger.log(Level.DEBUG, account.toString());

        AccountDao accountDao = new AccountDaoImpl();
        account.setId(account.getId());
        account.setClient_id(account.getClient_id());
        account.setNumber(account.getNumber());
        account.setValue(account.getValue());
        accountDao.update(account);
    }

    @Override
    public Account getById(long id) {
        logger.log(Level.DEBUG, id);

        AccountDao accountDao = new AccountDaoImpl();
        return accountDao.getById(id);
    }

    @Override
    public void delete(long id) {
        logger.log(Level.DEBUG, id);

        AccountDao accountDao = new AccountDaoImpl();
        accountDao.delete(id);
    }
}
