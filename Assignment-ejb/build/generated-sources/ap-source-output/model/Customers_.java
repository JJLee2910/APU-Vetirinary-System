package model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import model.Pets;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2024-03-17T15:10:27")
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile ListAttribute<Customers, Pets> pets;
    public static volatile SingularAttribute<Customers, Integer> contact;
    public static volatile SingularAttribute<Customers, String> id;
    public static volatile SingularAttribute<Customers, String> Gender;

}