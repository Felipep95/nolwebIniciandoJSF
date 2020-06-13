package br.edu.cesmac.si.nolweb.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.cesmac.si.nolweb.domain.Noticia;
import br.edu.cesmac.si.nolweb.repository.NoticiaRepositoryJPA;

@Named
@ViewScoped
public class NoticiaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private NoticiaRepositoryJPA noticiaRepositoryJPA;

	public List<Noticia> getNoticias() {
		return this.noticiaRepositoryJPA.listarTodos();
	}

}
