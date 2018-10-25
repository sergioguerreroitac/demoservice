
package org.fusesource.camel.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.camel.dataformat.bindy.annotation.CsvRecord;
import org.apache.camel.dataformat.bindy.annotation.DataField;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "tipo",
    "numero"
})
@XmlRootElement(name = "saldo")
@CsvRecord(separator = ",", skipFirstLine = true)
public class Saldo implements Serializable {

	private static final long serialVersionUID = 7593349011208666446L;

	@XmlElement(required = true)
    @DataField(pos = 1)
    protected String tipo;
    
    @XmlElement(required = true)
    @DataField(pos = 2)    
    protected int numero;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

    /**
     * Gets the value of the amount property.
     * 
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Sets the value of the amount property.
     * 
     */
    public void setNumero(int value) {
        this.numero = value;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null) {
            return false;
        }
        if (this.getClass() != other.getClass()) {
            return false;
        }
        Saldo that = (Saldo) other;
        return this.tipo.equals(that.tipo) && this.numero == that.numero;
    }
}