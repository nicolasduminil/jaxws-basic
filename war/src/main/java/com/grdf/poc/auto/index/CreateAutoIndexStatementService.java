package com.grdf.poc.auto.index;

import javax.jws.*;
import org.grdf.poc.wsdl.auto.index.*;

@WebService(serviceName="CreerIndexAutoReleveService", portName="CreerIndexAutoReleveServiceSOAPPort", targetNamespace = "com.grdf.poc.CreerIndexAutoReleveService:1", endpointInterface = "org.grdf.poc.wsdl.auto.index.CreerIndexAutoReleveServicePort")
public class CreateAutoIndexStatementService implements CreerIndexAutoReleveServicePort
{  

  @Override
  public IndexAutoReleveResponseType creerIndexAutoReleve(@WebParam(name = "indexAutoReleveRequestType", targetNamespace = "com.grdf.poc.IndexAutoReleveRequest-v1.2", partName = "parameters")IndexAutoReleveRequestType indexAutoReleveRequestType)
  {
    IndexAutoReleveResponseType indexAutoReleveResponseType = new IndexAutoReleveResponseType();
    indexAutoReleveResponseType.setIndexAutoReleve(indexAutoReleveRequestType.getIndexAutoReleve());
    indexAutoReleveResponseType.setResultat(ResultType.OK);
    return indexAutoReleveResponseType;
  }

  public IndexAutoReleveResponseType creerIndexAutoReleve()
  {
    IndexAutoReleveResponseType indexAutoReleveResponseType = new IndexAutoReleveResponseType();
    indexAutoReleveResponseType.setIndexAutoReleve(new IndexAutoReleve());
    indexAutoReleveResponseType.setResultat(ResultType.OK);
    return indexAutoReleveResponseType;
  }
}
