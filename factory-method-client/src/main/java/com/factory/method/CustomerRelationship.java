package com.factory.method;

import javax.swing.JOptionPane;

import com.factory.method.csv.DirectEmailCsv;
import com.factory.method.directemail.DirectEmail;
import com.factory.method.xml.DirectEmailXml;

/**
 * @author Jhonatas Oliveira
 *
 */
public class CustomerRelationship {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		String sendType = JOptionPane.showInputDialog(null, "Type: \n 1 - CSV \n 2 - XML");

		if (sendType.equals("1")) {
			sendDirectEMail(new DirectEmailCsv("contacts.csv"));
		} else if (sendType.equals("2")) {
			sendDirectEMail(new DirectEmailXml("contacts.xml"));
		} else {
			JOptionPane.showConfirmDialog(null, "Error");
		}

	}

	/**
	 * @param directEmail
	 */
	private static void sendDirectEMail(DirectEmail directEmail) {
		String message = JOptionPane.showInputDialog(null, "type the message to e-mail.");

		boolean status = directEmail.sendEmail(message);

		JOptionPane.showConfirmDialog(null, "E-mails sent: " + status);
	}
}
