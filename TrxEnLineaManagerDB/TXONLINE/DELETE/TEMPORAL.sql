delete from TPOS_DATA_ENTRY;
delete from TPOS_DISCOUNT;
delete from TPOS_EXCEPTION_LOG;
delete from TPOS_HEADER;
delete from TPOS_ITEMENTRY;
delete from TPOS_ITEM_RECORD_CHANGE;
delete from TPOS_MANAGER_OVERRIDE;
delete from TPOS_OPERATOR_TRAINING;
delete from TPOS_PRICE_CHANGE;
delete from TPOS_STORE_CLOSING;
delete from TPOS_TAX;
delete from TPOS_TENDER;
delete from TPOS_TILL_CHANGE;
delete from TPOS_TRADING_STAMPS;
delete from TPOS_USER_DATA;

SELECT count(*) FROM TPOS_HEADER;