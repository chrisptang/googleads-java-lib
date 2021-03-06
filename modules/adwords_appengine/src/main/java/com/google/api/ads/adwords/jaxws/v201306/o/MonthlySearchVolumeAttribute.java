
package com.google.api.ads.adwords.jaxws.v201306.o;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *             {@link Attribute} type that contains a list of {@link MonthlySearchVolume}
 *             values. The list contains the past 12 {@link MonthlySearchVolume}s
 *             (excluding the current month). The first item is the data for the most
 *             recent month and the last item is the data for the oldest month.
 *           
 * 
 * <p>Java class for MonthlySearchVolumeAttribute complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MonthlySearchVolumeAttribute">
 *   &lt;complexContent>
 *     &lt;extension base="{https://adwords.google.com/api/adwords/o/v201306}Attribute">
 *       &lt;sequence>
 *         &lt;element name="value" type="{https://adwords.google.com/api/adwords/o/v201306}MonthlySearchVolume" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MonthlySearchVolumeAttribute", propOrder = {
    "value"
})
public class MonthlySearchVolumeAttribute
    extends Attribute
{

    protected List<MonthlySearchVolume> value;

    /**
     * Gets the value of the value property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the value property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getValue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link MonthlySearchVolume }
     * 
     * 
     */
    public List<MonthlySearchVolume> getValue() {
        if (value == null) {
            value = new ArrayList<MonthlySearchVolume>();
        }
        return this.value;
    }

}
