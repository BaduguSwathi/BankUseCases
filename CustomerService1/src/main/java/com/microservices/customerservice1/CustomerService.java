package com.microservices.customerservice1;

import java.util.List;

public interface CustomerService {

	CustomerServiceBean saveCustomer(CustomerServiceBean customer);

	CustomerServiceBean registerCustomer(CustomerServiceBean customBean);

	List<DepositeDto> findByttype(String ttyp);

}
