package cn.itsource.rabbitmq.service;

/**
 * @author solargen
 */
public interface IUserService {

    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     */
    void login(String username,String password);

}
