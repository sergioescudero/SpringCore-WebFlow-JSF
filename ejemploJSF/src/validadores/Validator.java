package validadores;


import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;
import javax.faces.model.SelectItem;
import javax.faces.validator.ValidatorException;






public class Validator implements javax.faces.validator.Validator{
	

	public void validate(FacesContext arg0, UIComponent arg1, Object arg2)
			throws ValidatorException {
		
	
		
	
		
		if (arg2.toString().length()<8){
			
			throw new ValidatorException(new FacesMessage("pon 8"));
			
		}
		
	}
	
	

	
}
