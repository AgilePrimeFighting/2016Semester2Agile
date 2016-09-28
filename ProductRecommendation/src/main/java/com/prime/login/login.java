package com.prime.login;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.validator.ValidatorException;


@ManagedBean
@SessionScoped
public class login 
{
	
	
	
	private String user ;
	private String pwd ;
	
	
	
	public void initLogin() 
	{
		user = null ;
		pwd = null ;
	}
	
	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public void validatePassword (FacesContext context , UIComponent component , Object value ) throws ValidatorException
	{
		  if ( value == null ) 
		  {
			  return ;
		  }
		  
		  String data = value.toString() ;
		  if ( !( 0 == data.compareTo("admin"))) 
		  {
			  FacesMessage message = new FacesMessage ("Wrong password.");
			  throw new ValidatorException(message) ; 
		  }
	}
	
	public void validateUsername (FacesContext context , UIComponent component , Object value ) throws ValidatorException
	
	{
		  if ( value == null ) 
		  {
			  return ;
		  }
		  
		  String data = value.toString() ;
		  if ( !(0 == data.compareTo("admin"))) 
		  {
			  FacesMessage message = new FacesMessage ("Wrong username.");
			  throw new ValidatorException(message) ; 
		  }
	}
	

}
