package com.sowing.pitballs.model;

import java.io.Serializable;

public class Pit implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7522478816679185109L;
	private int pitNumber;
	private int stones;
	private String bigPitHole;
	
	public Pit(int pitNumber, int stones) {
		this.pitNumber = pitNumber;
		this.stones = stones;
		
	}

	public String getBigPitHole() {
		return bigPitHole;
	}

	public void setBigPitHole(String bigPitHole) {
		this.bigPitHole = bigPitHole;
	}

	public int getPitNumber() {
		return pitNumber;
	}

	public void setPitNumber(int pitNumber) {
		this.pitNumber = pitNumber;
	}
	public int getStones() {
		return stones;
	}

	public void setStones(int stones) {
		this.stones = stones;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Pit))
			return false;

		Pit other = (Pit) obj;
		return this.pitNumber == other.pitNumber;
	}

	@Override
	public int hashCode() {

		return pitNumber;
	}

	@Override
	public String toString() {

		return "Pit Number" + " : " + getPitNumber() + " :Stones : " + getStones();
	}

	
}
