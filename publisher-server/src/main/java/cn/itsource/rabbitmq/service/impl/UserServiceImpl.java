package cn.itsource.rabbitmq.service.impl;

import cn.itsource.rabbitmq.service.IUserService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**

 * @author solargen
 */
@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    /**
     * 登录
     * @param username 用户名
     * @param password 密码
     */
    @Override
    public void login(String username, String password) {
        System.out.println("登录成功!......");
        rabbitTemplate.convertAndSend(username);
    }
}
