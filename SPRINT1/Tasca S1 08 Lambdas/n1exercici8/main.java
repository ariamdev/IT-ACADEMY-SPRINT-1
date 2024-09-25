package n1exercici8;

public class main {
    public static void main(String[] args) {

        String word = "Testing the lambdas method reverse.";
        StringBuilder chain = new StringBuilder();

        functionalInterface lambdaInt = (a) -> chain.append(a).reverse().toString();
        System.out.println(lambdaInt.reverse(word));


    }
}
