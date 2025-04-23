public class Operadores {
    private float valor1;
    private float valor2;

//construtor

public Operadores(float valor1, float valor2){
    this.valor1 = valor1;
    this.valor2 = valor2;
}

//getters

public float getValor1(){
    return valor1;
}

public float getValor2(){
    return valor2;
}

//metdos de operações aritmeticas

public float somar(){
        return valor1 + valor2;
    }

public float subtrair(){
        return valor1 - valor2;
    }

public float multiplicar(){
        return valor1 * valor2;
    }

public float dividir(){
        return valor1 / valor2;
    }
    }
