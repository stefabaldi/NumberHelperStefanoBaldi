/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stefa
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercitazionejunit;

/**
 *
 * @author informatica
 */
public class NumberHelper {
    private int number;

    public NumberHelper(int n) {
        number = n;
    }

    public boolean isEven(int n) {
        
        if(number%2==0){
        
            return true;
        }
        return false;
    }

    public boolean isOdd() {
        // ritorna true se number è un numero dispari, altrimenti ritorna false
        if(number%2!=0){
        return true;
        
        }
        return false;
    }
    
    public int sum(int n){
        // ritorna la somma tra number e n
        
        int somma=0;
        somma=n+number;
        return somma;
    }

    public boolean isPrime() {
        // ritorna true se number è un numero primo, altrimenti ritorna false
        for(int i=2;i<=number/2;i++){
        if(number%i==0){
        return false;
        
        }
        return true;
        }
        return false;
    }

    public boolean isDivisibleBy(int n) {
        // ritorna true se number è divisibile per il parametro n, altrimenti ritorna false
        if(number%n==0)
        {
        return true;
        }
        return false;
    }
}
