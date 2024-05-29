/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.khalilul.produk.repository;

import com.khalilul.produk.entity.Produk;
import org.springframework.data.jpa.repository.JpaRepository;
/**
 *
 * @author Toshiba
 */
public interface ProdukRepository extends JpaRepository<Produk, Long> {

}
