package com.learning.springboot.web.app.controllers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.learning.springboot.web.app.models.Usuario;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index","/home","/",""})
	public String index(Model model) {
		model.addAttribute("titulo","Hi Spring Framework");
		return "index";
	}
	
	@RequestMapping("/perfil")
	public String perfil(Model model) {
		Usuario usuario = new Usuario();
		
		usuario.setNombre("Andres");
		usuario.setApellido("Zamora");
		usuario.setEmail("andres@mail.com");
		model.addAttribute("usuario", usuario);
		
		model.addAttribute("titulo","Perfil del usuario: ".concat(usuario.getNombre()));
		
		return "perfil";
	}
	
	@RequestMapping("/listar")
	public String listar(Model model) {
		model.addAttribute("titulo","Listado de usuarios");
		
		return "listar";
	}
	
	@ModelAttribute("usuarios")
	public List<Usuario> poblarUsuarios(){
		List<Usuario> usuarios = Arrays.asList(new Usuario("Andres","Zamora","andresz@mail.com"),
				new Usuario("Andres","Zamora","andresz@mail.com"),
				new Usuario("Pablo","Ramirez","pablor@mail.com"),
				new Usuario("Erika","Zuñiga","erikaz@mail.com"));
		return usuarios;
	}

}
