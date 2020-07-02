package ch.itenengineering.converter.jsf;

import ch.itenengineering.converter.domain.CurrencyType;
import ch.itenengineering.converter.ejb.CurrencyConverter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class Converter implements Serializable {

	private static final long serialVersionUID = 1L;

	@EJB
    CurrencyConverter remote;

    Double valueCHF = 12.5;
    
    List<String> result = new ArrayList<String>();


    public Converter() {
        super();
    }

    public void convert() {
        result.clear();
        for (CurrencyType currency : CurrencyType.values()) {
            if (currency != CurrencyType.CHF) {
                Double value = remote.convertCHF(valueCHF, currency);
                result.add(valueCHF + " CHF = " + value + " " + currency);
            }
        }
    }

    public Double getValueCHF() {
        return valueCHF;
    }

    public void setValueCHF(Double valueCHF) {
        this.valueCHF = valueCHF;
    }

    public List<String> getResult() {
        return result;
    }

} // end
