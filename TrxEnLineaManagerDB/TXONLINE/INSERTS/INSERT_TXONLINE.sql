
insert into INDICES (NOMBRE, VALOR) values ('SEQ_TX_RECHAZO',1);

insert into TX_EMAIL_CFG (EMAIL_ID, EMAIL_TXT, EMAIL_ASUNTO, EMAIL_DESTINO) values (1, 'Se detecto un fallo de Conexion para el sistema Transacciones en Linea ', 'Fallo de Conexion', 'alfonso.cadena@grpretail.com');
insert into TX_EMAIL_CFG (EMAIL_ID, EMAIL_TXT, EMAIL_ASUNTO, EMAIL_DESTINO) values (2, 'Se detecto una Transaccion Invalida en el sistema Transacciones en Linea ', 'Transaccion Rechazada', 'alfonso.cadena@grpretail.com');
insert into TX_EMAIL_CFG (EMAIL_ID, EMAIL_TXT, EMAIL_ASUNTO, EMAIL_DESTINO) values (3, 'Se detecto un fallo al invocar store procedure en el sistema Transacciones en Linea ', 'Fallo de Invocacion Store Procedure', 'alfonso.cadena@grpretail.com');

insert into TX_PARAM_SIST (PARAM_ID, PARAM_DESC, PARAM_VLR) values (1, 'Servidor de correo', '74.125.93.83');
insert into TX_PARAM_SIST (PARAM_ID, PARAM_DESC, PARAM_VLR) values (2, 'User Id de la cuenta', ' ');
insert into TX_PARAM_SIST (PARAM_ID, PARAM_DESC, PARAM_VLR) values (3, 'Contraseña de la cuenta', ' ');
insert into TX_PARAM_SIST (PARAM_ID, PARAM_DESC, PARAM_VLR) values (4, 'Base de Datos del usuario en el Servidor', ' ');
insert into TX_PARAM_SIST (PARAM_ID, PARAM_DESC, PARAM_VLR) values (5, 'Direccion donde se almacenan los archivos planos', 'C:/ArchivosPlanos/');

insert into TX_PROCESO (PROC_ID, PROC_DESC, PROC_ESTADO, AUDI_CREA, AUDI_FHCREA, AUDI_MOD, AUDI_FHMOD) values (1, 'Proceso disparado por trigger de MQ', '1', 'SISTEMA', SYSDATE, '', '');