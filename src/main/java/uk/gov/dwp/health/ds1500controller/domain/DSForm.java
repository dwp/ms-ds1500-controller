package uk.gov.dwp.health.ds1500controller.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonView;

import java.util.Arrays;

@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public class DSForm {

  @JsonView({DSForm.class, Views.DsFeeForm.class})
  private String surname;

  @JsonView({DSForm.class, Views.DsFeeForm.class})
  private String otherNames;

  @JsonView({DSForm.class, Views.DsFeeForm.class})
  private String dateOfBirth;

  @JsonView({DSForm.class, Views.DsFeeForm.class})
  private String nINumber;

  @JsonView({DSForm.class, Views.DsFeeForm.class})
  private String[] address;

  @JsonView({DSForm.class, Views.DsFeeForm.class})
  private String postcode;

  @JsonView(DSForm.class)
  private String diagnosis;

  @JsonView(DSForm.class)
  private String otherDiagnosis;

  @JsonView(DSForm.class)
  private String diagnosisAware;

  @JsonView(DSForm.class)
  private String patientAware;

  @JsonView(DSForm.class)
  private String diagnosisDate;

  @JsonView(DSForm.class)
  private String specialDate;

  @JsonView(DSForm.class)
  private String clinicalFeatures;

  @JsonView(DSForm.class)
  private String treatment;

  @JsonView(DSForm.class)
  private String declaration;

  @JsonView(DSForm.class)
  private String other;

  @JsonView({DSForm.class, Views.DsFeeForm.class})
  private String declarerName;

  @JsonView(DSForm.class)
  private String declarerPhoneNumber;

  @JsonView({DSForm.class, Views.DsFeeForm.class})
  private String declarerAddress;

  @JsonView({DSForm.class, Views.DsFeeForm.class})
  private String declarerPostcode;

  @JsonView({DSForm.class, Views.DsFeeForm.class})
  private String declarationDate;

  @JsonView({DSForm.class, Views.DsFeeForm.class})
  private int gmcNumber;

  public String getSurname() {
    return surname;
  }

  public String getOtherNames() {
    return otherNames;
  }

  public String getDateOfBirth() {
    return dateOfBirth;
  }

  public String getnINumber() {
    return nINumber;
  }

  public String[] getAddress() {
    return address == null ? null : Arrays.copyOf(address, address.length);
  }

  public String getPostcode() {
    return postcode;
  }

  public String getDiagnosis() {
    return diagnosis;
  }

  public String getOtherDiagnosis() {
    return otherDiagnosis;
  }

  public String getDiagnosisDate() {
    return diagnosisDate;
  }

  public String getSpecialDate() {
    return specialDate;
  }

  public String getClinicalFeatures() {
    return clinicalFeatures;
  }

  public String getTreatment() {
    return treatment;
  }

  public String getOther() {
    return other;
  }

  public String getDeclarerName() {
    return declarerName;
  }

  public String getDeclarerPhoneNumber() {
    return declarerPhoneNumber;
  }

  public String getDeclarerAddress() {
    return declarerAddress;
  }

  public String getDeclarerPostcode() {
    return declarerPostcode;
  }

  public String getDeclarationDate() {
    return declarationDate;
  }

  public String getDiagnosisAware() {
    return diagnosisAware;
  }

  public String getPatientAware() {
    return patientAware;
  }

  public String getDeclaration() {
    return declaration;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public void setOtherNames(String otherNames) {
    this.otherNames = otherNames;
  }

  public void setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
  }

  public void setnINumber(String nINumber) {
    this.nINumber = nINumber;
  }

  public void setAddress(String[] address) {
    this.address = address == null ? null : Arrays.copyOf(address, address.length);
  }

  public void setPostcode(String postcode) {
    this.postcode = postcode;
  }

  public void setDiagnosis(String diagnosis) {
    this.diagnosis = diagnosis;
  }

  public void setOtherDiagnosis(String otherDiagnosis) {
    this.otherDiagnosis = otherDiagnosis;
  }

  public void setDiagnosisAware(String diagnosisAware) {
    this.diagnosisAware = diagnosisAware;
  }

  public void setPatientAware(String patientAware) {
    this.patientAware = patientAware;
  }

  public void setDiagnosisDate(String diagnosisDate) {
    this.diagnosisDate = diagnosisDate;
  }

  public void setSpecialDate(String specialDate) {
    this.specialDate = specialDate;
  }

  public void setClinicalFeatures(String clinicalFeatures) {
    this.clinicalFeatures = clinicalFeatures;
  }

  public void setTreatment(String treatment) {
    this.treatment = treatment;
  }

  public void setDeclaration(String declaration) {
    this.declaration = declaration;
  }

  public void setOther(String other) {
    this.other = other;
  }

  public void setDeclarerName(String declarerName) {
    this.declarerName = declarerName;
  }

  public void setDeclarerPhoneNumber(String declarerPhoneNumber) {
    this.declarerPhoneNumber = declarerPhoneNumber;
  }

  public void setDeclarerAddress(String declarerAddress) {
    this.declarerAddress = declarerAddress;
  }

  public void setDeclarerPostcode(String declarerPostcode) {
    this.declarerPostcode = declarerPostcode;
  }

  public void setDeclarationDate(String declarationDate) {
    this.declarationDate = declarationDate;
  }

  public int getGmcNumber() {
    return gmcNumber;
  }

  public void setGmcNumber(int gmcNumber) {
    this.gmcNumber = gmcNumber;
  }
}
