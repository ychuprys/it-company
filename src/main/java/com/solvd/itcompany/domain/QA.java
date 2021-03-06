package com.solvd.itcompany.domain;

import java.math.BigDecimal;

public class QA extends Specialist {

    private BigDecimal salaryPerMonth;

    public QA(String id, String firstName, boolean work, BigDecimal salaryPerMonth) {
        super(id, firstName, work, "QA department");
        this.salaryPerMonth = salaryPerMonth;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (this == o) return true;
        if (getClass() != o.getClass()) return false;

        QA other = (QA) o;

        if (this.getSalaryPerMonth() != null) {
            return getSalaryPerMonth().equals(other.getSalaryPerMonth());
        } else {
            if (other.getSalaryPerMonth() != null) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int result = getFirstName() == null ? 0 : getFirstName().hashCode();
        result = 31 * result;
        return result;
    }

    @Override
    public String toString() {
        return "Name: " + getFirstName() + ", Identical ID: " + this.getId();
    }

    public BigDecimal getSalaryPerMonth() {
        return salaryPerMonth;
    }

    public void setSalaryPerMonth(BigDecimal salaryPerMonth) {
        this.salaryPerMonth = salaryPerMonth;
    }

}
