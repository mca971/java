package com.synchrony.album.vo;

import java.io.Serializable;

/**
 * This class is used to send the response to the consumer.
 * 
 * @author Subhendu
 *
 */
public class AlbumResponse implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -2246738483007567349L;
	private String code;
	private String message;
	

	/**
	 * 
	 */
	public AlbumResponse() {
		super();
	}

	/**
	 * @param code
	 * @param message
	 */
	public AlbumResponse(String code, String message) {
		super();
		this.code = code;
		this.message = message;
	}

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

}
