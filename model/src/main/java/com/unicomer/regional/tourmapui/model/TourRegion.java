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
@Table(name="TourRegion")
public class TourRegion {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer regionId;
	
	private String name;
	private TourSite startSite;
	
	
	public Integer getRegionId() {
		return regionId;
	}
	public void setRegionId(Integer regionId) {
		this.regionId = regionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public TourSite getStartSite() {
		return startSite;
	}
	public void setStartSite(TourSite startSite) {
		this.startSite = startSite;
	}
}