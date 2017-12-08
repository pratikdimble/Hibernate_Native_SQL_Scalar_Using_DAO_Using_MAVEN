package com.pratik.user;

import java.util.List;

import com.pratik.DAO.DAO_Factory;
import com.pratik.DAO.DAO_Interface;
import com.pratik.utility.HibernateUtil;



public class clientTest_Scalar {

	public static void main(String[] args) 
	{
		//use dao
				DAO_Interface dao=DAO_Factory.getInstance();
				//call getList method usung object collection
				List<Object[]> list=dao.getList();
				//display the list
							for(Object[]row:list) {
								for(Object val:row) {

										System.out.println(val);
									}
										System.out.println();
							}
			//close the session factory
							HibernateUtil.closeFactory();
	}//main()
}//class
