package com.wipro.model;
//POJO : Plain Old Java Object
public class Person implements Comparable<Person>{
	private Long adharCard;
	private String name;
	private Long mobile;
	
	
	public Person() {
		
	}
	public Person(Long adharCard, String name, Long mobile) {
		super();
		this.adharCard = adharCard;
		this.name = name;
		this.mobile = mobile;
	}
	public Long getAdharCard() {
		return adharCard;
	}
	public void setAdharCard(Long adharCard) {
		this.adharCard = adharCard;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "Person [adharCard=" + adharCard + ", name=" + name + ", mobile=" + mobile + "]";
	}
	//p1.compareTo(p2)
	@Override
	public int compareTo(Person o) {
		
		return this.getAdharCard().compareTo(o.getAdharCard());
	}
	
	
	
}
