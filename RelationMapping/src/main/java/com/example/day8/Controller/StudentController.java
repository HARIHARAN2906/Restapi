package com.example.day8.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.day8.Model.StudentModel;
import com.example.day8.Repository.StudentRepo;

@RestController
@RequestMapping("/")
public class StudentController 
{
	@Autowired
	StudentRepo srepo;
	@PostMapping()
		public StudentModel saveDetails(@RequestBody StudentModel aj)
		{
			return  srepo.save(aj);
		}
	@GetMapping()
	public List<StudentModel>getDetails()
	{
		return srepo.findAll();
	}
	@DeleteMapping("/{id}")
	public String deleteStudent(@PathVariable("id")int id)
	{
		srepo.deleteById(id);
		return "The id"+id+"is deletde";
	}
	
}