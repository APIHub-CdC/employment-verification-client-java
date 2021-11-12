package com.cdc.apihub.mx.employmentVerification.client.model;

import java.util.Objects;


import com.google.gson.annotations.SerializedName;



public class WeeksContributed   {
  

	@SerializedName(value = "totalContributedWeeks", alternate = { "total_contributed_weeks" ,"totalContributedWeeks"})
  private Integer totalContributedWeeks = null;

  
	@SerializedName(value = "discountedWeeks", alternate = { "discounted_weeks" ,"discountedWeeks"})
  private Integer discountedWeeks = null;

	
	@SerializedName(value = "reinstatedWeeks", alternate = { "reinstated_weeks" ,"reinstatedWeeks"})
  private Integer reinstatedWeeks = null;

  public WeeksContributed totalContributedWeeks(Integer totalContributedWeeks) {
    this.totalContributedWeeks = totalContributedWeeks;
    return this;
  }


  public Integer getTotalContributedWeeks() {
    return totalContributedWeeks;
  }

  public void setTotalContributedWeeks(Integer totalContributedWeeks) {
    this.totalContributedWeeks = totalContributedWeeks;
  }

  public WeeksContributed discountedWeeks(Integer discountedWeeks) {
    this.discountedWeeks = discountedWeeks;
    return this;
  }



  public Integer getDiscountedWeeks() {
    return discountedWeeks;
  }

  public void setDiscountedWeeks(Integer discountedWeeks) {
    this.discountedWeeks = discountedWeeks;
  }

  public WeeksContributed reinstatedWeeks(Integer reinstatedWeeks) {
    this.reinstatedWeeks = reinstatedWeeks;
    return this;
  }


  public Integer getReinstatedWeeks() {
    return reinstatedWeeks;
  }

  public void setReinstatedWeeks(Integer reinstatedWeeks) {
    this.reinstatedWeeks = reinstatedWeeks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WeeksContributed weeksContributed = (WeeksContributed) o;
    return Objects.equals(this.totalContributedWeeks, weeksContributed.totalContributedWeeks) &&
        Objects.equals(this.discountedWeeks, weeksContributed.discountedWeeks) &&
        Objects.equals(this.reinstatedWeeks, weeksContributed.reinstatedWeeks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalContributedWeeks, discountedWeeks, reinstatedWeeks);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WeeksContributed {\n");
    
    sb.append("    totalContributedWeeks: ").append(toIndentedString(totalContributedWeeks)).append("\n");
    sb.append("    discountedWeeks: ").append(toIndentedString(discountedWeeks)).append("\n");
    sb.append("    reinstatedWeeks: ").append(toIndentedString(reinstatedWeeks)).append("\n");
    sb.append("}");
    return sb.toString();
  }


  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

