package edu.itq.iptv.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import edu.itq.iptv.dto.UsuariosDto;

public class UsuariosDao {
    
    protected JdbcTemplate jdbcTemplate;

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
    
    public String msgPrueba() {
        return "Funciona el mensaje de prueba...";
    }
    
/*    public void add(UsuariosDto usuarioDto) {
        jdbcTemplate.execute("INSERT INTO usuario(login, password) VALUES('"
                + usuarioDto.getNumero_tarjeta() + "', '" + usuarioDto.getPassword()
                + "')");
    }*/
    
    public UsuariosDto findById(String numeroTarjeta) {
        String sql = "SELECT * FROM Usuarios WHERE numero_tarjeta = ?";

        UsuariosDto usuario = (UsuariosDto) jdbcTemplate.queryForObject(sql,
                new Object[] { numeroTarjeta }, new UsuarioDtoRowMapper());

        return usuario;
    }
    
}
