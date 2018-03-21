package com.factory.method.directemail;

import java.util.List;

import com.factory.method.contact.Contact;
import com.factory.method.contact.Contacts;

/**
 * @author Jhonatas Oliveira
 *
 */
public abstract class DirectEmail {
	
	/**
	 * @return
	 */
	protected abstract Contacts createContact();
	
	/**
	 * @param message
	 * @return
	 */
	public boolean sendEmail(String message) {
		List<Contact> contacts = createContact().all();

		System.out.println("Connecting in server SMTP...");
		System.out.println("Message to sending: " + message);
		System.out.println();
		
		for (Contact contact : contacts) {
			System.out.println("from: <contacts@oliveira.com>");
			System.out.printf("To: [%s] <%s>\n", contact.getName(), contact.getEmail());
			System.out.println(message);
			System.out.println();
		}
		
		return true;
	}
}
