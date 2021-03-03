package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import model.Employee;
import util.HibernateUtil;

public class EmployeeDao {

	public void saveEmployee(Employee employee) {
		Transaction transaction=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			
			transaction=session.beginTransaction();
			session.save(employee);
			
			transaction.commit();
		} catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			
		}
	}
	
	public void updateEmployee(Employee employee) {
		Transaction transaction=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			
			transaction=session.beginTransaction();
			session.saveOrUpdate(employee);
			
			transaction.commit();
		} catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			
		}
	}
	
	public Employee getEmployeeById(int id) {
		Transaction transaction=null;
		Employee employee=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			
			transaction=session.beginTransaction();
			
			employee=session.get(Employee.class, id);
			
			transaction.commit();
		} catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			
		}
		return employee;
	}
	
	@SuppressWarnings("unchecked")
	public List<Employee> getAllEmployee() {
		Transaction transaction=null;
		List<Employee> employee=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			
			transaction=session.beginTransaction();
			
			employee=session.createQuery("from Employee").list();
			
			transaction.commit();
		} catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			
		}
		return employee;
	}
	public void deleteEmployee(int id) {
		Transaction transaction=null;
		Employee employee=null;
		try(Session session=HibernateUtil.getSessionFactory().openSession()){
			
			transaction=session.beginTransaction();
			
			employee=session.get(Employee.class, id);
			session.delete(employee);
			
			transaction.commit();
		} catch(Exception e) {
			if(transaction != null) {
				transaction.rollback();
			}
			
		}
	
	}
	
}
