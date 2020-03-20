package com.bhy.test;

import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.security.rsa.crypto.KeyStoreKeyFactory;

public class AuthTest {

    @Test
    public void testCreateJwt() {
        // 证书文件
        String keyLocation = "bh.keystore";
        // 密钥库密码
        String keystorePassword = "bohuakeystore";
        // 访问路径
        ClassPathResource resource = new ClassPathResource(keyLocation);
        // 密钥工厂
        KeyStoreKeyFactory keyStoreKeyFactory = new KeyStoreKeyFactory(resource, keystorePassword.toCharArray());
        // 密钥密码，此密码和别名都要匹配
        String keypassword = "bohuayang";
        // 密钥别名
//        String ali
    }
}
