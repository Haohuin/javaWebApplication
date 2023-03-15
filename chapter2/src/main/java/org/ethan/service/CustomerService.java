package org.ethan.service;

import org.ethan.helper.DatabaseHelper;
import org.ethan.model.Customer;
import sun.util.resources.cldr.fil.CurrencyNames_fil;

import java.util.List;
import java.util.Map;

/**
 * @description:
 * @author: wangJw
 * @date: 2023/3/3
 */
public class CustomerService {

    public List<Customer> getCustomerList() {
        String sql = "SELECT * FROM customer";
        return DatabaseHelper.queryEntityList(Customer.class, sql);
    }

    public Customer getCustomer(String id) {
        String sql = "SELECT * FROM customer WHERE id = ?";
        return DatabaseHelper.queryEntity(Customer.class, sql, id);
    }


    public boolean createCustomer(Map<String, Object> filedMap) {
        return DatabaseHelper.insertEntity(Customer.class, filedMap);
    }

    public boolean deleteCustomer(String id) {
        return DatabaseHelper.deleteEntity(Customer.class, id);
    }

    public boolean updateCustomer(String id, Map<String, Object> fieldMap) {
        return DatabaseHelper.updateEntity(Customer.class, id, fieldMap);
    }
}
