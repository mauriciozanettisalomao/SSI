package br.com.nextel.ssi.model.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import br.com.nextel.ssi.model.entity.ReplVwbrUserNextel;
import br.com.nextel.ssi.model.entity.TwbrUserSystem;

@Component("userDAO")
@Transactional
public class UserDAO {
	
	private NamedParameterJdbcTemplate jdbc;
	
	@Autowired
	private SessionFactory sessionFactory;

	public Session session(){
		return 	sessionFactory.getCurrentSession();	
	}
	
	public List<TwbrUserSystem> getAllUsers(){
		return session().createQuery("from UserSystem").list();
	}
	
	public TwbrUserSystem getUserSystemByLogin(String cdLoginUser){
		Criteria criteria = session().createCriteria(TwbrUserSystem.class);
		criteria.add(Restrictions.eq("cdLoginUser", cdLoginUser));
		TwbrUserSystem user = (TwbrUserSystem) criteria.uniqueResult();
		return user;
	}
	
	public ReplVwbrUserNextel getUserByLogin(String cdLoginUser){
		Criteria criteria = session().createCriteria(ReplVwbrUserNextel.class);
		criteria.add(Restrictions.eq("cdLoginUser", cdLoginUser));
		ReplVwbrUserNextel user = (ReplVwbrUserNextel) criteria.uniqueResult();
		return user;
	}
}
