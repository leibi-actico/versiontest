package net.leibi.versiontest.service;

import org.springframework.stereotype.Service;

@Service
public class AOldService {

    private final ANewService newService;

    public AOldService(ANewService newService) {
        this.newService = newService;
    }

    public String sayMyName(){
        return newService.sayHello(this.getClass().getName());
    }
}
