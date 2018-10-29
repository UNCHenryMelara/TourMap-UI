/**
 * 
 */
package com.unicomer.regional.tourmapui.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * @author henry_melara
 *
 */
@Entity
@Table(name="TourmapService")
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "type" )
public class Tourmap implements Serializable
{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer tourId;

	private String tourName;
	private String tourFile;
	
	public Integer getTourId() {
		return tourId;
	}
	public Tourmap setTourId(Integer tourId) {
		this.tourId = tourId;
		return this;
	}
	public String getTourName() {
		return tourName;
	}
	public Tourmap setTourName(String tourName) {
		this.tourName = tourName;
		return this;
	}
	public String getTourFile() {
		return tourFile;
	}
	public Tourmap setTourFile(String tourFile) {
		this.tourFile = tourFile;
		return this;
	}
}