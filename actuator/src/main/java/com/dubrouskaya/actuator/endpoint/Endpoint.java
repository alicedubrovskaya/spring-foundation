package com.dubrouskaya.actuator.endpoint;

import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.stereotype.Component;

@Component
@org.springframework.boot.actuate.endpoint.annotation.Endpoint(id = "custom-endpoint")
public class Endpoint {

    @ReadOperation
    public EndpointResponse endpoint() {
        return new EndpointResponse("Custom endpoint", "Active");
    }

}
