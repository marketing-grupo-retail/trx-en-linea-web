CREATE TABLE TOL_SUMMARY_CASH_REPORT (
store 		INTEGER NOT NULL, // Almacén
grosssales 	 INTEGER NOT NULL,  // Ventas brutas
voidsamt     INTEGER NOT NULL,  // Anulaciones
refundsamt   INTEGER NOT NULL,  // Devoluciones
discsamt     INTEGER NOT NULL,  // Descuentos
netsales     INTEGER NOT NULL,  // Ventas netas
voidtrxsamt  INTEGER NOT NULL,  // Monto trx anuladas
grosspos 	 INTEGER NOT NULL, // Gross positivo
grossneg 	 INTEGER NOT NULL, // Gross negativo
netamount    INTEGER NOT NULL, //Monto neto // Monto Neto
custsnumber  INTEGER NOT NULL, // Número de clientes
itemsnumber  INTEGER NOT NULL, // Número de ítems
storecoups 	 INTEGER NOT NULL, // Número de cupones de almacén
storclosdate TIMESTAMP NOT NULL, // Store Closing Date
insertdate   TIMESTAMP NOT NULL WITH DEFAULT CURRENT TIMESTAMP  // Fecha hora de inserción del registro
);

ALTER TABLE TOL_SUMMARY_CASH_REPORT ADD CONSTRAINT "PK_TOL_SUMM_CASH_REP" PRIMARY KEY (store,storclosdate);
