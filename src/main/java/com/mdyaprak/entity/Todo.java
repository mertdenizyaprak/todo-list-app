package com.mdyaprak.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Todo {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Description;
    private boolean completed;
	private String task;

    // Getter ve Setter metodları
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
    public void setTask(String task) {
        this.task = task;
}
    public String getTask() {
        return task;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
    
    public String getDescription() {
            return Description;
        }

    public boolean isCompleted() {
        return completed;
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
    }
	
}
