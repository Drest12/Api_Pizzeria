package com.example.apiabarno.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.io.Serializable;
import java.sql.Date;


@Entity
@Table(name = "cashadvance")
public class Cashadvance implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private Date date_advance;
    @Column
    private String employee_id;
    @Column
    private Double amount;

    public Cashadvance(){
        super();
    }

    public Cashadvance(int id, Date date_advance, String employee_id, Double amount){
        this.id = id;
        this.date_advance = date_advance;
        this.employee_id = employee_id;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate_advance() {
        return date_advance;
    }

    public void setDate_advance(Date date_advance) {
        this.date_advance = date_advance;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
