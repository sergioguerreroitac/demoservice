package org.fusesource.camel.ws;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.fusesource.camel.model.Saldo;

@WebService
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface SaldoEndpoint {
  public String order(Saldo in);
}