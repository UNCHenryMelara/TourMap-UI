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
@Table(name="TourSite")
@Inheritance( strategy = InheritanceType.SINGLE_TABLE )
@DiscriminatorColumn( name = "type" )
@DiscriminatorValue( value="site" )
public class TourSite implements Serializable
{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO) 
	private Integer siteId;
	
	private String name;
	private String siteAction;
	private String sitePackage;
	
	
	public Integer getSiteId() {
		return siteId;
	}
	public void setSiteId(Integer siteId) {
		this.siteId = siteId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSiteAction() {
		return siteAction;
	}
	public void setSiteAction(String siteAction) {
		this.siteAction = siteAction;
	}
	public String getSitePackage() {
		return sitePackage;
	}
	public void setSitePackage(String sitePackage) {
		this.sitePackage = sitePackage;
	}
}