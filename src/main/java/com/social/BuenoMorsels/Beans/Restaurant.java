package com.social.BuenoMorsels.Beans;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Restaurant {

	@Id
	@Column(name="restaurant_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int restaurantId;
	
	@Column
	private String title;
	
	
	@Column
	private String description;
	
	@Column(name="post_id")
	private int postId;
	
	

	
}
