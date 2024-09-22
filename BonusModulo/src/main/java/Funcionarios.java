/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lima
 */
public class Funcionarios {
    private String id;
    private double salario;
    private String cargo;
    private String departamentoId;

    public Funcionarios(String id, double salario, String cargo, String departamentoId) {
        this.id = id;
        this.salario = salario;
        this.cargo = cargo;
        this.departamentoId = departamentoId;
    }

    public String getId() {
        return id;
    }

    public double getSalario() {
        return salario;
    }

    public String getCargo() {
        return cargo;
    }

    public String getDepartamentoId() {
        return departamentoId;
    }

    public void aumentarSalario(double aumento) {
        this.salario += aumento;
    }
}

