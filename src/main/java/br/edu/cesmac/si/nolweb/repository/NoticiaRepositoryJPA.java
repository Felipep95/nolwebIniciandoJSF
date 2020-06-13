package br.edu.cesmac.si.nolweb.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import br.edu.cesmac.si.nolweb.domain.Noticia;

public class NoticiaRepositoryJPA  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	public NoticiaRepositoryJPA() {}

	public NoticiaRepositoryJPA(EntityManager manager) {
		this.manager = manager;
	}
	
	public List<Noticia> listarTodos() {
		CriteriaQuery<Noticia> query = manager.getCriteriaBuilder().createQuery(Noticia.class);
		query.select(query.from(Noticia.class));

		List<Noticia> lista = manager.createQuery(query).getResultList();

		return lista;		
	}
	
}
