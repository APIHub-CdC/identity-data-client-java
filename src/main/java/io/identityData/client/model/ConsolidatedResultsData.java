package io.identityData.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;



public class ConsolidatedResultsData {
  @SerializedName("results")
  private List<SourceResult> results = new ArrayList<SourceResult>();
  public ConsolidatedResultsData results(List<SourceResult> results) {
    this.results = results;
    return this;
  }
  public ConsolidatedResultsData addResultsItem(SourceResult resultsItem) {
    this.results.add(resultsItem);
    return this;
  }
   
  public List<SourceResult> getResults() {
    return results;
  }
  public void setResults(List<SourceResult> results) {
    this.results = results;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsolidatedResultsData consolidatedResultsData = (ConsolidatedResultsData) o;
    return Objects.equals(this.results, consolidatedResultsData.results);
  }
  @Override
  public int hashCode() {
    return Objects.hash(results);
  }
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsolidatedResultsData {\n");
    
    sb.append("    results: ").append(toIndentedString(results)).append("\n");
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
