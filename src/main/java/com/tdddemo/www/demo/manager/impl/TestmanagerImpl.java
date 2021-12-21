package com.tdddemo.www.demo.manager.impl;

import com.tdddemo.www.demo.manager.TestManager;
import com.tdddemo.www.demo.service.TestServcie;
import com.tdddemo.www.demo.manager.UserManager;
import com.tdddemo.www.demo.utils.DateFormatUtil;
import org.apache.commons.lang3.time.DateFormatUtils;

import javax.annotation.Resource;
import java.util.Date;

public class TestmanagerImpl implements TestManager {

    @Resource
    private TestServcie testServcie;
    private UserManagerImpl userManager;

    public String getFormatDate() {
        String ss = DateFormatUtil.format(new Date());
//        String s1 = DateFormatUtils.format(new Date(), "1qwq");
        String s1 = DateFormatUtils.format(1111L, "1qwq");
        String getFormatDate = testServcie.getFormatDate(new Date());
        return getFormatDate;
    }
    public String getDate() {
        String ss = DateFormatUtils.format(new Date(), "sdsd");
        String privateMethod = privateMethod("sss");
//        return privateMethod; 
        String userName = userManager.getUserName("112");
        return ss;
    }

    private String privateMethod(String str){

        return str;
    }
}
