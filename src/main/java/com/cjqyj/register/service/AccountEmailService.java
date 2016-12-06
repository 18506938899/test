package com.cjqyj.register.service;

import javax.security.auth.login.AccountException;

/**
 * Created by sk on 2016/10/27.
 */
public interface AccountEmailService {

    //接口中写方法不能有方法体
    public void sendEmail(String to, String sunject, String htmlText) throws
            Exception;
}
