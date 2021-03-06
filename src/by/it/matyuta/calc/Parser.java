package by.it.matyuta.calc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Parser {
    Var calc(String expression) throws CalcException{
        //2.0*3.0
        Pattern p = Pattern.compile(Patterns.OPERATION);
        Matcher m = p.matcher(expression);
        if (m.find()) {
            String[] strOp = expression.split(Patterns.OPERATION);
            String operaton = m.group();
            Var two = Var.createVar(strOp[1]); // a=9
            if (operaton.equals("=") && strOp[0].matches(Patterns.VARNAME))
                return Var.saveVar(strOp[0],two);
            Var one = Var.createVar(strOp[0]);
            switch (operaton) {
                case "+":
                    return one.add(two);
                case "-":
                    return one.sub(two);
                case "*":
                    return one.mul(two);
                case "/":
                    return one.div(two);
            }
        }
        return Var.createVar(expression);
    }
}
