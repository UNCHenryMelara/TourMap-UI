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
/*@Table(name="TourService")*/
@DiscriminatorValue( value="service" )
public class TourService extends Tourmap{

	private static final long serialVersionUID = 1L;

	private Integer serviceId;
	
	private String serviceName;
	private String servicePackage;
	
	public Integer getServiceId() {
		return serviceId;
	}
	public void setServiceId(Integer serviceId) {
		this.serviceId = serviceId;
	}
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getServicePackage() {
		return servicePackage;
	}
	public void setServicePackage(String servicePackage) {
		this.servicePackage = servicePackage;
	}
}