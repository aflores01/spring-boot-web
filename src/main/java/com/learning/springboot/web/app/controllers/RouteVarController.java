package com.learning.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vars")
public class RouteVarController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("titulo","Enviar parametros de la ruta (@PathVariable)");
		return "vars/index";
	}
	
	@GetMapping("/string/{text}")
	public String vars(@PathVariable String text, Model model) {
		model.addAttribute("titulo","Recibir parametros de la ruta (@PathVariable)");
		model.addAttribute("resultado","El texto enviado en la ruta es: " + text);
		return "vars/ver";
	}
	
	@GetMapping("/string/{text}/{numero}")
	public String vars(@PathVariable String text,@PathVariable int numero, Model model) {
		model.addAttribute("titulo","Recibir parametros de la ruta (@PathVariable)");
		model.addAttribute("resultado","El texto enviado en la ruta es: " + text
				+ " Y el número es: " + numero);
		return "vars/ver";
	}
}
