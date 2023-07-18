package com.example.apiabarno.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


import java.io.Serializable;
import java.sql.Date;
import java.sql.Time;


@Entity
@Table(name = "attendance")
public class Attendance implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int employee_id;
    @Column
    private Date date;
    @Column
    private Time time_in;
    @Column
    private int status;
    @Column
    private Time time_out;
    @Column
    private Double num_hr;

    public Attendance(){
        super();
    }

    public Attendance(int id, int employee_id, Date date, Time time_in, int status, Time time_out, Double num_hr){
        super();
        this.id = id;
        this.employee_id = employee_id;
        this.date = date;
        this.time_in = time_in;
        this.status = status;
        this.time_out = time_out;
        this.num_hr = num_hr;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime_in() {
        return time_in;
    }

    public void setTime_in(Time time_in) {
        this.time_in = time_in;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public Time getTime_out() {
        return time_out;
    }

    public void setTime_out(Time time_out) {
        this.time_out = time_out;
    }

    public Double getNum_hr() {
        return num_hr;
    }

    public void setNum_hr(Double num_hr) {
        this.num_hr = num_hr;
    }
}
