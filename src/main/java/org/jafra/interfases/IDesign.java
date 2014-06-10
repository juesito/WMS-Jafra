/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jafra.interfases;

/**
 *
 * @author Jesús Armando Garcia Quiñones - Jueser <jesus_quinonez@jafra.com.mx>
 */
public interface IDesign {

    public String _LOCAL_PRINTER = "LOCAL";

    public String _DEVOLUTION_TYPE = "DT";
    public String _RECEIVE_TYPE = "RT";
    public String _PLANT_TYPE = "PT";

    public String _DEVOLUTION_TEMPLATE = "CT~~CD,~CC|~CT~\n"
            + "|XA~TA000~JSN|LT0|MNW|MTT|PON|PMN|LH0,0|JMA|PR2,2~SD22|JUS|LRN|CI0|XZ\n"
            + "|XA\n"
            + "|MMT\n"
            + "|PW812\n"
            + "|LL0609\n"
            + "|LS0\n"
            + "|FT162,71|A0N,34,33|FH\\|FDv_code|FS\n"
            + "|FT307,75|A0N,34,33|FH\\|FDv_description|FS\n"
            + "|FT307,85|A0N,34,33|FH\\|FDv_lote|FS\n"
            + "|FT307,95|A0N,34,33|FH\\|FDv_cantidad|FS\n"
            + "|FT307,115|A0N,34,33|FH\\|FDv_nomina|FS\n"
            + "|FT307,150|A0N,34,33|FH\\|FDv_OP|FS\n"
            + "|FT307,175|A0N,34,33|FH\\|FDv_turno|FS\n"
            + "|BY2,3,100|FT30,569|B3N,,Y,N\n"
            + "|FD>;v_barcode|FS\n"
            + "|FT30,135|A0N,23,24|FH\\|FD_______________________________________________________________|FS\n"
            + "|FT350,117|A0N,34,33|FH\\|FDCANTIDAD:|FS\n"
            + "|FT30,85|A0N,34,33|FH\\|FDLOTE:|FS\n"
            + "|FT30,115|A0N,34,33|FH\\|FDNOMINA:|FS\n"
            + "|PQv_numberlabels,0,1,Y|XZ\n";

    public String _RECEIVE_TEMPLATE = "CT~~CD,~CC|~CT~\n"
            + "|XA~TA000~JSN|LT0|MNW|MTT|PON|PMN|LH0,0|JMA|PR2,2~SD22|JUS|LRN|CI0|XZ\n"
            + "|XA\n"
            + "|MMT\n"
            + "|PW812\n"
            + "|LL0609\n"
            + "|LS0\n"
            + "|FT162,71|A0N,34,33|FH\\|FDv_code|FS\n"
            + "|FT307,75|A0N,34,33|FH\\|FDv_description|FS\n"
            + "|FT162,117|A0N,34,33|FH\\|FDv_batch|FS\n"
            + "|FT500,117|A0N,34,33|FH\\|FDv_quantity|FS\n"
            + "|BY3,3,80|FT30,256|BEN,,Y,N\n"
            + "|FD>;v_eancode|FS\n"
            + "|BY3,3,70|FT30,400|BCN,,Y,N\n"
            + "|FD>;v_roboticcode|FS\n"
            + "|BY2,3,100|FT30,569|BCN,,Y,N\n"
            + "|FD>;v_barcode|FS\n"
            + "|FT30,135|A0N,23,24|FH\\|FD_______________________________________________________________|FS\n"
            + "|FT30,170|A0N,23,24|FH\\|FDEAN|FS\n"
            + "|FT30,459|A0N,23,24|FH\\|FDADAIA|FS\n"
            + "|FT30,318|A0N,23,24|FH\\|FDROBOTICA|FS\n"
            + "|FT30,117|A0N,34,33|FH\\|FDLOTE:|FS\n"
            + "|FT350,117|A0N,34,33|FH\\|FDCANTIDAD:|FS\n"
            + "|FT30,70|A0N,34,33|FH\\|FDCODIGO:|FS\n"
            + "|PQv_numberlabels,0,1,Y|XZ\n";

    public String _PLANT_TEMPLATE = "";

}
