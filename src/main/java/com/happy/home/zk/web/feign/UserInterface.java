package com.happy.home.zk.web.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: lijixiao
 * @date: 2020-07-28
 */
@FeignClient(name = "zk-service")
public interface UserInterface {

    @GetMapping("/user")
    String getUser();
}
