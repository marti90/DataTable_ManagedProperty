package it.alfasoft.martina.managedProperty;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
@ManagedBean(name="msgDUE", eager=true)
public class MessageService_implementazione2 implements Serializable, MessageService{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
    public MessageService_implementazione2(){
		System.out.println("Creata classe Implementazione2");
	}

	@Override
	public String getMessage() {

		return "Implementazione DUE";
	}

}
