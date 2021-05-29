package com.openapi.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Account
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-29T18:26:03.564+05:30")

@Entity
public class Account   {
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("Transaction")
  @OneToOne(cascade = CascadeType.ALL)
  private Transaction transaction = null;

  @JsonProperty("bankName")
  private String bankName = null;

  @JsonProperty("currentBalance")
  private String currentBalance = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

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

  public Account transaction(Transaction transaction) {
    this.transaction = transaction;
    return this;
  }

  /**
   * Get transaction
   * @return transaction
   **/
  @ApiModelProperty(value = "")

  @Valid

  public Transaction getTransaction() {
    return transaction;
  }

  public void setTransaction(Transaction transaction) {
    this.transaction = transaction;
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

  public Account currentBalance(String currentBalance) {
    this.currentBalance = currentBalance;
    return this;
  }

  /**
   * Get currentBalance
   * @return currentBalance
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCurrentBalance() {
    return currentBalance;
  }

  public void setCurrentBalance(String currentBalance) {
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
            Objects.equals(this.transaction, account.transaction) &&
            Objects.equals(this.bankName, account.bankName) &&
            Objects.equals(this.currentBalance, account.currentBalance) &&
            Objects.equals(this.accountNumber, account.accountNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transaction, bankName, currentBalance, accountNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transaction: ").append(toIndentedString(transaction)).append("\n");
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

