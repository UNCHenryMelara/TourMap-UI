/**
 * 
 */
package com.unicomer.regional.tourmapui.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
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
@Table(name="TourAisleRoad")
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "type" )
@DiscriminatorValue( value="aisle" )
public class TourAisle implements Serializable 
{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer aisleId;

	private String name;
	private String letter;
	private String laneAction;
	
	
	public Integer getAisleId() {
		return aisleId;
	}
	public void setAisleId(Integer aisleId) {
		this.aisleId = aisleId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLetter() {
		return letter;
	}
	public void setLetter(String letter) {
		this.letter = letter;
	}
	public String getLaneAction() {
		return laneAction;
	}
	public void setLaneAction(String laneAction) {
		this.laneAction = laneAction;
	}
}
