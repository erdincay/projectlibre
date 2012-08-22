//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.08.15 at 08:47:18 AM BST 
//

package net.sf.mpxj.primavera.schema;

import java.util.Date;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>Java class for UDFTypeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UDFTypeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DataType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Text"/>
 *               &lt;enumeration value="Start Date"/>
 *               &lt;enumeration value="Finish Date"/>
 *               &lt;enumeration value="Cost"/>
 *               &lt;enumeration value="Double"/>
 *               &lt;enumeration value="Integer"/>
 *               &lt;enumeration value="Indicator"/>
 *               &lt;enumeration value="Code"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IsCalculated" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsConditional" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="IsSecureCode" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="SubjectArea" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Activity"/>
 *               &lt;enumeration value="Activity Expense"/>
 *               &lt;enumeration value="Activity Step"/>
 *               &lt;enumeration value="Project"/>
 *               &lt;enumeration value="Project Issue"/>
 *               &lt;enumeration value="Project Risk"/>
 *               &lt;enumeration value="Resource"/>
 *               &lt;enumeration value="Resource Assignment"/>
 *               &lt;enumeration value="WBS"/>
 *               &lt;enumeration value="Work Products and Documents"/>
 *               &lt;enumeration value="Activity Step Template Item"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Title" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="40"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "UDFTypeType", propOrder =
{
   "createDate",
   "createUser",
   "dataType",
   "isCalculated",
   "isConditional",
   "isSecureCode",
   "lastUpdateDate",
   "lastUpdateUser",
   "objectId",
   "subjectArea",
   "title"
}) @SuppressWarnings("all") public class UDFTypeType
{

   @XmlElementRef(name = "CreateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Date> createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElement(name = "DataType") protected String dataType;
   @XmlElementRef(name = "IsCalculated", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Boolean> isCalculated;
   @XmlElementRef(name = "IsConditional", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Boolean> isConditional;
   @XmlElement(name = "IsSecureCode") protected Boolean isSecureCode;
   @XmlElementRef(name = "LastUpdateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Date> lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "SubjectArea") protected String subjectArea;
   @XmlElement(name = "Title") protected String title;

   /**
    * Gets the value of the createDate property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public JAXBElement<Date> getCreateDate()
   {
      return createDate;
   }

   /**
    * Sets the value of the createDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public void setCreateDate(JAXBElement<Date> value)
   {
      this.createDate = ((JAXBElement<Date>) value);
   }

   /**
    * Gets the value of the createUser property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getCreateUser()
   {
      return createUser;
   }

   /**
    * Sets the value of the createUser property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setCreateUser(String value)
   {
      this.createUser = value;
   }

   /**
    * Gets the value of the dataType property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getDataType()
   {
      return dataType;
   }

   /**
    * Sets the value of the dataType property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setDataType(String value)
   {
      this.dataType = value;
   }

   /**
    * Gets the value of the isCalculated property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public JAXBElement<Boolean> getIsCalculated()
   {
      return isCalculated;
   }

   /**
    * Sets the value of the isCalculated property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public void setIsCalculated(JAXBElement<Boolean> value)
   {
      this.isCalculated = ((JAXBElement<Boolean>) value);
   }

   /**
    * Gets the value of the isConditional property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public JAXBElement<Boolean> getIsConditional()
   {
      return isConditional;
   }

   /**
    * Sets the value of the isConditional property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public void setIsConditional(JAXBElement<Boolean> value)
   {
      this.isConditional = ((JAXBElement<Boolean>) value);
   }

   /**
    * Gets the value of the isSecureCode property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isIsSecureCode()
   {
      return isSecureCode;
   }

   /**
    * Sets the value of the isSecureCode property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setIsSecureCode(Boolean value)
   {
      this.isSecureCode = value;
   }

   /**
    * Gets the value of the lastUpdateDate property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public JAXBElement<Date> getLastUpdateDate()
   {
      return lastUpdateDate;
   }

   /**
    * Sets the value of the lastUpdateDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public void setLastUpdateDate(JAXBElement<Date> value)
   {
      this.lastUpdateDate = ((JAXBElement<Date>) value);
   }

   /**
    * Gets the value of the lastUpdateUser property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getLastUpdateUser()
   {
      return lastUpdateUser;
   }

   /**
    * Sets the value of the lastUpdateUser property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setLastUpdateUser(String value)
   {
      this.lastUpdateUser = value;
   }

   /**
    * Gets the value of the objectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getObjectId()
   {
      return objectId;
   }

   /**
    * Sets the value of the objectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setObjectId(Integer value)
   {
      this.objectId = value;
   }

   /**
    * Gets the value of the subjectArea property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getSubjectArea()
   {
      return subjectArea;
   }

   /**
    * Sets the value of the subjectArea property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setSubjectArea(String value)
   {
      this.subjectArea = value;
   }

   /**
    * Gets the value of the title property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getTitle()
   {
      return title;
   }

   /**
    * Sets the value of the title property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setTitle(String value)
   {
      this.title = value;
   }

}
