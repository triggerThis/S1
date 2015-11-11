package com.huiju.typePojo;

/**
 * common field of entity
 *
 */
public class PojoBase{
    private Integer dTypeInt;
    private String  dTypeString;
    private String  dTypeDate;
    private String  dTypeImage;
    private String  dTypeBin;
    private String  dTypeFloat;
    
    private String  dbId;
    private String  dbSequence;
    private String  dbName;
    private String  dbText;
    private String  dbFkInt;
    private String  dbFkSequence;
    private String  dbFkString;
    
    private String  busiName;
    private String  busiValue;
    private String  busiBtime;
    private String  busiEtime;
    
    public Integer getdTypeInt() {
		return dTypeInt;
	}
	public void setdTypeInt(Integer dTypeInt) {
		this.dTypeInt = dTypeInt;
	}
	public String getdTypeString() {
		return dTypeString;
	}
	public void setdTypeString(String dTypeString) {
		this.dTypeString = dTypeString;
	}
	public String getdTypeDate() {
		return dTypeDate;
	}
	public void setdTypeDate(String dTypeDate) {
		this.dTypeDate = dTypeDate;
	}
	public String getdTypeImage() {
		return dTypeImage;
	}
	public void setdTypeImage(String dTypeImage) {
		this.dTypeImage = dTypeImage;
	}
	public String getdTypeBin() {
		return dTypeBin;
	}
	public void setdTypeBin(String dTypeBin) {
		this.dTypeBin = dTypeBin;
	}
	public String getdTypeFloat() {
		return dTypeFloat;
	}
	public void setdTypeFloat(String dTypeFloat) {
		this.dTypeFloat = dTypeFloat;
	}
	public String getDbId() {
		return dbId;
	}
	public void setDbId(String dbId) {
		this.dbId = dbId;
	}
	public String getDbSequence() {
		return dbSequence;
	}
	public void setDbSequence(String dbSequence) {
		this.dbSequence = dbSequence;
	}
	public String getDbName() {
		return dbName;
	}
	public void setDbName(String dbName) {
		this.dbName = dbName;
	}
	public String getDbText() {
		return dbText;
	}
	public void setDbText(String dbText) {
		this.dbText = dbText;
	}
	public String getDbFkInt() {
		return dbFkInt;
	}
	public void setDbFkInt(String dbFkInt) {
		this.dbFkInt = dbFkInt;
	}
	public String getDbFkSequence() {
		return dbFkSequence;
	}
	public void setDbFkSequence(String dbFkSequence) {
		this.dbFkSequence = dbFkSequence;
	}
	public String getDbFkString() {
		return dbFkString;
	}
	public void setDbFkString(String dbFkString) {
		this.dbFkString = dbFkString;
	}
	public String getBusiName() {
		return busiName;
	}
	public void setBusiName(String busiName) {
		this.busiName = busiName;
	}
	public String getBusiValue() {
		return busiValue;
	}
	public void setBusiValue(String busiValue) {
		this.busiValue = busiValue;
	}
	public String getBusiBtime() {
		return busiBtime;
	}
	public void setBusiBtime(String busiBtime) {
		this.busiBtime = busiBtime;
	}
	public String getBusiEtime() {
		return busiEtime;
	}
	public void setBusiEtime(String busiEtime) {
		this.busiEtime = busiEtime;
	}
	public String getsLog() {
		return sLog;
	}
	public void setsLog(String sLog) {
		this.sLog = sLog;
	}
	public String getsTransaction() {
		return sTransaction;
	}
	public void setsTransaction(String sTransaction) {
		this.sTransaction = sTransaction;
	}
	private String  sLog;
    private String  sTransaction;

}