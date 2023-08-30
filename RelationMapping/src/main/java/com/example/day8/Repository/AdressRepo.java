package com.example.day8.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.day8.Model.AddressModel;

public interface AdressRepo extends JpaRepository <AddressModel,Integer>{

}