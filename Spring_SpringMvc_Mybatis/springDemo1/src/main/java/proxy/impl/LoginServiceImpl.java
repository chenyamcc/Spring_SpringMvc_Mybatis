package proxy.impl;

import proxy.ILoginService;

/**
 * @author chenyam
 * @title: LoginServiceImpl
 * @projectName Spring_SpringMvc_Mybatis
 * @description: TODO
 * @date 19/06/10 下午 9:43
 */
public class LoginServiceImpl implements ILoginService {
    public void login() {
        System.out.println("登录");
    }
}
