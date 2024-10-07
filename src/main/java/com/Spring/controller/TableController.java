package com.Spring.controller;

import com.Spring.repository.TableRepository;

@Controller
@RequestMapping("/reserve")
public class TableController {
	@Autowired
	private TableRepository tablerepo;
}
