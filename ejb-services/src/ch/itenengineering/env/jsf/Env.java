package ch.itenengineering.env.jsf;

import ch.itenengineering.env.ejb.EnvService;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Env implements Serializable {

    @EJB
    EnvService env;
    
    public Env() {
    }

    public String getMessages() {
        return env.getMessages();
    }

} // end
