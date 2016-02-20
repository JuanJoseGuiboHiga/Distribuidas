/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tramarsa.services;

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
 * @author JUANJO
 */
@Entity
@Table(name = "reclamo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Reclamo.findAll", query = "SELECT r FROM Reclamo r"),
    @NamedQuery(name = "Reclamo.findByCodigo", query = "SELECT r FROM Reclamo r WHERE r.codigo = :codigo"),
    @NamedQuery(name = "Reclamo.findByFechaRegistro", query = "SELECT r FROM Reclamo r WHERE r.fechaRegistro = :fechaRegistro"),
    @NamedQuery(name = "Reclamo.findByFechaFin", query = "SELECT r FROM Reclamo r WHERE r.fechaFin = :fechaFin"),
    @NamedQuery(name = "Reclamo.findByCliente", query = "SELECT r FROM Reclamo r WHERE r.cliente = :cliente"),
    @NamedQuery(name = "Reclamo.findByObservacion", query = "SELECT r FROM Reclamo r WHERE r.observacion = :observacion"),
    @NamedQuery(name = "Reclamo.findByEstado", query = "SELECT r FROM Reclamo r WHERE r.estado = :estado"),
    @NamedQuery(name = "Reclamo.findByArearec", query = "SELECT r FROM Reclamo r WHERE r.arearec = :arearec")})
public class Reclamo implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO")
    private Integer codigo;
    @Column(name = "FECHA_REGISTRO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRegistro;
    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaFin;
    @Size(max = 10)
    @Column(name = "CLIENTE")
    private String cliente;
    @Size(max = 255)
    @Column(name = "OBSERVACION")
    private String observacion;
    @Size(max = 10)
    @Column(name = "ESTADO")
    private String estado;
    @Size(max = 10)
    @Column(name = "AREAREC")
    private String arearec;

    public Reclamo() {
    }

    public Reclamo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getArearec() {
        return arearec;
    }

    public void setArearec(String arearec) {
        this.arearec = arearec;
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
        if (!(object instanceof Reclamo)) {
            return false;
        }
        Reclamo other = (Reclamo) object;
        if ((this.codigo == null && other.codigo != null) || (this.codigo != null && !this.codigo.equals(other.codigo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tramarsa.services.Reclamo[ codigo=" + codigo + " ]";
    }
    
}
