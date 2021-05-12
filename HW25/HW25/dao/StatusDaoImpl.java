package HW25.dao;


import HW25.entity.Status;
import HW25.util.HibernateUtil;
import HW25.util.LoggerUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.apache.log4j.Logger;

public class StatusDaoImpl implements StatusDao {
    Logger logger = LoggerUtil.getLogger(StatusDaoImpl.class);

    @Override
    public void insert(Status status) {
        logger.debug(String.format("insert. status{id=%d, description=%s, alias=%s}", status.getId(), status.getDescription(), status.getAlias()));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(status);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Status status) {
        logger.debug(String.format("update. status{id=%d, description=%s, alias=%s}", status.getId(), status.getDescription(), status.getAlias()));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(status);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(long id) {
        logger.debug(String.format("delete. status{id=%d}", id));

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Status status = new Status();
        status.setId(id);
        session.delete(status);
        transaction.commit();
        session.close();
    }

    @Override
    public Status getById(long id) {
        logger.debug(String.format("getById. client{id=%d}", id));

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Status.class).getReference(id);
    }
}
