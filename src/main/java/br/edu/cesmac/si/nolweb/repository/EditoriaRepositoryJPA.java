package br.edu.cesmac.si.nolweb.repository;

import java.io.Serializable;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;

import br.edu.cesmac.si.nolweb.domain.Editoria;

public class EditoriaRepositoryJPA  implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EntityManager manager;

	public EditoriaRepositoryJPA() {}

	public EditoriaRepositoryJPA(EntityManager manager) {
		this.manager = manager;
	}
	
	public List<Editoria> listarTodos() {
		CriteriaQuery<Editoria> query = manager.getCriteriaBuilder().createQuery(Editoria.class);
		query.select(query.from(Editoria.class));

		List<Editoria> lista = manager.createQuery(query).getResultList();

		return lista;		
	}
	
}
