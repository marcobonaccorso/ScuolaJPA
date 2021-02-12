/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.sirfin.scuolaJPA.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author marco
 */
@CrossOrigin("*")
@RestController
public class ScuolaJPAController {

    @RequestMapping("/inizializza")
    public void inizializza() {
    }

}
