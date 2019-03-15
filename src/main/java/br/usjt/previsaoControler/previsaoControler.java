package br.usjt.previsaoControler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import previsao.model.previsao;
import previsao.repository.previsaoRepository;

@Controller
public class previsaoControler {
	
	@Autowired
	private previsaoRepository respoRepository;
	
	@GetMapping("/previsao")
	public ModelAndView listarPrevisoes() {
		ModelAndView mv = new ModelAndView("lista_tempo");
		List<previsao> previsoes = respoRepository.findAll();
		mv.addObject("previsoes", previsoes);
		mv.addObject("previsao", new previsao());
		return mv;
	}
	
	@PostMapping("/previsao")
	public String adicionarPrevisao(previsao previsao) {
		respoRepository.save(previsao);
		return "redirect:/previsao";
	}
}