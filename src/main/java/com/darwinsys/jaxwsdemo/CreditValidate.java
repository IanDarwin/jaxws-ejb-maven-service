package com.darwinsys.jaxwsdemo;

import javax.ejb.Stateless;
import javax.jws.WebService;

/**
 * A bean that can be accessed as an EJB or as a SOAP Web Service.
 */
@Stateless
@WebService
public class CreditValidate {

	/** In this fantasy world of demos, cards ending in 42 are valid */
	public boolean isValidCard(String cardNum) {
		return cardNum.endsWith("42");
	}
}
