/*package com.journaldev.daoimpl;

import com.journaldev.dao.BookDao;
import com.journaldev.model.Books;*/

import java.util.ArrayList;
import java.util.List;


public class ClienteDaoImpl implements ClienteDao {

    //list is working as a database
    public ArrayList<Cliente> clientes;

    public ClienteDaoImpl() {
        clientes = new ArrayList<>();
    }

    @Override
    public void addCliente(Cliente cliente){
        clientes.add(cliente);
    }

    @Override
    public void printClientes(){
        for(Cliente cliente: clientes){
            System.out.println();
        }
    }

    @Override
    public void delCliente(int idCliente){
        int index = 0;

        for(Cliente cliente: clientes){

            if( cliente.getId() == idCliente ){
                clientes.remove(index);
            }

            index++;
        }
    }

    @Override
    public void updateCliente(int idCliente, Cliente newCliente){
        int index = 0;

        for(Cliente cliente: clientes){

            if( cliente.getId() == idCliente ){
                clientes.set(index, newCliente);
            }

            index++;
        }
    }
}