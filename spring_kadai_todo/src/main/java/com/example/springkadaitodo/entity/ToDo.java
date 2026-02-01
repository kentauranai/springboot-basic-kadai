package com.example.springkadaitodo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="todos")
@Data
public class ToDo {
	@Id
	private Integer id;

	private String title;
	private String priority;
	private String status;

	// getter / setter
	
}
