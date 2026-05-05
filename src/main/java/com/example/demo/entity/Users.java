package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "users")   // वही table नाम जो तुमने SQL से बनाया है
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // SERIAL column के लिए सही strategy
    private Long id;

    private String name;

    @Column(unique = true)
    private String email;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

    // getters & setters
    
}