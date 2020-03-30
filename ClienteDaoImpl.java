/*package com.journaldev.daoimpl;

import com.journaldev.dao.BookDao;
import com.journaldev.model.Books;*/

import java.util.ArrayList;
import java.util.List;


public class ClienteDaoImpl implements ClienteDao {

    
    

    public ClienteDaoImpl() {
        clientes = 
    }

    @Override
    public void addCliente(String tipoCliente, int id, String nombre, String apellido, String genero, String fechaNacimiento, String estadoCivil){
        //super();
        
        FactoryProvider provider = new FactoryProvider();
        AbstractFactory factory = provider.getFactory("clienteFactory");
        Cliente cliente = factory.getCliente("clienteMenor");
        
        cliente.setId(id);
        cliente.setNombre(nombre);
        cliente.setApellido(apellido);
        cliente.setGenero(genero);
        cliente.setFechaNacimiento(fechaNacimiento);
        cliente.setEstadocivil(estadoCivil);

        
        clientes.add(cliente);
    }



    /*
    @Override
    public List<Books> getAllBooks() {
        return books;
    }

    @Override
    public Books getBookByIsbn(int isbn) {
        return books.get(isbn);
    }

    @Override
    public void saveBook(Books book) {
        books.add(book);
    }

    @Override
    public void deleteBook(Books book) {
        books.remove(book);
    }
    */
}