package com.openapi.banking.model;

import java.io.Serializable;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;

/**
 * Account
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-30T13:23:07.394Z")

@Entity
@Data

public class Account implements Serializable {

  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @JsonProperty("id")
  private String id ;

  @JsonProperty("bankName")
  private String bankName;

  @JsonProperty("currentBalance")
  private Integer currentBalance;

  @JsonProperty("accountNumber")
  @NotEmpty(message = "AccountNumber cannot be empty")
  private String accountNumber;

  transient
  @JsonProperty("status")
  private String status;

  public Account() {}

  public Account(String id, String bankName, Integer currentBalance, String status) {
    setId(id);
    setBankName(bankName);
    setCurrentBalance(currentBalance);
    setAccountNumber(status);
  }

  public Account id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Account bankName(String bankName) {
    this.bankName = bankName;
    return this;
  }

  /**
   * Get bankName
   * @return bankName
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getBankName() {
    return bankName;
  }

  public void setBankName(String bankName) {
    this.bankName = bankName;
  }

  public Account currentBalance(Integer currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }

  /**
   * Get currentBalance
   * @return currentBalance
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public Integer getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(Integer currentBalance) {
    this.currentBalance = currentBalance;
  }

  public Account accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.id, account.id) &&
            Objects.equals(this.bankName, account.bankName) &&
            Objects.equals(this.currentBalance, account.currentBalance) &&
            Objects.equals(this.accountNumber, account.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, bankName, currentBalance, accountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    bankName: ").append(toIndentedString(bankName)).append("\n");
    sb.append("    currentBalance: ").append(toIndentedString(currentBalance)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

