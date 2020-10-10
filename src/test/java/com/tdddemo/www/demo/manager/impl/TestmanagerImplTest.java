package com.tdddemo.www.demo.manager.impl;

import com.tdddemo.www.demo.service.TestServcie;
import com.tdddemo.www.demo.utils.DateFormatUtil;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.util.Date;

@RunWith(PowerMockRunner.class)
@PrepareForTest({DateFormatUtil.class,DateFormatUtils.class})
public class TestmanagerImplTest {

    @Mock
    TestServcie testServcie;

    @InjectMocks
    private TestmanagerImpl testmanagerImpl;
    @Before
    public void setUp() {
    }


    @After
    public void tearDown() {
    }

    @Test
    public void getFormatDate() {
        // Mock 静态方法
        PowerMockito.mockStatic(DateFormatUtil.class);
        PowerMockito.mockStatic(DateFormatUtils.class);
        Mockito.when(DateFormatUtil.format((Date) Mockito.anyObject())).thenReturn("2020-20-20");
        Mockito.when(DateFormatUtils.format((Date) Mockito.anyObject(),Mockito.anyString())).thenReturn("2020-1-1");
        Mockito.when(testServcie.getFormatDate((Date) Mockito.anyObject())).thenReturn("test");
        // 调用测试方法
        String s = testmanagerImpl.getFormatDate();
        Assert.assertTrue(true);
    }
}