package net.leibi.versiontest;

import jakarta.annotation.PostConstruct;
import lombok.extern.log4j.Log4j2;
import net.leibi.versiontest.service.AOldService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.processing.Processor;
import java.util.ServiceLoader;

@SpringBootApplication
@Log4j2
public class VersiontestApplication {

    private final AOldService oldService;

    public VersiontestApplication(AOldService oldService) {
        this.oldService = oldService;
    }

    public static void main(String[] args) {
        SpringApplication.run(VersiontestApplication.class, args);
        ServiceLoader<Processor> loader = ServiceLoader.load(Processor.class);
        loader.forEach(x -> log.info(x.getClass().getSimpleName()));
    }

    @PostConstruct
    public void init() {
        log.warn(oldService.sayMyName());
    }
}
