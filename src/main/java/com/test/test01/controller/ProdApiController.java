package com.test.test01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;

@Controller
@RequestMapping("${openapi.threetest.base-path:}")
public class ProdApiController implements ProdApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ProdApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
