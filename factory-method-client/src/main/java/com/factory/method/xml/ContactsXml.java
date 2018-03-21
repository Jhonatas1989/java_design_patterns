package com.factory.method.xml;

import java.net.URL;
import java.util.List;

import com.factory.method.contact.Contact;
import com.factory.method.contact.Contacts;
import com.thoughtworks.xstream.XStream;

/**
 * @author Jhonatas Oliveira
 *
 */
public class ContactsXml implements Contacts {

	private String fileName;

	/**
	 * @param fileName
	 */
	public ContactsXml(String fileName) {
		this.fileName = fileName;
	}

	@SuppressWarnings("unchecked")
	public List<Contact> all() {
		XStream xstream = new XStream();
		xstream.alias("contacts", List.class);
		xstream.alias("contact", Contact.class);

		URL file = this.getClass().getResource("/" + fileName);
		return (List<Contact>) xstream.fromXML(file);
	}

}
