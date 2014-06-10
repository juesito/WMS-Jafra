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
    public int firstPoint = 750;
    public int increase = 40;

    public String _DEVOLUTION_TEMPLATE = "CT~~CD,~CC|~CT~\n"
            + "|XA~TA000~JSN|LT0|MNW|MTT|PON|PMN|LH0,0|JMA|PR2,2~SD22|JUS|LRN|CI0|XZ\n"
            + "|XA\n"
            + "|MMT\n"
            + "|PW812\n"
            + "|LL0609\n"
            + "|LS0\n"
            + "|FT" + (firstPoint - 120) + ",450|A0R,90,90|FH\\|FDv_code|FS\n"            
            + "|FT" + (firstPoint - 300) + ",250|A0R,80,80|FH\\|FDv_description|FS\n"
            + "|FT" + (firstPoint - 200) + ",550|A0R,70,70|FH\\|FDv_lote|FS\n"
            + "|FT" + (firstPoint - 400) + ",450|A0R,80,80|FH\\|FDv_cantidad|FS\n"
            + "|FT" + (firstPoint - 500) + ",255|A0R,50,50|FH\\|FDv_nomina|FS\n"
            + "|FT" + (firstPoint - 500) + ",520|A0R,50,50|FH\\|FDv_OP|FS\n"
            + "|FT" + (firstPoint - 500) + ",960|A0R,50,50|FH\\|FDv_turno|FS\n"
            + "|FO25,550|A0R,30,30|FH\\|FD(v_code)|FS\n"
            + "|BY6,3,150|FT60,250|B3R,,Y,N\n"
            + "|FD>;v_barcode|FS\n"
            + "|FT" + firstPoint + ",300|A0R,40,40|FH\\|FDJafra Manufacturing S.A. de C.V.|FS\n"
            + "|FT" + firstPoint + ",1000|A0R,40,40|FH\\|FD2014/06/27|FS\n"
            + "|FT" + (firstPoint - 400) + ",700|A0R,80,80|FH\\|FDPIEZAS|FS\n"
            + "|FT" + (firstPoint - 200) + ",340|A0R,70,70|FH\\|FDLOTE:|FS\n"
            + "|FT" + (firstPoint - 500) + ",70|A0R,50,50|FH\\|FDNOMINA:|FS\n"
            + "|FT" + (firstPoint - 500) + ",450|A0R,50,50|FH\\|FDOP:|FS\n"
            + "|FT" + (firstPoint - 500) + ",790|A0R,50,50|FH\\|FDTURNO:|FS\n"
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
