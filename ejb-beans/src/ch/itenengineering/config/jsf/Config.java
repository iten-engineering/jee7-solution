package ch.itenengineering.config.jsf;

import ch.itenengineering.config.ejb.ConfigService;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


@ManagedBean
@ViewScoped
public class Config implements Serializable {

	private static final long serialVersionUID = 1L;

	private String key;
	private String value;

	@EJB
	ConfigService service;

	public Config() {		
	}

	public void save() {
		service.setConfig(key, value);
	}

	public void read() {
		value = service.getConfig(key);
	}

	public List<String> getList() {
		return service.listConfig();
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
