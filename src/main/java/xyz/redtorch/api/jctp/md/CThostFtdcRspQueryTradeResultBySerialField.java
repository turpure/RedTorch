/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package xyz.redtorch.api.jctp.md;

public class CThostFtdcRspQueryTradeResultBySerialField {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected CThostFtdcRspQueryTradeResultBySerialField(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(CThostFtdcRspQueryTradeResultBySerialField obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        jctpmdapiv6v3v11x64JNI.delete_CThostFtdcRspQueryTradeResultBySerialField(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public void setTradeCode(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeCode_set(swigCPtr, this, value);
  }

  public String getTradeCode() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeCode_get(swigCPtr, this);
  }

  public void setBankID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_BankID_set(swigCPtr, this, value);
  }

  public String getBankID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_BankID_get(swigCPtr, this);
  }

  public void setBankBranchID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_BankBranchID_set(swigCPtr, this, value);
  }

  public String getBankBranchID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_BankBranchID_get(swigCPtr, this);
  }

  public void setBrokerID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_BrokerID_set(swigCPtr, this, value);
  }

  public String getBrokerID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_BrokerID_get(swigCPtr, this);
  }

  public void setBrokerBranchID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_BrokerBranchID_set(swigCPtr, this, value);
  }

  public String getBrokerBranchID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_BrokerBranchID_get(swigCPtr, this);
  }

  public void setTradeDate(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeDate_set(swigCPtr, this, value);
  }

  public String getTradeDate() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeDate_get(swigCPtr, this);
  }

  public void setTradeTime(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeTime_set(swigCPtr, this, value);
  }

  public String getTradeTime() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeTime_get(swigCPtr, this);
  }

  public void setBankSerial(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_BankSerial_set(swigCPtr, this, value);
  }

  public String getBankSerial() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_BankSerial_get(swigCPtr, this);
  }

  public void setTradingDay(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_TradingDay_set(swigCPtr, this, value);
  }

  public String getTradingDay() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_TradingDay_get(swigCPtr, this);
  }

  public void setPlateSerial(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_PlateSerial_set(swigCPtr, this, value);
  }

  public int getPlateSerial() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_PlateSerial_get(swigCPtr, this);
  }

  public void setLastFragment(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_LastFragment_set(swigCPtr, this, value);
  }

  public char getLastFragment() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_LastFragment_get(swigCPtr, this);
  }

  public void setSessionID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_SessionID_set(swigCPtr, this, value);
  }

  public int getSessionID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_SessionID_get(swigCPtr, this);
  }

  public void setErrorID(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_ErrorID_set(swigCPtr, this, value);
  }

  public int getErrorID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_ErrorID_get(swigCPtr, this);
  }

  public void setErrorMsg(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_ErrorMsg_set(swigCPtr, this, value);
  }

  public String getErrorMsg() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_ErrorMsg_get(swigCPtr, this);
  }

  public void setReference(int value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_Reference_set(swigCPtr, this, value);
  }

  public int getReference() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_Reference_get(swigCPtr, this);
  }

  public void setRefrenceIssureType(char value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_RefrenceIssureType_set(swigCPtr, this, value);
  }

  public char getRefrenceIssureType() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_RefrenceIssureType_get(swigCPtr, this);
  }

  public void setRefrenceIssure(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_RefrenceIssure_set(swigCPtr, this, value);
  }

  public String getRefrenceIssure() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_RefrenceIssure_get(swigCPtr, this);
  }

  public void setOriginReturnCode(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_OriginReturnCode_set(swigCPtr, this, value);
  }

  public String getOriginReturnCode() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_OriginReturnCode_get(swigCPtr, this);
  }

  public void setOriginDescrInfoForReturnCode(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_OriginDescrInfoForReturnCode_set(swigCPtr, this, value);
  }

  public String getOriginDescrInfoForReturnCode() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_OriginDescrInfoForReturnCode_get(swigCPtr, this);
  }

  public void setBankAccount(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_BankAccount_set(swigCPtr, this, value);
  }

  public String getBankAccount() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_BankAccount_get(swigCPtr, this);
  }

  public void setBankPassWord(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_BankPassWord_set(swigCPtr, this, value);
  }

  public String getBankPassWord() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_BankPassWord_get(swigCPtr, this);
  }

  public void setAccountID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_AccountID_set(swigCPtr, this, value);
  }

  public String getAccountID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_AccountID_get(swigCPtr, this);
  }

  public void setPassword(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_Password_set(swigCPtr, this, value);
  }

  public String getPassword() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_Password_get(swigCPtr, this);
  }

  public void setCurrencyID(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_CurrencyID_set(swigCPtr, this, value);
  }

  public String getCurrencyID() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_CurrencyID_get(swigCPtr, this);
  }

  public void setTradeAmount(double value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeAmount_set(swigCPtr, this, value);
  }

  public double getTradeAmount() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_TradeAmount_get(swigCPtr, this);
  }

  public void setDigest(String value) {
    jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_Digest_set(swigCPtr, this, value);
  }

  public String getDigest() {
    return jctpmdapiv6v3v11x64JNI.CThostFtdcRspQueryTradeResultBySerialField_Digest_get(swigCPtr, this);
  }

  public CThostFtdcRspQueryTradeResultBySerialField() {
    this(jctpmdapiv6v3v11x64JNI.new_CThostFtdcRspQueryTradeResultBySerialField(), true);
  }

}