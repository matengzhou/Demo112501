package cn.kgc.matengzhou.test;


import cn.kgc.matengzhou.service.RealEstateService;
import cn.kgc.matengzhou.service.UsersService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @author shkstart
 * @create 2020-11-21 18:14
 */

@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class Test01 {
    @Resource
    RealEstateService realEstateService;
    @Resource
    UsersService usersService;
    @Test
    public void test01(){
    }
}
