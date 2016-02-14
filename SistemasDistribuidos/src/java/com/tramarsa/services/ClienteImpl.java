/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.tramarsa.services;

import com.tramarsa.webservices.Clientes;

/**
 *
 * @author JUANJO
 */
public class ClienteImpl {
    public static void main(String[] args) {
        ClienteClient cliente= new ClienteClient();
        Clientes c= cliente.find(Clientes.class, "401738");
        System.out.println("RUC:"+c.getRuc()+ "\n"+
                           "Dirección:"+c.getDireccion());
        cliente.close();
    }

//       public void getCliente() {
//        ClienteClient cliente= new ClienteClient();
//        Clientes c= cliente.find(Clientes.class, "401738");
//        System.out.println("RUC:"+c.getRuc()+ "\n"+
//                           "Dirección:"+c.getDireccion());
//        cliente.close();
//    }
}
