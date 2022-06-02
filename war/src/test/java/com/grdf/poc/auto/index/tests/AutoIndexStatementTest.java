package com.grdf.poc.auto.index.tests;

import org.grdf.poc.wsdl.auto.index.*;
import org.junit.*;

import javax.xml.datatype.*;
import java.net.*;
import java.time.*;

import static org.junit.Assert.*;

public class AutoIndexStatementTest
{
  private CreerIndexAutoReleveService creerIndexAutoReleveService;

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
    assertNotNull(indexAutoReleveResponseType);
    assertNotNull(indexAutoReleveResponseType.getIndexAutoReleve());
    assertNotNull(indexAutoReleveResponseType.getIndexAutoReleve().getIdExterneDemande());
    assertNotNull(indexAutoReleveResponseType.getIndexAutoReleve().getOrigineAutoReleve());
    assertEquals(TorigineAutoReleve.CLIENT_FINAL,
        indexAutoReleveResponseType.getIndexAutoReleve().getOrigineAutoReleve());
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
    indexAutoReleve.setIdExterneDemande(">160M3/h");
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
}
