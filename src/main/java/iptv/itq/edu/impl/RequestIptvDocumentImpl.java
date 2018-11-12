/*
 * An XML document type.
 * Localname: requestIptv
 * Namespace: edu.itq.iptv
 * Java type: iptv.itq.edu.RequestIptvDocument
 *
 * Automatically generated - do not modify.
 */
package iptv.itq.edu.impl;
/**
 * A document containing one requestIptv(@edu.itq.iptv) element.
 *
 * This is a complex type.
 */
public class RequestIptvDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements iptv.itq.edu.RequestIptvDocument
{
    private static final long serialVersionUID = 1L;
    
    public RequestIptvDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName REQUESTIPTV$0 = 
        new javax.xml.namespace.QName("edu.itq.iptv", "requestIptv");
    
    
    /**
     * Gets the "requestIptv" element
     */
    public iptv.itq.edu.RequestIptvDocument.RequestIptv getRequestIptv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            iptv.itq.edu.RequestIptvDocument.RequestIptv target = null;
            target = (iptv.itq.edu.RequestIptvDocument.RequestIptv)get_store().find_element_user(REQUESTIPTV$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "requestIptv" element
     */
    public void setRequestIptv(iptv.itq.edu.RequestIptvDocument.RequestIptv requestIptv)
    {
        generatedSetterHelperImpl(requestIptv, REQUESTIPTV$0, 0, org.apache.xmlbeans.impl.values.XmlObjectBase.KIND_SETTERHELPER_SINGLETON);
    }
    
    /**
     * Appends and returns a new empty "requestIptv" element
     */
    public iptv.itq.edu.RequestIptvDocument.RequestIptv addNewRequestIptv()
    {
        synchronized (monitor())
        {
            check_orphaned();
            iptv.itq.edu.RequestIptvDocument.RequestIptv target = null;
            target = (iptv.itq.edu.RequestIptvDocument.RequestIptv)get_store().add_element_user(REQUESTIPTV$0);
            return target;
        }
    }
    /**
     * An XML requestIptv(@edu.itq.iptv).
     *
     * This is a complex type.
     */
    public static class RequestIptvImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements iptv.itq.edu.RequestIptvDocument.RequestIptv
    {
        private static final long serialVersionUID = 1L;
        
        public RequestIptvImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName NUMEROTARJETA$0 = 
            new javax.xml.namespace.QName("edu.itq.iptv", "numeroTarjeta");
        private static final javax.xml.namespace.QName MONTO$2 = 
            new javax.xml.namespace.QName("edu.itq.iptv", "monto");
        
        
        /**
         * Gets the "numeroTarjeta" element
         */
        public java.lang.String getNumeroTarjeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROTARJETA$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "numeroTarjeta" element
         */
        public org.apache.xmlbeans.XmlString xgetNumeroTarjeta()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMEROTARJETA$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "numeroTarjeta" element
         */
        public void setNumeroTarjeta(java.lang.String numeroTarjeta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROTARJETA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROTARJETA$0);
                }
                target.setStringValue(numeroTarjeta);
            }
        }
        
        /**
         * Sets (as xml) the "numeroTarjeta" element
         */
        public void xsetNumeroTarjeta(org.apache.xmlbeans.XmlString numeroTarjeta)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NUMEROTARJETA$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NUMEROTARJETA$0);
                }
                target.set(numeroTarjeta);
            }
        }
        
        /**
         * Gets the "monto" element
         */
        public double getMonto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$2, 0);
                if (target == null)
                {
                    return 0.0;
                }
                return target.getDoubleValue();
            }
        }
        
        /**
         * Gets (as xml) the "monto" element
         */
        public org.apache.xmlbeans.XmlDouble xgetMonto()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTO$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "monto" element
         */
        public void setMonto(double monto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(MONTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(MONTO$2);
                }
                target.setDoubleValue(monto);
            }
        }
        
        /**
         * Sets (as xml) the "monto" element
         */
        public void xsetMonto(org.apache.xmlbeans.XmlDouble monto)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlDouble target = null;
                target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(MONTO$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(MONTO$2);
                }
                target.set(monto);
            }
        }
    }
}
