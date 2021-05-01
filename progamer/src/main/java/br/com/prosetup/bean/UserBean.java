package br.com.prosetup.bean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

import br.com.prosetup.dao.UserDAO;
import br.com.prosetup.model.User;

@ManagedBean
public class UserBean {
	
	private User user = new User();
	
	public void store() {
		new UserDAO().store(this.user);
		System.out.println("salvando.." + this.user);
		FacesContext.getCurrentInstance().addMessage(null, 
				new FacesMessage("Setup cadastrado com sucesso"));
	}

	
	public List<User> getUsers() {
		return new UserDAO().getAll();
	}
	
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
}
