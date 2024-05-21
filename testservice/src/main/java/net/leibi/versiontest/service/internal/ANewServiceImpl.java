package net.leibi.versiontest.service.internal;

import net.leibi.versiontest.betaannotation.LeibiBeta;
import net.leibi.versiontest.service.ANewService;
import org.springframework.stereotype.Service;

@Service
@LeibiBeta(forFeature = "New cool feature")
public class ANewServiceImpl implements ANewService {
    @Override
    public String sayHello(String name) {
        return "Hello %s".formatted(name);
    }
}
