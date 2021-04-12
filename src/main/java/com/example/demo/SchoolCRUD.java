package com.example.demo;

import org.springframework.data.repository.CrudRepository;

// CRUD операции
// create, read, update, delete


interface SchoolCRUD extends CrudRepository<School,Integer> {
}
