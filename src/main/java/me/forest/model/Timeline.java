package me.forest.model;

import jakarta.persistence.OneToOne;

public class Timeline {
	
	private String status;
	
	@OneToOne
	private Tree tree;
	
	private String dia ;
	
	private  String  mes;
	
	private String StartedSession;
	
	private String endSession;
	

}
