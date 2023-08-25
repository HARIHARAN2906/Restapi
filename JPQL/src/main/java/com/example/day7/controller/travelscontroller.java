package com.example.day7.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.day7.model.travelsmodel;
import com.example.day7.service.travelsservice;

@RestController


		public class travelscontroller {
			@Autowired
			public travelsservice hserv;
			
			//post mapping
			
			@PostMapping("/posttravels")
			public String posttravels(@RequestBody travelsmodel hr)
			{
				hserv.savetravels(hr);
				return "Data is saved to the Database";
			}
			
			//get all the data
			
				 @GetMapping("/getAllrows")
				 public List<travelsmodel> getallRows()
				 {
					 return hserv.getAllrows();
				 }
				 
				 //get specific data
				 
				 @GetMapping("/getSpecific/{add}/{name}")
				 public List<travelsmodel> getSpec(@PathVariable("add") String add,@PathVariable("name") String name)
				 {
					 return hserv.getSpecrows(add, name);
				 }
				
		
				    @PutMapping("/updateId/{add}/{id}")
				    public String updateInfo(@PathVariable("dest") String dest, @PathVariable("id") int id) 
				    {
				        return hserv.updateRow(dest, id) + " rows updated";
				    }

		}

