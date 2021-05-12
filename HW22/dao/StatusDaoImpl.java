package HW22.dao;


import HW22.entity.Status;
import HW22.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class StatusDaoImpl implements StatusDao {
    @Override
    public void insert(Status status) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(status);
        transaction.commit();
        session.close();
    }

    @Override
    public void update(Status status) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.update(status);
        transaction.commit();
        session.close();
    }

    @Override
    public void delete(long id) {
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
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();

        return session.byId(Status.class).getReference(id);
    }
}
