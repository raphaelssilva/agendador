package biz.r2s.security.DAO;

import org.springframework.stereotype.Repository;

import biz.r2s.security.model.Usuario;
import biz.r2s.util.persistencia.AbstractDAOMongo;

@Repository
public class UsuarioDAO extends AbstractDAOMongo<Usuario> {
	
	public Usuario getUsuarioByLogin(String login) {

		return null;

	}
}
