package com.action;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.bean.Values;

@Controller
public class Click {

	@Bean(name = "messageSource")
	public static ReloadableResourceBundleMessageSource messareSource() {
		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
		messageSource.setBasename("/messages");
		return messageSource;
	}

	int a = 0;
	Values obj = new Values();
	int count = 0;

	@RequestMapping(value = "/ChangeStateaction")
	public ModelAndView changestatus(@RequestParam("id") String id) {
      
		ArrayList firstuser=new ArrayList();
		ArrayList seconduser=new ArrayList();
		
        
		ModelAndView model = new ModelAndView("/Home");
		
		if (a == 0) {
			setter(id, a);
			firstuser.add(id);
			a = 1;
		} else if (a == 1) {
		
			setter(id, a);
			seconduser.add(id);
			a = 0;
		}
		
		
		if (check(firstuser,seconduser) || count == 9 )
		{
			
			obj.setResult("match complete");
			model.addObject("obj", obj);
			return model;
		}
		model.addObject("obj", obj);
		count++;
		return model;
	}

	
	boolean check(ArrayList firstuser,ArrayList seconduser)
	{
		    ArrayList patrn1=new ArrayList();
	        patrn1.add(1);
	        patrn1.add(2);
	        patrn1.add(3);
	        
	        ArrayList patrn2=new ArrayList();
	        patrn2.add(4);
	        patrn2.add(5);
	        patrn2.add(6);
	        
	        ArrayList patrn3=new ArrayList();
	        patrn3.add(7);
	        patrn3.add(8);
	        patrn3.add(9);
	        
	        ArrayList patrn4=new ArrayList();
	        patrn4.add(1);
	        patrn4.add(4);
	        patrn4.add(7);
	        
	        ArrayList patrn5=new ArrayList();
	        patrn5.add(2);
	        patrn5.add(5);
	        patrn5.add(8);
	        
	        ArrayList patrn6=new ArrayList();
	        patrn6.add(3);
	        patrn6.add(6);
	        patrn6.add(9);
	        
	        ArrayList patrn7=new ArrayList();
	        patrn7.add(1);
	        patrn7.add(5);
	        patrn7.add(9);
	        
	        ArrayList patrn8=new ArrayList();
	        patrn8.add(3);
	        patrn8.add(5);
	        patrn8.add(7);
	        
	        ArrayList patrn9=new ArrayList();
	        
	        patrn9.add(patrn8);
	        patrn9.add(patrn7);
	        patrn9.add(patrn6);
	        patrn9.add(patrn5);
	        patrn9.add(patrn4);
	        patrn9.add(patrn3);
	        patrn9.add(patrn2);
	        patrn9.add(patrn1);
	        
	       // seconduser.containsAll((Collection) patrn9.get(0));
	        for(int i=0;i<=firstuser.size();i++){
	        if(((Collection) patrn9.get(i)).containsAll(seconduser))
	        	return true;
	        
	        else if (((Collection) patrn9.get(i)).containsAll (firstuser))
            return true; 
	        }
	        return false;
	}
	
	void setter(String id, int a2) {

		System.out.println("valueof" + a2);
		int idTemp = Integer.parseInt(id);
		if (idTemp == 1) {
			obj.setB1("" + a2);
		}
		if (idTemp == 2) {
			obj.setB2("" + a2);
		}
		if (idTemp == 3) {
			obj.setB3("" + a2);
		}
		if (idTemp == 4) {
			obj.setB4("" + a2);
		}
		if (idTemp == 5) {
			obj.setB5("" + a2);
		}
		if (idTemp == 6) {
			obj.setB6("" + a2);
		}
		if (idTemp == 7) {
			obj.setB7("" + a2);
		}
		if (idTemp == 8) {
			obj.setB8("" + a2);
		}
		if (idTemp == 9) {
			obj.setB9("" + a2);
		}
	}
}
