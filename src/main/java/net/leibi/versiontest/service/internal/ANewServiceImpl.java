package net.leibi.versiontest.service.internal;

import net.leibi.versiontest.service.ANewService;
import org.springframework.stereotype.Service;

@Service
public class ANewServiceImpl implements ANewService {
    @Override
    public String sayHello(String name) {
        return "Hello %s".formatted(name);
    }
}
