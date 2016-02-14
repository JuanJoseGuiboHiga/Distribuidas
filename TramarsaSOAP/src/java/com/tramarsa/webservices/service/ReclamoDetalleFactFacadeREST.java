/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tramarsa.webservices.service;

import com.tramarsa.webservices.ReclamoDetalleFact;
import com.tramarsa.webservices.ReclamoDetalleFactPK;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.PathSegment;

/**
 *
 * @author JUANJO
 */
@Stateless
@Path("reclamodetallefact")
public class ReclamoDetalleFactFacadeREST extends AbstractFacade<ReclamoDetalleFact> {
    @PersistenceContext(unitName = "TramarsaSOAPPU")
    private EntityManager em;

    private ReclamoDetalleFactPK getPrimaryKey(PathSegment pathSegment) {
        /*
         * pathSemgent represents a URI path segment and any associated matrix parameters.
         * URI path part is supposed to be in form of 'somePath;codigo=codigoValue;item=itemValue;docItem=docItemValue'.
         * Here 'somePath' is a result of getPath() method invocation and
         * it is ignored in the following code.
         * Matrix parameters are used as field names to build a primary key instance.
         */
        com.tramarsa.webservices.ReclamoDetalleFactPK key = new com.tramarsa.webservices.ReclamoDetalleFactPK();
        javax.ws.rs.core.MultivaluedMap<String, String> map = pathSegment.getMatrixParameters();
        java.util.List<String> codigo = map.get("codigo");
        if (codigo != null && !codigo.isEmpty()) {
            key.setCodigo(new java.lang.Integer(codigo.get(0)));
        }
        java.util.List<String> item = map.get("item");
        if (item != null && !item.isEmpty()) {
            key.setItem(new java.lang.Integer(item.get(0)));
        }
        java.util.List<String> docItem = map.get("docItem");
        if (docItem != null && !docItem.isEmpty()) {
            key.setDocItem(new java.lang.Integer(docItem.get(0)));
        }
        return key;
    }

    public ReclamoDetalleFactFacadeREST() {
        super(ReclamoDetalleFact.class);
    }

    @POST
    @Override
    @Consumes({"application/xml", "application/json"})
    public void create(ReclamoDetalleFact entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({"application/xml", "application/json"})
    public void edit(@PathParam("id") PathSegment id, ReclamoDetalleFact entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") PathSegment id) {
        com.tramarsa.webservices.ReclamoDetalleFactPK key = getPrimaryKey(id);
        super.remove(super.find(key));
    }

    @GET
    @Path("{id}")
    @Produces({"application/xml", "application/json"})
    public ReclamoDetalleFact find(@PathParam("id") PathSegment id) {
        com.tramarsa.webservices.ReclamoDetalleFactPK key = getPrimaryKey(id);
        return super.find(key);
    }

    @GET
    @Override
    @Produces({"application/xml", "application/json"})
    public List<ReclamoDetalleFact> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({"application/xml", "application/json"})
    public List<ReclamoDetalleFact> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces("text/plain")
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}