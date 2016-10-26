package com.darwinsys.jaxwsdemo;

import javax.jws.WebService;

@WebService
public class CreditValidate {

	/** In this fantasy world of demos, cards ending in 42 are valid */
	public boolean isValidCard(String cardNum) {
		return cardNum.endsWith("42");
	}
}
