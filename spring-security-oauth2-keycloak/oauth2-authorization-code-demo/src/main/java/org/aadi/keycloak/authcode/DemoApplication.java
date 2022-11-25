package org.aadi.keycloak.authcode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}

//In keycloak server, for authorization-code & PKCE grant-type the username:password is = aadiuser/aadiuser123

