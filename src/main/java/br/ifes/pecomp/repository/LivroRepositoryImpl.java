package br.ifes.pecomp.repository;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.persistence.TypedQuery;

import br.ifes.pecomp.entity.Livro;
import br.ifes.pecomp.entity.Pessoa;



public class LivroRepositoryImpl extends AbstractRepository implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	@Inject
	public LivroRepositoryImpl() {
		super();
	}
	
	public List<Livro> findAll() {
        
		TypedQuery<Livro> query = getSession().createQuery("select obj from TB_LIVRO obj", Livro.class);
		List<Livro> livros = query.getResultList();
		return livros;
	
		/*
		List<Livro> lista = new ArrayList<Livro>();
		
        lista.add( new Livro("livro1.gif", "Computa��o Forense", "http://google.com.br"));
        lista.add( new Livro("livro2.jpg", "Computa��o Quantica", "http://google.com.br"));
        lista.add( new Livro("livro3.jpg", "Teoria da Computa��o", "http://google.com.br"));         
        lista.add( new Livro("livro4.jpg", "Fundamentos de Ci�ncia da Computa��o", "http://google.com.br"));
                 
        return lista;
        */
    }


}
