package cn.ezios.practice.june.demo.service.impl;

import cn.ezios.practice.june.demo.entities.ShopCase;
import cn.ezios.practice.june.demo.mapper.ShopCaseMapper;
import cn.ezios.practice.june.demo.mapper.ShopMapper;
import cn.ezios.practice.june.demo.service.IShopCaseService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author wangj
 * @since 2019-06-14
 */
@Service
public class ShopCaseServiceImpl extends ServiceImpl<ShopCaseMapper, ShopCase> implements IShopCaseService {

    public void s(){
        QueryWrapper<ShopCase> wrapper = new QueryWrapper<>();
        List<ShopCase> list = getBaseMapper().selectList(wrapper.eq("id", "1"));
        list.forEach(System.out::println);
    }
}
