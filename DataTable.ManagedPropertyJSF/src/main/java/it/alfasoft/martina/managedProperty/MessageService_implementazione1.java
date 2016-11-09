package it.alfasoft.martina.managedProperty;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;

@ManagedBean(name="msgService", eager=true)
public class MessageService_implementazione1 implements Serializable, MessageService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public MessageService_implementazione1(){
		
	}

	@Override
	public String getMessage() {
		
		return "Ciao da Prima Implementazione";
	}

}
