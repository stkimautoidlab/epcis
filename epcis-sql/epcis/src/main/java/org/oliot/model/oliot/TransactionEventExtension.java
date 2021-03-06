//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.09.15 at 01:39:48 PM KST 
//


package org.oliot.model.oliot;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlAnyAttribute;
import javax.xml.namespace.QName;


@Entity
public class TransactionEventExtension {

	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	
	
	@OneToOne
	@JoinColumn(name="quantityList_id")
    protected QuantityList quantityList;
	@OneToOne
	@JoinColumn(name="sourceList_id")
    protected SourceList sourceList;
	@OneToOne
	@JoinColumn(name="destinationList_id")
    protected DestinationList destinationList;
	// this will be handeled as a foriegn
	@OneToOne
	@JoinColumn(name="transactionEventExtension2_id") 
    protected TransactionEventExtension2 extension;
	@Transient 
    @XmlAnyAttribute
    private Map<QName, String> otherAttributes = new HashMap<QName, String>();

    /**
     * Gets the value of the quantityList property.
     * 
     * @return
     *     possible object is
     *     {@link QuantityList }
     *     
     */
	
    public QuantityList getQuantityList() {
        return quantityList;
    }

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	

	public void setOtherAttributes(Map<QName, String> otherAttributes) {
		this.otherAttributes = otherAttributes;
	}

	/**
     * Sets the value of the quantityList property.
     * 
     * @param value
     *     allowed object is
     *     {@link QuantityList }
     *     
     */
    public void setQuantityList(QuantityList value) {
        this.quantityList = value;
    }

    /**
     * Gets the value of the sourceList property.
     * 
     * @return
     *     possible object is
     *     {@link SourceList }
     *     
     */
    public SourceList getSourceList() {
        return sourceList;
    }

    /**
     * Sets the value of the sourceList property.
     * 
     * @param value
     *     allowed object is
     *     {@link SourceList }
     *     
     */
    public void setSourceList(SourceList value) {
        this.sourceList = value;
    }

    /**
     * Gets the value of the destinationList property.
     * 
     * @return
     *     possible object is
     *     {@link DestinationList }
     *     
     */
    public DestinationList getDestinationList() {
        return destinationList;
    }

    /**
     * Sets the value of the destinationList property.
     * 
     * @param value
     *     allowed object is
     *     {@link DestinationList }
     *     
     */
    public void setDestinationList(DestinationList value) {
        this.destinationList = value;
    }

    /**
     * Gets the value of the extension property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionEventExtension2 }
     *     
     */
    public TransactionEventExtension2 getExtension() {
        return extension;
    }

    /**
     * Sets the value of the extension property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionEventExtension2 }
     *     
     */
    public void setExtension(TransactionEventExtension2 value) {
        this.extension = value;
    }

    /**
     * Gets a map that contains attributes that aren't bound to any typed property on this class.
     * 
     * <p>
     * the map is keyed by the name of the attribute and 
     * the value is the string value of the attribute.
     * 
     * the map returned by this method is live, and you can add new attribute
     * by updating the map directly. Because of this design, there's no setter.
     * 
     * 
     * @return
     *     always non-null
     */
    public Map<QName, String> getOtherAttributes() {
        return otherAttributes;
    }

}
