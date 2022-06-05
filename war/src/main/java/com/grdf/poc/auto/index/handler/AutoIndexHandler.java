package com.grdf.poc.auto.index.handler;

import org.grdf.poc.wsdl.auto.index.*;

import javax.xml.ws.*;

public class AutoIndexHandler implements AsyncHandler<IndexAutoReleveResponseType>
{
  private IndexAutoReleveResponseType indexAutoReleveResponseType;

  @Override
  public void handleResponse(Response<IndexAutoReleveResponseType> resp)
  {
    synchronized (this)
    {
      try
      {
        indexAutoReleveResponseType = resp.get();
        this.notifyAll();
      }
      catch (Exception ex)
      {
        ex.printStackTrace();
      }
    }
  }

  public IndexAutoReleveResponseType getIndexAutoReleveResponseType()
  {
    return indexAutoReleveResponseType;
  }
}
