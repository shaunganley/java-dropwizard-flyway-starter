package org.example;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;
import org.example.controllers.DeliveryEmployeeController;
import org.example.controllers.SalesEmployeeController;
import org.example.controllers.TestController;
import org.example.daos.DeliveryEmployeeDao;
import org.example.daos.SalesEmployeeDao;
import org.example.daos.TestDao;
import org.example.services.DeliveryEmployeeService;
import org.example.services.SalesEmployeeService;
import org.example.services.TestService;

public class DJ2Application extends Application<TestConfiguration> {
    public static void main(final String[] args) throws Exception {
        new DJ2Application().run(args);
    }
    @Override
    public String getName() {
        return "Test";
    }
    @Override
    public void initialize(final Bootstrap<TestConfiguration> bootstrap) {
        bootstrap.addBundle(new SwaggerBundle<>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(
                    final TestConfiguration configuration) {
                return configuration.getSwagger();
            }
        });
    }
    @Override
    public void run(final TestConfiguration configuration,
                    final Environment environment) {
        environment.jersey()
                .register(new TestController(new TestService(new TestDao())));
        environment.jersey().register(new DeliveryEmployeeController(
                new DeliveryEmployeeService(new DeliveryEmployeeDao())));
        environment.jersey().register(new SalesEmployeeController(
                new SalesEmployeeService(new SalesEmployeeDao())));
    }

}
