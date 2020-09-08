package com.tdddemo.www.demo.manager.impl;

import com.tdddemo.www.demo.manager.TestManager;
import com.tdddemo.www.demo.utils.DateFormatUtil;

public class TestmanagerImpl implements TestManager {


    public String getDate() {
        String ss = DateFormatUtil.getStr("sdsd");
        String privateMethod = privateMethod("sss");
        return ss;
    }

    private String privateMethod(String str){

        return str;
    }
}
