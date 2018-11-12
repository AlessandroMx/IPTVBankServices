/**
 * IptvServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package edu.itq.iptv;

import iptv.itq.edu.RequestIptvDocument;
import iptv.itq.edu.ResponseIptvDocument;
import iptv.itq.edu.ResponseIptvDocument.ResponseIptv;

/**
 * IptvServiceSkeleton java skeleton for the axisService
 */
public class IptvServiceImpl extends IptvServiceSkeleton {
    /**
     * Auto generated method signature
     *
     * @param requestIptv
     * @return responseIptv
     */
    public ResponseIptvDocument iptvOperation(RequestIptvDocument requestIptv) {
        ResponseIptvDocument doc = ResponseIptvDocument.Factory.newInstance();
        ResponseIptv resp =  doc.addNewResponseIptv();
        //resp.setRespuesta("Se obtuvo request!");
        return doc;
    }
}
