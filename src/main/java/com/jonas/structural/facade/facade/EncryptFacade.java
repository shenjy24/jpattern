package com.jonas.structural.facade.facade;

import com.jonas.structural.facade.subsystem.CipherMachine;
import com.jonas.structural.facade.subsystem.FileReader;
import com.jonas.structural.facade.subsystem.FileWriter;

/**
 * <p>
 * 加密外观类，充当外观类
 * </p>
 *
 * @author shenjiayun
 * @since 2019-09-29
 */
public class EncryptFacade {
    //维持对其他对象的引用
    private FileReader reader;
    private CipherMachine cipher;
    private FileWriter writer;

    public EncryptFacade() {
        this.reader = new FileReader();
        this.cipher = new CipherMachine();
        this.writer = new FileWriter();
    }

    //调用其他对象的业务方法
    public void fileEncrypt() {
        reader.read();
        cipher.encrypt();
        writer.write();
    }
}
