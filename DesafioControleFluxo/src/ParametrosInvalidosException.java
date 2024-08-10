public class ParametrosInvalidosException extends Throwable {
    static void validarEntradas(int numero1, int numero2) throws ParametrosInvalidosException{
        if (numero2 < numero1)
            throw new ParametrosInvalidosException();

    }
}
