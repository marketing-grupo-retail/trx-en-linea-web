CREATE TABLE TOL_SUMMARY_CASH_REPORT (
store 		INTEGER NOT NULL, // Almac�n
grosssales 	 INTEGER NOT NULL,  // Ventas brutas
voidsamt     INTEGER NOT NULL,  // Anulaciones
refundsamt   INTEGER NOT NULL,  // Devoluciones
discsamt     INTEGER NOT NULL,  // Descuentos
netsales     INTEGER NOT NULL,  // Ventas netas
voidtrxsamt  INTEGER NOT NULL,  // Monto trx anuladas
grosspos 	 INTEGER NOT NULL, // Gross positivo
grossneg 	 INTEGER NOT NULL, // Gross negativo
netamount    INTEGER NOT NULL, //Monto neto // Monto Neto
custsnumber  INTEGER NOT NULL, // N�mero de clientes
itemsnumber  INTEGER NOT NULL, // N�mero de �tems
storecoups 	 INTEGER NOT NULL, // N�mero de cupones de almac�n
storclosdate TIMESTAMP NOT NULL, // Store Closing Date
insertdate   TIMESTAMP NOT NULL WITH DEFAULT CURRENT TIMESTAMP  // Fecha hora de inserci�n del registro
);

ALTER TABLE TOL_SUMMARY_CASH_REPORT ADD CONSTRAINT "PK_TOL_SUMM_CASH_REP" PRIMARY KEY (store,storclosdate);
