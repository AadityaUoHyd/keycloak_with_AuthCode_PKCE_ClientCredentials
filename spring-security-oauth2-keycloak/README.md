# A Demo Project for Spring Security OAuth2 Keycloak 

This repository contains source code to demonstrate OAuth2 features using Spring Security and KeyCloak Authorization Server

After you checked out the project, run the following command:

`mvn clean verify`

This project contains examples for 3 OAuth2 Grant Types

- Authorization Code Flow (oauth2-authorization-code-demo)
- PKCE Authorization Code Flow (oauth2-pkce-demo)
- Client Credentials Flow (oauth2-client-credentials-demo)

# Run Keycloak
    - Download Keycloak from https://www.keycloak.org/downloads
    - If you are using standalone version, run the following command, by making sure you are inside the bin directory
      `standalone.bat -Djboss.http.port=<port>`, you can provide whatever port number you like.

# Importing Realm
    - Use `oauth2-demo-realm-export.json` file to import all the realm details into your Keycloak instance, 
    in case not interested in creating realm.
     
# Lets run first server-side rendering program based on Authorization Code Flow (oauth2-authorization-code-demo):

- Now hit url with : http://localhost:8080/home , you'll find you're re-directed to keycloak login page.
![](https://github.com/AadityaUoHyd/keycloak_with_AuthCode_PKCE_ClientCredentials/blob/master/spring-security-oauth2-keycloak/authCode2.jpg)

- Once you login with correct credentials, you'll redirect to home.html of thymeleaf page.
![](https://github.com/AadityaUoHyd/keycloak_with_AuthCode_PKCE_ClientCredentials/blob/master/spring-security-oauth2-keycloak/authCode3.jpg)

# Lets run second Angular(public) side rendered rendering program based on PKCE Authorization Code Flow (oauth2-pkce-demo):

- Now hit url with : http://localhost:4200 , you'll find you're re-directed to anngular designed page with Login button.
![](https://github.com/AadityaUoHyd/keycloak_with_AuthCode_PKCE_ClientCredentials/blob/master/spring-security-oauth2-keycloak/pkce1.jpg)

- Once you click on login button, you'll redirect to keycloak login page for login.
![](https://github.com/AadityaUoHyd/keycloak_with_AuthCode_PKCE_ClientCredentials/blob/master/spring-security-oauth2-keycloak/pkce2.jpg)

- Provide your user credentials, you had erstwhile set in your keycloak server.
![](https://github.com/AadityaUoHyd/keycloak_with_AuthCode_PKCE_ClientCredentials/blob/master/spring-security-oauth2-keycloak/pkce3.jpg)

- It got successfully login & you need to refresh the page.
![](https://github.com/AadityaUoHyd/keycloak_with_AuthCode_PKCE_ClientCredentials/blob/master/spring-security-oauth2-keycloak/pkce4.jpg)

- Voila! you success page:
![](https://github.com/AadityaUoHyd/keycloak_with_AuthCode_PKCE_ClientCredentials/blob/master/spring-security-oauth2-keycloak/pkce5.jpg)

# Lets run third machine-to-machine(confidential) auth program based on Client Credentials Flow (oauth2-client-credentials-demo):

- Go to postman, and hit the microservice1 url which will consume microservice2,(here we can any one as client or server).
![](https://github.com/AadityaUoHyd/keycloak_with_AuthCode_PKCE_ClientCredentials/blob/master/spring-security-oauth2-keycloak/clientCredentials0.jpg)

![](https://github.com/AadityaUoHyd/keycloak_with_AuthCode_PKCE_ClientCredentials/blob/master/spring-security-oauth2-keycloak/cc0.jpg)

![](https://github.com/AadityaUoHyd/keycloak_with_AuthCode_PKCE_ClientCredentials/blob/master/spring-security-oauth2-keycloak/clientCredentials1.jpg)

![](https://github.com/AadityaUoHyd/keycloak_with_AuthCode_PKCE_ClientCredentials/blob/master/spring-security-oauth2-keycloak/clientCredentials2.jpg)
