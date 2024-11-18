package com.campusdual.classroom;

public class Teacher extends Person {

	protected String area;

	public Teacher(String name, String surname, String area) {
		super(name, surname);
		this.area = area;
	}

	@Override
	public void  getDetails() {
		StringBuilder profesora = new StringBuilder();

		profesora.append("Profesora ");
		profesora.append(this.name);
		profesora.append(" ");
		profesora.append(this.surname);
		profesora.append(", del área de ");
		profesora.append(this.area.toLowerCase());

		System.out.println(profesora.toString());
	}
}
