/**
 * IptvServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.8  Built on : May 19, 2018 (07:06:11 BST)
 */
package edu.itq.iptv;

import edu.itq.iptv.dao.UsuariosDao;
import edu.itq.iptv.dto.UsuariosDto;
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
    
    private UsuariosDao usuarioDao;
    
    public ResponseIptvDocument iptvOperation(RequestIptvDocument requestIptv) {
        ResponseIptvDocument doc = ResponseIptvDocument.Factory.newInstance();
        ResponseIptv resp =  doc.addNewResponseIptv();
        
        //UsuariosDto usuarioDto = usuarioDao.findById("9999000099990000");
        //String resp2 = usuarioDao.msgPrueba();
        
        UsuariosDao userDao = new UsuariosDao();
        String resp2 = userDao.msgPrueba();
        UsuariosDto userDto = userDao.findById("9999000099990000");
        
        resp.setRespuesta(userDto.getNombre());
        return doc;
    }

    /**
     * @param usuarioDao the usuarioDao to set
     */
    public void setUsuarioDao(UsuariosDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }
}
