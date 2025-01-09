package peaksoft.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import peaksoft.model.User;
import peaksoft.util.Util;

import java.util.List;

public class UserDaoHibernateImpl implements UserDao {

    public UserDaoHibernateImpl() {
    }

    @Override
    public void createUsersTable() {

    }

    @Override
    public void dropUsersTable() {
//        SessionFactory sessionFactory = Util.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.createQuery("delete from User").executeUpdate();
//        transaction.commit();
//        session.close();
    }

    @Override
    public void saveUser(String name, String lastName, byte age) {
//        SessionFactory sessionFactory = Util.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        User user = new User(name, lastName, age);
//        session.save(user);
//        transaction.commit();
//        session.close();
    }

    @Override
    public void removeUserById(long id) {
//        SessionFactory sessionFactory = Util.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        User user = (User) session.get(User.class, id);
//        session.delete(user);
//        transaction.commit();
//        session.close();
    }

    @Override
    public List<User> getAllUsers() {
//        SessionFactory sessionFactory = Util.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        List<User> users = session.createQuery("from User").list();
//        transaction.commit();
//        session.close();
//        return users;
        return null;
    }

    @Override
    public void cleanUsersTable() {
//        SessionFactory sessionFactory = Util.getSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        session.createQuery("delete from User").executeUpdate();
//        transaction.commit();
//        session.close();
    }
}
