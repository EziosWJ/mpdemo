package cn.ezios.practice.june.demo.entities;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Builder;
import lombok.Data;

@TableName("shop_case")
@Data @Builder public class ShopModel {
    private int id;
    private String name;
    private String address;
}
