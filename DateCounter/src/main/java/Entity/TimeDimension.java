/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author troel
 */
@Entity
@Table(name = "time_dimension")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TimeDimension.findAll", query = "SELECT t FROM TimeDimension t")
    , @NamedQuery(name = "TimeDimension.findById", query = "SELECT t FROM TimeDimension t WHERE t.id = :id")
    , @NamedQuery(name = "TimeDimension.findByDbDate", query = "SELECT t FROM TimeDimension t WHERE t.dbDate = :dbDate")
    , @NamedQuery(name = "TimeDimension.findByYear", query = "SELECT t FROM TimeDimension t WHERE t.year = :year")
    , @NamedQuery(name = "TimeDimension.findByMonth", query = "SELECT t FROM TimeDimension t WHERE t.month = :month")
    , @NamedQuery(name = "TimeDimension.findByDay", query = "SELECT t FROM TimeDimension t WHERE t.day = :day")
    , @NamedQuery(name = "TimeDimension.findByQuarter", query = "SELECT t FROM TimeDimension t WHERE t.quarter = :quarter")
    , @NamedQuery(name = "TimeDimension.findByWeek", query = "SELECT t FROM TimeDimension t WHERE t.week = :week")
    , @NamedQuery(name = "TimeDimension.findByDayName", query = "SELECT t FROM TimeDimension t WHERE t.dayName = :dayName")
    , @NamedQuery(name = "TimeDimension.findByMonthName", query = "SELECT t FROM TimeDimension t WHERE t.monthName = :monthName")
    , @NamedQuery(name = "TimeDimension.findByHolidayFlag", query = "SELECT t FROM TimeDimension t WHERE t.holidayFlag = :holidayFlag")
    , @NamedQuery(name = "TimeDimension.findByWeekendFlag", query = "SELECT t FROM TimeDimension t WHERE t.weekendFlag = :weekendFlag")
    , @NamedQuery(name = "TimeDimension.findByEvent", query = "SELECT t FROM TimeDimension t WHERE t.event = :event")})
public class TimeDimension implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "db_date")
    @Temporal(TemporalType.DATE)
    private Date dbDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "year")
    private int year;
    @Basic(optional = false)
    @NotNull
    @Column(name = "month")
    private int month;
    @Basic(optional = false)
    @NotNull
    @Column(name = "day")
    private int day;
    @Basic(optional = false)
    @NotNull
    @Column(name = "quarter")
    private int quarter;
    @Basic(optional = false)
    @NotNull
    @Column(name = "week")
    private int week;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "day_name")
    private String dayName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "month_name")
    private String monthName;
    @Column(name = "holiday_flag")
    private Character holidayFlag;
    @Column(name = "weekend_flag")
    private Character weekendFlag;
    @Size(max = 50)
    @Column(name = "event")
    private String event;

    public TimeDimension() {
    }

    public TimeDimension(Integer id) {
        this.id = id;
    }

    public TimeDimension(Integer id, Date dbDate, int year, int month, int day, int quarter, int week, String dayName, String monthName) {
        this.id = id;
        this.dbDate = dbDate;
        this.year = year;
        this.month = month;
        this.day = day;
        this.quarter = quarter;
        this.week = week;
        this.dayName = dayName;
        this.monthName = monthName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDbDate() {
        return dbDate;
    }

    public void setDbDate(Date dbDate) {
        this.dbDate = dbDate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getQuarter() {
        return quarter;
    }

    public void setQuarter(int quarter) {
        this.quarter = quarter;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public String getDayName() {
        return dayName;
    }

    public void setDayName(String dayName) {
        this.dayName = dayName;
    }

    public String getMonthName() {
        return monthName;
    }

    public void setMonthName(String monthName) {
        this.monthName = monthName;
    }

    public Character getHolidayFlag() {
        return holidayFlag;
    }

    public void setHolidayFlag(Character holidayFlag) {
        this.holidayFlag = holidayFlag;
    }

    public Character getWeekendFlag() {
        return weekendFlag;
    }

    public void setWeekendFlag(Character weekendFlag) {
        this.weekendFlag = weekendFlag;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TimeDimension)) {
            return false;
        }
        TimeDimension other = (TimeDimension) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.mycompany.datecounter.TimeDimension[ id=" + id + " ]";
    }
    
}
