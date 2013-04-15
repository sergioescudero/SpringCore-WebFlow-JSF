package com.validadores;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;

public class LoginValidator implements javax.faces.validator.Validator{

	public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
			throws ValidatorException {
		
		System.out.println(arg1.getId());

		if (arg2.toString().length()<4){
			throw new ValidatorException(new FacesMessage ("introducción incorrecta"));
		}
		
	}

}
