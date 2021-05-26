package pooexcepciones.ejemplo;

public class Calculadora {
    public double dividir( int numerador  , int divisor) throws DivisionPorZeroExcepcion {
        if (divisor == 0){
            throw new DivisionPorZeroExcepcion("No se puede Dividir por cero!");
        }
        return  numerador/(double)divisor;
    }
    public double dividir(String numerador , String divisor) throws DivisionPorZeroExcepcion, FormatoNumeroException {
       try {
           int num = Integer.parseInt(numerador);
           int div= Integer.parseInt(divisor);
           return this.dividir(num,div);
       } catch (NumberFormatException e){
           throw new FormatoNumeroException("debe ingresar un numero en el numerador y divisor");
       }

    }
}
