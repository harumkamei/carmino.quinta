public class OperadoresAritmeticos {
    public static void main(String[] args){

    int a = 10, b = 5; 

System.out.println("Soma:" + (a + b));     // 15
System.out.println("Subtracao: " + (a - b));    // 5
System.out.println("Multiplicacao:" + (a * b));     // 50
System.out.println("Divisao:" + (a / b));      // 2
System.out.println("Modulo:" + (a % b));      // 0
    }
}

public class OperadoresAtribuicao {
    public static void main(String[] args) {
 
    int x = 10;

     x += 5: // x + 5 -> 15 
     x -= 2: // x - 2 -> 13 
     x *= 3: // x * 3 -> 39 
     x /= 3: // x = x / 3 -> 13 
     x %= 4: // x = x % 4 -> 1 

     System.out.println("Resultado final:" + x)
    }
}

    public class OperadoresComparacao {
     public static void main(String[] args) {

    int a = 10, b = 5; 

System.out.println(a == b);  // false 
System.out.println(a != b); // true
System.out.println(a > b); // true 
System.out.println(a < b); // false
System.out.println(a >= b); // true 
System.out.println(a <= b); // false 


     }
    }

public class OperadoresLogicos {
     public static void main(String[] args){

        boolean cond1 = true, cond2 = false; 

        System.out.println(cond1 && cond2);  // false (AND)
        System.out.println(cond1 || cond2);  // true (OR)
        System.out.println(!cond1);  // false (NOT)

     } 
}