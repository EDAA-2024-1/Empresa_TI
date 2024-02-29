/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_ti;

/**
 *
 * @author rafaelamoreira
 */
public class Gerente extends Funcionario {

    public Gerente(String nome, int id, double salarioBase, Cargo cargo) {
        super(nome, id, salarioBase, cargo);
    }

    @Override
    protected double calcularSalario(double salarioBase) {
        return salarioBase * 1.2 + 1000;
    }

}
