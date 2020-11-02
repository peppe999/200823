package it.peppe;

import java.util.LinkedList;
import java.util.List;

public class MyMath {

    public List<Integer> primeNumbersGenerator(int i) {
        List<Integer> lista = new LinkedList<>();

        for(int j = 1; j < i; j++) {
            if(isPrime(j))
                lista.add(j);
        }

        return lista;
    }

    public boolean isPrime(int i) {
        if(i == 1)
            return false;
        for(int j = 2; j <= Math.sqrt(i); j++)
            if(i % j == 0)
                return false;

        return true;
    }
}
