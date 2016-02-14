package com.tramarsa.webservices;

import com.tramarsa.webservices.ReclamoDetalleFactPK;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2016-02-13T23:13:47")
@StaticMetamodel(ReclamoDetalleFact.class)
public class ReclamoDetalleFact_ { 

    public static volatile SingularAttribute<ReclamoDetalleFact, String> nuevoEstado;
    public static volatile SingularAttribute<ReclamoDetalleFact, String> nuevoTipdoc;
    public static volatile SingularAttribute<ReclamoDetalleFact, Integer> nuevoNumero;
    public static volatile SingularAttribute<ReclamoDetalleFact, Integer> nuevoSerie;
    public static volatile SingularAttribute<ReclamoDetalleFact, String> nuevoMoneda;
    public static volatile SingularAttribute<ReclamoDetalleFact, BigDecimal> nuevoMonto;
    public static volatile SingularAttribute<ReclamoDetalleFact, ReclamoDetalleFactPK> reclamoDetalleFactPK;

}