package com.sau.assignment2.service;

import com.sau.assignment2.model.Logistics;
import com.sau.assignment2.model.Healthcare;

public class BusinessService {

	private Logistics logistics ;
	private Healthcare healthcare;

	public Logistics getLogistics() {
		return logistics;
	}

	public void setApple(Logistics logistics) {
		this.logistics = logistics;
	}

	public Healthcare getHealthcare() {
		return healthcare;
	}

	public void setHealthcare(Healthcare healthcare) {
		this.healthcare = healthcare;
	}
}
