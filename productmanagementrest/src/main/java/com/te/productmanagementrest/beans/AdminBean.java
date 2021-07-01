package com.te.productmanagementrest.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
@Entity
@Table(name="admin")
@XmlRootElement(name="admin")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AdminBean implements Serializable {
	
		
		@Id
		@Column
		@XmlAnyElement
		@JsonProperty
		private int id;
		
		@Column
		@XmlAnyElement
		@JsonProperty
		private String name;
		@Column
		@XmlAnyElement
		@JsonProperty
		private String password;
	}


