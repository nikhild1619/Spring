package com.lnt.core.services;

public class Address {

		private String flatAndWing;
		private String Society;
		private String area;
		private String City;
		
		
		
		public String getFlatAndWing() {    //flatAndWing
			return flatAndWing;
		}
		public void setFlatAndWing(String flatAndWing) {
			this.flatAndWing = flatAndWing;
		}
		public String getSociety() {  //society
			return Society;
		}
		public void setSociety(String society) {
			Society = society;
		}
		public String getArea() { // area
			return area;
		}
		public void setArea(String area) {
			this.area = area;
		}
		public String getCity() { // city
			return City;
		}
		public void setCity(String city) {
			City = city;
		}
		@Override
		public String toString() {
			return "Address [flatAndWing=" + flatAndWing + ", Society=" + Society + ", area=" + area + ", City=" + City
					+ "]";
		}
		
		
		
		
		
}
