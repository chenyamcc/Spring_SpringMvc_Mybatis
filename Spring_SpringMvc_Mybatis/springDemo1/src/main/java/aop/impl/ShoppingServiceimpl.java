package aop.impl;

import aop.IShoppingService;

/**
 * @author chenyam
 * @title: ShoppingServiceimpl
 * @projectName Spring_SpringMvc_Mybatis
 * @description: 学生类的业务实现类
 * @date 19/06/11 下午 2:20
 */
public class ShoppingServiceimpl implements IShoppingService {

    public void shopping() {
        System.out.println("shopping");
    }
}
