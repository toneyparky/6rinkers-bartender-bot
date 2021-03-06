package bar.cocktailpick.bartender.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.TimeZone;

@Configuration
@Slf4j
public class TimeZoneConfig {

    @PostConstruct
    public void setTimeZone() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
        log.info("Time: " + LocalDateTime.now());
    }
}
