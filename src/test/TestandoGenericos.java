/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.bean.Cliente;
import model.bean.Recepcionista;
import model.dao.ClienteDao;
import model.dao.RecepcionistaDao;

/**
 *
 * @author Informática
 */
public class TestandoGenericos {

    public static void main(String[] args) {
        Cliente c = new Cliente();
        Recepcionista r = new Recepcionista();
        
        ClienteDao cdao = new ClienteDao();
        RecepcionistaDao rdao = new RecepcionistaDao();
        
        c.setCpf("teste");
        c.setEmail("teste");
        c.setNome("teste");
        
        cdao.saveOrUpdate(c);
        
         
        r.setCpf("teste");
        r.setRg("teste");
        r.setNome("teste");
        
        rdao.saveOrUpdate(r);
        
        
    }

}
