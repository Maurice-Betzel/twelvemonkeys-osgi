package net.betzel.imageio.osgi;

import javax.imageio.ImageIO;
import javax.imageio.spi.IIORegistry;
import javax.imageio.spi.ImageReaderSpi;
import javax.imageio.spi.ImageWriterSpi;
import javax.imageio.spi.ServiceRegistry;
import java.util.Arrays;

/**
 * Created by mbetzel on 13.03.2017.
 */
public class Consumer {

    public Consumer() {
        IIORegistry registry = IIORegistry.getDefaultInstance();
        registry.registerServiceProviders(ServiceRegistry.lookupProviders(ImageReaderSpi.class));
        registry.registerServiceProviders(ServiceRegistry.lookupProviders(ImageWriterSpi.class));
        System.out.println("Registered image readers: " + Arrays.asList(ImageIO.getReaderMIMETypes()));
        System.out.println("Registered image writers: " + Arrays.asList(ImageIO.getWriterMIMETypes()));
    }

}