package Tabela.anotacoes;
/**
 ** @author queiroga
 */
import java.lang.annotation.*;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface AnotacaoTabela {
    String value();
}
