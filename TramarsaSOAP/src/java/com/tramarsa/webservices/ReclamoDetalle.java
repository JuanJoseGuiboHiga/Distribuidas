/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tramarsa.webservices;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JUANJO
 */
@Entity
@Table(name = "reclamo_detalle")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReclamoDetalle.findAll", query = "SELECT r FROM ReclamoDetalle r"),
    @NamedQuery(name = "ReclamoDetalle.findByCodigo", query = "SELECT r FROM ReclamoDetalle r WHERE r.reclamoDetallePK.codigo = :codigo"),
    @NamedQuery(name = "ReclamoDetalle.findByItem", query = "SELECT r FROM ReclamoDetalle r WHERE r.reclamoDetallePK.item = :item"),
    @NamedQuery(name = "ReclamoDetalle.findByTipdocOrigen", query = "SELECT r FROM ReclamoDetalle r WHERE r.tipdocOrigen = :tipdocOrigen"),
    @NamedQuery(name = "ReclamoDetalle.findBySerieOrigen", query = "SELECT r FROM ReclamoDetalle r WHERE r.serieOrigen = :serieOrigen"),
    @NamedQuery(name = "ReclamoDetalle.findByNumeroOrigen", query = "SELECT r FROM ReclamoDetalle r WHERE r.numeroOrigen = :numeroOrigen"),
    @NamedQuery(name = "ReclamoDetalle.findByMonedaOrigen", query = "SELECT r FROM ReclamoDetalle r WHERE r.monedaOrigen = :monedaOrigen"),
    @NamedQuery(name = "ReclamoDetalle.findByMontoOrigen", query = "SELECT r FROM ReclamoDetalle r WHERE r.montoOrigen = :montoOrigen"),
    @NamedQuery(name = "ReclamoDetalle.findByMontoDev", query = "SELECT r FROM ReclamoDetalle r WHERE r.montoDev = :montoDev"),
    @NamedQuery(name = "ReclamoDetalle.findByFlgRefac", query = "SELECT r FROM ReclamoDetalle r WHERE r.flgRefac = :flgRefac"),
    @NamedQuery(name = "ReclamoDetalle.findByAreaRes", query = "SELECT r FROM ReclamoDetalle r WHERE r.areaRes = :areaRes"),
    @NamedQuery(name = "ReclamoDetalle.findByEstado", query = "SELECT r FROM ReclamoDetalle r WHERE r.estado = :estado")})
public class ReclamoDetalle implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ReclamoDetallePK reclamoDetallePK;
    @Size(max = 2)
    @Column(name = "TIPDOC_ORIGEN")
    private String tipdocOrigen;
    @Column(name = "SERIE_ORIGEN")
    private Integer serieOrigen;
    @Column(name = "NUMERO_ORIGEN")
    private Integer numeroOrigen;
    @Size(max = 10)
    @Column(name = "MONEDA_ORIGEN")
    private String monedaOrigen;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "MONTO_ORIGEN")
    private BigDecimal montoOrigen;
    @Column(name = "MONTO_DEV")
    private BigDecimal montoDev;
    @Column(name = "FLG_REFAC")
    private Character flgRefac;
    @Size(max = 15)
    @Column(name = "AREA_RES")
    private String areaRes;
    @Size(max = 10)
    @Column(name = "ESTADO")
    private String estado;

    public ReclamoDetalle() {
    }

    public ReclamoDetalle(ReclamoDetallePK reclamoDetallePK) {
        this.reclamoDetallePK = reclamoDetallePK;
    }

    public ReclamoDetalle(int codigo, int item) {
        this.reclamoDetallePK = new ReclamoDetallePK(codigo, item);
    }

    public ReclamoDetallePK getReclamoDetallePK() {
        return reclamoDetallePK;
    }

    public void setReclamoDetallePK(ReclamoDetallePK reclamoDetallePK) {
        this.reclamoDetallePK = reclamoDetallePK;
    }

    public String getTipdocOrigen() {
        return tipdocOrigen;
    }

    public void setTipdocOrigen(String tipdocOrigen) {
        this.tipdocOrigen = tipdocOrigen;
    }

    public Integer getSerieOrigen() {
        return serieOrigen;
    }

    public void setSerieOrigen(Integer serieOrigen) {
        this.serieOrigen = serieOrigen;
    }

    public Integer getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(Integer numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public String getMonedaOrigen() {
        return monedaOrigen;
    }

    public void setMonedaOrigen(String monedaOrigen) {
        this.monedaOrigen = monedaOrigen;
    }

    public BigDecimal getMontoOrigen() {
        return montoOrigen;
    }

    public void setMontoOrigen(BigDecimal montoOrigen) {
        this.montoOrigen = montoOrigen;
    }

    public BigDecimal getMontoDev() {
        return montoDev;
    }

    public void setMontoDev(BigDecimal montoDev) {
        this.montoDev = montoDev;
    }

    public Character getFlgRefac() {
        return flgRefac;
    }

    public void setFlgRefac(Character flgRefac) {
        this.flgRefac = flgRefac;
    }

    public String getAreaRes() {
        return areaRes;
    }

    public void setAreaRes(String areaRes) {
        this.areaRes = areaRes;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (reclamoDetallePK != null ? reclamoDetallePK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReclamoDetalle)) {
            return false;
        }
        ReclamoDetalle other = (ReclamoDetalle) object;
        if ((this.reclamoDetallePK == null && other.reclamoDetallePK != null) || (this.reclamoDetallePK != null && !this.reclamoDetallePK.equals(other.reclamoDetallePK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tramarsa.webservices.ReclamoDetalle[ reclamoDetallePK=" + reclamoDetallePK + " ]";
    }
    
}
