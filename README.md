# Multiple security domains with Elytron

## Configuration

(Create a new Applicative user with add-user.sh)

```
/subsystem=ejb3/application-security-domain=other:add(security-domain=ApplicationDomain)
/subsystem=ejb3/application-security-domain=other2:add(security-domain=ApplicationDomain)

/subsystem=elytron/http-authentication-factory=basic-http-factory:add(http-server-mechanism-factory=global,mechanism-configurations=[{mechanism-name=BASIC}],security-domain=ApplicationDomain)

/subsystem=undertow/application-security-domain=other3:add(http-authentication-factory=basic-http-factory)
```

## Build & Test

```
mvn clean package wildfly:deploy

curl -v -u '<username>:<password>' http://localhost:8080/test/local
```
