package com.tdddemo.www.demo.service;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class TestServcie {

    public String getFormatDate(Date date){
        return "getFormatDate";
    }
}
