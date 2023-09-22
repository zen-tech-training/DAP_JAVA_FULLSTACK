package com.zensar.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.zensar.dto.CouponDto;
import com.zensar.entity.Product;
import com.zensar.rest.client.RestClient;
import com.zensar.services.ProductService;

@RestController
@RequestMapping("/product-api")
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	//@Autowired
	//private RestClient restClient;
	
	@Autowired
	private RestTemplate restTemplate;
	
	

	 //http://localhost:8082/product-api/product -> POST
	@PostMapping("/product")
	public Product insertProduct(@RequestBody Product product) {
		
		CouponDto couponDto = restTemplate.getForObject("http://localhost:8083/coupon-api/coupons/"+product.getCouponCode(),CouponDto.class);
	 	 
		//CouponDto couponDto = restTemplate.getForObject("http://COUPON-SERVICE/coupon-api/coupons/"+product.getCouponCode(),CouponDto.class);
		
		//CouponDto couponDto = restClient.getCoupon(product.getCouponCode());
		
		product.setPrice(product.getPrice()-100);
		
		return productService.insertProduct(product);
	
	}

}


