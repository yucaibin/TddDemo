package com.tdddemo.www.demo.manager.impl;

import com.tdddemo.www.demo.manager.TestManager;
import com.tdddemo.www.demo.service.TestServcie;
import com.tdddemo.www.demo.utils.DateFormatUtil;
import org.apache.commons.lang3.time.DateFormatUtils;

import javax.annotation.Resource;
import java.util.Date;

public class TestmanagerImpl implements TestManager {

    @Resource
    private TestServcie testServcie;

    public String getFormatDate() {
        String ss = DateFormatUtil.format(new Date());
        String s1 = DateFormatUtils.format(new Date(),"1qwq");
        String getFormatDate = testServcie.getFormatDate(new Date());
        return ss;
    }
}
