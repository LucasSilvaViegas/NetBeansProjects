package modelo;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import modelo.Produto;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-01-26T08:06:31")
@StaticMetamodel(Marca.class)
public class Marca_ { 

    public static volatile SingularAttribute<Marca, Integer> codigo;
    public static volatile ListAttribute<Marca, Produto> produtoList;
    public static volatile SingularAttribute<Marca, String> nome;

}