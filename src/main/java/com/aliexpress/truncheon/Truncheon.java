package com.aliexpress.truncheon;

import com.taobao.hsf.app.spring.util.annotation.EnableHSF;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@EnableHSF                      // 启用HSF服务
public class Truncheon {

    public static void main(String[] args) {
        SpringApplication.run(Truncheon.class, args);
    }
}