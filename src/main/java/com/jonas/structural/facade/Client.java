package com.jonas.structural.facade;

import com.jonas.structural.facade.facade.EncryptFacade;

/**
 * <p>
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-29
 */
public class Client {

    public static void main(String[] args) {
        EncryptFacade facade = new EncryptFacade();
        facade.fileEncrypt();
    }
}
