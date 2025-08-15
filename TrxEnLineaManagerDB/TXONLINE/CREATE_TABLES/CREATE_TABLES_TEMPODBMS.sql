DROP TABLE tpos_header;
DROP TABLE tpos_itementry;
DROP TABLE tpos_discount;
DROP TABLE tpos_tender;
DROP TABLE tpos_data_entry;
DROP TABLE tpos_tax;
DROP TABLE tpos_till_change;
DROP TABLE tpos_trading_stamps;
DROP TABLE tpos_store_closing;
DROP TABLE tpos_item_record_change;
DROP TABLE tpos_price_change;
DROP TABLE tpos_manager_override;
DROP TABLE tpos_exception_log;
DROP TABLE tpos_user_data;
DROP TABLE tpos_operator_training;

CREATE TABLE tpos_header (
offsety 	INTEGER,
offsetx 	INTEGER,
store 		INTEGER,
terminal 	INTEGER,
transnum 	INTEGER,
day 		DATE,
time 		CHAR(5),
transtype 	INTEGER,
numstrin 	INTEGER,
operator 	INTEGER,
password 	INTEGER,
grosspos 	INTEGER,
grossneg 	INTEGER,
ringtime 	INTEGER,
tenderti 	INTEGER,
special 	INTEGER,
inactive 	INTEGER,
indicat11 	CHAR(1),
indicat12 	CHAR(1),
indicat13 	CHAR(1),
indicat14 	CHAR(1),
indicat15 	CHAR(1),
indicat16 	CHAR(1),
indicat17 	CHAR(1),
indicat18 	CHAR(1),
indicat19 	CHAR(1),
indicat110 	CHAR(1),
indicat111 	CHAR(1),
indicat112 	CHAR(1),
indicat113 	CHAR(1),
indicat114 	CHAR(1),
indicat115 	CHAR(1),
indicat116 	CHAR(1),
indicat117 	CHAR(1),
indicat118 	CHAR(1),
indicat119 	CHAR(1),
indicat120 	CHAR(1),
indicat121 	CHAR(1),
indicat122 	CHAR(1),
indicat123 	CHAR(1),
indicat124 	CHAR(1),
indicat125 	CHAR(1),
indicat126 	CHAR(1),
indicat127 	CHAR(1),
indicat128 	CHAR(1),
indicat129 	CHAR(1),
indicat130 	CHAR(1),
indicat131 	CHAR(1),
indicat132 	CHAR(1),
tipo 		VARCHAR(1)
);

ALTER TABLE tpos_header ADD CONSTRAINT "PK_TPOS_HEADER" PRIMARY KEY (store,terminal,transnum,day);

CREATE TABLE tpos_itementry (
offsety 	NUMBER(4),
offsetx		NUMBER(4),
store 		NUMBER(4),
terminal 	NUMBER(4),
transnum 	NUMBER(4),
day 		DATE,
time 		CHAR(5),
itemcode 	NUMBER(12),
xprice 		NUMBER(8),
departme 	NUMBER(4),
familynu1 	NUMBER(3),
familynu2 	NUMBER(3),
indicat11 	CHAR(1),
indicat12 	CHAR(1),
indicat13 	CHAR(1),
indicat14 	CHAR(1),
indicat15 	CHAR(1),
indicat16 	CHAR(1),
indicat17 	CHAR(1),
indicat18 	CHAR(1),
indicat19 	CHAR(1),
indicat110 	CHAR(1),
indicat111 	CHAR(1),
indicat112 	CHAR(1),
indicat113 	CHAR(1),
indicat114 	CHAR(1),
indicat115 	CHAR(1),
indicat116 	CHAR(1),
indicat21 	CHAR(1),
indicat22 	CHAR(1),
indicat23 	CHAR(1),
indicat24 	CHAR(1),
indicat25 	CHAR(1),
indicat26 	CHAR(1),
indicat27 	CHAR(1),
indicat28 	CHAR(1),
indicat29 	CHAR(1),
indicat210 	CHAR(1),
indicat211 	CHAR(1),
indicat212 	CHAR(1),
indicat213 	CHAR(1),
indicat214 	CHAR(1),
indicat215 	CHAR(1),
indicat216 	CHAR(1),
indicat31 	CHAR(1),
indicat32 	CHAR(1),
mpgroup 	NUMBER(2),
dealquan 	NUMBER(8),
pricemth 	NUMBER(2),
salequan 	NUMBER(2),
saleprice 	NUMBER(10),
qtyorwgt 	NUMBER(11),
indicat41 	CHAR(1),
indicat42 	CHAR(1),
indicat43 	CHAR(1),
indicat44 	CHAR(1),
indicat45 	CHAR(1),
indicat46 	CHAR(1),
indicat47 	CHAR(1),
indicat48 	CHAR(1),
prciva		number(4,2),
tipo 		VARCHAR(1)
);

ALTER TABLE tpos_itementry ADD CONSTRAINT "PK_TPOS_ITEM_ENTRY" PRIMARY KEY (offsetx,store,terminal,transnum,day);


CREATE TABLE tpos_discount (
offsety		NUMBER (4),
offsetx		NUMBER (4),
store		NUMBER (4),
terminal	NUMBER (4),
transnum	NUMBER (4),
day			DATE,
time		NUMBER (4),
type		NUMBER (4),
disgroup	NUMBER (4),
disrate		NUMBER (4),
amtdisco	NUMBER(8),
taxexemp	NUMBER (8),
tipo 		VARCHAR(1)
);

ALTER TABLE tpos_discount ADD CONSTRAINT "PK_TPOS_DISCOUNT" PRIMARY KEY (offsetx,store,terminal,transnum,day);

CREATE TABLE  tpos_tender (
offsety		NUMBER(4),
offsetx		NUMBER(4),
store		NUMBER(4),
terminal	NUMBER(4),
transnum	NUMBER(4),
day 		DATE,
time		NUMBER(4),
type		NUMBER(2),
tendtype	NUMBER(4),
amttende	NUMBER(8),
amttnfee	NUMBER(2),
customer	NUMBER(24),
status		NUMBER(2),
tipo 		VARCHAR(1)
);

ALTER TABLE tpos_tender ADD CONSTRAINT "PK_TPOS_TENDER" PRIMARY KEY (offsetx,store,terminal,transnum,day);

CREATE TABLE  tpos_data_entry (
offsety		NUMBER(4) ,
offsetx		NUMBER(4) ,
store 		NUMBER (4),
terminal 	NUMBER (4),
transnum 	NUMBER (4),
day 		DATE ,
time 		CHAR (5) ,
data1 		CHAR(40) ,
data2 		CHAR(40) ,
data3 		CHAR(40) ,
data4 		CHAR(40) ,
data5 		CHAR(40) ,
data6 		CHAR(40) ,
tipo 		VARCHAR(1)
);

ALTER TABLE tpos_data_entry ADD CONSTRAINT "PK_TPOS_DATA_ENTRY" PRIMARY KEY (offsetx,store,terminal,transnum,day);

--CREATE TABLE  tpos_terminales(
--store       NUMBER(4),
--terminal    NUMBER(4),
--serial      VARCHAR2(10),
--tipo 		VARCHAR(1)
--);

--CREATE TABLE  tpos_promocode (
--offsety    NUMBER(4),
--offsetx    NUMBER(4),
--store      NUMBER(4),
--terminal   NUMBER(4),
--transnum   NUMBER(4),
--day        DATE,
--time       CHAR(5),
--signo	   CHAR (2),
--promocode  CHAR (6),
--dpto 	   CHAR(4),
--tiva	   CHAR (2),
--userdat	   CHAR (2),
--itemcode   number(12),
--indicat    char(2),
--saleqty    number(2),
--saleprice  number(10),
--tipo 	   VARCHAR(1)
--);


--CREATE TABLE  TPOS_VENTADETALLADA(
-- OFFSETY   NUMBER(4),
-- OFFSETX   NUMBER(4),
-- STORE     NUMBER(4),
-- TERMINAL  NUMBER(4),
-- TRANSNUM  NUMBER(4),
-- DAY       DATE,
-- TIME      CHAR(5),
-- ITEMCODE  NUMBER(12),
-- XPRICE    NUMBER(8),
-- DEPARTME  NUMBER(4),
-- QTYORWGT  NUMBER(11),
-- PRCIVA    NUMBER(4,2),
-- VLRDCTO   NUMBER(14,3),
-- BASE      NUMBER(14,3),
-- tipo 		VARCHAR(1)
 --);

CREATE TABLE  tpos_tax (
 OFFSETY   NUMBER(4),
 OFFSETX   NUMBER(4),
 STORE     NUMBER(4),
 TERMINAL  NUMBER(4),
 TRANSNUM  NUMBER(4),
 DAY       DATE,
 TIME      CHAR(5),
 TYPE      NUMBER(2),
 AMTTAXA   NUMBER(8),
 AMTTAXB   NUMBER(8),
 AMTTAXC   NUMBER(8),
 AMTTAXD   NUMBER(8),
 AMTTAXLEA NUMBER(8),
 AMTTAXLEB NUMBER(8),
 AMTTAXLEC NUMBER(8),
 AMTTAXLED NUMBER(8),
 tipo 	   VARCHAR(1)
 );

ALTER TABLE tpos_tax ADD CONSTRAINT "PK_TPOS_TAX" PRIMARY KEY (offsetx,store,terminal,transnum,day);

CREATE TABLE  tpos_till_change(
 OFFSETY        NUMBER(4) ,
 OFFSETX        NUMBER(4) ,
 STORE          NUMBER(4) ,
 TERMINAL       NUMBER(4) ,
 DAY            DATE      ,
 TIME           CHAR(5)   ,
 TRANSNUM       NUMBER(4) ,
 NUMBERLOANS    NUMBER(4) ,
 AMTLOANS       NUMBER(8) ,
 NUMBERPKUPS    NUMBER(4) ,
 AMTPKUPS       NUMBER(8) ,
 TENDTYP11      NUMBER(2) ,
 AMTTEND11      NUMBER(8) ,
 TENDTYP12      NUMBER(2) ,
 AMTTEND12      NUMBER(8) ,
 TENDTYP13      NUMBER(2) ,
 AMTTEND13      NUMBER(8) ,
 TENDTYP14      NUMBER(2) ,
 AMTTEND14      NUMBER(8) ,
 TENDTYP15      NUMBER(2) ,
 AMTTEND15      NUMBER(8) ,
 TENDTYP16      NUMBER(2) ,
 AMTTEND16      NUMBER(8) ,
 TENDTYP17      NUMBER(2) ,
 AMTTEND17      NUMBER(8) ,
 TENDTYP18      NUMBER(2) ,
 AMTTEND18      NUMBER(8) ,
 TENDTYP21      NUMBER(2) ,
 AMTTEND21      NUMBER(8) ,
 TENDTYP22      NUMBER(2) ,
 AMTTEND22      NUMBER(8) ,
 TENDTYP23      NUMBER(2) ,
 AMTTEND23      NUMBER(8) ,
 TENDTYP24      NUMBER(2) ,
 AMTTEND24      NUMBER(8) ,
 TENDTYP25      NUMBER(2) ,
 AMTTEND25      NUMBER(8) ,
 TENDTYP26      NUMBER(2) ,
 AMTTEND26      NUMBER(8) ,
 TENDTYP27      NUMBER(2) ,
 AMTTEND27      NUMBER(8) ,
 TENDTYP28      NUMBER(2) ,
 AMTTEND28      NUMBER(8) ,
 tipo 		VARCHAR(1)
);

ALTER TABLE tpos_till_change ADD CONSTRAINT "PK_TPOS_TILL_CHANGE" PRIMARY KEY (offsetx,store,terminal,transnum,day);

CREATE TABLE  tpos_trading_stamps(
 OFFSETY     NUMBER(4) ,
 OFFSETX     NUMBER(4) ,
 STORE       NUMBER(4) ,
 TERMINAL    NUMBER(4) ,
 TRANSNUM    NUMBER(4) ,
 DAY         DATE      ,
 TIME        CHAR(5)   ,
 STAMPS      NUMBER(8) ,
 tipo 		VARCHAR(1)
);

ALTER TABLE tpos_trading_stamps ADD CONSTRAINT "PK_TPOS_TRADINGS_STAMPS" PRIMARY KEY (offsetx,store,terminal,transnum,day);

CREATE TABLE  tpos_operator_training(
 OFFSETY    NUMBER(4),
 OFFSETX    NUMBER(4),
 STORE      NUMBER(4),
 TERMINAL   NUMBER(4),
 TRANSNUM   NUMBER(4),
 DAY        DATE     ,
 TIME       CHAR(5)  ,
 DATA1      VARCHAR(10),
 tipo 		VARCHAR(1)
);

ALTER TABLE tpos_operator_training ADD CONSTRAINT "PK_TPOS_OPERATOR_TRAINING" PRIMARY KEY (offsetx,store,terminal,transnum,day);

CREATE TABLE tpos_store_closing(
 OFFSETY    NUMBER(4) ,
 OFFSETX    NUMBER(4) ,
 STORE      NUMBER(4) ,
 TERMINAL   NUMBER(4) ,
 TRANSNUM   NUMBER(4) ,
 DAY        DATE      ,
 TIME       CHAR(5)   ,
 INDICAT2   CHAR(2)   ,
 FECHAHORA  CHAR(10)  ,
 tipo 		VARCHAR(1)
);

ALTER TABLE tpos_store_closing ADD CONSTRAINT "PK_TPOS_STORE_CLOSING" PRIMARY KEY (store,tfechahora);

CREATE TABLE tpos_item_record_change(
 OFFSETY   NUMBER(4) ,
 OFFSETX   NUMBER(4) ,
 STORE     NUMBER(4) ,
 TERMINAL  NUMBER(4) ,
 TRANSNUM  NUMBER(4) ,
 DAY       DATE	     ,
 TIME      CHAR(5)   ,
 OLDDATA   CHAR(100) ,
 NEWDATA   CHAR(100) ,
 tipo 		VARCHAR(1)
);

ALTER TABLE tpos_item_record_change ADD CONSTRAINT "PK_TPOS_ITEM_RECORD_CHANGE" PRIMARY KEY (offsetx,store,terminal,transnum,day);

CREATE TABLE  tpos_price_change(
 OFFSETY    NUMBER(4)  ,
 OFFSETX    NUMBER(4)  ,
 STORE      NUMBER(4)  ,
 TERMINAL   NUMBER(4)  ,
 TRANSNUM   NUMBER(4)  ,
 DAY        DATE       ,
 TIME       CHAR(5)    ,
 ITEMCODE   NUMBER(12) ,
 NEWDEALQ   NUMBER(2)  ,
 NEWPRICE   NUMBER(10) ,
 OLDDEALQ   NUMBER(2)  ,
 OLDPRICE   NUMBER(10) ,
 TIPO 		VARCHAR(1)
);

ALTER TABLE tpos_price_change ADD CONSTRAINT "PK_TPOS_PRICE_CHANGE" PRIMARY KEY (offsetx,store,terminal,transnum,day);

CREATE TABLE tpos_manager_override(
 OFFSETY   NUMBER(4)	,
 OFFSETX   NUMBER(4)	,
 STORE     NUMBER(4)	,
 TERMINAL  NUMBER(4)	,
 TRANSNUM  NUMBER(4)	,
 DAY       DATE		,
 TIME      CHAR(5)	,
 OVERRIDE  NUMBER(14)	,
 REASON    VARCHAR2(30)	,
 tipo 		VARCHAR(1)
);

ALTER TABLE tpos_manager_override ADD CONSTRAINT "PK_TPOS_MANAGER_OVERRIDE" PRIMARY KEY (offsetx,store,terminal,transnum,day);

CREATE TABLE  tpos_exception_log(
 OFFSETY   NUMBER(4) ,
 OFFSETX   NUMBER(4) ,
 STORE     NUMBER(4) ,
 TERMINAL  NUMBER(4) ,
 TRANSNUM  NUMBER(4) ,
 DAY       DATE	     ,
 TIME      CHAR(5)   ,
 LOGDATA   CHAR(30)  ,
 tipo 		VARCHAR(1)
);

ALTER TABLE tpos_exception_log ADD CONSTRAINT "PK_TPOS_EXCEPTION_LOG" PRIMARY KEY (offsetx,store,terminal,transnum,day);

CREATE TABLE tpos_user_data(
offsety 	NUMBER (4),
offsetx 	NUMBER (4),
store 		NUMBER (4),
terminal 	NUMBER (4),
transnum 	NUMBER (4),
day 		DATE,
time 		CHAR(5),
type 		varchar(8),
data1 		VARCHAR(1024),
data2 		VARCHAR(1024),
data3 		VARCHAR(150),
data4 		VARCHAR(150),
data5 		VARCHAR(150),
data6 		VARCHAR(150),
data7 		VARCHAR(150),
data8 		VARCHAR(150),
data9 		VARCHAR(150),
data10 		VARCHAR(150),
data11 		VARCHAR(150),
data12 		VARCHAR(150),
data13 		VARCHAR(150),
data14 		VARCHAR(150),
data15 		VARCHAR(150),
data16 		VARCHAR(150),
data17 		VARCHAR(150),
data18 		VARCHAR(150),
data19 		VARCHAR(150),
data20 		VARCHAR(150),
tipo 		VARCHAR(1)
);

ALTER TABLE tpos_user_data ADD CONSTRAINT "PK_TPOS_USER_DATA" PRIMARY KEY (offsetx,store,terminal,transnum,day);


