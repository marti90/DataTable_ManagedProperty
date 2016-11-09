package it.alfasoft.martina.managedProperty;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

@ManagedBean(name="p", eager=true)
public class EsempioManagedProperty implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ManagedProperty(value = "#{msgDUE}")
	private MessageService msg;
	
	public EsempioManagedProperty(){
		
	}

	public MessageService getMsg() {
		return msg;
	}

	public void setMsg(MessageService msg) {
		this.msg = msg;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getMessaggio(){
		return msg.getMessage();
	}

}
