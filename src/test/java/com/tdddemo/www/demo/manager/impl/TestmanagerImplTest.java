package com.tdddemo.www.demo.manager.impl;

import com.tdddemo.www.demo.utils.DateFormatUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({DateFormatUtil.class})
public class TestmanagerImplTest {

    //    @Mock
//    FileUploadManager fileUploadManager;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
    }


    @After
    public void tearDown() {
    }

    @Test
    public void getDate() {
        // Mock 静态方法
        PowerMockito.mockStatic(DateFormatUtil.class);
        Mockito.when(DateFormatUtil.getStr(Mockito.anyString())).thenReturn("2020-20-20");

        // 调用测试方法
        TestmanagerImpl testmanager = new TestmanagerImpl();
        String s = testmanager.getDate();
        Assert.assertTrue(true);
    }
}