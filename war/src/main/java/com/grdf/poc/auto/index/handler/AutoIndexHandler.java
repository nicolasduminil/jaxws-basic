package com.grdf.poc.auto.index.handler;

import javax.xml.ws.*;
import org.apache.logging.log4j.*;
import org.grdf.poc.wsdl.auto.index.*;

public class AutoIndexHandler implements AsyncHandler<IndexAutoReleveResponseType>
{
  private static Logger logger = LogManager.getLogger(AutoIndexHandler.class);
  private IndexAutoReleveResponseType indexAutoReleveResponseType;

  @Override
  public void handleResponse(Response<IndexAutoReleveResponseType> resp)
  {
    logger.info ("*** AutoIndexHandler.handleResponse: Executing callback handler");
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
