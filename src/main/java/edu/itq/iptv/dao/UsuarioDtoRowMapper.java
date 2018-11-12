package edu.itq.iptv.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import edu.itq.iptv.dto.UsuariosDto;

public class UsuarioDtoRowMapper implements RowMapper {

    @Override
    public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
        UsuariosDto usuario = new UsuariosDto();
        usuario.setNumero_tarjeta(rs.getString("numero_tarjeta"));
        usuario.setNombre(rs.getString("nombre"));
        usuario.setApellidoPaterno(rs.getString("apellido_paterno"));
        return usuario;
    }

}
