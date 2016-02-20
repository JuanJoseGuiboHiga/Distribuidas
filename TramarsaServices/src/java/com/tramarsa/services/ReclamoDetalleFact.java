/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tramarsa.services;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author JUANJO
 */
@Entity
@Table(name = "reclamo_detalle_fact")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ReclamoDetalleFact.findAll", query = "SELECT r FROM ReclamoDetalleFact r"),
    @NamedQuery(name = "ReclamoDetalleFact.findByCodigo", query = "SELECT r FROM ReclamoDetalleFact r WHERE r.codigo = :codigo"),
    @NamedQuery(name = "ReclamoDetalleFact.findByItem", query = "SELECT r FROM ReclamoDetalleFact r WHERE r.item = :item"),
    @NamedQuery(name = "ReclamoDetalleFact.findByDocItem", query = "SELECT r FROM ReclamoDetalleFact r WHERE r.docItem = :docItem"),
    @NamedQuery(name = "ReclamoDetalleFact.findByNuevoTipdoc", query = "SELECT r FROM ReclamoDetalleFact r WHERE r.nuevoTipdoc = :nuevoTipdoc"),
    @NamedQuery(name = "ReclamoDetalleFact.findByNuevoSerie", query = "SELECT r FROM ReclamoDetalleFact r WHERE r.nuevoSerie = :nuevoSerie"),
    @NamedQuery(name = "ReclamoDetalleFact.findByNuevoNumero", query = "SELECT r FROM ReclamoDetalleFact r WHERE r.nuevoNumero = :nuevoNumero"),
    @NamedQuery(name = "ReclamoDetalleFact.findByNuevoMoneda", query = "SELECT r FROM ReclamoDetalleFact r WHERE r.nuevoMoneda = :nuevoMoneda"),
    @NamedQuery(name = "ReclamoDetalleFact.findByNuevoMonto", query = "SELECT r FROM ReclamoDetalleFact r WHERE r.nuevoMonto = :nuevoMonto"),
    @NamedQuery(name = "ReclamoDetalleFact.findByNuevoEstado", query = "SELECT r FROM ReclamoDetalleFact r WHERE r.nuevoEstado = :nuevoEstado")})
public class ReclamoDetalleFact implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "ITEM")
    private Integer item;
    @Column(name = "DOC_ITEM")
    private Integer docItem;
    @Size(max = 2)
    @Column(name = "NUEVO_TIPDOC")
    private String nuevoTipdoc;
    @Column(name = "NUEVO_SERIE")
    private Integer nuevoSerie;
    @Column(name = "NUEVO_NUMERO")
    private Integer nuevoNumero;
    @Size(max = 10)
    @Column(name = "NUEVO_MONEDA")
    private String nuevoMoneda;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NUEVO_MONTO")
    private BigDecimal nuevoMonto;
    @Size(max = 1)
    @Column(name = "NUEVO_ESTADO")
    private String nuevoEstado;

    public ReclamoDetalleFact() {
    }

    public ReclamoDetalleFact(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getItem() {
        return item;
    }

    public void setItem(Integer item) {
        this.item = item;
    }

    public Integer getDocItem() {
        return docItem;
    }

    public void setDocItem(Integer docItem) {
        this.docItem = docItem;
    }

    public String getNuevoTipdoc() {
        return nuevoTipdoc;
    }

    public void setNuevoTipdoc(String nuevoTipdoc) {
        this.nuevoTipdoc = nuevoTipdoc;
    }

    public Integer getNuevoSerie() {
        return nuevoSerie;
    }

    public void setNuevoSerie(Integer nuevoSerie) {
        this.nuevoSerie = nuevoSerie;
    }

    public Integer getNuevoNumero() {
        return nuevoNumero;
    }

    public void setNuevoNumero(Integer nuevoNumero) {
        this.nuevoNumero = nuevoNumero;
    }

    public String getNuevoMoneda() {
        return nuevoMoneda;
    }

    public void setNuevoMoneda(String nuevoMoneda) {
        this.nuevoMoneda = nuevoMoneda;
    }

    public BigDecimal getNuevoMonto() {
        return nuevoMonto;
    }

    public void setNuevoMonto(BigDecimal nuevoMonto) {
        this.nuevoMonto = nuevoMonto;
    }

    public String getNuevoEstado() {
        return nuevoEstado;
    }

    public void setNuevoEstado(String nuevoEstado) {
        this.nuevoEstado = nuevoEstado;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigo != null ? codigo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReclamoDetalleFact)) {
            return false;
        }
        ReclamoDetalleFact other = (ReclamoDetalleFact) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tramarsa.services.ReclamoDetalleFact[ codigo=" + codigo + " ]";
    }
    
}
