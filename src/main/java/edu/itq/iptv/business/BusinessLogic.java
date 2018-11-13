package edu.itq.iptv.business;

import java.math.BigDecimal;
import java.util.List;

import edu.itq.iptv.dao.UsuariosDao;
import edu.itq.iptv.dto.UsuariosDto;

public class BusinessLogic {

    private UsuariosDao usuarioDao;

    public String chargeService(String numeroTarjeta, BigDecimal monto) {

        List<UsuariosDto> usuario = usuarioDao.buscarUsuario(numeroTarjeta);

        if (usuario == null) {
            return "Operación inválida, no existe el usuario en el banco.";
        }

        UsuariosDto tmpUsuarioDto = null;
        if (usuario != null & usuario.size() >= 0) {
            tmpUsuarioDto = usuario.get(0);
        }

        if (tmpUsuarioDto != null) {
            if (tmpUsuarioDto.getMonto().compareTo(monto) >= 0) {
                BigDecimal newMonto = tmpUsuarioDto.getMonto().subtract(monto);
                tmpUsuarioDto.setMonto(newMonto);
                usuarioDao.updateBalance(tmpUsuarioDto);
                return "Operación válida. Cobro realizado con éxito.";
            } else {
                return "Operación inválida, no hay suficientes fondos.";
            }
        } else {
            return "Operación inválida, no existe el usuario en el banco.";
        }

    }

    /**
     * @param usuarioDao the usuarioDao to set
     */
    public void setUsuarioDao(UsuariosDao usuarioDao) {
        this.usuarioDao = usuarioDao;
    }

}
