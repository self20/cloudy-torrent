package com.sachin.cloudy.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by sachinhooda on 25/5/17.
 */
@Entity
@Table(name = "ROLES")
public class Role extends AuditableEntity {

    private static final long serialVersionUID = 3823659416701565658L;

    @Column(name = "NAME", nullable = false)
    private String name;

    @Column(name = "DESCRIPTION", nullable = true)
    private String description;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



}
