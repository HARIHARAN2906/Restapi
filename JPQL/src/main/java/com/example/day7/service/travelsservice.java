package com.example.day7.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.day7.model.travelsmodel;
import com.example.day7.repository.travelsrepo;

@Service

public class travelsservice {
	@Autowired
	public travelsrepo hrepo;
	
	//post the data
	public String savetravels(travelsmodel h)
	{
		hrepo.save(h);
		return"Data is saved to database";
	}
	
	//get all the data
		public List<travelsmodel> getAllrows()
		{
			return hrepo.getAllRows();
		}
		
		//get specific rows
		public List<travelsmodel> getSpecrows(String add,String name)
		{
			return hrepo.getSpecRows(add, name);
		}
		//delete the data
		
	
			//update the data
			
			public Integer updateRow(String dest,int id)
			{
				return hrepo.updateByid(dest, id);
			

	}
}