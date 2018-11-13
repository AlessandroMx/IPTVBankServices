/**
 * IptvServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package edu.itq.iptv;

import java.math.BigDecimal;

import edu.itq.iptv.business.BusinessLogic;
import edu.itq.iptv.dao.UsuariosDao;
import edu.itq.iptv.dto.UsuariosDto;
import iptv.itq.edu.RequestIptvDocument;
import iptv.itq.edu.ResponseIptvDocument;
import iptv.itq.edu.ResponseIptvDocument.ResponseIptv;

/**
 * IptvServiceSkeleton java skeleton for the axisService
 */
public class IptvServiceImpl extends IptvServiceSkeleton {

    private BusinessLogic businessLogic;

    public ResponseIptvDocument iptvOperation(RequestIptvDocument requestIptv) {
        ResponseIptvDocument doc = ResponseIptvDocument.Factory.newInstance();
        ResponseIptv resp = doc.addNewResponseIptv();

        // Obtain parameters from request...
        String numeroTarjeta = requestIptv.getRequestIptv().getNumeroTarjeta();
        BigDecimal monto = new BigDecimal(
                requestIptv.getRequestIptv().getMonto());

        // Call business logic...
        String response = businessLogic.chargeService(numeroTarjeta, monto);

        resp.setRespuesta(response);
        return doc;
    }

    /**
     * @param businessLogic the businessLogic to set
     */
    public void setBusinessLogic(BusinessLogic businessLogic) {
        this.businessLogic = businessLogic;
    }

}
