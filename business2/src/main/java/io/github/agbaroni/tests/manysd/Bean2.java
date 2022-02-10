package io.github.agbaroni.tests.manysd;

import javax.annotation.Resource;
import javax.annotation.security.PermitAll;
import javax.ejb.SessionContext;
import javax.security.enterprise.SecurityContext;
import javax.ejb.Stateless;

import org.jboss.ejb3.annotation.SecurityDomain;

@PermitAll
@SecurityDomain("other2")
@Stateless
public class Bean2 {

    @Resource
    private SessionContext sessionContext;

    public String getUser() {
	return String.format("[BEAN2] %s", sessionContext.getCallerPrincipal().getName());
    }
}
