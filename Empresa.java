/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.empresa_ti;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rafaelamoreira
 */
public class Empresa {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public double calcularFolhaSalarial() {
        double total = 0;
        for (Funcionario funcionario : funcionarios) {
            total += funcionario.salario;
        }
        return total;
    }
}
