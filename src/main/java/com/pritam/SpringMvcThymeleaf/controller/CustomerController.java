package com.pritam.SpringMvcThymeleaf.controller;


import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.pritam.SpringMvcThymeleaf.model.Address;
import com.pritam.SpringMvcThymeleaf.model.Customer;


@Controller
public class CustomerController {
	
	List<Customer> lstCustomers = new ArrayList<Customer>();
	
	@PostConstruct
    public void init() throws Exception {
		lstCustomers.add(new Customer(new Long(1), "Jack", 25, new Address("NANTERRE CT", "77471")));
		lstCustomers.add(new Customer(new Long(2), "Mary", 37, new Address("W NORMA ST", "77009")));
		lstCustomers.add(new Customer(new Long(3), "Peter", 18, new Address("S NUGENT AVE", "77571")));
		lstCustomers.add(new Customer(new Long(4), "Amos", 23, new Address("E NAVAHO TRL", "77449")));
		lstCustomers.add(new Customer(new Long(5), "Craig", 45, new Address("AVE N", "77587")));
		lstCustomers.add(new Customer(new Long(6), "Aries", 19, new Address("Broadway/Reade St, New York", "10007")));
		lstCustomers.add(new Customer(new Long(7), "Brice", 39, new Address("Columbus, OH 43215, USA", "43215")));
		lstCustomers.add(new Customer(new Long(8), "Cage", 24, new Address("Plano, TX 75074", "75074")));
		lstCustomers.add(new Customer(new Long(9), "Ellen", 41, new Address("Modesto, CA 95354", "95354")));
		lstCustomers.add(new Customer(new Long(10), "Brice", 32, new Address("Atlanta, GA 30334", "30334")));
    }

	@GetMapping
	public String index() {
		return "redirect:/employee";
	}
	
	@GetMapping("/customer")
    public String getCustomer(Model model) {
        model.addAttribute("customers", lstCustomers);
        return "customer/customer.table.html";
    }
}

