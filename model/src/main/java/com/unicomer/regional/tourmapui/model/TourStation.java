/**
 * 
 */
package com.unicomer.regional.tourmapui.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 * @author henry_melara
 *
 */
@Entity
/*@Table( name="TourStation" )*/
@DiscriminatorValue( value="station" )
public class TourStation extends TourSite 
{
	private static final long serialVersionUID = 1L;

	private String serviceName;
	private String launchShuttle;
	private String returnShuttle;
	
	
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getLaunchShuttle() {
		return launchShuttle;
	}
	public void setLaunchShuttle(String launchShuttle) {
		this.launchShuttle = launchShuttle;
	}
	public String getReturnShuttle() {
		return returnShuttle;
	}
	public void setReturnShuttle(String returnShuttle) {
		this.returnShuttle = returnShuttle;
	}
}
