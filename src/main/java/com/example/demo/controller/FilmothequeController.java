package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.bean.Film;
import com.exemple.demo.metier.FilmService;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
public class FilmothequeController {
	
	//servicce film
	private FilmService filmService;
	
	private Film film1;
	private Film film2;
	private Film film3;
	private List<Film> listFilm;
	
	@Autowired
	public FilmothequeController(FilmService filmService) {
			this.filmService = filmService;
	}
	
	
	//ancien constructeur
	public FilmothequeController() {
		film1 = new Film(1, "La menace fantôme", "1999", 136, "Avant de devenir un célèbre chevalier Jedi, et bien avant de se révéler l’âme la plus noire de la galaxie, Anakin Skywalker est un jeune esclave sur la planète Tatooine. La Force est déjà puissante en lui et il est un remarquable pilote de Podracer. Le maître Jedi Qui-Gon Jinn le découvre et entrevoit alors son immense potentiel.\r\n"
				+ "Pendant ce temps, l’armée de droïdes de l’insatiable Fédération du Commerce a envahi Naboo, une planète pacifique, dans le cadre d’un plan secret des Sith visant à accroître leur pouvoir. Pour défendre la reine de Naboo, Amidala, les chevaliers Jedi vont devoir affronter le redoutable Seigneur Sith, Dark Maul.");
		film2 = new Film(2, "L'attaque des clones", "2002", 142, "Depuis le blocus de la planète Naboo par la Fédération du commerce, la République, gouvernée par le Chancelier Palpatine, connaît une véritable crise. Un groupe de dissidents, mené par le sombre Jedi comte Dooku, manifeste son mécontentement envers le fonctionnement du régime. Le Sénat et la population intergalactique se montrent pour leur part inquiets face à l'émergence d'une telle menace.\r\n"
				+ "Certains sénateurs demandent à ce que la République soit dotée d'une solide armée pour empêcher que la situation ne se détériore davantage. Parallèlement, Padmé Amidala, devenue sénatrice, est menacée par les séparatistes et échappe de justesse à un attentat. Le Padawan Anakin Skywalker est chargé de sa protection. Son maître, Obi-Wan Kenobi, part enquêter sur cette tentative de meurtre et découvre la constitution d'une mystérieuse armée de clones...");
		film3 = new Film(3, "La revanche des sith", "2005", 140, "La Guerre des Clones fait rage. Une franche hostilité oppose désormais le Chancelier Palpatine au Conseil Jedi. Anakin Skywalker, jeune Chevalier Jedi pris entre deux feux, hésite sur la conduite à tenir. Séduit par la promesse d'un pouvoir sans précédent, tenté par le côté obscur de la Force, il prête allégeance au maléfique Darth Sidious et devient Dark Vador.\r\n"
				+ "Les Seigneurs Sith s'unissent alors pour préparer leur revanche, qui commence par l'extermination des Jedi. Seuls rescapés du massacre, Yoda et Obi Wan se lancent à la poursuite des Sith. La traque se conclut par un spectaculaire combat au sabre entre Anakin et Obi Wan, qui décidera du sort de la galaxie.");
		
		listFilm = new ArrayList<>();
		listFilm.add(film1);
		listFilm.add(film2);
		listFilm.add(film3);
	}
	
	@RequestMapping(value ="/accueil")
	public String accueil() {
		String vue = "accueil";
		
		return vue;
	}
	
	@RequestMapping(value = "/liste")
	public String liste(Model model) {	
		
		model.addAttribute("listFilm", this.listFilm);
		
		String vue = "liste";
		
		return vue;
	}
	
	@RequestMapping(value = "/detail/{id}")
	public String detail(@PathVariable int id, Model model) {
		
		for(Film f : listFilm) {
			if(f.getId() == id) {
				model.addAttribute("film", f);
			}
		}
		
		String vue = "detail";
		
		return vue;
	}
	
	@GetMapping(value = "/ajouter")
	public String ajouter(Model model) {
		model.addAttribute("film", new Film());
		
		String vue = "ajouter";
		
		return vue;
	}
	
	@PostMapping(value = "/ajouter")
	public String ajouter(@ModelAttribute Film film, Model model) {
		
		film.setId(listFilm.size() + 1);
		listFilm.add(film);
		
		model.addAttribute("film", film);
		
		String vue = "accueil";
		
		return vue;
	}
}
