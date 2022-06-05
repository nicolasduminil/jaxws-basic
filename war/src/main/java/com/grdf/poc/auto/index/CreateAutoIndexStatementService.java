package com.grdf.poc.auto.index;

import java.util.concurrent.*;
import java.util.logging.*;

import javax.jws.*;
import javax.xml.ws.*;

import org.grdf.poc.wsdl.auto.index.*;

@WebService(serviceName = "CreerIndexAutoReleveService", portName = "CreerIndexAutoReleveServiceSOAPPort", targetNamespace = "com.grdf.poc.CreerIndexAutoReleveService:1", endpointInterface = "org.grdf.poc.wsdl.auto.index.CreerIndexAutoReleveServicePort")
public class CreateAutoIndexStatementService implements CreerIndexAutoReleveServicePort
{
  private final Logger logger = Logger.getLogger("com.grdf.poc.auto.index.CreateAutoIndexStatementService");

  @Override
  public Response<IndexAutoReleveResponseType> creerIndexAutoReleveAsync(@WebParam(name = "indexAutoReleveRequest", targetNamespace = "com.grdf.poc.IndexAutoReleveRequest-v1.2", partName = "parameters")IndexAutoReleveRequestType parameters)
  {
    return null;
  }

  @Override
  public Future<?> creerIndexAutoReleveAsync(IndexAutoReleveRequestType parameters, AsyncHandler<IndexAutoReleveResponseType> asyncHandler)
  {
    return null;
  }

  @Override
  public IndexAutoReleveResponseType creerIndexAutoReleve(
    @WebParam(name = "indexAutoReleveRequestType", targetNamespace = "com.grdf.poc.IndexAutoReleveRequest-v1.2", partName = "parameters") IndexAutoReleveRequestType indexAutoReleveRequestType)
  {
    IndexAutoReleveResponseType indexAutoReleveResponseType = new IndexAutoReleveResponseType();
    indexAutoReleveResponseType.setIndexAutoReleve(indexAutoReleveRequestType.getIndexAutoReleve());
    indexAutoReleveResponseType.setResultat(ResultType.OK);
    logger.log(Level.FINEST, "*** CreateAutoIndexStatementService.creerIndexAutoReleve(): Sleeping 20s ");
    try
    {
      Thread.sleep(20000);
      Thread.yield();
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
    return indexAutoReleveResponseType;
  }
}
