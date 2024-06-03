package com.example.demo.models;

import java.math.BigInteger;
import java.time.LocalDate;

public class EgrZagsForm {

    private String requestId;
    private BigInteger colDoc;
    private int AGSType;
    private int codeOsn;
    private String orgRaspDoc;
    private String documentId;
    private int actNumber;
    private LocalDate actCreatedDate;
    private String ZAGS;
    private String ZAGSCode;
    private String SNILS;
    private String LastName;
    private String FirstName;
    private String Patronymic;
    private LocalDate birthday;
    private int docCode;
    private int docSeries;
    private int docNumber;
    private LocalDate docDate;
    private String orgName;
    private int orgCode;
    private String subjectName;

    public EgrZagsForm() {
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public BigInteger getColDoc() {
        return colDoc;
    }

    public void setColDoc(BigInteger colDoc) {
        this.colDoc = colDoc;
    }

    public int getAGSType() {
        return AGSType;
    }

    public void setAGSType(int AGSType) {
        this.AGSType = AGSType;
    }

    public int getCodeOsn() {
        return codeOsn;
    }

    public void setCodeOsn(int codeOsn) {
        this.codeOsn = codeOsn;
    }

    public String getOrgRaspDoc() {
        return orgRaspDoc;
    }

    public void setOrgRaspDoc(String orgRaspDoc) {
        this.orgRaspDoc = orgRaspDoc;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public int getActNumber() {
        return actNumber;
    }

    public void setActNumber(int actNumber) {
        this.actNumber = actNumber;
    }

    public LocalDate getActCreatedDate() {
        return actCreatedDate;
    }

    public void setActCreatedDate(LocalDate actCreatedDate) {
        this.actCreatedDate = actCreatedDate;
    }

    public String getZAGS() {
        return ZAGS;
    }

    public void setZAGS(String ZAGS) {
        this.ZAGS = ZAGS;
    }

    public String getZAGSCode() {
        return ZAGSCode;
    }

    public void setZAGSCode(String ZAGSCode) {
        this.ZAGSCode = ZAGSCode;
    }

    public String getSNILS() {
        return SNILS;
    }

    public void setSNILS(String SNILS) {
        this.SNILS = SNILS;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getPatronymic() {
        return Patronymic;
    }

    public void setPatronymic(String patronymic) {
        Patronymic = patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public int getDocCode() {
        return docCode;
    }

    public void setDocCode(int docCode) {
        this.docCode = docCode;
    }

    public int getDocSeries() {
        return docSeries;
    }

    public void setDocSeries(int docSeries) {
        this.docSeries = docSeries;
    }

    public int getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(int docNumber) {
        this.docNumber = docNumber;
    }

    public LocalDate getDocDate() {
        return docDate;
    }

    public void setDocDate(LocalDate docDate) {
        this.docDate = docDate;
    }

    public String getOrgName() {
        return orgName;
    }

    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    public int getOrgCode() {
        return orgCode;
    }

    public void setOrgCode(int orgCode) {
        this.orgCode = orgCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }
}
