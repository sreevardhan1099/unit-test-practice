package com.example.mockitodemo;

import business.BusinessImpl;
import business.DataService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BusinessImplTest {

    @Test
    void test(){
        DataServiceStub dstub = new DataServiceStub();
        BusinessImpl b=new BusinessImpl(dstub);
        int res= b.findGreatesvalue();
        assertEquals(25,res);
    }
}

class DataServiceStub implements DataService {


    @Override
    public int[] retrieveAllData() {
        return new int[]{25,10};
    }
}