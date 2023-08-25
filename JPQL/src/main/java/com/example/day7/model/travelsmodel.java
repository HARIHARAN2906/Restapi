package com.example.day7.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="garuda")
public class travelsmodel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int travelsId;
	@Column(name="travelsname")
	private String travelsName;
	private String Destination;
	public int getTravelsId() {
		return travelsId;
	}
	public void setTravelsId(int travelsId) {
		this.travelsId = travelsId;
	}
	public String getTravelsName() {
		return travelsName;
	}
	public void setTravelsName(String travelsName) {
		this.travelsName = travelsName;
	}
	public String getDestination() {
		return Destination;
	}
	public void setDestination(String destination) {
		Destination = destination;
	}
}