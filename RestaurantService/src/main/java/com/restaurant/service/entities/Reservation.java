package com.restaurant.service.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "reservation")
public class Reservation extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Column(name = "name")
	private String name;

	@Column(name = "email")
	private String email;

	@Column(name = "phone_number")
	private String phoneNumber;

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

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getStart_time() {
		return start_time;
	}

	public void setStart_time(String start_time) {
		this.start_time = start_time;
	}

	public String getEnd_time() {
		return end_time;
	}

	public void setEnd_time(String end_time) {
		this.end_time = end_time;
	}

	public Integer getPerson_number() {
		return person_number;
	}

	public void setPerson_number(Integer person_number) {
		this.person_number = person_number;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public TableM getTableM() {
		return tableM;
	}

	public void setTableM(TableM tableM) {
		this.tableM = tableM;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Column(name = "date")
	private String date;

	@Column(name = "start_time")
	private String start_time;

	@Column(name = "end_time")
	private String end_time;

	@Column(name = "person_number")
	private Integer person_number;

	@Column(name = "status")
	private int status = 0;

	@ManyToOne
	@JoinColumn(name = "table_id")
	private TableM tableM;

	public Reservation() {
		super();
	}

//	@Transient
//	public String getDateToString() {
//	    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//	    return formatter.format(date);
//	}

}
