package com.example.mockitodemo;

import business.BusinessImpl;
import business.DataService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class BusinessImplMockTest {

    @Mock
    private DataService ddsmock;

    @InjectMocks
    private BusinessImpl b;

    @Test
    void findgreatest(){
//        DataService dataServicemock= mock(DataService.class);
        when(ddsmock.retrieveAllData()).thenReturn(new int[] {25,15,10});

//        BusinessImpl b=new BusinessImpl(dataServicemock);
        int res = b.findGreatesvalue();
        assertEquals(25,res);

    }
}
