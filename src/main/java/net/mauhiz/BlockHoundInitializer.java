package net.mauhiz;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import reactor.blockhound.BlockHound;

@WebListener
public class BlockHoundInitializer implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        try {
            BlockHound.install();
        } catch (Throwable t) {
            t.printStackTrace();
        }
    }
}
