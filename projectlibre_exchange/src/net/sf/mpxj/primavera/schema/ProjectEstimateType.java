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
 * <p>Java class for ProjectEstimateType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProjectEstimateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdjustedUnits" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="AdjustmentFactor" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;maxInclusive value="999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Applied" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="AverageProductivity" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *               &lt;maxInclusive value="99999.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="FunctionPointCount" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="IsBaseline" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Method" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Top Down"/>
 *               &lt;enumeration value="User Defined"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Name" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="120"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Notes" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ProjectId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResourceId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResourceName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ResourceObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="ResourceType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Labor"/>
 *               &lt;enumeration value="Nonlabor"/>
 *               &lt;enumeration value="Material"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalActivities" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="TotalDegreeOfInfluence" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="70"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UnadjustedFunctionPointCount" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="9999999"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Units" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}double">
 *               &lt;minInclusive value="0.0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WBSCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WBSName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="100"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="WBSObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ProjectEstimateType", propOrder =
{
   "adjustedUnits",
   "adjustmentFactor",
   "applied",
   "averageProductivity",
   "createDate",
   "createUser",
   "date",
   "functionPointCount",
   "isBaseline",
   "lastUpdateDate",
   "lastUpdateUser",
   "method",
   "name",
   "notes",
   "objectId",
   "projectId",
   "projectObjectId",
   "resourceId",
   "resourceName",
   "resourceObjectId",
   "resourceType",
   "totalActivities",
   "totalDegreeOfInfluence",
   "unadjustedFunctionPointCount",
   "units",
   "wbsCode",
   "wbsName",
   "wbsObjectId"
}) @SuppressWarnings("all") public class ProjectEstimateType
{

   @XmlElementRef(name = "AdjustedUnits", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Double> adjustedUnits;
   @XmlElementRef(name = "AdjustmentFactor", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> adjustmentFactor;
   @XmlElement(name = "Applied") protected Boolean applied;
   @XmlElementRef(name = "AverageProductivity", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Double> averageProductivity;
   @XmlElementRef(name = "CreateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Date> createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElementRef(name = "Date", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Date> date;
   @XmlElementRef(name = "FunctionPointCount", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> functionPointCount;
   @XmlElement(name = "IsBaseline") protected Boolean isBaseline;
   @XmlElementRef(name = "LastUpdateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Date> lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElement(name = "Method") protected String method;
   @XmlElement(name = "Name") protected String name;
   @XmlElement(name = "Notes") protected String notes;
   @XmlElement(name = "ObjectId") protected Integer objectId;
   @XmlElement(name = "ProjectId") protected String projectId;
   @XmlElement(name = "ProjectObjectId") protected Integer projectObjectId;
   @XmlElement(name = "ResourceId") protected String resourceId;
   @XmlElement(name = "ResourceName") protected String resourceName;
   @XmlElementRef(name = "ResourceObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> resourceObjectId;
   @XmlElement(name = "ResourceType") protected String resourceType;
   @XmlElementRef(name = "TotalActivities", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> totalActivities;
   @XmlElementRef(name = "TotalDegreeOfInfluence", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> totalDegreeOfInfluence;
   @XmlElementRef(name = "UnadjustedFunctionPointCount", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> unadjustedFunctionPointCount;
   @XmlElementRef(name = "Units", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Double> units;
   @XmlElement(name = "WBSCode") protected String wbsCode;
   @XmlElement(name = "WBSName") protected String wbsName;
   @XmlElementRef(name = "WBSObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> wbsObjectId;

   /**
    * Gets the value of the adjustedUnits property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public JAXBElement<Double> getAdjustedUnits()
   {
      return adjustedUnits;
   }

   /**
    * Sets the value of the adjustedUnits property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public void setAdjustedUnits(JAXBElement<Double> value)
   {
      this.adjustedUnits = ((JAXBElement<Double>) value);
   }

   /**
    * Gets the value of the adjustmentFactor property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getAdjustmentFactor()
   {
      return adjustmentFactor;
   }

   /**
    * Sets the value of the adjustmentFactor property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setAdjustmentFactor(JAXBElement<Integer> value)
   {
      this.adjustmentFactor = ((JAXBElement<Integer>) value);
   }

   /**
    * Gets the value of the applied property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isApplied()
   {
      return applied;
   }

   /**
    * Sets the value of the applied property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setApplied(Boolean value)
   {
      this.applied = value;
   }

   /**
    * Gets the value of the averageProductivity property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public JAXBElement<Double> getAverageProductivity()
   {
      return averageProductivity;
   }

   /**
    * Sets the value of the averageProductivity property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public void setAverageProductivity(JAXBElement<Double> value)
   {
      this.averageProductivity = ((JAXBElement<Double>) value);
   }

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
    * Gets the value of the date property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public JAXBElement<Date> getDate()
   {
      return date;
   }

   /**
    * Sets the value of the date property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Date }{@code >}
    *     
    */
   public void setDate(JAXBElement<Date> value)
   {
      this.date = ((JAXBElement<Date>) value);
   }

   /**
    * Gets the value of the functionPointCount property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getFunctionPointCount()
   {
      return functionPointCount;
   }

   /**
    * Sets the value of the functionPointCount property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setFunctionPointCount(JAXBElement<Integer> value)
   {
      this.functionPointCount = ((JAXBElement<Integer>) value);
   }

   /**
    * Gets the value of the isBaseline property.
    * 
    * @return
    *     possible object is
    *     {@link Boolean }
    *     
    */
   public Boolean isIsBaseline()
   {
      return isBaseline;
   }

   /**
    * Sets the value of the isBaseline property.
    * 
    * @param value
    *     allowed object is
    *     {@link Boolean }
    *     
    */
   public void setIsBaseline(Boolean value)
   {
      this.isBaseline = value;
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
    * Gets the value of the method property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getMethod()
   {
      return method;
   }

   /**
    * Sets the value of the method property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setMethod(String value)
   {
      this.method = value;
   }

   /**
    * Gets the value of the name property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getName()
   {
      return name;
   }

   /**
    * Sets the value of the name property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setName(String value)
   {
      this.name = value;
   }

   /**
    * Gets the value of the notes property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getNotes()
   {
      return notes;
   }

   /**
    * Sets the value of the notes property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setNotes(String value)
   {
      this.notes = value;
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
    * Gets the value of the projectId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getProjectId()
   {
      return projectId;
   }

   /**
    * Sets the value of the projectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setProjectId(String value)
   {
      this.projectId = value;
   }

   /**
    * Gets the value of the projectObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link Integer }
    *     
    */
   public Integer getProjectObjectId()
   {
      return projectObjectId;
   }

   /**
    * Sets the value of the projectObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link Integer }
    *     
    */
   public void setProjectObjectId(Integer value)
   {
      this.projectObjectId = value;
   }

   /**
    * Gets the value of the resourceId property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getResourceId()
   {
      return resourceId;
   }

   /**
    * Sets the value of the resourceId property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setResourceId(String value)
   {
      this.resourceId = value;
   }

   /**
    * Gets the value of the resourceName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getResourceName()
   {
      return resourceName;
   }

   /**
    * Sets the value of the resourceName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setResourceName(String value)
   {
      this.resourceName = value;
   }

   /**
    * Gets the value of the resourceObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getResourceObjectId()
   {
      return resourceObjectId;
   }

   /**
    * Sets the value of the resourceObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setResourceObjectId(JAXBElement<Integer> value)
   {
      this.resourceObjectId = ((JAXBElement<Integer>) value);
   }

   /**
    * Gets the value of the resourceType property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getResourceType()
   {
      return resourceType;
   }

   /**
    * Sets the value of the resourceType property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setResourceType(String value)
   {
      this.resourceType = value;
   }

   /**
    * Gets the value of the totalActivities property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getTotalActivities()
   {
      return totalActivities;
   }

   /**
    * Sets the value of the totalActivities property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setTotalActivities(JAXBElement<Integer> value)
   {
      this.totalActivities = ((JAXBElement<Integer>) value);
   }

   /**
    * Gets the value of the totalDegreeOfInfluence property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getTotalDegreeOfInfluence()
   {
      return totalDegreeOfInfluence;
   }

   /**
    * Sets the value of the totalDegreeOfInfluence property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setTotalDegreeOfInfluence(JAXBElement<Integer> value)
   {
      this.totalDegreeOfInfluence = ((JAXBElement<Integer>) value);
   }

   /**
    * Gets the value of the unadjustedFunctionPointCount property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getUnadjustedFunctionPointCount()
   {
      return unadjustedFunctionPointCount;
   }

   /**
    * Sets the value of the unadjustedFunctionPointCount property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setUnadjustedFunctionPointCount(JAXBElement<Integer> value)
   {
      this.unadjustedFunctionPointCount = ((JAXBElement<Integer>) value);
   }

   /**
    * Gets the value of the units property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public JAXBElement<Double> getUnits()
   {
      return units;
   }

   /**
    * Sets the value of the units property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public void setUnits(JAXBElement<Double> value)
   {
      this.units = ((JAXBElement<Double>) value);
   }

   /**
    * Gets the value of the wbsCode property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getWBSCode()
   {
      return wbsCode;
   }

   /**
    * Sets the value of the wbsCode property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setWBSCode(String value)
   {
      this.wbsCode = value;
   }

   /**
    * Gets the value of the wbsName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getWBSName()
   {
      return wbsName;
   }

   /**
    * Sets the value of the wbsName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setWBSName(String value)
   {
      this.wbsName = value;
   }

   /**
    * Gets the value of the wbsObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getWBSObjectId()
   {
      return wbsObjectId;
   }

   /**
    * Sets the value of the wbsObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setWBSObjectId(JAXBElement<Integer> value)
   {
      this.wbsObjectId = ((JAXBElement<Integer>) value);
   }

}
