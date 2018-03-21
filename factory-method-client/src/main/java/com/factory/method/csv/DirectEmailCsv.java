package com.factory.method.csv;

import com.factory.method.contact.Contacts;
import com.factory.method.directemail.DirectEmail;

/**
 * @author Jhonatas Oliveira
 *
 */
public class DirectEmailCsv extends DirectEmail {

	private String fileName;

	/**
	 * @param fileName
	 */
	public DirectEmailCsv(String fileName) {
		this.fileName = fileName;
	}

	@Override
	protected Contacts createContact() {
		return new ContactsCsv(fileName);
	}

}
