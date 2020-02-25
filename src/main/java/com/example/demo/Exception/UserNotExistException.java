package com.example.demo.Exception;

/**
 * @program: demo
 * @description:
 * @author: DBC
 * @create: 2020-02-24 23:18
 **/
public class UserNotExistException extends RuntimeException {

    public UserNotExistException() {
        super("用户不存在");
    }
}
