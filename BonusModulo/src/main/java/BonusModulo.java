/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lima
 */
import java.util.ArrayList;
import java.util.List;

import java.util.ArrayList;
import java.util.List;

public class BonusModulo {
    private static final double BONUS_PADRAO = 2000;
    private static final double BONUS_GERENTE = 1000;
    private static final double SALARIO_LIMITE = 150000;

    public int calcularBonus(List<Funcionarios> funcionarios, List<Departamento> departamentos) {
        if (funcionarios.isEmpty() || departamentos.isEmpty()) {
            return 1; 
        }

        double maiorVendas = 0;
        List<String> departamentosTop = new ArrayList<>();

        for (Departamento dept : departamentos) {
            if (dept.getTotalVendas() > maiorVendas) {
                maiorVendas = dept.getTotalVendas();
                departamentosTop.clear();
                departamentosTop.add(dept.getId());
            } else if (dept.getTotalVendas() == maiorVendas) {
                departamentosTop.add(dept.getId());
            }
        }

        boolean funcionarioElegivel = false;

        for (Funcionarios func : funcionarios) {
            if (departamentosTop.contains(func.getDepartamentoId())) {
                funcionarioElegivel = true;
                double bonus = (func.getSalario() >= SALARIO_LIMITE || func.getCargo().equalsIgnoreCase("gerente")) ? BONUS_GERENTE : BONUS_PADRAO;
                func.aumentarSalario(bonus);
            }
        }

        if (!funcionarioElegivel) {
            return 2; 
        }

        return 0; 
    }

    public static void main(String[] args) {
        List<Funcionarios> funcionarios = new ArrayList<>();
        List<Departamento> departamentos = new ArrayList<>();

        departamentos.add(new Departamento("D1", 50000));
        departamentos.add(new Departamento("D2", 75000));
        departamentos.add(new Departamento("D3", 75000));

        funcionarios.add(new Funcionarios("F1", 140000, "analista", "D1"));
        funcionarios.add(new Funcionarios("F2", 155000, "gerente", "D2"));
        funcionarios.add(new Funcionarios("F3", 130000, "vendedor", "D3"));

        BonusModulo bonusModulo = new BonusModulo();
        int resultado = bonusModulo.calcularBonus(funcionarios, departamentos);
        System.out.println("Resultado: " + resultado);
        
        for (Funcionarios func : funcionarios) {
            System.out.println("ID: " + func.getId() + ", Salário Atual: " + func.getSalario());
        }
    }
}

