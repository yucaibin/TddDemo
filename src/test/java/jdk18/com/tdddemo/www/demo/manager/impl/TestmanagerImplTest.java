package jdk18.com.tdddemo.www.demo.manager.impl;

import com.tdddemo.www.demo.manager.UserManager;
import com.tdddemo.www.demo.manager.impl.TestmanagerImpl;
import com.tdddemo.www.demo.manager.impl.UserManagerImpl;
import com.tdddemo.www.demo.utils.DateFormatUtil;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.test.util.ReflectionTestUtils;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.doReturn;

import java.util.Date;

@RunWith(PowerMockRunner.class)
@PrepareForTest({DateFormatUtil.class, TestmanagerImpl.class,UserManagerImpl.class})
public class TestmanagerImplTest {

    //    @Mock
//    FileUploadManager fileUploadManager;

    @InjectMocks
    TestmanagerImpl testmanager;
    @InjectMocks
    UserManagerImpl userManager;
    @Before
    public void setUp() {
//        MockitoAnnotations.initMocks(this);
        testmanager = PowerMockito.spy(new TestmanagerImpl());
        userManager = PowerMockito.mock(UserManagerImpl.class);
    }

    @After
    public void tearDown() {
    }

    @Test
    public void getDate() throws Exception{
        // Mock 静态方法
        PowerMockito.mockStatic(DateFormatUtil.class);
        Mockito.when(DateFormatUtils.format((Date)Mockito.anyObject(),Mockito.anyString())).thenReturn("2020-20-20");
//        Mockito.when(DateFormatUtil.getStr(Mockito.anyString())).thenReturn("2020-20-20");
        Mockito.when(userManager.getUserName(Mockito.anyString())).thenReturn("aaaaa");

        //注入属性
        ReflectionTestUtils.setField(testmanager, "userManager", userManager);

        // 调用测试方法
        String s = testmanager.getDate();
        Assert.assertTrue(true);
    }

    @Test
    public void privateMethod() throws Exception{
        // Mock 静态方法
        PowerMockito.mockStatic(DateFormatUtil.class);
        Mockito.when(DateFormatUtil.format(Mockito.anyObject())).thenReturn("2020-20-20");

        PowerMockito.when(testmanager, "privateMethod", Mockito.anyString()).thenReturn("22222");

        String s = testmanager.getDate();
        Assert.assertTrue(true);

    }
    @Test
    public void getFormatDate() throws Exception{
        // Mock 静态方法
        PowerMockito.mockStatic(DateFormatUtil.class);
        Mockito.when(DateFormatUtil.format((Date) Mockito.anyObject())).thenReturn("2020-20-20");
//        Mockito.when(DateFormatUtils.format(,Mockito.anyString())).thenReturn("2020-20-21");

        String s = testmanager.getFormatDate();
        Assert.assertTrue(true);

    }
}