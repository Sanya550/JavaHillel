package HW23;

import HW23.entity.Address;
import HW23.entity.Car;
import HW23.entity.Client;
import HW23.entity.Passport;
import HW23.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class Main {
    public static void main(String[] args) {
        Client client = new Client();
        Passport passport = new Passport();
        Address address = new Address();
        Car car = new Car();

        client.setName("Bob");
        client.setEmail("1222@gmail.com");
        client.setPhone(12332454323L);
        client.setAbout("I am from Kyiv");

        passport.setNumber("213455344");

        address.setCity("Kyiv");
        address.setStreet("Wall Street");
        address.setBuilding("10");
        address.setClient(client);

        car.setNumber("AA 1234 AA");

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(client);
        session.save(address);
        session.save(passport);
        session.save(car);

        transaction.commit();
        session.close();

    }
}
