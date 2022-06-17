package com.rk.runner.app;


import java.io.FileInputStream;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rk.model.Product;
import com.rk.repo.ProductRepository;
@Component
public class DataRunner implements CommandLineRunner{
	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {
		/*
		 * repo.saveAll(Arrays.asList( new Product(101, "pen", 100.0), new Product(102,
		 * "book", 200.0), new Product(103, "pencel", 300.0), new Product(104, "food",
		 * 400.0), new Product(105, "ride", 500.0), new Product(106, "cat", 600.0) ));
		 * System.out.println("Save all data");
		 */
		/*
		 * List<myData> list= repo.findByProdIdLessThan(103); for (myData myData : list)
		 * { System.out.println(myData.getProdcode()+" "+myData.getProdCost()); }
		 */
		FileInputStream fis= new FileInputStream("D:\\image\\download.jpg");
			byte[] proImg= new byte[fis.available()]; 
			fis.read(proImg);
			
			String str="Birds are vertebrates (animals with backbones) with wings and feathers. Most birds can fly, using powerful muscles to flap their wings. But a few bird species do not have strong enough wings to fly, and so these birds are flightless.";
			char[] prodesc=str.toCharArray();
		
		repo.save(new Product(101, "pen", 22.0, proImg, prodesc));
		
		
		
	}

}
