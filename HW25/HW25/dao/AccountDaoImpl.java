package HW25.dao;

import HW25.entity.Account;
import HW25.util.HibernateUtil;
import HW25.util.LoggerUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.apache.log4j.Logger;

public class AccountDaoImpl implements AccountDao {
    static Logger logger = LoggerUtil.getLogger(AccountDaoImpl.class);

    @Override
    public void insert(Account account) {
        logger.debug(String.format("insert. account{id=%d, number=%d, value=%d}", account.getId(), account.getNumber(), account.getValue()));

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(account);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Account account) {
        logger.debug(String.format("insert. account{id=%d, number=%d, value=%d}", account.getId(), account.getNumber(), account.getValue()));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(account);
        transaction.commit();
        session.close();
    }

    @Override
    public Account getById(long id) {
        logger.debug(String.format("getById. account{id=%d}", id));

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Account.class).getReference(id);
    }

    @Override
    public void delete(long id) {
        logger.debug(String.format("delete. account{id=%d}", id));

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Account account = new Account();
        account.setId(id);
        session.delete(account);
        transaction.commit();
        session.close();
    }
}
