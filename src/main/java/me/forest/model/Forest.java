package me.forest.model;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity(name="tb_forest")
public class Forest {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany(mappedBy = "forest")
	@JsonIgnoreProperties("forest")
	private List<Tree >trees;
	
	
	private int totalMinFocusedDay;
	
	private int totalMinFocusedWeek;
	
	private int totalMinFocusedMonth;
	
	private int TreeDeathMonth;
	
	private int TreeDeathsWeek;
	
	private int TreeDeathsDay;
 	
    private int TreePlantsMonth;
	
	private int TreePlantshWeek;
	
	private int TreePlantsDay;
	
	
	


}
