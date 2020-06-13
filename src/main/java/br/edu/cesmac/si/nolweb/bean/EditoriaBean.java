package br.edu.cesmac.si.nolweb.bean;

import java.io.Serializable;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import br.edu.cesmac.si.nolweb.domain.Editoria;
import br.edu.cesmac.si.nolweb.repository.EditoriaRepositoryJPA;

@Named
@ViewScoped
public class EditoriaBean implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private EditoriaRepositoryJPA editoriaRepositoryJPA;

	public List<Editoria> getEditorias() {
		return this.editoriaRepositoryJPA.listarTodos();
	}

}
