package com.grdf.poc.auto.index.handler;

import javax.xml.ws.*;
import org.grdf.poc.wsdl.auto.index.*;

public class AutoIndexHandler implements AsyncHandler<IndexAutoReleveResponseType>
{
  private IndexAutoReleveResponseType indexAutoReleveResponseType;

  @Override
  public void handleResponse(Response<IndexAutoReleveResponseType> resp)
  {
    try
    {
      indexAutoReleveResponseType = resp.get();
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
  }

  public IndexAutoReleveResponseType getIndexAutoReleveResponseType()
  {
    return indexAutoReleveResponseType;
  }
}
