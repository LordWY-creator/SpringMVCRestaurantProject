package com.Spring.controller;

import com.Spring.repository.FDDRepository;

@Controller
@RequestMapping("/FDD")
public class FDDController {
	@Autowired
	private FDDRepository fddrepo;
}
