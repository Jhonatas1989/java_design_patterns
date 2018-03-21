package com.factory.method.csv;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import com.factory.method.contact.Contact;
import com.factory.method.contact.Contacts;

import au.com.bytecode.opencsv.CSVReader;

/**
 * @author Jhonatas Oliveira
 *
 */
public class ContactsCsv implements Contacts {

	private String fileName;

	/**
	 * @param fileName
	 */
	public ContactsCsv(String fileName) {
		this.fileName = fileName;
	}

	public List<Contact> all() {
		List<Contact> contacts = new ArrayList<Contact>();
		CSVReader csvReader = null;

		try {
			URI uri = this.getClass().getResource("/" + fileName).toURI();
			File fileCsv = new File(uri);
			FileReader fileReader = new FileReader(fileCsv);
			csvReader = new CSVReader(fileReader);
			String[] nextLine;

			while ((nextLine = csvReader.readNext()) != null) {
				contacts.add(new Contact(nextLine[0].trim(), nextLine[1].trim()));
			}
		} catch (Exception e) {
			throw new RuntimeException("Error reading file csv", e);
		} finally {
			try {
				csvReader.close();
			} catch (IOException e) {
			}
		}

		return contacts;
	}

}
