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
 * <p>Java class for ScheduleOptionsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ScheduleOptionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CalculateFloatBasedOnFinishDate" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="ComputeTotalFloatType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Start Float = Late Start - Early Start"/>
 *               &lt;enumeration value="Finish Float = Late Finish - Early Finish"/>
 *               &lt;enumeration value="Smallest of Start Float and Finish Float"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="CreateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="CreateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CriticalActivityFloatThreshold" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/>
 *         &lt;element name="CriticalActivityPathType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Critical Float"/>
 *               &lt;enumeration value="Longest Path"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="IgnoreOtherProjectRelationships" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="LastUpdateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="LastUpdateUser" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LevelResourcesDuringScheduling" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MakeOpenEndedActivitiesCritical" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MaximumMultipleFloatPaths" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;minInclusive value="0"/>
 *               &lt;maxInclusive value="1000"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="MultipleFloatPathsEnabled" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="MultipleFloatPathsEndingActivityObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="MultipleFloatPathsUseTotalFloat" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="OutOfSequenceScheduleType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value=""/>
 *               &lt;enumeration value="Retained Logic"/>
 *               &lt;enumeration value="Progress Override"/>
 *               &lt;enumeration value="Actual Dates"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProjectId" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ProjectObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *         &lt;element name="RecalculateResourceCosts" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="RelationshipLagCalendar" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Predecessor Activity Calendar"/>
 *               &lt;enumeration value="Successor Activity Calendar"/>
 *               &lt;enumeration value="24 Hour Calendar"/>
 *               &lt;enumeration value="Project Default Calendar"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="StartToStartLagCalculationType" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UseExpectedFinishDates" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UserName" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;maxLength value="32"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="UserObjectId" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD) @XmlType(name = "ScheduleOptionsType", propOrder =
{
   "calculateFloatBasedOnFinishDate",
   "computeTotalFloatType",
   "createDate",
   "createUser",
   "criticalActivityFloatThreshold",
   "criticalActivityPathType",
   "ignoreOtherProjectRelationships",
   "lastUpdateDate",
   "lastUpdateUser",
   "levelResourcesDuringScheduling",
   "makeOpenEndedActivitiesCritical",
   "maximumMultipleFloatPaths",
   "multipleFloatPathsEnabled",
   "multipleFloatPathsEndingActivityObjectId",
   "multipleFloatPathsUseTotalFloat",
   "outOfSequenceScheduleType",
   "projectId",
   "projectObjectId",
   "recalculateResourceCosts",
   "relationshipLagCalendar",
   "startToStartLagCalculationType",
   "useExpectedFinishDates",
   "userName",
   "userObjectId"
}) @SuppressWarnings("all") public class ScheduleOptionsType
{

   @XmlElementRef(name = "CalculateFloatBasedOnFinishDate", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Boolean> calculateFloatBasedOnFinishDate;
   @XmlElement(name = "ComputeTotalFloatType") protected String computeTotalFloatType;
   @XmlElementRef(name = "CreateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Date> createDate;
   @XmlElement(name = "CreateUser") protected String createUser;
   @XmlElementRef(name = "CriticalActivityFloatThreshold", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Double> criticalActivityFloatThreshold;
   @XmlElement(name = "CriticalActivityPathType") protected String criticalActivityPathType;
   @XmlElementRef(name = "IgnoreOtherProjectRelationships", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Boolean> ignoreOtherProjectRelationships;
   @XmlElementRef(name = "LastUpdateDate", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Date> lastUpdateDate;
   @XmlElement(name = "LastUpdateUser") protected String lastUpdateUser;
   @XmlElementRef(name = "LevelResourcesDuringScheduling", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Boolean> levelResourcesDuringScheduling;
   @XmlElementRef(name = "MakeOpenEndedActivitiesCritical", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Boolean> makeOpenEndedActivitiesCritical;
   @XmlElementRef(name = "MaximumMultipleFloatPaths", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> maximumMultipleFloatPaths;
   @XmlElementRef(name = "MultipleFloatPathsEnabled", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Boolean> multipleFloatPathsEnabled;
   @XmlElementRef(name = "MultipleFloatPathsEndingActivityObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> multipleFloatPathsEndingActivityObjectId;
   @XmlElementRef(name = "MultipleFloatPathsUseTotalFloat", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Boolean> multipleFloatPathsUseTotalFloat;
   @XmlElement(name = "OutOfSequenceScheduleType") protected String outOfSequenceScheduleType;
   @XmlElement(name = "ProjectId") protected String projectId;
   @XmlElementRef(name = "ProjectObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> projectObjectId;
   @XmlElementRef(name = "RecalculateResourceCosts", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Boolean> recalculateResourceCosts;
   @XmlElement(name = "RelationshipLagCalendar") protected String relationshipLagCalendar;
   @XmlElementRef(name = "StartToStartLagCalculationType", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Boolean> startToStartLagCalculationType;
   @XmlElementRef(name = "UseExpectedFinishDates", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Boolean> useExpectedFinishDates;
   @XmlElement(name = "UserName") protected String userName;
   @XmlElementRef(name = "UserObjectId", namespace = "http://xmlns.oracle.com/Primavera/P6/V7/API/BusinessObjects", type = JAXBElement.class) protected JAXBElement<Integer> userObjectId;

   /**
    * Gets the value of the calculateFloatBasedOnFinishDate property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public JAXBElement<Boolean> getCalculateFloatBasedOnFinishDate()
   {
      return calculateFloatBasedOnFinishDate;
   }

   /**
    * Sets the value of the calculateFloatBasedOnFinishDate property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public void setCalculateFloatBasedOnFinishDate(JAXBElement<Boolean> value)
   {
      this.calculateFloatBasedOnFinishDate = ((JAXBElement<Boolean>) value);
   }

   /**
    * Gets the value of the computeTotalFloatType property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getComputeTotalFloatType()
   {
      return computeTotalFloatType;
   }

   /**
    * Sets the value of the computeTotalFloatType property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setComputeTotalFloatType(String value)
   {
      this.computeTotalFloatType = value;
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
    * Gets the value of the criticalActivityFloatThreshold property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public JAXBElement<Double> getCriticalActivityFloatThreshold()
   {
      return criticalActivityFloatThreshold;
   }

   /**
    * Sets the value of the criticalActivityFloatThreshold property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Double }{@code >}
    *     
    */
   public void setCriticalActivityFloatThreshold(JAXBElement<Double> value)
   {
      this.criticalActivityFloatThreshold = ((JAXBElement<Double>) value);
   }

   /**
    * Gets the value of the criticalActivityPathType property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getCriticalActivityPathType()
   {
      return criticalActivityPathType;
   }

   /**
    * Sets the value of the criticalActivityPathType property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setCriticalActivityPathType(String value)
   {
      this.criticalActivityPathType = value;
   }

   /**
    * Gets the value of the ignoreOtherProjectRelationships property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public JAXBElement<Boolean> getIgnoreOtherProjectRelationships()
   {
      return ignoreOtherProjectRelationships;
   }

   /**
    * Sets the value of the ignoreOtherProjectRelationships property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public void setIgnoreOtherProjectRelationships(JAXBElement<Boolean> value)
   {
      this.ignoreOtherProjectRelationships = ((JAXBElement<Boolean>) value);
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
    * Gets the value of the levelResourcesDuringScheduling property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public JAXBElement<Boolean> getLevelResourcesDuringScheduling()
   {
      return levelResourcesDuringScheduling;
   }

   /**
    * Sets the value of the levelResourcesDuringScheduling property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public void setLevelResourcesDuringScheduling(JAXBElement<Boolean> value)
   {
      this.levelResourcesDuringScheduling = ((JAXBElement<Boolean>) value);
   }

   /**
    * Gets the value of the makeOpenEndedActivitiesCritical property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public JAXBElement<Boolean> getMakeOpenEndedActivitiesCritical()
   {
      return makeOpenEndedActivitiesCritical;
   }

   /**
    * Sets the value of the makeOpenEndedActivitiesCritical property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public void setMakeOpenEndedActivitiesCritical(JAXBElement<Boolean> value)
   {
      this.makeOpenEndedActivitiesCritical = ((JAXBElement<Boolean>) value);
   }

   /**
    * Gets the value of the maximumMultipleFloatPaths property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getMaximumMultipleFloatPaths()
   {
      return maximumMultipleFloatPaths;
   }

   /**
    * Sets the value of the maximumMultipleFloatPaths property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setMaximumMultipleFloatPaths(JAXBElement<Integer> value)
   {
      this.maximumMultipleFloatPaths = ((JAXBElement<Integer>) value);
   }

   /**
    * Gets the value of the multipleFloatPathsEnabled property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public JAXBElement<Boolean> getMultipleFloatPathsEnabled()
   {
      return multipleFloatPathsEnabled;
   }

   /**
    * Sets the value of the multipleFloatPathsEnabled property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public void setMultipleFloatPathsEnabled(JAXBElement<Boolean> value)
   {
      this.multipleFloatPathsEnabled = ((JAXBElement<Boolean>) value);
   }

   /**
    * Gets the value of the multipleFloatPathsEndingActivityObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getMultipleFloatPathsEndingActivityObjectId()
   {
      return multipleFloatPathsEndingActivityObjectId;
   }

   /**
    * Sets the value of the multipleFloatPathsEndingActivityObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setMultipleFloatPathsEndingActivityObjectId(JAXBElement<Integer> value)
   {
      this.multipleFloatPathsEndingActivityObjectId = ((JAXBElement<Integer>) value);
   }

   /**
    * Gets the value of the multipleFloatPathsUseTotalFloat property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public JAXBElement<Boolean> getMultipleFloatPathsUseTotalFloat()
   {
      return multipleFloatPathsUseTotalFloat;
   }

   /**
    * Sets the value of the multipleFloatPathsUseTotalFloat property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public void setMultipleFloatPathsUseTotalFloat(JAXBElement<Boolean> value)
   {
      this.multipleFloatPathsUseTotalFloat = ((JAXBElement<Boolean>) value);
   }

   /**
    * Gets the value of the outOfSequenceScheduleType property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getOutOfSequenceScheduleType()
   {
      return outOfSequenceScheduleType;
   }

   /**
    * Sets the value of the outOfSequenceScheduleType property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setOutOfSequenceScheduleType(String value)
   {
      this.outOfSequenceScheduleType = value;
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
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getProjectObjectId()
   {
      return projectObjectId;
   }

   /**
    * Sets the value of the projectObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setProjectObjectId(JAXBElement<Integer> value)
   {
      this.projectObjectId = ((JAXBElement<Integer>) value);
   }

   /**
    * Gets the value of the recalculateResourceCosts property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public JAXBElement<Boolean> getRecalculateResourceCosts()
   {
      return recalculateResourceCosts;
   }

   /**
    * Sets the value of the recalculateResourceCosts property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public void setRecalculateResourceCosts(JAXBElement<Boolean> value)
   {
      this.recalculateResourceCosts = ((JAXBElement<Boolean>) value);
   }

   /**
    * Gets the value of the relationshipLagCalendar property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getRelationshipLagCalendar()
   {
      return relationshipLagCalendar;
   }

   /**
    * Sets the value of the relationshipLagCalendar property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setRelationshipLagCalendar(String value)
   {
      this.relationshipLagCalendar = value;
   }

   /**
    * Gets the value of the startToStartLagCalculationType property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public JAXBElement<Boolean> getStartToStartLagCalculationType()
   {
      return startToStartLagCalculationType;
   }

   /**
    * Sets the value of the startToStartLagCalculationType property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public void setStartToStartLagCalculationType(JAXBElement<Boolean> value)
   {
      this.startToStartLagCalculationType = ((JAXBElement<Boolean>) value);
   }

   /**
    * Gets the value of the useExpectedFinishDates property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public JAXBElement<Boolean> getUseExpectedFinishDates()
   {
      return useExpectedFinishDates;
   }

   /**
    * Sets the value of the useExpectedFinishDates property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Boolean }{@code >}
    *     
    */
   public void setUseExpectedFinishDates(JAXBElement<Boolean> value)
   {
      this.useExpectedFinishDates = ((JAXBElement<Boolean>) value);
   }

   /**
    * Gets the value of the userName property.
    * 
    * @return
    *     possible object is
    *     {@link String }
    *     
    */
   public String getUserName()
   {
      return userName;
   }

   /**
    * Sets the value of the userName property.
    * 
    * @param value
    *     allowed object is
    *     {@link String }
    *     
    */
   public void setUserName(String value)
   {
      this.userName = value;
   }

   /**
    * Gets the value of the userObjectId property.
    * 
    * @return
    *     possible object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public JAXBElement<Integer> getUserObjectId()
   {
      return userObjectId;
   }

   /**
    * Sets the value of the userObjectId property.
    * 
    * @param value
    *     allowed object is
    *     {@link JAXBElement }{@code <}{@link Integer }{@code >}
    *     
    */
   public void setUserObjectId(JAXBElement<Integer> value)
   {
      this.userObjectId = ((JAXBElement<Integer>) value);
   }

}
