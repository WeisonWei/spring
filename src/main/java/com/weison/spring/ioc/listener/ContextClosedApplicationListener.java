package com.weison.spring.ioc.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Weison
 * @date 2020/9/17
 */
@Slf4j
@Component
public class ContextClosedApplicationListener {

    @EventListener
    public void onContextClosedEvent(ContextClosedEvent event) {
        log.info("ClosedListener监听到ContextClosedEvent事件！");
    }
}
