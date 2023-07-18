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
@Table(name = "overtime")
public class Overtime implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String employee_id;
    @Column
    private Double hours;
    @Column
    private Double rate;
    @Column
    private Date date_overtime;

    public Overtime(int id, String employee_id, Double hours, Double rate, Date date_overtime){
        this.id = id;
        this.employee_id = employee_id;
        this.hours = hours;
        this.rate = rate;
        this.date_overtime = date_overtime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(String employee_id) {
        this.employee_id = employee_id;
    }

    public Double getHours() {
        return hours;
    }

    public void setHours(Double hours) {
        this.hours = hours;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Date getDate_overtime() {
        return date_overtime;
    }

    public void setDate_overtime(Date date_overtime) {
        this.date_overtime = date_overtime;
    }
}
