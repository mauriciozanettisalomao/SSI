package br.com.nextel.ssi.model.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.nextel.ssi.model.entity.ReplVwbrUserNextel;

@Component
public class UserManagerDAO {
	
	@Autowired
	private SessionFactory sessionFactory;

	public Session session(){
		return 	sessionFactory.getCurrentSession();	
	}
	
	public List<ReplVwbrUserNextel> getManagerByCostCenter(String costCenter){
		Query query;
		query = session().createQuery("from ReplVwbrUserNextel where cdLoginUser = :cdLoginUser");
		query.setString("cdLoginUser", "ELOMBA");
		
		List<ReplVwbrUserNextel> list = query.list();
		for(ReplVwbrUserNextel l : list){
			System.out.println("List of Employees::"+l.toString());
		}
		
		return query.list();
		
	}

}
