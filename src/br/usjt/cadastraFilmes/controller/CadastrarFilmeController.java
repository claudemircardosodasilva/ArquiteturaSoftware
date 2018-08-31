package br.usjt.cadastraFilmes.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.usjt.cadastraFilmes.beans.Filme;

import java.util.Random;

@Controller
public class CadastrarFilmeController {
	
	@RequestMapping("/cadastrar")
	
	public String execute() {
		Random random = new Random();
		int id = new Random().nextInt();
		
	return "cadastrarFilme";		
	}
}
