package homework;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        System.out.println("Server start");
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();

        Session session = null;
        try{
            session = factory.getCurrentSession();
            session.beginTransaction();
            User user = session.get(User.class, 1l);
            System.out.println(user.getName());
            Product prod = session.get(Product.class, 1l);
            System.out.println(prod.getName());
            System.out.println(user.getCart());
            user.addProduct(prod);
            System.out.println(user.getUserDeatils());
            session.close();
            System.out.println(user.getCart().toString());
        }catch (Exception e){
            e.printStackTrace();
        }
        }
    }
