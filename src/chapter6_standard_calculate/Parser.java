package chapter6_standard_calculate;

import java.util.ArrayList;
import java.util.Stack;

public class Parser {
    private String operations;
    public Parser(){

    }
    public Parser(String operations){
        this.operations = operations;
        System.out.println(operations);
    }
//    public double getResult(){
//        return parseResult(operations);
//    }
//    private double parseResult(String operations){
//
//        return 1.0;
//    }
    public int getResult(){
        return parseResult(operations);
    }
    private int parseResult(String operations){
        return evaluateExpression(operations);
    }
    private boolean isDigit(char c){
        return c>='0'&&c<='9'||c=='.';
    }
    private boolean isSpace(char c){
        return c==' ';
    }
    private ArrayList<String> splitExpression(String expression){
        ArrayList<String> v = new ArrayList<>();
        StringBuilder numberString = new StringBuilder();
        for(int i = 0;i<expression.length(); i++){
            if(isDigit(expression.charAt(i))){
                numberString.append(expression.charAt(i));
            }else{
                if(numberString.toString().length()>0){
                    v.add(numberString.toString());
                    numberString = new StringBuilder();
                }
                if(!isSpace(expression.charAt(i))){
                    String s = ""+expression.charAt(i);
                    v.add(s);
                }
            }
        }
        if(numberString.toString().length()>0){
            v.add(numberString.toString());
        }
//        for(String s:v){
//            System.out.println("v: "+s);
//        }
        return v;
    }
    private int evaluateExpression(String expression){
        Stack<Integer> operandStack = new Stack<>();
        Stack<Character> operatorStack = new Stack<>();
        ArrayList<String> tokens = splitExpression(expression);
        for (String token : tokens) {
            if (token.charAt(0) == '+' || token.charAt(0) == '-') {
                while (!operatorStack.isEmpty() && (operatorStack.peek() == '+' || operatorStack.peek() == '-'
                        || operatorStack.peek() == '*' || operatorStack.peek() == '/')) {
                    processAnOperator(operandStack, operatorStack);
                }
                operatorStack.push(token.charAt(0));
            } else if (token.charAt(0) == '*' || token.charAt(0) == '/') {
                while (!operatorStack.isEmpty() && (operatorStack.peek() == '*' || operatorStack.peek() == '/')) {
                    processAnOperator(operandStack, operatorStack);
                }
                operatorStack.push(token.charAt(0));
            } else {
                operandStack.push(Integer.parseInt(token));
            }
        }
//        for(Integer i:operandStack){
//            System.out.println("operandSTack: "+i);
//        }
//        for(char c:operatorStack){
//            System.out.println("operatorStack: "+c);
//        }
        while(!operatorStack.isEmpty()){
            processAnOperator(operandStack,operatorStack);
        }
        return operandStack.pop();
    }
    private void processAnOperator(Stack<Integer> operandStack,Stack<Character> operatorStack){
        char op = operatorStack.pop();
        int op1 = operandStack.pop();
        int op2 = operandStack.pop();
        if(op=='+'){
            operandStack.push(op2+op1);
        } else if (op =='-') {
            operandStack.push(op2-op1);
        }else if(op=='*'){
            operandStack.push(op2*op1);
        }else if(op=='/'){
            operandStack.push(op2/op1);
        }
    }
}
