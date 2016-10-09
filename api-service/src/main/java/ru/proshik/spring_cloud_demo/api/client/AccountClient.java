package ru.proshik.spring_cloud_demo.api.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.proshik.spring_cloud_demo.api.model.ResourceOut;

/**
 * Created by proshik on 04.10.16.
 */
@Component
@FeignClient("account-service")
public interface AccountClient {

    @RequestMapping(method = RequestMethod.GET, value = "/v1/account")
    ResourceOut get();
}
