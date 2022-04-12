package com.grdf.poc.auto.index.tests;

import static org.junit.Assert.*;
import java.net.*;
import java.time.*;
import java.util.concurrent.*;
import java.util.logging.Logger;
import javax.xml.datatype.*;
import org.grdf.poc.wsdl.auto.index.*;
import org.junit.*;
import com.grdf.poc.auto.index.handler.*;
import javax.xml.ws.*;

public class AutoIndexStatementTest
{
  private CreerIndexAutoReleveService creerIndexAutoReleveService;
  public static final Logger logger2 = Logger.getLogger("com.grdf.poc.auto.index.tests");

  @Before
  public void setup() throws Exception
  {
    creerIndexAutoReleveService = new CreerIndexAutoReleveService(new URL("http://localhost:7001/war/auto?WSDL"));
  }

  @Test
  public void test() throws DatatypeConfigurationException
  {
    IndexAutoReleveResponseType indexAutoReleveResponseType = creerIndexAutoReleveService
        .getCreerIndexAutoReleveServiceSOAPPort().creerIndexAutoReleve(getIndexAutoReleveRequestType());
    assertions (indexAutoReleveResponseType);
  }
  
  @Test
  public void test2() throws DatatypeConfigurationException, InterruptedException, ExecutionException
  {
    Response<IndexAutoReleveResponseType> resp = creerIndexAutoReleveService.getCreerIndexAutoReleveServiceSOAPPort().creerIndexAutoReleveAsync(getIndexAutoReleveRequestType());
    while (!resp.isDone())
    {
      logger2.info("*** Waiting ...");
      Thread.sleep(5000);
      Thread.yield();
    }
    assertions (resp.get());
  }
  
  @Test
  public void test3() throws DatatypeConfigurationException, InterruptedException
  {
    AutoIndexHandler handler = new AutoIndexHandler();
    Future<?> task = creerIndexAutoReleveService.getCreerIndexAutoReleveServiceSOAPPort().creerIndexAutoReleveAsync(getIndexAutoReleveRequestType(), handler);
    while (!task.isDone())
    {
      logger2.info("*** Waiting ...");
      Thread.sleep(5000);
      Thread.yield();
    }
    assertions(handler.getIndexAutoReleveResponseType());
  }

  private IndexAutoReleveRequestType getIndexAutoReleveRequestType() throws DatatypeConfigurationException
  {
    IndexAutoReleveRequestType indexAutoReleveRequestType = new IndexAutoReleveRequestType();
    indexAutoReleveRequestType.setIndexAutoReleve(getIndexAutoReleve());
    return indexAutoReleveRequestType;
  }
  
  private IndexAutoReleve getIndexAutoReleve() throws DatatypeConfigurationException
  {
    IndexAutoReleve indexAutoReleve = new IndexAutoReleve();
    indexAutoReleve.setIdExterneDemande("Id externe demande");
    indexAutoReleve.setDateDemande(DatatypeFactory.newInstance().newXMLGregorianCalendar(LocalDate.now().toString()));
    indexAutoReleve.setPCE(getPCELocal());
    indexAutoReleve.setSourceAutoReleve(TsourceAutoReleve.OMEGA);
    indexAutoReleve.setOrigineAutoReleve(TorigineAutoReleve.CLIENT_FINAL);
    return indexAutoReleve;    
  }

  private PCETypeLocal getPCELocal() throws DatatypeConfigurationException
  {
    PCETypeLocal pceTypeLocal = new PCETypeLocal();
    pceTypeLocal.setClePCE("cle PCE");
    pceTypeLocal.setCompteur(getCompteurTypeLocal());
    return pceTypeLocal;
  }

  private CompteurTypeLocal getCompteurTypeLocal() throws DatatypeConfigurationException
  {
    CompteurTypeLocal compteurTypeLocal = new CompteurTypeLocal();
    compteurTypeLocal.setCleCompteur("cle compteur");
    compteurTypeLocal.setIndex(getTindex());
    return compteurTypeLocal;
  }

  private TIndex getTindex() throws DatatypeConfigurationException
  {
    TIndex tindex = new TIndex();
    tindex.setCodeModeAcquisitionIndex(TcodeModeAcquisitionIndex.ACR);
    tindex.setCodeQualificationIndex(TcodeQualificationIndex.COR);
    tindex.setCodeTypeIndex(TcodeTypeIndex.ANN);
    tindex.setHorodateIndex(DatatypeFactory.newInstance().newXMLGregorianCalendar(LocalDate.now().toString()));
    tindex.setValeurIndex(10);
    return tindex;
  }
  
  private void assertions(IndexAutoReleveResponseType indexAutoReleveResponseType)
  {
    assertNotNull(indexAutoReleveResponseType);
    assertNotNull(indexAutoReleveResponseType.getIndexAutoReleve());
    assertNotNull(indexAutoReleveResponseType.getIndexAutoReleve().getIdExterneDemande());
    assertEquals("Id externe demande", indexAutoReleveResponseType.getIndexAutoReleve().getIdExterneDemande());
    assertNotNull(indexAutoReleveResponseType.getIndexAutoReleve().getOrigineAutoReleve());
    assertEquals(TorigineAutoReleve.CLIENT_FINAL,
        indexAutoReleveResponseType.getIndexAutoReleve().getOrigineAutoReleve());
  }
}
