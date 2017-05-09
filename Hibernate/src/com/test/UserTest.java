package com.test;

import org.junit.Test;

import com.entity.User;
import com.util.UserDAO;
import com.util.UserDAOImpl;

public class UserTest {

	@Test
	  public void testSave() {
        UserDAO userdao=new UserDAOImpl();  
         try{
          User u=new User();          
          u.setId(21);
          u.setName("zhangsan");
          u.setPassword("456");
          u.setType("admin");
          userdao.save(u);             
         }catch(Exception e){
             e.printStackTrace();
         }
    }
	@Test
	public void find()
	{
		 UserDAO userdao=new UserDAOImpl();  
         try{
         
          User user=userdao.findById(21);   
          System.out.println(user);
         }catch(Exception e){
             e.printStackTrace();
         }
	}
	

}
