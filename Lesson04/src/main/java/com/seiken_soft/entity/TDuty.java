package com.seiken_soft.entity;

import java.util.Date;

public class TDuty extends TDutyKey {
    private Date dutyWorkTimeFrom;

    private Date dutyWorkTimeTo;

    public Date getDutyWorkTimeFrom() {
        return dutyWorkTimeFrom;
    }

    public void setDutyWorkTimeFrom(Date dutyWorkTimeFrom) {
        this.dutyWorkTimeFrom = dutyWorkTimeFrom;
    }

    public Date getDutyWorkTimeTo() {
        return dutyWorkTimeTo;
    }

    public void setDutyWorkTimeTo(Date dutyWorkTimeTo) {
        this.dutyWorkTimeTo = dutyWorkTimeTo;
    }
}