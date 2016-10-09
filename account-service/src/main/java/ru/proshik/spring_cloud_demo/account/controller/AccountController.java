package ru.proshik.spring_cloud_demo.account.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.proshik.spring_cloud_demo.account.model.ResourceOut;

/**
 * Created by proshik on 04.10.16.
 */
@RestController
@RequestMapping("/v1/account")
public class AccountController {

    @GetMapping
    @HystrixCommand
    public ResponseEntity getAccount() {
        return ResponseEntity.ok(new ResourceOut("anyKey", "value"));
    }
}
