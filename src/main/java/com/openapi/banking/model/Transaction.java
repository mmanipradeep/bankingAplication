package com.openapi.banking.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.*;

/**
 * Transaction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2021-05-29T18:26:03.564+05:30")

@Entity
public class Transaction   {
  @Id
  @GeneratedValue(generator = "uuid")
  @GenericGenerator(name = "uuid", strategy = "uuid2")
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("accountNumber")
  private String accountNumber = null;

  @JsonProperty("amount")
  private String amount = null;

  @JsonProperty("transactionDate")
  private String transactionDate = null;

  @JsonProperty("creditDebitFlag")
  private String creditDebitFlag = null;

  public Transaction id(String id) {
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

  public Transaction name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   **/
  @ApiModelProperty(value = "")


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Transaction accountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
    return this;
  }

  /**
   * Get accountNumber
   * @return accountNumber
   **/
  @ApiModelProperty(value = "")


  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public Transaction amount(String amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public Transaction transactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
    return this;
  }

  /**
   * Get transactionDate
   * @return transactionDate
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getTransactionDate() {
    return transactionDate;
  }

  public void setTransactionDate(String transactionDate) {
    this.transactionDate = transactionDate;
  }

  public Transaction creditDebitFlag(String creditDebitFlag) {
    this.creditDebitFlag = creditDebitFlag;
    return this;
  }

  /**
   * Get creditDebitFlag
   * @return creditDebitFlag
   **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getCreditDebitFlag() {
    return creditDebitFlag;
  }

  public void setCreditDebitFlag(String creditDebitFlag) {
    this.creditDebitFlag = creditDebitFlag;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.id, transaction.id) &&
            Objects.equals(this.name, transaction.name) &&
            Objects.equals(this.accountNumber, transaction.accountNumber) &&
            Objects.equals(this.amount, transaction.amount) &&
            Objects.equals(this.transactionDate, transaction.transactionDate) &&
            Objects.equals(this.creditDebitFlag, transaction.creditDebitFlag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, accountNumber, amount, transactionDate, creditDebitFlag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");

    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    accountNumber: ").append(toIndentedString(accountNumber)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transactionDate: ").append(toIndentedString(transactionDate)).append("\n");
    sb.append("    creditDebitFlag: ").append(toIndentedString(creditDebitFlag)).append("\n");
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

