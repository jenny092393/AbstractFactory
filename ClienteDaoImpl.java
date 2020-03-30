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