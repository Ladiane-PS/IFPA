/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.ifpa.BancoTeste.repo;

import com.ifpa.BancoTeste.mode.ContaBV;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author LADY
 */
public interface ContaVR extends JpaRepository<ContaBV, Long>{

    public List<ContaBV> findAll();
    
}
