package com.zensar.rest.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.zensar.dto.CouponDto;

//@FeignClient("COUPON-SERVICE")
@FeignClient("API-GATEWAY")
public interface RestClient {

	@GetMapping("/coupon-api/coupons/{couponCode}")
	CouponDto getCoupon(@PathVariable String couponCode);
	
	
	

}
