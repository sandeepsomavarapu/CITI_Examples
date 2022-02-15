import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class TestClient {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("sleeping");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
//insert
//
//		 Employee e = new Employee(123, "suresh", 10000); 
//		 Employee e1 = new	Employee(124, "naresh", 20000);
//		 Employee e2 = new Employee(125, "ramesh",	30000);
//		 Employee e3 = new Employee(126, "suresh", 40000); 
//		 em.persist(e);
//		 em.persist(e1);
//		 em.persist(e2); 
//		 em.persist(e3);//find()-1 record,JPQL

//fetch  select * from capemp123; persist,merge,remove,find,createQuery

//		 TypedQuery<Employee> q2 = em.createQuery("select c from Employee c",Employee.class); 
//		 List<Employee> l1 = q2.getResultList();
//		  
//		  for (Employee e4 : l1) {
//			  System.out.print(e4.getEid());
//		  System.out.print(" "+e4.getEname());// ...all 
//		  System.out.println(" "+e4.getEsal());
//		  }
//	

		// update
//		  						//update sleepingemps set salary=salary+5000 where salary<50000;
//		Query q = em.createQuery("update Employee set esal=esal+5000 where esal<50000");
//		q.executeUpdate();

		// delete

//		  Query q3 = em.createQuery("delete from Employee where esal>30000");
//		  q3.executeUpdate();
//		 
		Query query = em.createQuery("select sum(emp.esal) FROM Employee emp");
		long maxsal = (long) query.getSingleResult();
		System.out.println(maxsal);

		em.getTransaction().commit();
		System.out.println("inserted");
		em.close();
		emf.close();

	}
}
