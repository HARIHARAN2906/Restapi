package com.example.day7.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.example.day7.model.travelsmodel;

import jakarta.transaction.Transactional;

public interface travelsrepo extends JpaRepository<travelsmodel, Integer>{
	//native Query
	
		@Query(value="select * from travelsmodel", nativeQuery = true)
		public List<travelsmodel> getAllRows();
		
		@Query(value="select * from travelsmodel where travelsname like %?1%",nativeQuery = true)
		public List<travelsmodel> getByname(@Param("name") String name);
			
		@Query(value="select * from travelsmodel where Destination=:dest and travelsname=:name",nativeQuery = true )
		public List<travelsmodel> getSpecRows(@Param("dest") String dest,@Param("name") String name);
			
		//Delete using native query
		
		@Modifying
		@Transactional
		@Query(value="delete from travelsmodel where travels_id=:id",nativeQuery=true)
		public int deletebyid(@Param("id") int id);

		
		//Update the native query
		
		@Modifying
		@Transactional
		@Query(value="update travelsmodel set destination=:dest where travels_id=:id",nativeQuery = true)
		public Integer updateByid(@Param("dest") String dest,@Param("id") int id);

}
