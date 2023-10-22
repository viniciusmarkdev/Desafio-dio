package me.forest.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity(name="tb_trees")
public class Tree {
	
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   
	private Long id;
	
	private String type;
	
	private String tag;
	
	@ManyToOne 
	@JsonIgnoreProperties("trees")
	Forest forest; 
    
    private String min ; 
    
    

}
