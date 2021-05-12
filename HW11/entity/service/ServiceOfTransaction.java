package com.company.HW11.entity.service;

import com.company.HW11.entity.Client;
import com.company.HW11.entity.util.Helper;

public class ServiceOfTransaction {

    private Helper helper = new Helper();
    private Client client = new Client();

    public void transaction(String client1,String client2){
        helper.method3(client1,client2);
    }
}
