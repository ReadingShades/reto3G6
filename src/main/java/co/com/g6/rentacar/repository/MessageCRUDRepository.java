/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.com.g6.rentacar.repository;

import co.com.g6.rentacar.model.Message;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Caramu
 */
public interface MessageCRUDRepository extends CrudRepository<Message, Integer> {
    
}
