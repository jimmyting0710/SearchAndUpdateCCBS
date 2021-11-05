package com.example.demo.thisentity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "testcase")
public class TestCase {

	private String SPRINT;
	private String TESTCASE;
	private String SEQ;
	private String SYSTEMTYPE;
	private String CHTOWNER;
	private String JOBNAME;
	private String AD;
	private String ADDESC;
	private String JCL;
	private String JCLDESC;
	private String STEP_NO;
	private String STEP_NAME;
	private String MBR_RUN;
	private String JCLEXEC;
	private String JCLPROGRAM;
	private String OPEN_MODE;
	private String DD;
	private String DSN;
	private String DISP;
	private String IMS_GET;
	private String IMS_INSERT;
	private String IMS_UPDATE;
	private String IMS_DELETE;
	private String DB2_INCLUDE;
	private String DB2_SELECT;
	private String DB2_INSERT;
	private String DB2_UPDATE;
	private String DB2_DELETE;
	private String DELETE_REMARK;
	private String DELETE_REASON_EXEC_DD;
	private String DELETE_REASON_PROGRAM;
	private String DELETE_REASON_DSN;
	private String DELETE_REASON_DD;
	private String JID;
	@Id
	private String TID;
	private String TEST_TYPE;
	private String TESTER_ID;
	private String STATUS;

	public String getTESTER_ID() {
		return TESTER_ID;
	}

	public void setTESTER_ID(String tESTER_ID) {
		TESTER_ID = tESTER_ID;
	}

	public String getSTATUS() {
		return STATUS;
	}

	public void setSTATUS(String sTATUS) {
		STATUS = sTATUS;
	}

	public String getSPRINT() {
		return SPRINT;
	}

	public void setSPRINT(String sPRINT) {
		SPRINT = sPRINT;
	}

	public String getTESTCASE() {
		return TESTCASE;
	}

	public void setTESTCASE(String tESTCASE) {
		TESTCASE = tESTCASE;
	}

	public String getSEQ() {
		return SEQ;
	}

	public void setSEQ(String sEQ) {
		SEQ = sEQ;
	}

	public String getSYSTEMTYPE() {
		return SYSTEMTYPE;
	}

	public void setSYSTEMTYPE(String sYSTEMTYPE) {
		SYSTEMTYPE = sYSTEMTYPE;
	}

	public String getCHTOWNER() {
		return CHTOWNER;
	}

	public void setCHTOWNER(String cHTOWNER) {
		CHTOWNER = cHTOWNER;
	}

	public String getJOBNAME() {
		return JOBNAME;
	}

	public void setJOBNAME(String jOBNAME) {
		JOBNAME = jOBNAME;
	}

	public String getAD() {
		return AD;
	}

	public void setAD(String aD) {
		AD = aD;
	}

	public String getADDESC() {
		return ADDESC;
	}

	public void setADDESC(String aDDESC) {
		ADDESC = aDDESC;
	}

	public String getJCL() {
		return JCL;
	}

	public void setJCL(String jCL) {
		JCL = jCL;
	}

	public String getJCLDESC() {
		return JCLDESC;
	}

	public void setJCLDESC(String jCLDESC) {
		JCLDESC = jCLDESC;
	}

	public String getSTEP_NO() {
		return STEP_NO;
	}

	public void setSTEP_NO(String sTEP_NO) {
		STEP_NO = sTEP_NO;
	}

	public String getSTEP_NAME() {
		return STEP_NAME;
	}

	public void setSTEP_NAME(String sTEP_NAME) {
		STEP_NAME = sTEP_NAME;
	}

	public String getMBR_RUN() {
		return MBR_RUN;
	}

	public void setMBR_RUN(String mBR_RUN) {
		MBR_RUN = mBR_RUN;
	}

	public String getJCLEXEC() {
		return JCLEXEC;
	}

	public void setJCLEXEC(String jCLEXEC) {
		JCLEXEC = jCLEXEC;
	}

	public String getJCLPROGRAM() {
		return JCLPROGRAM;
	}

	public void setJCLPROGRAM(String jCLPROGRAM) {
		JCLPROGRAM = jCLPROGRAM;
	}

	public String getOPEN_MODE() {
		return OPEN_MODE;
	}

	public void setOPEN_MODE(String oPEN_MODE) {
		OPEN_MODE = oPEN_MODE;
	}

	public String getDD() {
		return DD;
	}

	public void setDD(String dD) {
		DD = dD;
	}

	public String getDSN() {
		return DSN;
	}

	public void setDSN(String dSN) {
		DSN = dSN;
	}

	public String getDISP() {
		return DISP;
	}

	public void setDISP(String dISP) {
		DISP = dISP;
	}

	public String getIMS_GET() {
		return IMS_GET;
	}

	public void setIMS_GET(String iMS_GET) {
		IMS_GET = iMS_GET;
	}

	public String getIMS_INSERT() {
		return IMS_INSERT;
	}

	public void setIMS_INSERT(String iMS_INSERT) {
		IMS_INSERT = iMS_INSERT;
	}

	public String getIMS_UPDATE() {
		return IMS_UPDATE;
	}

	public void setIMS_UPDATE(String iMS_UPDATE) {
		IMS_UPDATE = iMS_UPDATE;
	}

	public String getIMS_DELETE() {
		return IMS_DELETE;
	}

	public void setIMS_DELETE(String iMS_DELETE) {
		IMS_DELETE = iMS_DELETE;
	}

	public String getDB2_INCLUDE() {
		return DB2_INCLUDE;
	}

	public void setDB2_INCLUDE(String dB2_INCLUDE) {
		DB2_INCLUDE = dB2_INCLUDE;
	}

	public String getDB2_SELECT() {
		return DB2_SELECT;
	}

	public void setDB2_SELECT(String dB2_SELECT) {
		DB2_SELECT = dB2_SELECT;
	}

	public String getDB2_INSERT() {
		return DB2_INSERT;
	}

	public void setDB2_INSERT(String dB2_INSERT) {
		DB2_INSERT = dB2_INSERT;
	}

	public String getDB2_UPDATE() {
		return DB2_UPDATE;
	}

	public void setDB2_UPDATE(String dB2_UPDATE) {
		DB2_UPDATE = dB2_UPDATE;
	}

	public String getDB2_DELETE() {
		return DB2_DELETE;
	}

	public void setDB2_DELETE(String dB2_DELETE) {
		DB2_DELETE = dB2_DELETE;
	}

	public String getDELETE_REMARK() {
		return DELETE_REMARK;
	}

	public void setDELETE_REMARK(String dELETE_REMARK) {
		DELETE_REMARK = dELETE_REMARK;
	}

	public String getDELETE_REASON_EXEC_DD() {
		return DELETE_REASON_EXEC_DD;
	}

	public void setDELETE_REASON_EXEC_DD(String dELETE_REASON_EXEC_DD) {
		DELETE_REASON_EXEC_DD = dELETE_REASON_EXEC_DD;
	}

	public String getDELETE_REASON_PROGRAM() {
		return DELETE_REASON_PROGRAM;
	}

	public void setDELETE_REASON_PROGRAM(String dELETE_REASON_PROGRAM) {
		DELETE_REASON_PROGRAM = dELETE_REASON_PROGRAM;
	}

	public String getDELETE_REASON_DSN() {
		return DELETE_REASON_DSN;
	}

	public void setDELETE_REASON_DSN(String dELETE_REASON_DSN) {
		DELETE_REASON_DSN = dELETE_REASON_DSN;
	}

	public String getDELETE_REASON_DD() {
		return DELETE_REASON_DD;
	}

	public void setDELETE_REASON_DD(String dELETE_REASON_DD) {
		DELETE_REASON_DD = dELETE_REASON_DD;
	}

	public String getJID() {
		return JID;
	}

	public void setJID(String jID) {
		JID = jID;
	}

	public String getTID() {
		return TID;
	}

	public void setTID(String tID) {
		TID = tID;
	}

	public String getTEST_TYPE() {
		return TEST_TYPE;
	}

	public void setTEST_TYPE(String tEST_TYPE) {
		TEST_TYPE = tEST_TYPE;
	}

}
