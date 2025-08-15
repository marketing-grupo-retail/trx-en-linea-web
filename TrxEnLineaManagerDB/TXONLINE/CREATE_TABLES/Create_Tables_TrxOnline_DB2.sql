CREATE TABLE tpos_header (
offsety NUMERIC(4),
offsetx NUMERIC(4), 
store NUMERIC(4) NOT NULL, 
terminal NUMERIC(4) NOT NULL, 
transnum NUMERIC(4) NOT NULL, 
day DATE NOT NULL, 
time	CHAR(5) NOT NULL,
transtype NUMERIC(2), 
numstrin NUMERIC(4), 
operator NUMERIC(10), 
password NUMERIC(8), 
grosspos NUMERIC(8), 
grossneg NUMERIC(8), 
ringtime NUMERIC(8),
tenderti 	NUMERIC(8),
special 	NUMERIC(8),
inactive 	NUMERIC(8),
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
tipo 		VARCHAR(1),
FECHAHORA TIMESTAMP
);

ALTER TABLE tpos_header ADD CONSTRAINT "PK_TPOS_HEADER" PRIMARY KEY (store,terminal,transnum,day,time);

CREATE TABLE  tpos_tax (
 OFFSETY   NUMERIC(4) NOT NULL,
 OFFSETX   NUMERIC(4) NOT NULL,
 STORE     NUMERIC(4) NOT NULL,
 TERMINAL  NUMERIC(4) NOT NULL,
 TRANSNUM  NUMERIC(4) NOT NULL,
 DAY       DATE NOT NULL,
 TIME      CHAR(5) NOT NULL,
 TYPE      NUMERIC(2),
 AMTTAXA   NUMERIC(8),
 AMTTAXB   NUMERIC(8),
 AMTTAXC   NUMERIC(8),
 AMTTAXD   NUMERIC(8),
 AMTTAXLEA NUMERIC(8),
 AMTTAXLEB NUMERIC(8),
 AMTTAXLEC NUMERIC(8),
 AMTTAXLED NUMERIC(8),
 tipo 	   VARCHAR(1)
 );

ALTER TABLE tpos_tax ADD CONSTRAINT "PK_TPOS_TAX" PRIMARY KEY (offsetx,store,terminal,transnum,day,time);

CREATE TABLE  tpos_tender (
offsety NUMERIC(4) NOT NULL,
offsetx NUMERIC(4) NOT NULL,
store NUMERIC(4) NOT NULL,
terminal NUMERIC(4) NOT NULL,
transnum NUMERIC(4) NOT NULL,
day 		DATE NOT NULL,
time 	NUMERIC(4),
type 	NUMERIC(2),
tendtype NUMERIC(4),
amttende NUMERIC(8),
amttnfee NUMERIC(2),
customer NUMERIC(24),
status	 NUMERIC(2),
tipo 		VARCHAR(1)
);

ALTER TABLE tpos_tender ADD CONSTRAINT "PK_TPOS_TENDER" PRIMARY KEY (offsetx,store,terminal,transnum,day,time);

CREATE TABLE tpos_user_data(
offsety 	NUMERIC (4) NOT NULL,
offsetx 	NUMERIC (4) NOT NULL,
store 		NUMERIC (4) NOT NULL,
terminal 	NUMERIC (4) NOT NULL,
transnum 	NUMERIC (4) NOT NULL,
day 		DATE NOT NULL,
time 		CHAR(5) NOT NULL,
type 		varchar(8),
data1 		VARCHAR(512),
data2 		VARCHAR(512),
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

ALTER TABLE tpos_user_data ADD CONSTRAINT "PK_TPOS_USER_DATA" PRIMARY KEY (offsetx,store,terminal,transnum,day,time);

CREATE TABLE tpos_itementry (
offsety 	NUMERIC(4) NOT NULL,
offsetx	    NUMERIC(4) NOT NULL,
store 		NUMERIC(4) NOT NULL,
terminal 	NUMERIC(4) NOT NULL,
transnum 	NUMERIC(4) NOT NULL,
day 		DATE NOT NULL,
time 		CHAR(5) NOT NULL,
itemcode 	NUMERIC(12),
xprice 		NUMERIC(8),
departme 	NUMERIC(4),
familynu1 	NUMERIC(3),
familynu2 	NUMERIC(3),
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
mpgroup 	NUMERIC(2),
dealquan 	NUMERIC(8),
pricemth 	NUMERIC(2),
salequan 	NUMERIC(2),
saleprice 	NUMERIC(10),
qtyorwgt 	NUMERIC(11),
indicat41 	CHAR(1),
indicat42 	CHAR(1),
indicat43 	CHAR(1),
indicat44 	CHAR(1),
indicat45 	CHAR(1),
indicat46 	CHAR(1),
indicat47 	CHAR(1),
indicat48 	CHAR(1),
prciva        NUMERIC(4,2),
tipo 		VARCHAR(1)
);

ALTER TABLE tpos_itementry ADD CONSTRAINT "PK_TPOS_ITEM_ENTRY" PRIMARY KEY (offsetx,store,terminal,transnum,day,time);

CREATE TABLE  tpos_data_entry (
offsety 	NUMERIC(4) NOT NULL,
offsetx 	NUMERIC(4) NOT NULL,
store 		NUMERIC (4) NOT NULL,
terminal 	NUMERIC (4) NOT NULL,
transnum 	NUMERIC (4) NOT NULL,
day 		DATE NOT NULL,
time 		CHAR (5) NOT NULL,
data1 		CHAR(40) ,
data2 		CHAR(40) ,
data3 		CHAR(40) ,
data4 		CHAR(40) ,
data5 		CHAR(40) ,
data6 		CHAR(40) ,
tipo 		VARCHAR(1)
);

ALTER TABLE tpos_data_entry ADD CONSTRAINT "PK_TPOS_DATA_ENTRY" PRIMARY KEY (offsetx,store,terminal,transnum,day,time);

CREATE TABLE tpos_discount (
offsety 	NUMERIC (4) NOT NULL,
offsetx	   NUMERIC (4) NOT NULL,
store NUMERIC (4) NOT NULL,
terminal NUMERIC (4) NOT NULL,
transnum NUMERIC (4) NOT NULL,
day DATE NOT NULL,
time NUMERIC (4) NOT NULL,
type 	NUMERIC (4),
disgroup NUMERIC (4),
disrate	 NUMERIC (4),
amtdisco NUMERIC(8),
taxexemp NUMERIC (8),
tipo  VARCHAR(1)
);

ALTER TABLE tpos_discount ADD CONSTRAINT "PK_TPOS_DISCOUNT" PRIMARY KEY (offsetx,store,terminal,transnum,day,time);

CREATE TABLE tpos_manager_override(
 OFFSETY   NUMERIC(4) NOT NULL,
 OFFSETX   NUMERIC(4) NOT NULL,
 STORE     NUMERIC(4) NOT NULL,
 TERMINAL  NUMERIC(4) NOT NULL,
 TRANSNUM  NUMERIC(4) NOT NULL,
 DAY       DATE NOT NULL,
 TIME      CHAR(5) NOT NULL,
 OVERRIDE  NUMERIC(14)	,
 REASON    VARCHAR(30)	,
 tipo 		VARCHAR(1)
);

ALTER TABLE tpos_manager_override ADD CONSTRAINT "PK_TPOS_MANAGER_OVERRIDE" PRIMARY KEY (offsetx,store,terminal,transnum,day,time);

CREATE TABLE tpos_store_closing(
 OFFSETY    NUMERIC(4) ,
 OFFSETX    NUMERIC(4) ,
 STORE      NUMERIC(4) NOT NULL,
 TERMINAL   NUMERIC(4) ,
 TRANSNUM   NUMERIC(4) ,
 DAY        DATE      NOT NULL,
 TIME       CHAR(5)  NOT NULL ,
 INDICAT2   CHAR(2)   ,
 FECHAHORA  VARCHAR(10)  ,
 tipo 		VARCHAR(1)
);

ALTER TABLE tpos_store_closing ADD CONSTRAINT "PK_TPOS_STORE_CLOSING" PRIMARY KEY (store,tfechahora);

CREATE TABLE  tpos_exception_log(
 OFFSETY   NUMERIC(4) ,
 OFFSETX   NUMERIC(4) ,
 STORE     NUMERIC(4) ,
 TERMINAL  NUMERIC(4) ,
 TRANSNUM  NUMERIC(4) ,
 DAY       DATE	     ,
 TIME      CHAR(5)   ,
 LOGDATA   CHAR(30)  ,
 tipo 		VARCHAR(1)
);

ALTER TABLE tpos_exception_log ADD CONSTRAINT "PK_TPOS_EXCEPTION_LOG" PRIMARY KEY (offsetx,store,terminal,transnum,day);

CREATE TABLE tpos_item_record_change(
 OFFSETY   NUMERIC(4) ,
 OFFSETX   NUMERIC(4) ,
 STORE     NUMERIC(4) ,
 TERMINAL  NUMERIC(4) ,
 TRANSNUM  NUMERIC(4) ,
 DAY       DATE	     ,
 TIME      CHAR(5)   ,
 OLDDATA   CHAR(100) ,
 NEWDATA   CHAR(100) ,
 tipo 		VARCHAR(1)
);

ALTER TABLE tpos_item_record_change ADD CONSTRAINT "PK_TPOS_ITEM_RECORD_CHANGE" PRIMARY KEY (offsetx,store,terminal,transnum,day);

CREATE TABLE  tpos_operator_training(
 OFFSETY    NUMERIC(4),
 OFFSETX    NUMERIC(4),
 STORE      NUMERIC(4),
 TERMINAL   NUMERIC(4),
 TRANSNUM   NUMERIC(4),
 DAY        DATE     ,
 TIME       CHAR(5)  ,
 DATA1      VARCHAR(10),
 tipo 		VARCHAR(1)
);

ALTER TABLE tpos_operator_training ADD CONSTRAINT "PK_TPOS_OPERATOR_TRAINING" PRIMARY KEY (offsetx,store,terminal,transnum,day);

CREATE TABLE  tpos_price_change(
 OFFSETY    NUMERIC(4)  ,
 OFFSETX    NUMERIC(4)  ,
 STORE      NUMERIC(4)  ,
 TERMINAL   NUMERIC(4)  ,
 TRANSNUM   NUMERIC(4)  ,
 DAY        DATE       ,
 TIME       CHAR(5)    ,
 ITEMCODE   NUMERIC(12) ,
 NEWDEALQ   NUMERIC(2)  ,
 NEWPRICE   NUMERIC(10) ,
 OLDDEALQ   NUMERIC(2)  ,
 OLDPRICE   NUMERIC(10) ,
 TIPO 		VARCHAR(1)
);

ALTER TABLE tpos_price_change ADD CONSTRAINT "PK_TPOS_PRICE_CHANGE" PRIMARY KEY (offsetx,store,terminal,transnum,day);

CREATE TABLE  tpos_till_change(
 OFFSETY        NUMERIC(4) ,
 OFFSETX        NUMERIC(4) ,
 STORE          NUMERIC(4) ,
 TERMINAL       NUMERIC(4) ,
 DAY            DATE      ,
 TIME           CHAR(5)   ,
 TRANSNUM       NUMERIC(4) ,
 NUMBERLOANS    NUMERIC(4) ,
 AMTLOANS       NUMERIC(8) ,
 NUMBERPKUPS    NUMERIC(4) ,
 AMTPKUPS       NUMERIC(8) ,
 TENDTYP11      NUMERIC(2) ,
 AMTTEND11      NUMERIC(8) ,
 TENDTYP12      NUMERIC(2) ,
 AMTTEND12      NUMERIC(8) ,
 TENDTYP13      NUMERIC(2) ,
 AMTTEND13      NUMERIC(8) ,
 TENDTYP14      NUMERIC(2) ,
 AMTTEND14      NUMERIC(8) ,
 TENDTYP15      NUMERIC(2) ,
 AMTTEND15      NUMERIC(8) ,
 TENDTYP16      NUMERIC(2) ,
 AMTTEND16      NUMERIC(8) ,
 TENDTYP17      NUMERIC(2) ,
 AMTTEND17      NUMERIC(8) ,
 TENDTYP18      NUMERIC(2) ,
 AMTTEND18      NUMERIC(8) ,
 TENDTYP21      NUMERIC(2) ,
 AMTTEND21      NUMERIC(8) ,
 TENDTYP22      NUMERIC(2) ,
 AMTTEND22      NUMERIC(8) ,
 TENDTYP23      NUMERIC(2) ,
 AMTTEND23      NUMERIC(8) ,
 TENDTYP24      NUMERIC(2) ,
 AMTTEND24      NUMERIC(8) ,
 TENDTYP25      NUMERIC(2) ,
 AMTTEND25      NUMERIC(8) ,
 TENDTYP26      NUMERIC(2) ,
 AMTTEND26      NUMERIC(8) ,
 TENDTYP27      NUMERIC(2) ,
 AMTTEND27      NUMERIC(8) ,
 TENDTYP28      NUMERIC(2) ,
 AMTTEND28      NUMERIC(8) ,
 tipo 		VARCHAR(1)
);

ALTER TABLE tpos_till_change ADD CONSTRAINT "PK_TPOS_TILL_CHANGE" PRIMARY KEY (offsetx,store,terminal,transnum,day);

CREATE TABLE TOL_DEPARTMENT(
	ID integer NOT NULL PRIMARY KEY ,
	NOMBRE VARCHAR(40)
);


