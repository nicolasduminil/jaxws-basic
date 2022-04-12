package com.grdf.poc.auto.index;

import java.util.concurrent.*;
import javax.jws.*;
import javax.xml.ws.*;
import org.grdf.poc.wsdl.auto.index.*;

@WebService(serviceName="CreerIndexAutoReleveService", portName="CreerIndexAutoReleveServiceSOAPPort", targetNamespace = "com.grdf.poc.CreerIndexAutoReleveService:1", endpointInterface = "org.grdf.poc.wsdl.auto.index.CreerIndexAutoReleveServicePort")
public class CreateAutoIndexStatementService implements CreerIndexAutoReleveServicePort
{   
  @SuppressWarnings("unchecked")
  @Override
  public Response<IndexAutoReleveResponseType> creerIndexAutoReleveAsync(IndexAutoReleveRequestType indexAutoReleveRequestType)
  {
    Response<IndexAutoReleveResponseType> response = null;
    try
    {
      response = Response.class.newInstance();
    }
    catch (InstantiationException | IllegalAccessException e)
    {
      e.printStackTrace();
    }
    return response;
  }

  @SuppressWarnings("unchecked")
  @Override
  public Future<?> creerIndexAutoReleveAsync(IndexAutoReleveRequestType indexAutoReleveRequestType,
      AsyncHandler<IndexAutoReleveResponseType> asyncHandler)
  {
    Future<IndexAutoReleveResponseType> response = null;
    try
    {
      response = Future.class.newInstance();
    }
    catch (InstantiationException | IllegalAccessException e)
    {
      e.printStackTrace();
    }
    return response;
  }


  @Override
  public IndexAutoReleveResponseType creerIndexAutoReleve(@WebParam(name = "indexAutoReleveRequestType", targetNamespace = "com.grdf.poc.IndexAutoReleveRequest-v1.2", partName = "parameters")IndexAutoReleveRequestType indexAutoReleveRequestType)
  {
    IndexAutoReleveResponseType indexAutoReleveResponseType = new IndexAutoReleveResponseType();
    indexAutoReleveResponseType.setIndexAutoReleve(indexAutoReleveRequestType.getIndexAutoReleve());
    indexAutoReleveResponseType.setResultat(ResultType.OK);
    return indexAutoReleveResponseType;
  }
}
