package com.microservices.customerservice1;
import java.util.List;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//@FeignClient(name="currency-exchange-service", url="localhost:8000")
//Enabling feign
@FeignClient(name="ManagerService1")

public interface CustomerServiceProxy 
{
     @GetMapping("/custinfo")
     public List<CustomerServiceBean> CustomerInfo();
}