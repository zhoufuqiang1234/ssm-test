package cn.fuqiang.ssmtest.dao;

import cn.fuqiang.ssmtest.bean.TestBean;
import cn.fuqiang.ssmtest.bean.TestBeanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestBeanMapper {
    long countByExample(TestBeanExample example);

    int deleteByExample(TestBeanExample example);

    int insert(TestBean record);

    int insertSelective(TestBean record);

    List<TestBean> selectByExample(TestBeanExample example);

    int updateByExampleSelective(@Param("record") TestBean record, @Param("example") TestBeanExample example);

    int updateByExample(@Param("record") TestBean record, @Param("example") TestBeanExample example);
}