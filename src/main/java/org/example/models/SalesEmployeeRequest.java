package org.example.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class SalesEmployeeRequest {
    private int salesEmployeeId;
    private int employeeId;
    private BigDecimal commissionRate;

    public int getSalesEmployeeId() {
        return salesEmployeeId;
    }

    public void setSalesEmployeeId(final int salesEmployeeId) {
        this.salesEmployeeId = salesEmployeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(final int employeeId) {
        this.employeeId = employeeId;
    }

    public BigDecimal getCommissionRate() {
        return commissionRate;
    }

    public void setCommissionRate(final BigDecimal commissionRate) {
        this.commissionRate = commissionRate;
    }

    @JsonCreator SalesEmployeeRequest(
            @JsonProperty("SalesID") final int salesEmployeeId,
            @JsonProperty("EmployeeID") final int employeeId,
            @JsonProperty("Commission") final BigDecimal commissionRate) {
                this.salesEmployeeId = salesEmployeeId;
                this.employeeId = employeeId;
                this.commissionRate = commissionRate;
    }
}
