package net.leibi.versiontest.service;

import org.springframework.stereotype.Service;

import net.leibi.versiontest.betaannotation.LeibiBeta;

@Service
@LeibiBeta(forFeature = "New cool feature")
public class AOldService {

    private final ANewService newService;

    public AOldService(ANewService newService) {
        this.newService = newService;
    }

    public String sayMyName(){
        return newService.sayHello(this.getClass().getName());
    }
}
