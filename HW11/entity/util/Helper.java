package com.company.HW11.entity.util;

import com.company.HW11.entity.Client;
import com.company.HW11.entity.exception.UserExpectedError;
import com.company.HW11.entity.exception.WrongFieldException;
import com.company.HW11.entity.exception.WrongSumException;

public class Helper {

    private Client client = new Client();
    private WrongFieldException wrongFieldException = new WrongFieldException();
    private WrongSumException wrongSumException = new WrongSumException();
    private UserExpectedError userExpectedError = new UserExpectedError();

    private String client1 = client.getIdentifierOfAccount();
    private String client2 = client.getIdentifierOfClient();
    private double summary = client.getSummary();


    public void method1(String client1) throws WrongFieldException {
        if(client1.length() != 10){
            throw wrongFieldException;
        }
    }

    public void method2(double summary) throws WrongSumException{
        if((summary>1000)||(summary<0)){
            throw wrongSumException;
        }
    }

    public void method3( String client1,String client2 )throws UserExpectedError{
        if(!client2.equals(client1)) {
            throw userExpectedError;
        }
    }
}
