package com.factory.method.xml;

import com.factory.method.contact.Contacts;
import com.factory.method.directemail.DirectEmail;

/**
 * @author Jhonatas Oliveira
 *
 */
public class DirectEmailXml extends DirectEmail {

	private String fileName;

	/**
	 * @param fileName
	 */
	public DirectEmailXml(String fileName) {
		this.fileName = fileName;
	}

	@Override
	protected Contacts createContact() {
		return new ContactsXml(fileName);
	}

}
