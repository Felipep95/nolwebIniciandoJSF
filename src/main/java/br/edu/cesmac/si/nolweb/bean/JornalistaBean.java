package br.edu.cesmac.si.nolweb.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.cesmac.si.nolweb.domain.Jornalista;
import br.edu.cesmac.si.nolweb.repository.JornalistaRepositoryJPA;

@Named
@ViewScoped
public class JornalistaBean implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private JornalistaRepositoryJPA jornalistaRepositoryJPA;

	public List<Jornalista> getJornalistas() {
		return this.jornalistaRepositoryJPA.listarTodos();
	}
}
