/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.activeapi.service;

import com.activeapi.Stocks;
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
import javax.ws.rs.core.MediaType;

/**
 *
 * @author USER
 */
@Stateless
@Path("com.activeapi.stocks")
public class StocksFacadeREST extends AbstractFacade<Stocks> {

    @PersistenceContext(unitName = "my_persistence_unit")
    private EntityManager em;

    public StocksFacadeREST() {
        super(Stocks.class);
    }

    // API to create a new stock entry
    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Stocks entity) {
        super.create(entity);
    }

    // This API updates the specified stock with the new data
    @PUT
    @Path("/api/stocks/{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Stocks entity) {
        super.edit(entity);
    }

    // API to delete the stock of id {id}
    @DELETE
    @Path("/api/stocks/{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    // This API returns the stock of the given id param
    @GET
    @Path("/api/stocks/{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Stocks find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    // This API returns all available stocks
    @GET
    @Path("/api/stocks")
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Stocks> findAll() {
        return super.findAll();
    }

    @GET
    @Path("api/stocks/{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Stocks> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("/api/stocks/count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
