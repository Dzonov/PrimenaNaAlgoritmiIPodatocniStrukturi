//package K1;
//
//import java.util.Locale;
//import java.util.Stack;
//import java.util.Scanner;
///*
//Даден е код на модифициран програмски јазик каде функциите се претставени
//со отворен и затворен таг ("imeFunkcija" и "endimeFunkcija").
//Ваша задача е да дефинирате дали даден програмски код е валиден.
//
//Пример валиден код:
//
//func1
//func2
//endfunc2
//func3
//endfunc3
//endfunc1
//
//Пример невалиден код (испуштен е затворен таг за func3):
//
//func1
//func2
//endfunc2
//func3
//endfunc1
//
//Влез: Код со модифициран програмски јазик, каде секој таг е напишан во нов ред. Се внесуваат тагови се додека не се внесе "x".
//
//Излез: "Valid" - доколку е валиден кодот, "Invalid" - доколку не е валиден кодот.
//    */
//
//public class StackValidniFunkcii {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        Stack<String> stack = new Stack<>();
//        String line = scanner.nextLine();
//        boolean isValid=true;
//        while (!line.equals("x")) {
//            char prvaBukva = line.charAt(0);
//            char poslednaBrojka = line.charAt(line.length() - 1);
//            if (prvaBukva == 'f') {
//                if(stack.isEmpty()) {
//                    stack.push(line);
//                }else if(poslednaBrojka > stack.peek().charAt(stack.peek().length()-1)){
//                    stack.push(line);
//                }else{
//                    isValid=false;
//                }
//            }else if(prvaBukva=='e'){
//                if(stack.isEmpty()){
//                    isValid=false;
//                }else if(poslednaBrojka == stack.peek().charAt(stack.peek().length()-1)){
//                    stack.pop();
//                }else{
//                    isValid=false;
//                }
//            }else{
//                isValid=false;
//            }
//            line = scanner.nextLine();
//        }
//        if(stack.isEmpty() && isValid){
//            System.out.println("Validen");
//        }else{
//            System.out.println("Ne e evaliden");
//        }
//    }
//}