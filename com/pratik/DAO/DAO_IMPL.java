package com.pratik.DAO;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.type.StandardBasicTypes;

import com.pratik.utility.HibernateUtil;

public class DAO_IMPL implements DAO_Interface {

	@Override
	public List<Object[]> getList() {
		//create the session
		Session ses=null;
		//get the session
		ses=HibernateUtil.getSession();
			//create the list of class object
			List<Object[]> list=null;
			//create the named parameterised the query
			SQLQuery query=ses.createSQLQuery("select PRODID,PRODNAME from PRODUCT where price>:price");
			//pass the parameter to query
			query.setString("price", "500");
		//add scalar to query
		query.addScalar("PRODID", StandardBasicTypes.INTEGER);
		query.addScalar("PRODNAME", StandardBasicTypes.STRING);
			//execute the query
			list=query.list();
				//close the session
			HibernateUtil.closeSession(ses);
			//return the list
			return list;
	}
}
