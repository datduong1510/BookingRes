package com.restaurant.service.entities;

import java.text.SimpleDateFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@AllArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Entity
@Table(name = "bookingTable")
public class BookingTable extends AbstractEntity {
	private static final long serialVersionUID = 1L;

	@NotBlank(message = "Name is required")
	@Column(name = "name")
	private String name;

	@Email(message = "Email must be valid")
	@NotBlank(message = "Email is required")
	@Column(name = "email")
	private String email;

	@Pattern(regexp = "^0\\d{9,10}$", message = "Phone number must start with 0 and have 9-10 digits")
	@NotBlank(message = "Phone number is required")
	@Column(name = "phone_number")
	private String phone_number;

	@NotBlank(message = "Date is required")
	@Column(name = "date")
	private String date;

	@NotBlank(message = "Start time is required")
	@Column(name = "start_time")
	private String start_time;

	@NotBlank(message = "End time time is required")
	@Column(name = "end_time")
	private String end_time;

	@NotNull(message = "Number of persons is required")
	@Column(name = "person_number")
	private Integer person_number;

	@Column(name = "status")
	private Integer status = 0;

	@Column(name = "special")
	private Integer special = 0;

	@Column(name = "tableId")
	private Long tableId;

//	@ManyToOne
//	@JoinColumn(name = "tableId", referencedColumnName = "id")
//	private RestaurantTable restaurantTable;

	public BookingTable() {
		super();
	}

	public BookingTable(String name, String email, String phone_number, String date, String start_time, String end_time,
			int person_number) {
		super();
		this.name = name;
		this.email = email;
		this.phone_number = phone_number;
		this.date = date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.person_number = person_number;
	}

//	@Transient
//	public String getDateFormat() {
//		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
//		return formatter.format(date);
//	}

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

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
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

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getSpecial() {
		return special;
	}

	public void setSpecial(Integer special) {
		this.special = special;
	}

	public Long getTableId() {
		return tableId;
	}

	public void setTableId(Long tableId) {
		this.tableId = tableId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public BookingTable(String name, String email, String phone_number, String date, String start_time, String end_time,
			Integer person_number, Long tableId) {
		super();
		this.name = name;
		this.email = email;
		this.phone_number = phone_number;
		this.date = date;
		this.start_time = start_time;
		this.end_time = end_time;
		this.person_number = person_number;
		this.tableId = tableId;
	}

}
