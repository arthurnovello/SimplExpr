package parser;
/*
    Para executar o interpretador:
Windows: 
java -cp simple_expr.jar;..\tools\java-cup-11b.jar parser.Main
Linux/Mac
java -cp simple_expr.jar:../tools/java-cup-11b.jar parser.Main


*/


import java.io.InputStreamReader;


public class Main {

    public static void main(String[] args) {
        // O construtor do parser necessita de um objeto
        // do tipo scanner
        Parser parser = 
                new Parser(new Scanner(
                    new InputStreamReader(System.in)));
        try {
            //Executa o parser
            parser.parse();
        } catch(Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
