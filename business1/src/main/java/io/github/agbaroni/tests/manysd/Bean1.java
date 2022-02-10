package io.github.agbaroni.tests.manysd;

import javax.annotation.Resource;
import javax.annotation.security.PermitAll;
import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import org.jboss.ejb3.annotation.SecurityDomain;

@PermitAll
@SecurityDomain("other")
@Stateless
public class Bean1 {

    @Resource
    private SessionContext sessionContext;

    public String getUser() {
	return String.format("[BEAN1] %s", sessionContext.getCallerPrincipal().getName());
    }
}
