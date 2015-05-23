package oneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MainOneToOne {

	public static void main(String[] args) {
		
		UserDetails user = new UserDetails();
		user.setUserName("apatel");
		
		Vehicle vehicle = new Vehicle();
		vehicle.setVehicleName("BMW");
		
		user.setVehicle(vehicle);
		
		@SuppressWarnings("deprecation")
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(user);
		session.save(vehicle);
		
		session.getTransaction().commit();
		session.close();
		
	}

}
