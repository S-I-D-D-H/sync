package com.bill.backend.services;

import org.springframework.stereotype.Service;

import com.bill.backend.dao.employeeimple;
import com.bill.backend.entities.employee;

@Service
public class data 
{

    public void print()
    {
    	
    }
   
    public void register(int i, String a, String b, String c)
    {
      employee st = new employee();
      employeeimple ea = new employeeimple();
      st.setId(i);
      st.setName(a);
      st.setPassword(b);
      st.setEmailid(c);
      int r = ea.insert(st);
      System.out.println(r);
    }
		
}
