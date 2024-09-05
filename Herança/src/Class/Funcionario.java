package Class;

import java.util.*;

public class Funcionario {

        private ArrayList < Integer > fun ;   
        private String nome;
        private double ValorDaHora;
        private int horasTrabalhada;
     
        public Funcionario(){
     
        }
        
        public Funcionario(String nome , int horasTrabalhada, double valorDaHora){
            
         this.nome = nome;
         this.horasTrabalhada = horasTrabalhada;
         this.ValorDaHora = valorDaHora;
        }

        public String getNome() {
            return nome;
        }

        public double getValorDaHora() {
            return ValorDaHora;
        }

        public int getHorasTrabalhada() {
            return horasTrabalhada;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setValorDaHora(double valorDaHora) {
            ValorDaHora = valorDaHora;
        }

        public void setHorasTrabalhada(int horasTrabalhada) {
            this.horasTrabalhada = horasTrabalhada;
        }

        public double  salariototal(){
           return  horasTrabalhada * ValorDaHora /100;
            
        }

       
        
     }
    

