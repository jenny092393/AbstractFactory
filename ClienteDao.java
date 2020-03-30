/*package com.journaldev.dao;

import com.journaldev.model.Books;*/

import java.util.List;

public interface ClienteDao {

    //list is working as a database
    public ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public void addCliente(String tipoCliente, int id, String nombre, String apellido, String genero, String fechaNacimiento, String estadoCivil);
    /*
    List<Books> getAllBooks();
    Books getBookByIsbn(int isbn);
    void saveBook(Books book);
    void deleteBook(Books book);*/
}