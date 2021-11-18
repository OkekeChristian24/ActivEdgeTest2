/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.activeapi;

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
 * @author USER
 */
@Entity
@Table(name = "STOCKS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Stocks.findAll", query = "SELECT s FROM Stocks s"),
    @NamedQuery(name = "Stocks.findByName", query = "SELECT s FROM Stocks s WHERE s.name = :name"),
    @NamedQuery(name = "Stocks.findByCurrentPrice", query = "SELECT s FROM Stocks s WHERE s.currentPrice = :currentPrice"),
    @NamedQuery(name = "Stocks.findByCreateDate", query = "SELECT s FROM Stocks s WHERE s.createDate = :createDate"),
    @NamedQuery(name = "Stocks.findByLastUpdate", query = "SELECT s FROM Stocks s WHERE s.lastUpdate = :lastUpdate"),
    @NamedQuery(name = "Stocks.findById", query = "SELECT s FROM Stocks s WHERE s.id = :id")})
public class Stocks implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 45)
    @Column(name = "NAME")
    private String name;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "CURRENT_PRICE")
    private Double currentPrice;
    @Column(name = "CREATE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createDate;
    @Column(name = "LAST_UPDATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;

    public Stocks() {
    }

    public Stocks(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        if (!(object instanceof Stocks)) {
            return false;
        }
        Stocks other = (Stocks) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.activeapi.Stocks[ id=" + id + " ]";
    }
    
}
