package cn.cj.spring_boot.service;

import cn.cj.spring_boot.domain.Customer;
import cn.cj.spring_boot.domain.QueryVo;
import cn.cj.spring_boot.utils.Page;

public interface CustomerService {

    Page<Customer> getCustomerList(QueryVo queryVo);

    Customer getCustomerById(Long id);

    void updateCustomer(Customer customer);

    void deleteCustomer(Long id);
}
