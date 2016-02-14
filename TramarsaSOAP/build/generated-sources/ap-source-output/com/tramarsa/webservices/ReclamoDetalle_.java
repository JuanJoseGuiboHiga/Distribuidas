package com.tramarsa.webservices;

import com.tramarsa.webservices.ReclamoDetallePK;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2016-02-13T23:13:47")
@StaticMetamodel(ReclamoDetalle.class)
public class ReclamoDetalle_ { 

    public static volatile SingularAttribute<ReclamoDetalle, Integer> serieOrigen;
    public static volatile SingularAttribute<ReclamoDetalle, ReclamoDetallePK> reclamoDetallePK;
    public static volatile SingularAttribute<ReclamoDetalle, BigDecimal> montoDev;
    public static volatile SingularAttribute<ReclamoDetalle, String> areaRes;
    public static volatile SingularAttribute<ReclamoDetalle, String> estado;
    public static volatile SingularAttribute<ReclamoDetalle, String> monedaOrigen;
    public static volatile SingularAttribute<ReclamoDetalle, BigDecimal> montoOrigen;
    public static volatile SingularAttribute<ReclamoDetalle, Integer> numeroOrigen;
    public static volatile SingularAttribute<ReclamoDetalle, Character> flgRefac;
    public static volatile SingularAttribute<ReclamoDetalle, String> tipdocOrigen;

}