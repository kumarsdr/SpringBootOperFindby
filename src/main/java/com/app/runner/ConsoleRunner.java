package com.app.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.model.Product;
import com.app.repo.ProductRepository;
@SuppressWarnings("unused")
@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;
	
	public void run(String... args) throws Exception {
		
		repo.save(new Product(71,"A",8.1));
		repo.save(new Product(72,"B",8.2));
		repo.save(new Product(73,"C",8.3));
		repo.save(new Product(74,"D",8.4));
		repo.save(new Product(75,"E",8.5));
		repo.save(new Product(76,"F",8.6));
		repo.save(new Product(77,"G",8.7));
		repo.save(new Product(78,"H",8.8));
		repo.save(new Product(79,"I",8.9));
		repo.save(new Product(80,"J",9.0));
		
		//dataJPA Or
		//repo.findByProdCodeOrProdCostLessThan("A",8.5).forEach(System.out::println);
		
		//IsNotNull
		//repo.findByProdCodeIsNotNull().forEach(System.out::println);
		
		//In
		//repo.findByProdCodeIn(Arrays.asList("A","E")).forEach(System.out::println);
		
		//Or
		//repo.findByProdCostOrProdCode(8.6,"F").forEach(System.out::println);
		repo.findByProdCostOrderByProdCodeDesc(8.5).forEach(System.out::println);
		
	}

}
