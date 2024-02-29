/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_ti;

/**
 *
 * @author rafaelamoreira
 */
public abstract class Funcionario {

    protected String nome;
    protected int id;
    protected double salario;
    protected Cargo cargo;

    public Funcionario(String nome, int id, double salarioBase, Cargo cargo) {
        this.nome = nome;
        this.id = id;
        this.cargo = cargo;
        this.salario = calcularSalario(salarioBase); 
    }

    protected abstract double calcularSalario(double salarioBase);

    @Override
    public String toString() {
        return "Nome:  " + nome + "\n"
                + "ID: " + id + "\n"
                + "Salario: " + salario + "\n"
                + "Cargo: " + cargo;
    }

}
