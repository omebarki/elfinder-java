
package br.com.trustsystems.elfinder.configuration.jaxb;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour anonymous complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="thumbnail"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="width"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
 *                         &lt;minInclusive value="80"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="volume" maxOccurs="unbounded"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;all&gt;
 *                   &lt;element name="source"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="filesystem"/&gt;
 *                         &lt;enumeration value="dropbox"/&gt;
 *                         &lt;enumeration value="googledrive"/&gt;
 *                         &lt;enumeration value="onedrive"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *                   &lt;element name="locale"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;enumeration value="pt_BR"/&gt;
 *                         &lt;enumeration value="en_US"/&gt;
 *                         &lt;enumeration value="fr_FR"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="constraint"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;all&gt;
 *                             &lt;element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="readable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                             &lt;element name="writable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *                           &lt;/all&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/all&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "thumbnail",
    "volume"
})
@XmlRootElement(name = "elfinder-configuration")
public class ElfinderConfiguration {

    @XmlElement(required = true)
    protected ElfinderConfiguration.Thumbnail thumbnail;
    @XmlElement(required = true)
    protected List<ElfinderConfiguration.Volume> volume;

    /**
     * Obtient la valeur de la propriété thumbnail.
     * 
     * @return
     *     possible object is
     *     {@link ElfinderConfiguration.Thumbnail }
     *     
     */
    public ElfinderConfiguration.Thumbnail getThumbnail() {
        return thumbnail;
    }

    /**
     * Définit la valeur de la propriété thumbnail.
     * 
     * @param value
     *     allowed object is
     *     {@link ElfinderConfiguration.Thumbnail }
     *     
     */
    public void setThumbnail(ElfinderConfiguration.Thumbnail value) {
        this.thumbnail = value;
    }

    /**
     * Gets the value of the volume property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the volume property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVolume().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ElfinderConfiguration.Volume }
     * 
     * 
     */
    public List<ElfinderConfiguration.Volume> getVolume() {
        if (volume == null) {
            volume = new ArrayList<ElfinderConfiguration.Volume>();
        }
        return this.volume;
    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="width"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer"&gt;
     *               &lt;minInclusive value="80"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Thumbnail {

        @XmlElement(required = true)
        protected BigInteger width;

        /**
         * Obtient la valeur de la propriété width.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getWidth() {
            return width;
        }

        /**
         * Définit la valeur de la propriété width.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setWidth(BigInteger value) {
            this.width = value;
        }

    }


    /**
     * <p>Classe Java pour anonymous complex type.
     * 
     * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;all&gt;
     *         &lt;element name="source"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="filesystem"/&gt;
     *               &lt;enumeration value="dropbox"/&gt;
     *               &lt;enumeration value="googledrive"/&gt;
     *               &lt;enumeration value="onedrive"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="alias" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="path" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="default" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
     *         &lt;element name="locale"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;enumeration value="pt_BR"/&gt;
     *               &lt;enumeration value="en_US"/&gt;
     *               &lt;enumeration value="fr_FR"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="constraint"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;all&gt;
     *                   &lt;element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="readable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                   &lt;element name="writable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
     *                 &lt;/all&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *       &lt;/all&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class Volume {

        @XmlElement(required = true)
        protected String source;
        @XmlElement(required = true)
        protected String alias;
        @XmlElement(required = true)
        protected String path;
        @XmlElement(name = "default")
        protected Boolean _default;
        @XmlElement(required = true)
        protected String locale;
        @XmlElement(required = true)
        protected ElfinderConfiguration.Volume.Constraint constraint;

        /**
         * Obtient la valeur de la propriété source.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * Définit la valeur de la propriété source.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

        /**
         * Obtient la valeur de la propriété alias.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAlias() {
            return alias;
        }

        /**
         * Définit la valeur de la propriété alias.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAlias(String value) {
            this.alias = value;
        }

        /**
         * Obtient la valeur de la propriété path.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPath() {
            return path;
        }

        /**
         * Définit la valeur de la propriété path.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPath(String value) {
            this.path = value;
        }

        /**
         * Obtient la valeur de la propriété default.
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDefault() {
            return _default;
        }

        /**
         * Définit la valeur de la propriété default.
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefault(Boolean value) {
            this._default = value;
        }

        /**
         * Obtient la valeur de la propriété locale.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocale() {
            return locale;
        }

        /**
         * Définit la valeur de la propriété locale.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocale(String value) {
            this.locale = value;
        }

        /**
         * Obtient la valeur de la propriété constraint.
         * 
         * @return
         *     possible object is
         *     {@link ElfinderConfiguration.Volume.Constraint }
         *     
         */
        public ElfinderConfiguration.Volume.Constraint getConstraint() {
            return constraint;
        }

        /**
         * Définit la valeur de la propriété constraint.
         * 
         * @param value
         *     allowed object is
         *     {@link ElfinderConfiguration.Volume.Constraint }
         *     
         */
        public void setConstraint(ElfinderConfiguration.Volume.Constraint value) {
            this.constraint = value;
        }


        /**
         * <p>Classe Java pour anonymous complex type.
         * 
         * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
         * 
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;all&gt;
         *         &lt;element name="locked" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="readable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *         &lt;element name="writable" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
         *       &lt;/all&gt;
         *     &lt;/restriction&gt;
         *   &lt;/complexContent&gt;
         * &lt;/complexType&gt;
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Constraint {

            protected boolean locked;
            protected boolean readable;
            protected boolean writable;

            /**
             * Obtient la valeur de la propriété locked.
             * 
             */
            public boolean isLocked() {
                return locked;
            }

            /**
             * Définit la valeur de la propriété locked.
             * 
             */
            public void setLocked(boolean value) {
                this.locked = value;
            }

            /**
             * Obtient la valeur de la propriété readable.
             * 
             */
            public boolean isReadable() {
                return readable;
            }

            /**
             * Définit la valeur de la propriété readable.
             * 
             */
            public void setReadable(boolean value) {
                this.readable = value;
            }

            /**
             * Obtient la valeur de la propriété writable.
             * 
             */
            public boolean isWritable() {
                return writable;
            }

            /**
             * Définit la valeur de la propriété writable.
             * 
             */
            public void setWritable(boolean value) {
                this.writable = value;
            }

        }

    }

}
