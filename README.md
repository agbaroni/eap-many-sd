# Multiple security domains with Elytron

```
/subsystem=ejb3/application-security-domain=other:add(security-domain=ApplicationDomain)
/subsystem=ejb3/application-security-domain=other2:add(security-domain=ApplicationDomain)

/subsystem=elytron/http-authentication-factory=basic-http-factory:add(http-server-mechanism-factory=global,mechanism-configurations=[{mechanism-name=BASIC}],security-domain=ApplicationDomain)

/subsystem=undertow/application-security-domain=other:add(http-authentication-factory=basic-http-factory)
```