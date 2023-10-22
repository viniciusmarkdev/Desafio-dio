package me.forest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity(name="tb_user")
public class User {
	
	   @Id
	   @GeneratedValue(strategy=GenerationType.IDENTITY)
       private Long id;
       
       
       private String name;
       
       
       private  int coins;
       
       @OneToMany(cascade = CascadeType.ALL  , fetch = FetchType.EAGER)
       @JsonIgnoreProperties
       private List<Tree> trees;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCoins() {
		return coins;
	}

	public void setCoins(int coins) {
		this.coins = coins;
	}

	public List<Tree> getTrees() {
		return trees;
	}

	public void setTrees(List<Tree> trees) {
		this.trees = trees;
	}
       
       
       
       
       
}
