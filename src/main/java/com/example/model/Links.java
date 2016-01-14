package com.example.model;


public class Links {

	private Self self;
	public Links(Self _self){
		self = _self;
	}

	/**
	 * @return self
	 */
	public Self getSelf() {
		return self;
	}

	/**
	 * @param self セットする self
	 */
	public void setSelf(Self self) {
		this.self = self;
	}


}
