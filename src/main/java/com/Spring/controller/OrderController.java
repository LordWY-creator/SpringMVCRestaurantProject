package com.Spring.controller;

import com.Spring.repository.OrderRepository;

@Controller
@RequestMapping("/order")
public class OrderController {
	@Autowired
	private OrderRepository orderrepo;

}
