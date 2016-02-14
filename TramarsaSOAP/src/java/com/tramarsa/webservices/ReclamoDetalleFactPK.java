/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tramarsa.webservices;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author JUANJO
 */
@Embeddable
public class ReclamoDetalleFactPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "CODIGO")
    private int codigo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ITEM")
    private int item;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DOC_ITEM")
    private int docItem;

    public ReclamoDetalleFactPK() {
    }

    public ReclamoDetalleFactPK(int codigo, int item, int docItem) {
        this.codigo = codigo;
        this.item = item;
        this.docItem = docItem;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getItem() {
        return item;
    }

    public void setItem(int item) {
        this.item = item;
    }

    public int getDocItem() {
        return docItem;
    }

    public void setDocItem(int docItem) {
        this.docItem = docItem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codigo;
        hash += (int) item;
        hash += (int) docItem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReclamoDetalleFactPK)) {
            return false;
        }
        ReclamoDetalleFactPK other = (ReclamoDetalleFactPK) object;
        if (this.codigo != other.codigo) {
            return false;
        }
        if (this.item != other.item) {
            return false;
        }
        if (this.docItem != other.docItem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.tramarsa.webservices.ReclamoDetalleFactPK[ codigo=" + codigo + ", item=" + item + ", docItem=" + docItem + " ]";
    }
    
}
