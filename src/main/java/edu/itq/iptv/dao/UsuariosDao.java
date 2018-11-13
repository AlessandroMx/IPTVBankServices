package edu.itq.iptv.dao;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import edu.itq.iptv.dto.UsuariosDto;

public class UsuariosDao {

    protected JdbcTemplate jdbcTemplate;

    public void add(UsuariosDto usuarioDto) {
        jdbcTemplate.execute(
                "INSERT INTO Usuarios(numero_tarjeta, nombre, apellido_paterno, apellido_materno, monto, cvv, fecha) VALUES('"
                        + usuarioDto.getNumeroTarjeta() + "', '"
                        + usuarioDto.getNombre() + "', '"
                        + usuarioDto.getApellidoPaterno() + "', '"
                        + usuarioDto.getApellidoMaterno() + "', "
                        + usuarioDto.getMonto() + ", '" + usuarioDto.getCvv()
                        + "', '" + usuarioDto.getFecha() + "')");
    }

    public void updateBalance(UsuariosDto usuarioDto) {
        jdbcTemplate.execute("UPDATE Usuarios SET monto = "
                + usuarioDto.getMonto() + " WHERE numero_tarjeta = '"
                + usuarioDto.getNumeroTarjeta() + "'");
    }

    public List<UsuariosDto> buscarUsuario(String numeroTarjeta) {
        List<UsuariosDto> resultList = null;
        List<Map<String, Object>> list = jdbcTemplate
                .queryForList("SELECT * FROM Usuarios WHERE numero_tarjeta ='"
                        + numeroTarjeta + "'");
        if (list != null && !list.isEmpty()) {
            resultList = new ArrayList<UsuariosDto>();
            for (Map<String, Object> userMap : list) {
                UsuariosDto dto = new UsuariosDto();
                dto.setNumeroTarjeta((String) userMap.get("numero_tarjeta"));
                dto.setNombre((String) userMap.get("nombre"));
                dto.setApellidoPaterno(
                        (String) userMap.get("apellido_paterno"));
                dto.setApellidoMaterno(
                        (String) userMap.get("apellido_materno"));
                dto.setMonto((BigDecimal) userMap.get("monto"));
                dto.setCvv((String) userMap.get("cvv"));
                dto.setFecha((String) userMap.get("fecha"));
                resultList.add(dto);
            }
        }
        return resultList;
    }

    /**
     * @param jdbcTemplate the jdbcTemplate to set
     */
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

}
