package com.Spring.controller;

import com.Spring.repository.TableRepository;

@Controller
@RequestMapping("/booking")
public class BookingController {
	@Autowired
	private TableRepository tablerepo;
}
