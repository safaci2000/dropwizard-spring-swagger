package com.esamir.dropwizard.example.app;

import com.esamir.dropwizard.example.app.resources.SampleResource;
import com.esamir.dropwizard.support.spring.SpringContextBuilder;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import org.springframework.context.ApplicationContext;

/**
 * @author Federico Recio
 */
public class SampleApplication extends Application<SampleConfiguration> {

    public static void main(String... args) throws Exception {
        new SampleApplication().run(args);
    }

    @Override
    public void initialize(Bootstrap<SampleConfiguration> bootstrap) {
        bootstrap.addBundle(new SwaggerBundle<SampleConfiguration>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(SampleConfiguration sampleConfiguration) {
                // this would be the preferred way to set up swagger, you can also construct the object here programtically if you want
                return sampleConfiguration.swaggerBundleConfiguration;
            }
        });

    }

    @Override
    public void run(SampleConfiguration configuration, Environment environment) throws Exception {
        ApplicationContext context = new SpringContextBuilder()
            .addAnnotationConfiguration(SpringConfiguration.class)
            .build();

        SampleResource sampleResource = context.getBean(SampleResource.class);
        environment.jersey().register(sampleResource);
    }
}
