/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.sprint3.igor;


public class Palmeiras extends Times{

    
    @Override
    public String idolos() {
        String sepidolos = "Prof - Yoshi";
        return sepidolos;
    }

    @Override
    public String Titulos() {
        String septitulos = "Campeonato Mundial - 1951";
        return septitulos;
    }

    @Override
    public String BemVindo() {
        String sepbv = "Bem vindo(a) Palmeirense!!!";
        return sepbv;
    }

    @Override
    public String topArtilheiro() {
        String separtilheiro = "TOP 1 - Heitor - 315 \n"
                             + "TOP 2 - César Maluco - Gols - 182 \n"
                             + "TOP 3 - Ademir da Guia - Gols - 155 \n"
                             + "TOP 4 - Eduardo Lima - Gols - 148 \n"
                             + "TOP 5 - Servillo - Gols 139 ";
        return separtilheiro;
    }
    
}
