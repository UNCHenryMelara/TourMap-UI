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
/*@Table( name="TourRoad" )*/
@DiscriminatorValue( value="road" )
public class TourRoad extends TourAisle
{
	private static final long serialVersionUID = 1L;
	
	private String destination;
	private String signal;
	
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	public String getSignal() {
		return signal;
	}
	public void setSignal(String signal) {
		this.signal = signal;
	}
}