package ch.itenengineering.helloworld.jsf;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import ch.itenengineering.helloworld.ejb.HelloWorldRemote;

@ManagedBean
@ViewScoped
public class Index implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
    HelloWorldRemote remote;
    
    public Index() {
    	super();
    }

    public String getGreeting() {
        return remote.helloWorld("Hello EJB from JSF");
    }

} // end
