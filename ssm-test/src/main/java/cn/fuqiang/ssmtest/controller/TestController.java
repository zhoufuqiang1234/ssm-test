package cn.fuqiang.ssmtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.fuqiang.ssmtest.bean.TestBean;


@Controller
public class TestController {
    @RequestMapping("stringTest")
    @ResponseBody
    public String returnStr() {
        return "hello,即使是中文也可以";
    }

    @RequestMapping("entityTest")
    @ResponseBody
    public TestBean returnEntify() {
        TestBean testBean = new TestBean();
        //testBean.setTestStr("测试实体");
       // testBean.setTestInt(12);
        return testBean;
    }
}