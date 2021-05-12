package HW25.dao;

import HW25.entity.Client;
import HW25.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.apache.log4j.Logger;



public class ClientDaoImpl implements ClientDao {
    Logger logger = Logger.getLogger(ClientDaoImpl.class);

    @Override
    public void insert(Client client) {
        logger.debug(String.format("insert. client{id=%d, email=%s, name=%s}", client.getId(), client.getEmail(), client.getName()));

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(client);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Client client) {
        logger.debug(String.format("update. client{id=%d, email=%s}", client.getId(), client.getEmail()));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(client);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(long id) {
        logger.debug(String.format("delete. client{id=%d}", id));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Client client = new Client();
        client.setId(id);
        session.delete(client);
        transaction.commit();
        session.close();
    }

    @Override
    public Client getById(long id) {
        logger.debug(String.format("getById. client{id=%d}", id));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Client.class).getReference(id);
    }

    @Override
    public Client getByPhone(long phone) {
        logger.debug(String.format("getByPhone. client{phone=%d}", phone));
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        return session.byId(Client.class).getReference(phone);
    }
}

