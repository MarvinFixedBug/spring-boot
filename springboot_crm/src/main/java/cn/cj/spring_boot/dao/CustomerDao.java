package cn.cj.spring_boot.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import cn.cj.spring_boot.domain.Customer;
import cn.cj.spring_boot.domain.QueryVo;

@Component
public interface CustomerDao {
    List<Customer> getCustomerList(QueryVo queryVo);

    Integer getCustomerListCount(QueryVo queryVo);

    Customer getCustomerById(Long id);

    void updateCustomer(Customer customer);

    void deleteCustomer(Long id);
}
