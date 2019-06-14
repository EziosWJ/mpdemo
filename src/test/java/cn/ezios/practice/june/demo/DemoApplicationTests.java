package cn.ezios.practice.june.demo;

import cn.ezios.practice.june.demo.entities.ShopModel;
import cn.ezios.practice.june.demo.mapper.ShopMapper;
import cn.ezios.practice.june.demo.service.impl.ShopCaseServiceImpl;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private ShopMapper shopMapper;

    @Autowired
    private ShopCaseServiceImpl shopCaseService;

    @Test
    public void contextLoads() {
        shopCaseService.s();
    }
    @Test
    public void shopmapper() {
        List<ShopModel> shopModels = shopMapper.selectList(null);
        shopModels.forEach(System.out::println);
    }

}
