/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carr;

/**
 *
 * @author aluno.saolucas
 */
public class Carro {
    private String modelo;
    private double consumoPorKm; 
    private double Kmpercorrido;
    public String getModelo(){
        return modelo;}
    public double getConsumo(){
        return consumoPorKm;}
    public double getKm(){
        return Kmpercorrido;}
    public void setModelo(String modelo){
        this.modelo=modelo;}
    public void setConsumo(double consumoPorKm){
        this.consumoPorKm=consumoPorKm;}
    public void setKm(double Kmpercorrido){
        this.Kmpercorrido=Kmpercorrido;}
    public void calcGas(){
        System.out.println("o "+modelo+" usara "+(Kmpercorrido/consumoPorKm)+" litros para percorrer a viagem");}
}
