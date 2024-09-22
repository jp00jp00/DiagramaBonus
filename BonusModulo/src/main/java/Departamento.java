/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lima
 */
public class Departamento {
    private String id;
    private double totalVendas;

    public Departamento(String id, double totalVendas) {
        this.id = id;
        this.totalVendas = totalVendas;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public String getId() {
        return id;
    }
}
