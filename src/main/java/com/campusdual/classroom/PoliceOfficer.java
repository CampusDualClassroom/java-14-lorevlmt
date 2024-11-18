package com.campusdual.classroom;

public class PoliceOfficer extends Person {

	protected String squad;

	public PoliceOfficer(String name, String surname, String squad) {
		super(name, surname);
		this.squad = squad;
	}

	@Override
	public void  getDetails() {

		StringBuilder police = new StringBuilder();

		police.append("Agente de policía ");
		police.append(this.name);
		police.append(" ");
		police.append(this.surname);
		police.append(", del escuadrón ");
		police.append(this.squad.toLowerCase());

		System.out.println(police.toString());
	}
}
