package com.devmedia.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.devmedia.mvc.entity.Livro;
import com.devmedia.mvc.repository.LivroRepository;

import java.util.List;

@Controller
public class LivroController {

	 private LivroRepository livroRepository;

	  @Autowired
	  public LivroController(LivroRepository livroRepository) {
	        this.livroRepository = livroRepository;
	  }

	  @GetMapping("/{autor}")
	  public String listaLivros(@PathVariable("autor") String autor, Model model) {
	        List<Livro> listaLivros = livroRepository.findByAutor(autor);
	        if (listaLivros != null) {
	              model.addAttribute("livros", listaLivros);
	        }
	        return "listaLivros";
	  }

	  @PostMapping("/{autor}")
	  public String adicionaLivroAutor(@PathVariable("autor") String autor, Livro livro) {
	        livro.setAutor(autor);
	        livroRepository.save(livro);
	        return "redirect:/{autor}";
	  }
}