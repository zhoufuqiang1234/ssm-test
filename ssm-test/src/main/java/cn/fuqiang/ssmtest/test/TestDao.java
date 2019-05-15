package cn.fuqiang.ssmtest.test;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.fuqiang.ssmtest.bean.TestBean;
import cn.fuqiang.ssmtest.dao.TestBeanMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
@Component
public class TestDao {
	@Autowired
    TestBeanMapper testBeanMapper;

    @Test
    public void testInsert() {
        TestBean testBean = new TestBean();
        testBean.setTeststr("mybatisInsert");
        testBean.setTestint((long) 343);

        testBeanMapper.insert(testBean);
       
    }
}