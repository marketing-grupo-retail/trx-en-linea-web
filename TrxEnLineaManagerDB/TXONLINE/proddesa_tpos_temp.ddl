CREATE OR REPLACE VIEW "VPOS_TOTALAJUSTE" ("OFFSETY",
    "STORE","TERMINAL","TRANSNUM","DAY","TIME","VR_AJUSTE") AS 
    SELECT a.offsety, a.store, a.terminal, a.transnum, a.day, 
    a.time, nvl(SUM(nvl(amtdisco,0)),0) VR_AJUSTE 
FROM tpos_discount A 
WHERE disgroup = 4 
group by a.offsety, a.store, a.terminal, a.transnum, a.day, a.time;

CREATE OR REPLACE VIEW "VPOS_TOTALTENDER" ("OFFSETY",
    "STORE","TERMINAL","TRANSNUM","DAY","TIME","VR_PAGOS") AS 
    select a.offsety, a.store, a.terminal, a.transnum, a.day, 
    a.time, 
TRUNC(nvl(sum(a.amttende),0),0) Vr_Pagos 
 from tpos_tender a 
 group by a.offsety, a.store, a.terminal, a.transnum, a.day, a.time;

CREATE TABLE "TPOS_VENTADETALLADA" ("OFFSETY" NUMBER(4), 
    "OFFSETX" NUMBER(4), "STORE" NUMBER(4), "TERMINAL" NUMBER(4),
    "TRANSNUM" NUMBER(4), "DAY" DATE, "TIME" CHAR(5 byte), 
    "ITEMCODE" NUMBER(12), "XPRICE" NUMBER(8), "DEPARTME" 
    NUMBER(4), "QTYORWGT" NUMBER(11), "PRCIVA" NUMBER(4, 2), 
    "VLRDCTO" NUMBER(14, 3), "BASE" NUMBER(14, 3), 
    "TIPO_DESCUENTO" NUMBER(3))  
 --   TABLESPACE "INVAUDEE_TRIM3" PCTFREE 10 PCTUSED 0 INITRANS 1 MAXTRANS 
  --  255 
   -- STORAGE ( INITIAL 2640K NEXT 0K MINEXTENTS 1 MAXEXTENTS 
   -- 2147483645 PCTINCREASE 0) 
   -- LOGGING
   ;
    
CREATE OR REPLACE VIEW "VPOS_TOTALVTADET" ("OFFSETY",
    "STORE","TERMINAL","TRANSNUM","DAY","TIME","VR_VTA") AS 
    select a.offsety, a.store, a.terminal, a.transnum, a.day, 
    a.time, 
TRUNC((sum(NVL(a.xprice,0))-sum(NVL(vlrdcto,0))),0) Vr_Vta 
from tpos_ventadetallada a 
group by a.offsety, a.store, a.terminal, a.transnum, a.day, a.time;