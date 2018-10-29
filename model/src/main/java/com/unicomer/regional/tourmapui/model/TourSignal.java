/**
 * 
 */
package com.unicomer.regional.tourmapui.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author henry_melara
 *
 */
@Entity
@Table(name="TourSignal")
public class TourSignal {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer signalId;
	
	private String name;
	private Boolean negate;
	
	public Integer getSignalId() {
		return signalId;
	}
	public void setSignalId(Integer signalId) {
		this.signalId = signalId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getNegate() {
		return negate;
	}
	public void setNegate(Boolean negate) {
		this.negate = negate;
	}
}