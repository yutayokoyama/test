package com.example.model;

public class JSon {

	private String rel;
	private String location;
	private Links _links;

	public JSon(String _rel, String _location, Links _links){
		rel = _rel;
		location = _location;
		this._links = _links;
	}

	/**
	 * @return rel
	 */
	public String getRel() {
		return rel;
	}
	/**
	 * @param rel セットする rel
	 */
	public void setRel(String rel) {
		this.rel = rel;
	}
	/**
	 * @return location
	 */
	public String getLocation() {
		return location;
	}
	/**
	 * @param location セットする location
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return _links
	 */
	public Links get_links() {
		return _links;
	}
	/**
	 * @param _links セットする _links
	 */
	public void set_links(Links _links) {
		this._links = _links;
	}



}
