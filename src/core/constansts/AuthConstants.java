package core.constansts;

import java.util.ArrayList;

public class AuthConstants {

	/* Codificacion para operacion de transformacion de cadena */
	public final static String CODIFICACION_ISO = "ISO-8859-1";

	// Constantes Fijas para PUC
	public final static String NEMO_PUC = "PUC";

	public final static String NEMO_PUS = "PUS";

	public final static String NEMO_PUC_EMV = "PUC-EMV";
	
	public final static String NEMO_AMEX_EMV = "AMEX-EMV";
	public final static String NEMO_AMEX_IKEA = "AMEX-IKEA";


	public final static String NEMO_PUC_CECA ="PUC-CECA";
	
	public final static String NEMO_RSI_DAT ="RSI-DATAFO";
	
	public final static String NEMO_PUC_ECI = "ECI-PUC";
	public final static String NEMO_INCOMM = "INCOMM";
	public final static String NEMO_CHEQUEMOT = "CHEQUEMOT";

	public final static String NEMO_PRICE_SERMEPA ="SERM-PRICE";
	public final static String NEMO_PRICE_SERMEPA_EMV ="PRICE-EMV";
	public final static String ID_TERMINAL_SERMEPA ="1";
	
	public final static String NEMO_IFSF_EUROWAG = "EUROWAG";
	public final static String NEMO_IFSF_E100 = "E100";
	public final static String NEMO_IFSF_GALP = "GALPONLINE";
	public final static String NEMO_IFSF_DKV = "DKVONLINE";
	public final static String NEMO_IFSF_UTA = "UTAONLINE";
	public final static String NEMO_IFSF_REDTORTUGA = "REDTORTUGA";
	public final static String NEMO_IFSF_RESSA = "RESSAON";
	public final static String NEMO_IFSF_UKFUEL = "UKFUEL";
	public final static String NEMO_IFSF_CEPSA = "CEPSA";
	public final static String NEMO_SFC_CEPSA = "CEPSA-SFC";
	public final static String NEMO_STC_CEPSA = "CEPSA-STC";
	public final static String NEMO_EFI_PETRONIEVES = "PETRONIEV";
	public final static String NEMO_IFSF_TOKHEIM_RESSA = "TOKH_RESSA";
	public final static String NEMO_IFSF_TOKHEIM_CEPSA = "TOKH_CEPSA";
	public final static String NEMO_IFSF_TOTAL_CEPSA = "TOTL_CEPSA";
	public final static String NEMO_IFSF_ARVAL = "ARVAL";
	public final static String NEMO_IFSF_BIPDRIVE = "BIPDRIVE";
	public final static String NEMO_IFSF_VALCARCE = "VALCARCEON";
	public final static String NEMO_IFSF_NECTAR = "NECTAR";
	public final static String NEMO_IFSF_TOKHEIM_BIPDRIVE = "TOKH_BIPDRIVE";
	public final static String NEMO_IFSF_ALLSTAR = "ALLSTAR";	
	public final static String NEMO_IFSF_TOTAL = "TOTAL";	
	public final static String NEMO_IFSF_TOTAL_AUT = "TOTAL_IFSF";
	public final static String NEMO_IFSF_Q8_CEPSA = "Q8";
	public final static String NEMO_GALPFID = "GALPFID";
	public final static String NEMO_Q8_ONLINE = "Q8_ONLINE";
	public final static String NEMO_IFSF_CEPSA_DKV = "CEPSADKV";
	public final static String NEMO_CEPSA_2i = "CEPSA2i";
	public final static String NEMO_IFSF_CEPSA_2i = "2i_PBC_IN"; //"CEPSA2i";
	
	public final static String NEMO_MOVEUP = "MOVEUP";
	public final static String NEMO_TOKHEIM_MOVEUP = "TOKH_MOVEUP";

	public final static String NEMO_AS24_AUT = "AS24";
		
	public final static String NEMO_PRICE_REDSYS ="REDSYS";
	public final static String NEMO_PRICE_REDSYSCC ="REDSYS-CC";
	public final static String NEMO_PRICE_REDSYS79 ="REDSYS-79";
	public final static String NEMO_PRICE_REDSYSCC63 ="REDSYSCC63";
	
	public final static String NEMO_VILAMALLA ="VILAMALLA";
	public final static String NEMO_POPULARPAYMENTS ="POPULARPAY";
	public final static String NEMO_PRICE_REDSYSABERTIS ="REDSYS-AB";
	public final static String NEMO_PRICE_SOLRED ="SOLRED";
	public final static String NEMO_PUC_CECA_EMV ="CECAEMV";
	public final static String NEMO_SANTANDERPAGOSUBV ="SANPAGOSUB";
	public final static String NEMO_PROSA ="PROSA";
	public final static String NEMO_ABERTISOFFLINE ="ABERTISOFF";
	
	public final static String NEMO_ELPARKING = "ELPARKING";
	public final static String NEMO_ELPARKING_TOKEN = "TOKEN";
	
	public final static String NEMO_MASH = "MASH";
	public final static String NEMO_IFSF_LOGPAY = "LOGPAY";
	
	public final static String NEMO_BD_CODIGO_PROCESO = "CODIGO_PROCESO";
	public final static String NEMO_BD_CODIGO_FUNCION = "CODIGO_FUNCION";
	public final static String NEMO_BD_CODIGO_ADQUIRENTE = "CODIGO_ADQUIRENTE" ;
	public final static String NEMO_BD_ID_TERMINAL = "IDENTIFICACION_TERMINAL";
	public final static String NEMO_BD_INF_CONTROL = "INF_CONTROL_SEGURIDAD";
	public final static String NEMO_BD_CODIGO_TIPO_NEGOCIO = "TIPO_NEGOCIO";
	public final static String NEMO_BD_CODIGO_RAZON_MENSAJE = "CODIGO_RAZON_MENSAJE";
	public final static String NEMO_BD_CODIGO_ENTORNO = "CODIGO_ENTORNO";
	
	public final static String NEMO_BD_TIPO_DCC_MASTER = "TIPO_DCC_MASTER";
	public final static String NEMO_BD_TIPO_DCC_VISA = "TIPO_DCC_VISA";
	public final static String NEMO_BD_TIPO_DCC_DEFECTO = "TIPO_DCC_DEFECTO";
	public final static String NEMO_BD_TIPO_DCC_MASTER_BCE_00 = "TIPO_DCC_MASTER_BCE_00";
	public final static String NEMO_BD_TIPO_DCC_VISA_BCE_00 = "TIPO_DCC_VISA_BCE_00";
	public final static String NEMO_BD_TIPO_DCC_DEFECTO_BCE_00 = "TIPO_DCC_DEFECTO_BCE_00";
	public final static String NEMO_BD_TIPO_DCC_MASTER_BCE_01 = "TIPO_DCC_MASTER_BCE_01";
	public final static String NEMO_BD_TIPO_DCC_VISA_BCE_01 = "TIPO_DCC_VISA_BCE_01";
	public final static String NEMO_BD_TIPO_DCC_DEFECTO_BCE_01 = "TIPO_DCC_DEFECTO_BCE_01";
	


	public final static String NEMO_ID_TRANSACCION ="ID_TRANSACCION";
	public final static String NEMO_CAPTURA_AUTOMATICA = "AUT";
	public final static String NEMO_CAPTURA_MANUAL = "MAN";

	public final static String NEMO_BD_PROTOCOLO = "PROTOCOLO";
	public final static String NEMO_BD_CONTEXTO = "CONTEXTO";


	//INI vlosada (Ing Cash Back)
	public final static String NEMO_ING = "ING";
	//FIN vlosada (Ing Cash Back)
	
	public final static String NEMO_HSM_IDENTIFY_TOTAL = "TOTAL";
	public final static String NEMO_HSM_IDENTIFY_TOTAL_IFSF = "TOTAL_IFSF";
	public final static String NEMO_HSM_IDENTIFY_Q8 = "Q8";
	
	// Constantes para Punto de Servicio
	
	// start ctes galp 3/5/10
	
	/*
	 * Magnetic stripe reader and ICC
	 */
	public final static String PTO_MAG_ICC = "D";
	
	/*
	 * Magnetic stripe reader, ICC and key entry.
	 */
	public final static String PTO_MAG_ICC_KEY = "C";
		 
	 /*
	  * ICC and key entry.
	  */
	public final static String PTO_ICC_KEY = "E";
	
	public final static String PTO_GALP_CAPTURA_MANUAL = "0";
	public final static String PTO_GALP_CAPTURA_AUTOMATICA = "1";
	
	
	/*
	 * Dato Extra para consulta Contado Comercial
	 */

	public static final String DATO_ADICIONAL_CC = "/p";
	
	/*
	 * Adicional para Popular
	 */
	static public class ID_DATO_ADICIONAL_POPULAR{
		public final static String KEY_CHIPDATA = "/uCHIPDATA";
		public final static String KEY_5F24 = "5F24";
	}
	
	/*
	 * Operating enviroment: Indicates the location and type of the originating terminal
	 */
	public final static String PTO_GALP_IPT 		= "1";
	public final static String PTO_GALP_OPT 		= "2";
	public final static String PTO_GALP_DEALER_IPT = "3";
	public final static String PTO_GALP_DEALER_OPT = "4";
	
	/*
	 * Capacidad del terminal de actualizar las tarjetas
	 */
	
	public final static String PTO_GALP_UNKNOWN = "0";
	public final static String PTO_GALP_NONE = "1";
	public final static String PTO_GALP_MAGNETIC = "2";
	public final static String PTO_GALP_ICC = "3";
	
	// end ctes galp
	
	public final static String PTO_CAPTURA_MANUAL = "1";
	public final static String PTO_CAPTURA_AUTOMATICA = "2";
	
	

	public final static String PTO_AUT_CON_PIN = "1";
	public final static String PTO_AUT_SIN_PIN = "0";
	public final static String PTO_AUT_FIRMA = "5";

	public final static String PTO_SIN_RETENCION = "0";

	public final static String NEMO_TERMINAL_ATENDIDO = "S";
	public final static String PTO_ATENDIDO = "1";
	public final static String PTO_NO_ATENDIDO = "2";

	public final static String PTO_CLIENTE_NO_PRESENTE = "1";
	public final static String PTO_CLIENTE_PRESENTE = "0";

	public final static String PTO_TARJETA_NO_PRESENTE = "0";
	public final static String PTO_TARJETA_PRESENTE = "1";

	public final static String PTO_LECTURA_MAGNETICA = "2";
	public final static String PTO_LECTURA_MANUAL = "6";

	public final static String PTO_AUT_EMISOR = "3";
	public final static String PTO_AUT_ESTABLECIMIENTO = "4";

	public final static String PTO_DISPLAY = "4";

	// Constantes para Datos Adicionales (P48)

	/* 
	 * Modificacion PUS
	 * Autor: JAN
	 * Fecha: 20060615
	 * Descripcion: Se aniade la cuenta de abono como subcampo de los datos adicionales
	 */
	public final static String CODIGO_DA_CUENTA_ABONO = "02";
	/*
	 * Fin modificacion
	 */



	/* 
	 * Modificacion PUC
	 * Autor: DPPEREZ
	 * Fecha: 20061130
	 * Descripcion: Se aniade la cuenta de abono como subcampo de los datos adicionales
	 */
	public final static String CODIGO_DA_IMPORTE_NETO = "74";
	public final static String CODIGO_DA_SOLICITUD_IMPORTE_NETO = "01";
	/* Fin modificacion */

	/* 
	 * Modificacion PUC-EMV
	 * Autor: DPPEREZ
	 * Fecha: 20070302
	 * Descripcion: Se anyaden nuevos bits para pucemv.
	 */
	public final static String CODIGO_DA_VERSION_PARAMETROS = "15";
	public final static String CODIGO_DA_SOLICITUD_CONTROL_PIN= "16";
	public static final String CODIGO_DA_SOLICITUD_INFORMACION = "17";
	public static final String CODIGO_DA_DELAY_CODES = "21";
	public static final String CODIGO_DA_SCA_MANAGEMENT = "22";
	public static final String CODIGO_DA_SCA = "22";
	public final static String CODIGO_DATOS_CIFRADOS_PISTA2 = "35";
	public final static String CODIGO_DATOS_CIFRADOS_TRJ = "38"; 	
	public final static String CODIGO_DATOS_CIFRADOS_TRJ_VG = "59";
	//INI SLOPEZ
	public static final String CODIGO_DA_SOLICITUD_INFORMACION_BIS = "74";
	//FIN SLOPEZ
	public final static String CODIGO_DA_LONGITUD_PIN = "39";
	public static final String DA_SOLICITUD_INFORMACION = "01";
	/* Fin modificacion */


	public final static String CODIGO_DA_IDCUADRE = "03";
	public final static String CODIGO_DA_IDCUADRE_CIERRE = "72";
	public final static String CODIGO_DA_IDCUADRE_CIERRE_CECA = "06";
	//TODO Cambiar el valor de la constante CODIGO_DA_IDCUADRE_CIERRE_ECI
	public final static String CODIGO_DA_IDCUADRE_CIERRE_ECI="06";
	public final static int LENGTH_DA_IDCUADRE = 10;

	// Codigos de Mensaje
	public final static String CODIGO_MSG_VENTA = "1200";
	public final static String CODIGO_MSG_RESPUESTA_VENTA = "1210";
	public final static String CODIGO_MSG_VENTA_OFF = "1220OF";

	public final static String CODIGO_MSG_DEVOLUCION = "1220";
	public final static String CODIGO_MSG_CONFIRMACION = "1220";
	public final static String CODIGO_MSG_RESPUESTA_DEVOLUCION = "1230";
	public final static String CODIGO_MSG_REPETICION_DEVOLUCION = "1221";

	public final static String CODIGO_MSG_ANULACION = "1420";
	public final static String CODIGO_MSG_RESPUESTA_ANULACION = "1430";
	public final static String CODIGO_MSG_REPETICION_ANULACION = "1421";

	public final static String CODIGO_MSG_CIERRE = "1520";
	public final static String CODIGO_MSG_RESPUESTA_CIERRE = "1530";
	public final static String CODIGO_MSG_REPETICION_CIERRE = "1521";

	public final static String CODIGO_MSG_NO_RECONOCIBLE = "1644";

	public final static String CODIGO_MSG_PREAUTORIZACION = "1100";
	public final static String CODIGO_MSG_RESPUESTA_PREAUT = "1110";
	
	
	/* (30/05/2013)JDIEZ - Se anyaden los codigos para los mensajes de peticion y de
	 * respuesta para la carga remota de claves mediante claves simetricas
	 * */
	public final static String CODIGO_MSG_PETICION_CARGA_REMOTA_CLAVES  = "1600"; 
	public final static String CODIGO_MSG_RESPUESTA_CARGA_REMOTA_CLAVES = "1610";
	/* (30/05/2013)JDIEZ - Fin codigo anyadido */
	//23/02/2016 Codigos de mensaje de peticion administrativa (Ceca)
	public final static String CODIGO_MSG_PETICION_ADM = "1604";
	public final static String CODIGO_MSG_RESPUESTA_PETICION_ADM = "1614";

	public final static String CODIGO_MSG_PETICION_CIERRE_TOTALES  = "1800"; 
	public final static String CODIGO_MSG_RESPUESTA_CIERRE_TOTALES = "1810";

	
	// Codigos de Razon y Funcion para los mensajes
	public final static String CODIGO_RAZON_MENSAJE_TIMEOUT_VENTA = "4006";

	public final static String CODIGO_RAZON_MENSAJE_ANULACION_AUTOMATICA = "4007";

	public final static String CODIGO_RAZON_MENSAJE_DEVOLUCION = "1376";
	public final static String CODIGO_RAZON_CAPTURA_DIFERIDA = "1377";
	public final static String CODIGO_RAZON_PRE_IMPOT_INF = "1379";
	public final static String CODIGO_PROCESO_CAPTURA_DIFERIDA = "000000";
	public final static String CODIGO_ACCION_CAPTURA_DIFERIDA = "201";

	public final static String CODIGO_FUNCION_CONF_IMPORTE = "201";	
	public final static String CODIGO_FUNCION_CONF_IMPORTE_INFERIOR = "202";
	
	public final static String CODIGO_ACCION_DEVOLUCION = "000";
	public final static String CODIGO_ACCION_APROBADA = "000";
	public final static String CODIGO_ACCION_RESPUESTA_DEVOLUCION_OK = "900";
	public final static String CODIGO_ACCION_RESPUESTA_ANULACION_OK = "400";

	public final static String CODIGO_ACCION_RESPUESTA_CIERRE_OK = "500";
	public final static String FLAG_NO_DESCUADRE = "N";
	public final static String FLAG_DESCUADRE = "S";

	//TODO: Revisar
	/* (30/05/2013)JDIEZ - Se anyaden los codigos de funcion para los mensajes de peticion 
	 *  para la carga remota de claves mediante claves simetricas
	 * */
	public final static String CODIGO_FUNCION_IDENTIFICACION_CARGA_CLAVES 	= "693";
	public final static String CODIGO_FUNCION_INICIALIZACION_CARGA_CLAVES 	= "694";
	public final static String CODIGO_FUNCION_RENOVACION_CARGA_CLAVES 		= "695";
	/* (30/05/2013)JDIEZ - Fin codigo anyadido */
	
	/* (30/05/2013)JDIEZ - Se anyaden los codigos de accion para los mensajes de respuesta 
	 *  para la carga remota de claves mediante claves simetricas
	 * */
	public final static String CODIGO_ACCION_IDENTIFICACION_CARGA_CLAVES 		= "670";
	public final static String CODIGO_ACCION_INICIALIZACION_CARGA_CLAVES 		= "671";
	public final static String CODIGO_ACCION_RENOVACION_CARGA_CLAVES_PIN_Y_CTC  = "672";
	public final static String CODIGO_ACCION_RENOVACION_CARGA_CLAVES_PIN 		= "673";
	/* (30/05/2013)JDIEZ - Fin codigo anyadido */

	/* (02/09/2013)JDIEZ - Se anyaden el codigo de razon para el mensaje de
	 * cancelacion de preautorizacion
	 * */
	public final static String CODIGO_RAZON_CANC_CUSTOMER = "4000";
	public final static String CODIGO_RAZON_CANC_PREAUT_EMV_Q8 = "4007";
	public final static String CODIGO_RAZON_CANC_PREAUT_EMV = "4001";
	/* (02/09/2013)JDIEZ - Fin codigo anyadido */
	
	public final static String CODIGO_FUNCION_ANULACION_TOTAL ="400";
	public final static String CODIGO_FUNCION_ANULACION_PREAUTORIZACION ="481";
	public final static String CODIGO_FUNCION_ANULACION_CONFIRMACION_PRE ="482";
	public final static String CODIGO_FUNCION_ANULACION_VENTA_DCC ="484";
	public final static String CODIGO_FUNCION_ANULACION_PREAUT_DCC ="485";
	public final static String CODIGO_FUNCION_ANULACION_CONF_PREAUT_DCC ="488";
	//add codigo_funcion_autorizacion_venta_dcc y codigo_moneda_euro
	public final static String CODIGO_FUNCION_AUTORIZACION_VENTA_DCC ="286";
	public final static String CODIGO_FUNCION_MONEDA_EXTRANJERA_DCC_VENTA ="284";
	public final static String CODIGO_MONEDA_EURO = "978";
	public final static String CODIGO_MONEDA_DIRHAM = "504";
	public final static String CODIGO_RAZON_ANULACION_TIMEOUT = "4006";
	public final static String CODIGO_RAZON_ANULACION_GENERAL = "4007";
	//add codigo_funcion_autorizacion_preautorizacion_dcc
	public final static String CODIGO_FUNCION_AUTORIZACION_PREAUTORIZACION_DCC 		= "181";
	public final static String CODIGO_FUNCION_MONEDA_EXTRANJERA_DCC_PREAUTORIZACION = "185";
	public static final String CODIGO_FUNCION_CONFIRM_PREAUT_MONEDA_TARJETA			= "288";
	public static final String CODIGO_FUNCION_CONFIRM_PREAUT_MONEDA_TARJETA_DIST	= "289";
	
	/* Dpperez : Se anyade un nuevo codigo de razon de mensaje para PUC-EMV */
	public final static String CODIGO_RAZON_ANULACION_EMV = "4352";
	public final static String CODIGO_RAZON_RESOLUCION_TERMINAL = "1004";
	public final static String CODIGO_RAZON_RESOLUCION_HE = "1007";
	public final static String CODIGO_FUNCION_TRANSACCION_FINANCIERA_ORIGINAL = "200";

	/* MMorenoRodriguez : Se aniade nuevo codifo de funcion de mensahe para PUC v5.5 - AVS */
	public final static String CODIGO_FUNCION_OP_VERIFICACION_TARJETA = "150";
	public final static String CODIGO_FUNCION_OP_PREAUTORIZACION = "101";
	public final static String CODIGO_FUNCION_OP_ADVICE_REQUEST = "202";
	public final static String CODIGO_FUNCION_OP_AUTHORIZATION_REQUEST = "200";
	public final static String CODIGO_FUNCION_OP_COBRO_ACUMULADO = "251";
	public final static String CODIGO_FUNCION_OP_RECOBRO = "252";

	public final static int REDEFINE_MENSAJE_PROTOCOLO_PISTA2 = 1;
	public final static int REDEFINE_MENSAJE_PROTOCOLO_FECHA_CAD_PUNTO_SERV = 2;
	public final static int REDEFINE_MENSAJE_PROTOCOLO_ANULACION = 3;

	// Codigos de Proceso para anulaciones
	public final static String COD_PROCESO_ANUL_VENTA = "000000";
	public final static String COD_PROCESO_ANUL_DEV = "200000";
	
	//Tag 8A por defecto
	public final static String TAG_8A = "Y3";
	
	// Longitud de Campos PUC
	public final static int LENGTH_PROCESO = 6;
	public final static int LENGTH_IMPORTE = 12;
	public final static int LENGTH_TRANSACCION = 6;
	public final static int LENGTH_FECHA_TRANMISION = 10;
	public final static int LENGTH_FECHA_TRANSACCION = 12;
	public final static int LENGTH_HORA_LOCAL_TRANSACCION = 6;
	public final static int LENGTH_FECHA_LOCAL_TRANSACCION = 4;
	public final static int LENGTH_FECHA_CADUCIDAD = 4;
	public final static int LENGTH_TIPO_COMERCIO = 4;
	public final static int LENGTH_DATOS_SERVICIO_UP = 3;
	public final static int LENGTH_DATOS_SERVICIO = 12;
	public final static int LENGTH_SECUENCIA_TARJETA = 3;
	public final static int LENGTH_FUNCION = 3;
	public final static int LENGTH_RAZON = 4;
	public final static int LENGTH_BUSINESS_CODE = 4;
	public final static int LENGTH_MAX_PIN = 2;
	public final static int LENGTH_FECHA_CONC = 6;
	public final static int LENGTH_NUM_CONC = 3;
	public final static int LENGTH_NUM_REF = 4;
	public final static int LENGTH_NUM_AUTH = 6;
	public final static int LENGTH_COD_ACTION = 3;
	public final static int LENGTH_COD_ACTION_MOVEUP = 2;
	public final static int LENGTH_ID_TERMINAL = 8;
	public final static int LENGTH_ID_COM = 15;
	public final static int LENGTH_DATOS_AUT = 40;
	public final static int LENGTH_INF_CONTROL = 16;
	public final static int LENGTH_MAC = 8;
	public final static int LENGTH_ORIGINAL_DATA_ELEMENTS = 42;
	public final static int LENGTH_TOTALES = 10;
	public final static int LENGTH_IMPORTES = 16;
	public final static int LENGTH_CTA_ABONO = 20;
	public final static int LENGTH_NUM_OPER = 10;
	public final static int LENGTH_CARD_ACCEPTOR_BUSSINES_CODE = 4;
	public final static int LENGTH_PINBLOCK = 8;
	public final static int LENGTH_CODIGO_MONEDA = 3;
	public final static int LENGTH_IMP_OP_ORIGINAL = 24;
	public final static int LENGTH_PBC = 8;
	/* 
	 * Modificacion PUC_EMV
	 * Autor: DPPEREZ
	 * Fecha: 20070124
	 * Descripcion: Se anyade la constante para recoger la longitut del bit 23, se podria haber
	 *              reutilizado cualquiera de las anteriores, pero para evitar problemas por si
	 *              cambian en un futuro se crea una aparte.
	 */
	public final static int LENGTH_NUM_SECUENCIA = 3;
	/*fin modificacion*/
	public final static int NUM_SPACES_NREF = 8;

	// Nemonicos para la actualizacion del cierre del autorizador
	public final static String NEMO_ACA_VENTA = "VENTA";
	public final static String NEMO_ACA_BONIFICACION = "BONIFICACION";
	public final static String NEMO_ACA_DEVOLUCION = "DEVOLUCION";
	public final static String NEMO_ACA_ANUL_AUT_VENTA = "ANUL_AUT_VENTA";
	public final static String NEMO_ACA_ANUL_AUT_DEVOL = "ANUL_AUT_DEVOL";
	public final static String NEMO_ACA_ANUL_BONIFICACION = "ANUL_AUT_BON";
	public final static String NEMO_ACA_VENTA_FID = "VENTA_FID";
	public final static String NEMO_ACA_ANUL_AUT_VENTA_FID = "ANU_AUT_VEN_FID";
	public final static String NEMO_ACA_DEVOLUCION_FID = "DEVOLUCION_FID";
	public final static String NEMO_ACA_ANUL_AUT_DEVOL_FID = "ANU_AUT_DEV_FID";

	// BBERNA (24/01/2019)Nuevos nemonicos para la actualizacion del cierre del autorizador CEPSA para la acumulacion de puntos y recarga de saldos
	public final static String NEMO_ACA_ABONO = "ABONO";
	public final static String NEMO_ACA_ANUL_AUT_ABONO = "ANU_AUT_ABONO";
	public final static String NEMO_ACA_DEV_ABONO = "DEV_ABONO";
	public final static String NEMO_ACA_ANUL_AUT_DEV_ABONO = "ANU_AUT_DEV_ABO";
	
	// Constantes de Signo del Movto. de Ciere
	public final static String SIGNO_CIERRE_POSITIVO = "C";
	public final static String SIGNO_CIERRE_NEGATIVO = "D";
	
	// Etiqueta para recuperar adquierente del banco y mostrarlo en el ticket.
	public final static String ETIQUETA_IIN_CUP_POPULARPAY = "IIN_CUP_UPI";

	/* 
	 * Modificacion PUC_EMV
	 * Autor: DPPEREZ
	 * Fecha: 20070130
	 * Descripcion: Se anyaden las constantes que representan los tags para el bit 55.
	 * Nota: Se ha establecido una pequenya arquitectura para automatizar el envio de
	 *       campos y la inclusion/exclusion de futuros tags. Para mandar un nuevo campo 
	 *       a 4b basta con introducir valores en las estructuras definidas 
	 *       (variable final y arraylists).
	 */
	public final static String TIPO_DATOS_CHIP = "TIPO_DATOS_CHIP";
	public final static String PAN_SEQUENCE_NUMBER = "5F34";
	public final static String APPLICATION_CRYPTOGRAM = "9F26";
	public final static String CRYPTOGRAM_INFORMATION_DATA = "9F27";
	public final static String ISSUER_APPLICATION_DATA = "9F10";
	public final static String APPLICATION_TRANSACTION_COUNTER = "9F36";
	public final static String APPLICATION_INTERCHANGE_PROFILE = "82";
	public final static String CVM_RESULTS = "9F34"; 
	public final static String TERMINAL_VERTIFICATION_RESULT = "95";
	public final static String TRANSACTION_DATE = "9A";
	public final static String UNPREDICTABLE_NUMBER = "9F37";
	public final static String TRANSACTION_TYPE = "9C";
	public final static String TERMINAL_COUNTRY_CODE = "9F1A";
	public final static String TERMINAL_CAPABILITIES = "9F33";
	public final static String TERMINAL_TYPE = "9F35";
	public final static String TRANSACTION_CATEGORY_CODE = "9F53";
	public final static String APPLICATION_ID = "4F";
	public final static String PIN_TRY_COUNTER = "9F17";
	public final static String IMPORTE = "9F02";
	public final static String MONEDA = "5F2A";
	public final static String FORM_FACTOR_INDICATOR = "9F6E";
	public final static String TERMINAL_TRANSACTION_QUALIFIERS = "9F66";
	public final static String CONTACTLESS_TYPE = "CONTACTLESS_TYPE";
	public final static String CONTACTLESS_DEVICE = "CONTACTLESS_DEVICE";
	public final static String DF_NAME = "84";

	
	public final static String BIT55_CABECERA_EMV = "EMV#";
	public final static String BIT55_CABECERA_CONTACTLESS = "CLS#";
	public final static String BIT55_CABECERA_DCC = "DCC#";
	
	public final static String SECONDARY_AMOUNT = "9F03";
	public final static String TERMINAL_COUNTRY_CODE_2 = "9F1E"; ///TODO IBU es el mismo que TERMINAL_COUNTRY_CODE = "9F1A"; PREGUNTAR POR QUE
	public final static String INTERFACE_DEVICE_SERIAL_NUMBER = "9F1E"; //BERNA (03/11/2017)MOVEUP
	public final static String TERMINAL_APP_VERSION_NUMBER = "9F09"; //BERNA (03/11/2017)MOVEUP
	public final static String TRANSACTION_SEQUENCE_NUMBER = "9F41"; //BERNA (03/11/2017)MOVEUP
	public final static String APPLICATION_LABEL= "50";
	public final static String ISSUERSCRIPTTEMPLATE1= "71";
	public final static String AUTHORISATIONRESPONSECODE= "8A";
	public final static String ISSUERAUTHENTICATIONDATA= "91";
	public final static String PAYWAVE = "9F66";
	

	public final static ArrayList<String> SUBCAMPOS_ENVIAR_REDSYS = new ArrayList<String> ();
	static{ /* Subcampos que deben enviarse a REDSYS*/	
		SUBCAMPOS_ENVIAR_REDSYS.add(ISSUERSCRIPTTEMPLATE1);
		SUBCAMPOS_ENVIAR_REDSYS.add(CODIGO_DA_IDCUADRE_CIERRE);
		SUBCAMPOS_ENVIAR_REDSYS.add(APPLICATION_INTERCHANGE_PROFILE);
		SUBCAMPOS_ENVIAR_REDSYS.add(AUTHORISATIONRESPONSECODE);
		SUBCAMPOS_ENVIAR_REDSYS.add(ISSUERAUTHENTICATIONDATA);
		SUBCAMPOS_ENVIAR_REDSYS.add(TERMINAL_VERTIFICATION_RESULT);
		SUBCAMPOS_ENVIAR_REDSYS.add(TRANSACTION_DATE);
		SUBCAMPOS_ENVIAR_REDSYS.add(TRANSACTION_TYPE);
		SUBCAMPOS_ENVIAR_REDSYS.add(MONEDA);
		SUBCAMPOS_ENVIAR_REDSYS.add(IMPORTE);
		SUBCAMPOS_ENVIAR_REDSYS.add(ISSUER_APPLICATION_DATA);
		SUBCAMPOS_ENVIAR_REDSYS.add(TERMINAL_COUNTRY_CODE);
		SUBCAMPOS_ENVIAR_REDSYS.add(APPLICATION_CRYPTOGRAM);
		SUBCAMPOS_ENVIAR_REDSYS.add(CRYPTOGRAM_INFORMATION_DATA);
		SUBCAMPOS_ENVIAR_REDSYS.add(TERMINAL_CAPABILITIES);
		SUBCAMPOS_ENVIAR_REDSYS.add(CVM_RESULTS);
		SUBCAMPOS_ENVIAR_REDSYS.add(TERMINAL_TYPE);
		SUBCAMPOS_ENVIAR_REDSYS.add(APPLICATION_TRANSACTION_COUNTER);
		SUBCAMPOS_ENVIAR_REDSYS.add(UNPREDICTABLE_NUMBER);
		SUBCAMPOS_ENVIAR_REDSYS.add(FORM_FACTOR_INDICATOR);
		SUBCAMPOS_ENVIAR_REDSYS.add(PAN_SEQUENCE_NUMBER);
		SUBCAMPOS_ENVIAR_REDSYS.add(TERMINAL_TRANSACTION_QUALIFIERS);
		SUBCAMPOS_ENVIAR_REDSYS.add(DF_NAME);
	}
	//IBU	
	
	public final static ArrayList<String> SUBCAMPOS_ENVIAR_REDSYS79 = new ArrayList<String> ();
	static{ /* Subcampos que deben enviarse a REDSYS*/	
		SUBCAMPOS_ENVIAR_REDSYS79.add(ISSUERSCRIPTTEMPLATE1);//71
		SUBCAMPOS_ENVIAR_REDSYS79.add(CODIGO_DA_IDCUADRE_CIERRE);//72
		SUBCAMPOS_ENVIAR_REDSYS79.add(APPLICATION_INTERCHANGE_PROFILE);//82
		SUBCAMPOS_ENVIAR_REDSYS79.add(AUTHORISATIONRESPONSECODE);//8A
		SUBCAMPOS_ENVIAR_REDSYS79.add(ISSUERAUTHENTICATIONDATA);//91
		SUBCAMPOS_ENVIAR_REDSYS79.add(TERMINAL_VERTIFICATION_RESULT);//95
		SUBCAMPOS_ENVIAR_REDSYS79.add(TRANSACTION_DATE);//9A
		SUBCAMPOS_ENVIAR_REDSYS79.add(TRANSACTION_TYPE);//9C
		SUBCAMPOS_ENVIAR_REDSYS79.add(MONEDA);//5F2A
		SUBCAMPOS_ENVIAR_REDSYS79.add(IMPORTE);//9F02
		SUBCAMPOS_ENVIAR_REDSYS79.add(ISSUER_APPLICATION_DATA);//9F10
		SUBCAMPOS_ENVIAR_REDSYS79.add(TERMINAL_COUNTRY_CODE);//9F1A
		SUBCAMPOS_ENVIAR_REDSYS79.add(APPLICATION_CRYPTOGRAM);//9F26
		SUBCAMPOS_ENVIAR_REDSYS79.add(CRYPTOGRAM_INFORMATION_DATA);//9F27
		SUBCAMPOS_ENVIAR_REDSYS79.add(TERMINAL_CAPABILITIES);//9F33
		SUBCAMPOS_ENVIAR_REDSYS79.add(CVM_RESULTS);//9F34
		SUBCAMPOS_ENVIAR_REDSYS79.add(TERMINAL_TYPE);//9F35
		SUBCAMPOS_ENVIAR_REDSYS79.add(APPLICATION_TRANSACTION_COUNTER);//9F36
		SUBCAMPOS_ENVIAR_REDSYS79.add(UNPREDICTABLE_NUMBER);//9F37
		SUBCAMPOS_ENVIAR_REDSYS79.add(FORM_FACTOR_INDICATOR);//9F6E
		SUBCAMPOS_ENVIAR_REDSYS79.add(DF_NAME);//84
		SUBCAMPOS_ENVIAR_REDSYS79.add(PAYWAVE);//9F66
	}
	
	public final static ArrayList<String> SUBCAMPOS_BCD = new ArrayList<String> ();
	static{ /* Subcampos cuya conversion antes de envio se realiza en BCD, si el campo consultado no esta aqui
	           la conversion debe realizarse en BINARIO*/	
		SUBCAMPOS_BCD.add(TRANSACTION_DATE);
		SUBCAMPOS_BCD.add(TRANSACTION_TYPE);
		SUBCAMPOS_BCD.add(MONEDA);
		SUBCAMPOS_BCD.add(IMPORTE);
		SUBCAMPOS_BCD.add(TERMINAL_COUNTRY_CODE);
	}
	public final static ArrayList<String> SUBCAMPOS_ENVIO_EMV = new ArrayList<String>();
	static { /* Subcampos que hay que mandar a 4B , de esta manera FILTRAMOS AQUELLOS QUE NOS LLEGAN DE TERMINALES
	           EN EL CAMPO DE DATOS CHIP, PERO QUE NO HAY QUE MANDARLOS A 4B, si en cualquier momento nos llega
	           un campo nuevo, simplemente hay que anyadir aqui el tag sin mas, y si su codificacion es BCD entonces
	           en la tabla de BCD*/
		SUBCAMPOS_ENVIO_EMV.add(APPLICATION_CRYPTOGRAM);
		SUBCAMPOS_ENVIO_EMV.add(CRYPTOGRAM_INFORMATION_DATA);
		SUBCAMPOS_ENVIO_EMV.add(ISSUER_APPLICATION_DATA);
		SUBCAMPOS_ENVIO_EMV.add(APPLICATION_TRANSACTION_COUNTER);
		SUBCAMPOS_ENVIO_EMV.add(APPLICATION_INTERCHANGE_PROFILE);
		SUBCAMPOS_ENVIO_EMV.add(CVM_RESULTS);
		SUBCAMPOS_ENVIO_EMV.add(TERMINAL_VERTIFICATION_RESULT);
		SUBCAMPOS_ENVIO_EMV.add(TRANSACTION_DATE);
		SUBCAMPOS_ENVIO_EMV.add(UNPREDICTABLE_NUMBER);
		SUBCAMPOS_ENVIO_EMV.add(TRANSACTION_TYPE);
		SUBCAMPOS_ENVIO_EMV.add(TERMINAL_COUNTRY_CODE);
		SUBCAMPOS_ENVIO_EMV.add(TERMINAL_CAPABILITIES);
		SUBCAMPOS_ENVIO_EMV.add(TERMINAL_TYPE);
		SUBCAMPOS_ENVIO_EMV.add(PIN_TRY_COUNTER);
		SUBCAMPOS_ENVIO_EMV.add(IMPORTE);
		SUBCAMPOS_ENVIO_EMV.add(MONEDA);
		SUBCAMPOS_ENVIO_EMV.add(DF_NAME);
		SUBCAMPOS_ENVIO_EMV.add(TERMINAL_TRANSACTION_QUALIFIERS);
	}
	
	public final static ArrayList<String> SUBCAMPOS_ENVIO_EMV_REDSYS = new ArrayList<String>();
	static { /* Subcampos que hay que mandar a 4B , de esta manera FILTRAMOS AQUELLOS QUE NOS LLEGAN DE TERMINALES
	           EN EL CAMPO DE DATOS CHIP, PERO QUE NO HAY QUE MANDARLOS A 4B, si en cualquier momento nos llega
	           un campo nuevo, simplemente hay que anyadir aqui el tag sin mas, y si su codificacion es BCD entonces
	           en la tabla de BCD*/
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(APPLICATION_CRYPTOGRAM);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(CRYPTOGRAM_INFORMATION_DATA);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(AUTHORISATIONRESPONSECODE);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(ISSUER_APPLICATION_DATA);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(APPLICATION_TRANSACTION_COUNTER);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(APPLICATION_INTERCHANGE_PROFILE);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(CVM_RESULTS);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(TERMINAL_VERTIFICATION_RESULT);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(TRANSACTION_DATE);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(UNPREDICTABLE_NUMBER);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(TRANSACTION_TYPE);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(TERMINAL_COUNTRY_CODE);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(TERMINAL_CAPABILITIES);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(TERMINAL_TYPE);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(PIN_TRY_COUNTER);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(IMPORTE);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(MONEDA);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(DF_NAME);
		SUBCAMPOS_ENVIO_EMV_REDSYS.add(TERMINAL_TRANSACTION_QUALIFIERS);
	}
	
	public final static ArrayList<String> SUBCAMPOS_ENVIO_EMV_ALLSTAR = new ArrayList<String>();
	static { /* Subcampos que hay que mandar a 4B , de esta manera FILTRAMOS AQUELLOS QUE NOS LLEGAN DE TERMINALES
	           EN EL CAMPO DE DATOS CHIP, PERO QUE NO HAY QUE MANDARLOS A 4B, si en cualquier momento nos llega
	           un campo nuevo, simplemente hay que anyadir aqui el tag sin mas, y si su codificacion es BCD entonces
	           en la tabla de BCD*/
		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(APPLICATION_CRYPTOGRAM);
		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(CRYPTOGRAM_INFORMATION_DATA);
		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(ISSUER_APPLICATION_DATA);
		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(APPLICATION_TRANSACTION_COUNTER);
		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(APPLICATION_INTERCHANGE_PROFILE);
		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(CVM_RESULTS);
		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(TERMINAL_VERTIFICATION_RESULT);
//		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(TRANSACTION_DATE);
		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(UNPREDICTABLE_NUMBER);
//		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(TRANSACTION_TYPE);
//		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(TERMINAL_COUNTRY_CODE);
		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(TERMINAL_CAPABILITIES);
		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(TERMINAL_TYPE);
//		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(PIN_TRY_COUNTER);
//		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(IMPORTE);
//		SUBCAMPOS_ENVIO_EMV_ALLSTAR.add(MONEDA);
	}
	public final static ArrayList<String> SUBCAMPOS_ENVIO_CONTACTLESS = new ArrayList<String>();
	
	static { 
	/* Subcampos que hay que mandar al autorizador para CONTACTLESS, de esta manera FILTRAMOS AQUELLOS QUE NOS LLEGAN DE TERMINALES
	EN EL CAMPO DE DATOS CHIP, PERO QUE NO HAY QUE MANDARLOS AL AUTORIZADOR, si en cualquier momento nos llega
	un campo nuevo, simplemente hay que anyadir aqui el tag sin mas, y si su codificacion es BCD entonces
	en la tabla de BCD*/
		SUBCAMPOS_ENVIO_CONTACTLESS.add(APPLICATION_CRYPTOGRAM);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(CRYPTOGRAM_INFORMATION_DATA);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(ISSUER_APPLICATION_DATA);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(APPLICATION_TRANSACTION_COUNTER);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(APPLICATION_INTERCHANGE_PROFILE);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(CVM_RESULTS);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(TERMINAL_VERTIFICATION_RESULT);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(TRANSACTION_DATE);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(UNPREDICTABLE_NUMBER);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(TRANSACTION_TYPE);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(TERMINAL_COUNTRY_CODE);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(TERMINAL_CAPABILITIES);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(TERMINAL_TYPE);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(PIN_TRY_COUNTER);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(IMPORTE);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(MONEDA);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(FORM_FACTOR_INDICATOR);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(TERMINAL_TRANSACTION_QUALIFIERS);
		SUBCAMPOS_ENVIO_CONTACTLESS.add(DF_NAME);

	}
	
	/* fin modificacion */

	/* 
	 * Modificacion PUC_EMV
	 * Autor: DPPEREZ
	 * Fecha: 20070208
	 * Descripcion: Se anyaden las constantes para identificar los diferentes tipos de operativas Puc-Emv y todos los posibles valores del bit 22 y 53 que dependen de ellas 
	 */
	public final static String V_NO_EMV = "00";
	public final static String V_EMV_CHIP_NO_FIRMA_NO_PIN = "01";
	public final static String V_EMV_CHIP_PINOFF = "02";
	public final static String V_EMV_CHIP_FIRMA = "03";
	public final static String V_EMV_CHIP_FIRMA_PIN = "04";
	public final static String V_FALLBACK_FIRMA = "80";
	public final static String A_EMV_CHIP = "05";
	public final static String D_EMV_CHIP = "06";
	public final static String D_EMV_FALLBACK = "07";
	public final static String D_BANDA_MAGNETICA = "00";
	public final static String V_DIFERIDA = "08";
	public final static String A_PREAUTORIZACION = "10";
	public final static String P_NO_EMV = "00";
	public final static String P_EMV = "04";
	public final static String P_NO_EMV_CAPTURA_MANUAL = "11";
	public final static String V_P_EMV_PIN_ONLINE = "09";
	public final static String C_EMV_CHIP_DATAFONO = "14";
	public final static String CLS_TOP_NO_VERIFICACION = "01"; 
	public final static String CLS_TOP_PIN = "02"; 
	public final static String CLS_TOP_FIRMA = "03"; 
	public final static String CLS_TOP_PIN_FIRMA = "04"; 
	public final static String CLS_TOP_MOBILE_CODE = "05"; 
	/* -------------------------------------------------------- */


	//public final static String PS_V_EMV_CHIP_NO_FIRMA_NO_PIN = "51010120404C";
	
	/*
	 * Jarios 12/02/2007
	 * Se cambia el bit 7 del P-22, en caso de que sea una EMV#01, ya que se esta enviando 2 (lectura banda magnetica)
	 * cuando deberia de ser 5 (Tarjeta chip EMV), dado que luego si se envian en el P-55 los datos chip.
	 * Son tarjetas sin verificacion de pin ni firma. Se envia el CVMR (tag P-55 9F34), con 3F0000
	 */
	/*
	 * 28/04/2015: Se modifica la primera posicion del campo 22 para indicar que el terminal tiene capacidades contactless (M) antiguo valor (5).
	 */
	public final static String PS_V_EMV_CHIP_NO_FIRMA_NO_PIN = "M1010150004C";
	/*
	 * Antiguo valor: PS_V_EMV_CHIP_NO_FIRMA_NO_PIN = "51010150404C";//Segun correo de RedSYS de 28/04/2015, 
	 * en este caso se debe mandar en el bit 9 el valor 0 - No autenticado) 
	 */
	public final static String PS_V_EMV_CHIP_PINOFF = "M1010151104C";
	public final static String PS_EMV_CHIP_FIRMA = "M1010155404C";
	public final static String PS_V_EMV_CHIP_FIRMA_PIN = "M1010155404C";
	public final static String PS_V_FALLBACK_FIRMA = "M10101S5404C";
	public final static String PS_A_EMV_CHIP = null; /* no aplica, borrar si se desea */
	public final static String PS_D_EMV_CHIP = "M1010155404C";
	public final static String PS_C_EMV_CHIP = "M1020150004C";

	public final static String PS_D_EMV_FALLBACK = "M10101S5404C";
	public final static String PS_D_BANDA_MAGNETICA = "M1010125404C";
	public final static String PS_V_DIFERIDA = "M1011065404C";
	public final static String PS_V_DIFERIDA_AMEX = "M1011060404C"; //CSACT-3779: Valor del P22 para operaciones mauales de AMEX
	public final static String PS_V_BANDA_TERMINAL_NO_EMV = "200101254040";
	public final static String PS_V_NO_EMV = "M1010125404C";
											
	public final static String PS_P_BANDA_MAGNETICA_PIN_ONLINE = "M1020121314C";
	public final static String PS_P_EMV_PIN_ONLINE = "M1020151314C";
	public final static String PS_V_EMV_PIN_ONLINE = "M1020151314C";
	public final static String PS_P_EMV_PIN_OFFLINE = "M1020151104C";
	public final static String PS_C_EMV = "M1020151104C";
	public final static String PS_C_EMV_DATAFONO = "M1020151104C";
	public final static String PS_V_EMV_PIN_ONLINE_ATEN = "M1010151314C";
	
	public final static String PS_P_EMV_PIN = "M1020151104C";
	public final static String PS_C_BANDA = "M1020120004C";
	public final static String PS_C_GENERAL = "M1020120004C";
	public final static String PS_C_GENERAL_ATEN = "M1010120004C";
																
	//Nuevo tratamiento -> Operacion Contactless ---> Valor anterior: "200201200040";//M00201200040
	// PARA ABERTIS, la solucion de BANDA es considerada otro terminal diferente, por lo que se envia un P22 fijo
	public final static String PS_TERMINAL_ABERTIS_BANDA 		= "200201200040";

	//Nuevo tratamiento -> Operacion Contactless ---> Valor anterior: "100201600040"; //'200201600040'
	// PARA ABERTIS, la solucion de BANDA es considerada otro terminal diferente, por lo que se envia un P22 fijo
	public final static String PS_TERMINAL_ABERTIS_BANDA_MANUAL = "200201600040";
	public final static String PS_TERMINAL_ABERTIS_BANDA_CEPSA_MANUAL = "100201600040";

	// [JDP 20160530] P22 AMEX PIN Online
	public final static String PS_V_POS_ATE_EMV_PIN_ONLINE = "M10101M1314C";
	public final static String PS_V_POSA_ATE_BANDA_MAGNETICA_PIN_ONLINE = "M10101N1314C";

	//20170817 ACL: para las regularizaciones de CECA se ha de cambiar el P22. las posiciones 8 y 9 deben ser "No Autentificado"
	public final static String PS_V_DIFERIDA_CECA = "M1011060004C";

	
	/* -------------------------------------------------------- */
	public final static String CS_V_NO_EMV = "0102000001000000";
	public final static String CS_V_EMV_CHIP_NO_FIRMA_NO_PIN = "0102250001000000";
	public final static String CS_V_EMV_CHIP_NO_FIRMA_NO_PIN_PRICE = "0102000002000000";
	public final static String CS_V_EMV_CHIP_PINOFF = "0102250001000000";
	public final static String CS_EMV_CHIP_FIRMA = "0102250001000000";
	public final static String CS_V_EMV_CHIP_FIRMA_PIN = "0102000001000000";
	public final static String CS_V_FALLBACK_FIRMA = "0102000001000000";
	public final static String CS_A_EMV_CHIP = "0102000001000000";
	public final static String CS_D_EMV_CHIP = "0102250001000000";
	public final static String CS_D_EMV_FALLBACK = "0102000001000000";
	public final static String CS_D_BANDA_MAGNETICA = "0102000001000000";
	public final static String CS_A_AUTOMATICA_CORE = "0102000001000000";
	/*ESPECIALES PARA SERMEPA*/
	public final static String SERMEPA_CS_V_NO_EMV = "0102000002000000";
	public final static String SERMEPA_CS_V_EMV_CHIP_NO_FIRMA_NO_PIN = "0102250002000000";
	public final static String SERMEPA_CS_V_EMV_CHIP_NO_FIRMA_NO_PIN_PRICE = "0102000002000000";
	public final static String SERMEPA_CS_V_EMV_CHIP_PINOFF = "0102250002000000";
	public final static String SERMEPA_CS_EMV_CHIP_FIRMA = "0102250002000000";
	public final static String SERMEPA_CS_V_EMV_CHIP_FIRMA_PIN = "0102000002000000";
	public final static String SERMEPA_CS_V_FALLBACK_FIRMA = "0102000002000000";
	public final static String SERMEPA_CS_A_EMV_CHIP = "0102000002000000";
	public final static String SERMEPA_CS_D_EMV_CHIP = "0102250002000000";
	public final static String SERMEPA_CS_D_EMV_FALLBACK = "0102000002000000";
	public final static String SERMEPA_CS_D_BANDA_MAGNETICA = "0102000002000000";
	public final static String SERMEPA_CS_A_AUTOMATICA_CORE = "0102000002000000";
	public final static String SERMEPA_CS_P_NO_EMV = "0102010102000000";
	public final static String SERMEPA_CS_P_EMV = "0102010102000000";
	public final static String SERMEPA_CS_A_AUT_CORE_CIFRADO = "2202000002000000";
	
	
	/*fin modificacion*/
	public final static String CS_SERMEPA = "9201000001000000";
	public static final String CODIGO_FORMA_PAGO = "21";
	public static final String FORMA_PAGO = "STD005DF00        ";


	/** Constantes para el manejo de los subcampos 15 y 16 del bit 48 - DATOS ADICIONALES - 
	 * en operaciones EMV*/
	public final static String TPV_SN_400 = "TPV_SN_400";
	public final static String AIE_FABRICANTE = "AIE_FABRICANTE";
	public final static String AIE_MODELO = "AIE_MODELO";
	public final static String AIE_NOMBRE_PRO_SOFT = "AIE_NOMBRE_PRO_SOFT";
	public final static String AIE_VERSION_PRO_SOFT = "AIE_VERSION_PRO_SOFT";
	public final static String AIE_KERNEL_EMV = "AIE_KERNEL_EMV";
	public final static String AIE_VCTC = "AIE_VCTC";
	public final static String AIE_VCPIN = "AIE_VCPIN";

	/** Constantes para el manejo del bit 48 - DATOS ADICIONALES - CECA*/
	public static final String CODIGO_DE_BANCO = "01";



	/************************************************************ 
	 * 			CONSTANTES PARA EL PROTOCOLO ECI 
	 ************************************************************/
	public final static String CODIGO_TRANSACCION_ECI = "9390";
	public final static String CODIGO_TRANSACCION_ECI_CONCILIACION = "9395";
	public final static String COD_VENTA_ECI = "01";
	public final static String COD_DEVOLUCION_ECI ="02";
	public final static String TIPO_TARJETA_ECI= "99";
	public final static String TIPO_DISPOSITIVO_MSR="1";
	public final static String TIPO_DEPARTAMENTO_RESTO = "5";
	public final static String COD_DEPARTAMENTO_ECI = "4407";
	public final static String COD_EMPRESA_ECI = "908";
	public final static String MONEDA_EUROS_ECI="EUR";
	public final static String MONEDA_DIRHAM="MAD";
	public final static String MOTIVO_AUT_ECI="02";
	public final static String MOTIVO_ANUL_TIMEOUT_ECI="01";
	public final static String MOTIVO_ANUL_ERROR_SISTEMA_ECI="02";
	public final static String NUM_ID_TRANS_ECI = "999999";
	public final static String COD_ACCION_APROBADA_ECI = "00";
	public final static String COD_ACCION_DENEGADA_ECI = "02";
	public final static String COD_ACCION_SESIONCERRADA_ECI = "03";
	public final static String COD_ACCION_ERROR_DATOS_ECI = "05";
	public final static String COD_ACCION_ERROR_SISTEMA_ECI = "06";
	public final static String COD_ACCION_ANULADA_ECI = "08";
	public final static String COD_ACCION_NO_ANULADA_ECI = "09";
	public final static String COD_ACCION_CONCILIA_ACUERDO_ECI = "500";
	public final static String COD_ACCION_CONCILIA_DESACUERDO_ECI = "501";
	public final static String PTO_CAPTURA_CONPISTA2 = "0";
	public final static String CODIGO_ANULACION_ACEPTADA_ECI = "08";
	
	
	/************************************************************ 
	 * 			LONGITUD CAMPOS DE ECI 
	 ************************************************************/
	public final static int LENGTH_COD_MSG = 4;
	public final static int LENGTH_PAN_ECI = 17;
	public final static int LENGTH_TIPO_OPERACION = 17;
	public final static int LENGTH_ID_TERMINAL_ECI = 4;
	public final static int LENGTH_NUM_OPER_ECI = 6;
	public final static int LENGTH_PISTA2_ECI = 37;
	public final static int LENGTH_CODFUC_ECI = 15;
	public final static int LENGTH_PIN_ECI = 8;
	public final static int LENGTH_SEGURIDAD_PIN_ECI = 16;
	public final static int LENGTH_NUMSEC_ECI_EMV = 3;
	public final static int LENGTH_DATOS_EMV_ECI = 303;
	public final static int LENGTH_PARAMETROS_EMV_ECI = 50;
	public final static int LENGTH_ECI_COD4DBC = 8;
	public final static int LENGTH_ECI_FILLER = 13;
	public final static int LENGTH_ECI_FILLER_DEV = 5;
	public final static int LENGTH_NUM_TRANSACCIONES= 10 ;
	public final static int LENGTH_IMPORTE_TRANSACCIONES = 16;
	public final static int LENGTH_COD_EMPRESA_ECI = 3;	
	public final static int LENGTH_ID_TRANSACCION_ECI = 6;
	public final static int LENGTH_ECI_ANUL_FILLER = 51;
	// para permitir mostrar como texto plano los datosAdicionales que utilizar CHEQUEMOTIVA para el ticket 
	public static final String DATO_ADICIONAL_TEXTO = "DATO_ADICIONAL_TEXTO";

	// separador utilizado para los datos de la Respuesta de CHEQUEMOTIVA almacenados en el campo datosAdicionales
	public static final String SEPARADOR_RESP_CHEQUE = "-";
	

	static public class CODIGO_PROCESO{
		public final static String VENTA = "000000";
		public final static String DEVOLUCION = "200000";
	}
	
	static public class CODIGO_PROCESO_Q8{
		public final static String VENTA = "000000";
		public final static String DEVOLUCION = "000000";
	}
	
	static public class CODIGO_MENSAJE{
		public final static String PETICION_CONTABLE_REQ = "1200";
		public final static String PETICION_CONTABLE_RES = "1210";
		public final static String COMUNICACION_CONTABLE_REQ = "1220";
		public final static String COMUNICACION_CONTABLE_RES = "1230";
		public final static String ANULACION_REQ = "1420";
		public final static String ANULACION_RES = "1430";
		public final static String CONCILIACION_REQ = "1520";
		public final static String CONCILIACION_RES = "1530";
		public final static String NO_RECONOCIBLE_RES = "1644";
	}

	static public class CODIGO_MENSAJE_IFSF_GALP{
		public final static String AUTHORIZATION_TRANSACTION_REQ = "1100";
		public final static String AUTHORIZATION_TRANSACTION_RES = "1110";
		public final static String FINANCIAL_TRANSACTION_REQ = "1200";
		public final static String FINANCIAL_TRANSACTION_REQ_REP = "1201";
		public final static String FINANCIAL_TRANSACTION_RES = "1210";
		public final static String FINANCIAL_TRANSACTION_ADVICE_REQ = "1220";
		public final static String FINANCIAL_TRANSACTION_ADVICE_REQ_REP = "1221";
		public final static String FINANCIAL_TRANSACTION_ADVICE_RES = "1230";
		public final static String REVERSAL_ADVICE_REQ = "1420";
		public final static String REVERSAL_ADVICE_REQ_REP = "1421";
		public final static String REVERSAL_ADVICE_RES = "1430";
		public final static String RECONCILIACION_REQ = "1520";
		public final static String RECONCILIACION_REQ_REP = "1521";
		public final static String RECONCILIACION_RES = "1530";
		public final static String NETWORK_MANAGEMENT_REQ = "1820";
		public final static String NETWORK_MANAGEMENT_RES = "1830";
		public final static String NO_RECONOCIBLE_RES = "1644";
		public final static String MONEDA = "EUR";
		public final static String MONEDA_CIERRE = "978";
	}
	// longitud campos protocolo IFSF GALP. 
	static public class L_CAMPOS_GALP{
		public final static int LENGTH_IMPORTE_OUT = 12;
		public final static int LENGTH_PROCESO = 6;
		public final static int LENGTH_FECHA_TRANSMISION = 10;
		public final static int LENGTH_FECHA_RECONCILIACION = 6;
		public final static int LENGTH_TRANSACCION = 6;
		public final static int LENGTH_FECHA_TRANSACCION = 12;
		public final static int LENGTH_IMPORTE_IN = 24;
		public final static int LENGTH_APPROVAL_CODE = 6;
		public final static int LENGTH_ACTION_CODE = 3;
		public final static int LENGTH_CODIGO_MONEDA = 3;
		public final static int LENGTH_NUM_OPERACIONES = 10;
		public final static int LENGTH_SUMA_OPERACIONES = 16;
		public final static int LENGTH_TOTAL_CRED_DEB = 17;
		public final static int LENGTH_DATOS_SERVICIO = 12;
		public final static int LENGTH_RAZON = 4;
		public final static int LENGTH_ID_TERMINAL = 8;
		public final static int LENGTH_ID_COM = 15;
		public final static int LENGTH_PINBLOCK = 8;
		public final static int LENGTH_MAC = 8;
		public final static int LENGTH_FUNCION = 3;
	}
	
	public final static String CODIGO_EMPLEADO_GALP = "1";

	public static final String BLOQUE_EMV = "EMV";
	public static final String BLOQUE_CONTACTLESS = "CLS";
	public static final String BLOQUE_DCC = "DCC";
	
	static public class MESSAGE_REASON_CODE_GALP{
		public final static String CODIGO_RAZON_DEVOLUCION_CLIENTE = "4000";
		public final static String CODIGO_RAZON_ANULACION_GENERAL = "4007";
		public final static String CODIGO_RAZON_ANULACION_TIMEOUT = "4021";
	}

	static public class ID_DATO_ADICIONAL_GALP{
		public final static String ID_KM	= "4";
		public final static String ID_VEHICULO	= "1";
		public final static String ID_MATRICULA = "2";
		public final static String ID_CONDUCTOR = "3";
	}
	
	static public class ID_DATO_ADICIONAL_FDI{
		public final static String KEY_KM = "/B";
		public final static String KEY_VEHICULO = "/F";
		public final static String KEY_MATRICULA = "/E";
		public final static String KEY_CONDUCTOR = "/D";
		public final static String KEY_VALE = "/W";
		public final static String KEY_PBC = "/G";
		public final static String KEY_ID_PASSPORTNUMBER = "/C";
	}
	
	static public class ID_DATO_ADICIONAL_BIPDRIVE{
		public final static String KEY_TOKEN = "/b";
	}
	
	static public class ID_DATO_ADICIONAL_EUROWAG {
		public final static String MATRICULA = "1";
		public final static String LICENCIA = "3";
		public final static String KILOMETRAJE = "4";
		public final static String ID_UNIT_OR_FLEET = "5";
		public final static String DATO_ADICIONAL= "G";
		public final static String REEMPLAZO = "Q";
		public final static String COD_CONDUCTOR = "R";
	}
	
	static public class ID_DATO_ADICIONAL_CIERRE{
		public final static String KEY_COM400 = "COM400";
	}
	
	static public class TIPO_PRODUCTO_GALP{
		public final static String LITROS = "L";
		public final static String OTROS	 = "O";
		public final static String NONFUEL	 = "U";
	}	

	static public class TIPO_CIERRE_GALP{
		public final static String FROTA = "FROTA";
		public final static String BONUS = "BONOCARD";
	}	

	static public class COD_PROPCESO_GALP{
		public final static String SALE 				 = "000000";
		public final static String CONFIR_BONUS 		 = "170000";
		public final static String BONUS_BALANCE_ENQUIRY = "380000";
		public final static String REFUND_WMCARD		 = "290000";
	}	
	static public class COD_ACCION_GALP{
		public final static String DEVOLUCION = "000";
		public final static String RESPUESTA_DEVOLUCION_OK = "000";
		public final static String RESPUESTA_CONFIRMACION_OK = "000";
		public final static String RESPUESTA_ANULACION_OK = "400";
	}	
	
	static public class COD_FUNCION_GALP
	{
		public final static String CODIGO_FUNCION_ANULACION_BONIFICACION = "200";
	}
	
	static public class COD_ACCION_IFSFPOS{
		public final static String DEVOLUCION = "000";
		public final static String RESPUESTA_DEVOLUCION_OK = "000";
		public final static String RESPUESTA_CONFIRMACION_OK = "000";
		public final static String RESPUESTA_ANULACION_OK = "400";
	}
	static public class COD_ACCION_CEPSA{
		public final static String DEVOLUCION = "000";
		public final static String RESPUESTA_DEVOLUCION_OK = "000";
		public final static String RESPUESTA_CONFIRMACION_PREAUT_OK = "000";
		public final static String RESPUESTA_CANCELACION_PREAUT_OK = "000";
		public final static String RESPUESTA_ANULACION_OK = "400";
		public final static String RESPUESTA_NOTIFICACION_OK = "500";
	}
	
	static public class COD_ACCION_DKV{
		public final static String DEVOLUCION = "000";
		public final static String RESPUESTA_DEVOLUCION_OK = "000";
		public final static String RESPUESTA_CONFIRMACION_PREAUT_OK = "000";
		public final static String RESPUESTA_CANCELACION_PREAUT_OK = "000";
		public final static String RESPUESTA_ANULACION_OK = "400";
	}
	
	static public class COD_ACCION_BIPDRIVE{
		public final static String DEVOLUCION = "000";
		public final static String RESPUESTA_DEVOLUCION_OK = "000";
		public final static String RESPUESTA_CONFIRMACION_PREAUT_OK = "000";
		public final static String RESPUESTA_CANCELACION_PREAUT_OK = "000";
		public final static String RESPUESTA_ANULACION_OK = "400";
	}
	
	static public class COD_ACCION_VALCARCE{
		public final static String DEVOLUCION = "000";
		public final static String RESPUESTA_DEVOLUCION_OK = "000";
		public final static String RESPUESTA_CONFIRMACION_PREAUT_OK = "000";
		public final static String RESPUESTA_CANCELACION_PREAUT_OK = "000";
		public final static String RESPUESTA_ANULACION_OK = "400";
	}
	
	static public class COD_ACCION_NECTAR{
		public final static String DEVOLUCION = "000";
		public final static String RESPUESTA_DEVOLUCION_OK = "000";
		public final static String RESPUESTA_CONFIRMACION_PREAUT_OK = "000";
		public final static String RESPUESTA_CANCELACION_PREAUT_OK = "000";
		public final static String RESPUESTA_ANULACION_OK = "400";
	}
	
	static public class COD_ACCION_UTA{
		public final static String DEVOLUCION = "000";
		public final static String RESPUESTA_DEVOLUCION_OK = "000";
		public final static String RESPUESTA_CONFIRMACION_PREAUT_OK = "000";
		public final static String RESPUESTA_CANCELACION_PREAUT_OK = "000";
		public final static String RESPUESTA_ANULACION_OK = "400";
	}

	static public class COD_ACCION_MOVEUP{
		public final static String DEVOLUCION = "000";
		public final static String RESPUESTA_DEVOLUCION_OK = "000";
		public final static String RESPUESTA_CONFIRMACION_PREAUT_OK = "000";
		public final static String RESPUESTA_CANCELACION_PREAUT_OK = "000";
		public final static String RESPUESTA_ANULACION_OK = "400";
	}
	
	static public class DATOS_COMUNES_MOVEUP{
		public final static String MERCHANT_TYHPE = "5541";
		public final static String CARD_SEQUENCE_NUMBER = "000";
		public final static String POI = "04";
		public final static String ACQUIRING_INSTITUTION_ID = "55410";
		public final static String FORWARDING_INSTITUTION_ID = "55410";
		public final static String CARD_ACCEPTOR_S1 = "MTH24SPAIN";
		public final static String CARD_ACCEPTOR_S3 = "ALCOBENDAS";
		public final static String CARD_ACCEPTOR_S5 = "ESP";
	}
	
	static public class COD_ACCION_E100{
		public final static String RESPUESTA_CONFIRMACION_PREAUT_OK = "000";
	}
	static public class COD_ACCION_UKFUEL{
		public final static String RESPUESTA_CONFIRMACION_PREAUT_OK = "000";
	}
	
	static public class COD_ACCION_EUROWAG {
		public final static String DEVOLUCION = "000";
		public final static String RESPUESTA_DEVOLUCION_OK = "000";
		public final static String RESPUESTA_CONFIRMACION_PREAUT_OK = "000";
		public final static String RESPUESTA_CANCELACION_PREAUT_OK = "000";
		public final static String RESPUESTA_ANULACION_OK = "400";
	}

	static public class COD_RAZON_GALP{
		public final static String DEVOLUCION = "4000";
		public final static String DENIEGA_TERMINAL = "4007";
		public final static String INVALID_RESPONSE_MAC = "4020";
		public final static String TIMEOUT = "4021";
		public final static String FIRMA_NO_COINCIDE = "4351";
		public final static String DENIEGA_TARJETA = "4352";
		public final static String ERROR_CHIP = "4353";
		public final static String ERROR_SYSTEM = "4354";
		public final static String OFFILINE_TRAN = "1007";
		public final static String MANUAL_DATA_ENTRY = "1377";
	}	
	
	static public class COD_ACCION_ALLSTAR{
		public final static String DEVOLUCION = "000";
		public final static String RESPUESTA_DEVOLUCION_OK = "000";
		public final static String RESPUESTA_CONFIRMACION_PREAUT_OK = "000";
		public final static String RESPUESTA_CANCELACION_PREAUT_OK = "000";
		public final static String RESPUESTA_ANULACION_OK = "400";
	}

	static public class COD_ACCION_LOGPAY{
		public final static String DEVOLUCION = "000";
		public final static String RESPUESTA_DEVOLUCION_OK = "000";
		public final static String RESPUESTA_CONFIRMACION_PREAUT_OK = "000";
		public final static String RESPUESTA_CANCELACION_PREAUT_OK = "000";
		public final static String RESPUESTA_ANULACION_OK = "400";
	}
	
	static public class COD_RAZON_ALLSTAR_IFSF{
		public final static String DEVOLUCION = "4000";
		public final static String TIMEOUT = "4021";
		//public final static String FIRMA_NO_COINCIDE = "4351";
		public final static String MAC_ERRONEO_PETICION = "4020";
		public final static String ANULACION_GENERAL = "4354";
		public final static String TERMINAL_PROCESSED = "1004";
		//public final static String STAND_IN = "1003";
	}

	static public class L_CAMPOS_IFSF{
		public final static int LENGTH_IMPORTE_OUT = 12;
		public final static int LENGTH_PROCESO = 6;
		public final static int LENGTH_FECHA_TRANSMISION = 10;
		public final static int LENGTH_FECHA_ACTIVACION = 4;
		public final static int LENGTH_FECHA_CADUCIDAD = 4;
		public final static int LENGTH_FECHA_ACUERDO = 6;
		public final static int LENGTH_FECHA_RECONCILIACION = 6;
		public final static int LENGTH_TRANSACCION = 6;
		public final static int LENGTH_FECHA_TRANSACCION = 12;
		public final static int LENGTH_IMPORTE_IN = 24;
		public final static int LENGTH_APPROVAL_CODE = 6;
		public final static int LENGTH_ACTION_CODE = 3;
		public final static int LENGTH_CODIGO_MONEDA = 3;
		public final static int LENGTH_NUM_OPERACIONES = 10;
		public final static int LENGTH_SUMA_OPERACIONES = 16;
		public final static int LENGTH_TOTAL_CRED_DEB = 17;
		public final static int LENGTH_CODIGO_PAIS = 3;
		public final static int LENGTH_DATOS_SERVICIO = 12;
		public final static int LENGTH_PAN_SEQUENCE_NUMBER = 3;
		public final static int LENGTH_RAZON = 4;
		public final static int LENGTH_ID_TERMINAL = 8;
		public final static int LENGTH_ID_COM = 15;
		public final static int LENGTH_PINBLOCK = 8;
		public final static int LENGTH_MAC = 8;
		public final static int LENGTH_FUNCION = 3;
	}
	
	static public class L_CODIGOS_PAIS_IFSF{
		public final static String SPAIN = "724";
		public final static String PORTUGAL = "620";
		public final static String FRANCIA = "250";
		public final static String ITALIA = "380";
	}
	
	static public class L_CODIGOS_LENGUAJE_IFSF{
		public final static String SPANISH = "es";
		public final static String PORTUGUES = "pt";
		public final static String FRANCES = "fr";
		public final static String ITALIANO = "it";
		public final static String INGLES = "en";
		public final static String ALEMAN = "de";
	}
	
	static public class CODIGO_MENSAJE_IFSF{
		public final static String AUTHORIZATION_TRANSACTION_REQ = "1100";
		public final static String AUTHORIZATION_TRANSACTION_RES = "1110";
		public final static String FINANCIAL_TRANSACTION_REQ = "1200";
		public final static String FINANCIAL_TRANSACTION_REQ_REP = "1201";
		public final static String FINANCIAL_TRANSACTION_RES = "1210";
		public final static String FINANCIAL_TRANSACTION_ADVICE_REQ = "1220";
		public final static String FINANCIAL_TRANSACTION_ADVICE_REQ_REP = "1221";
		public final static String FINANCIAL_TRANSACTION_ADVICE_RES = "1230";
		public final static String REVERSAL_ADVICE_REQ = "1420";
		public final static String REVERSAL_ADVICE_REQ_REP = "1421";
		public final static String REVERSAL_ADVICE_RES = "1430";
		public final static String RECONCILIACION_REQ = "1520";
		public final static String RECONCILIACION_REQ_REP = "1521";
		public final static String RECONCILIACION_RES = "1530";
		public final static String NO_RECONOCIBLE_RES = "1644";
		public final static String MONEDA = "978";
		public final static String MONEDA_CIERRE = "978";
		public final static String MONEDA_CIERRE_UK = "826";
		public final static String BALANCE_INQUIRY_REQ = "9900";
		public final static String BALANCE_INQUIRY_RES = "9910";
		public final static String FIDELITY_BALANCE_INQUIRY_REQ = "9900" ;
		public final static String FIDELITY_BALANCE_INQUIRY_RES = "9910" ;
		//Estos solo valen para fidelidad cepsa, para recuperar las constantes de los mensajes
		//1200 y 1220 que tienen un codigo de funcion diferente 290 y 490 
		public final static String FIDELITY_FINANCIAL_TRANSACTION_REQ_ACC = "1200";
		public final static String FIDELITY_FINANCIAL_TRANSACTION_REQ = "1250";
		public final static String FIDELITY_FINANCIAL_TRANSACTION_ADVICE_REQ = "1270";
		public final static String FIDELITY_MONEDA = "999";

		//Peticion Otorgacion Puntos SFC CEPSA
		public final static String PETICION_PUNTOS_SFC_ENV = "0001";
		public final static String PETICION_PUNTOS_SFC_RES = "0011";
		public final static String PETICION_PUNTOS_STC_ENV = "0002";
		public final static String PETICION_PUNTOS_STC_RES = "0012";
	}
	
	// BERNA: Codigos de Mensaje para MoveUP
	static public class CODIGO_MENSAJE_MOVEUP{
		public final static String AUTHORIZATION_TRANSACTION_REQ = "0100";
		public final static String AUTHORIZATION_TRANSACTION_RES = "0110";
		public final static String REVERSAL_ADVICE_REQ = "0400";
		public final static String REVERSAL_ADVICE_REQ_REP = "0411";
		public final static String REVERSAL_ADVICE_RES = "0410";
	}
	
	static public class DATOS_SERVICIO_DKV{
		public final static String INPUT_CAPABILITY_CARD = "D";
		public final static String AUTHENTICATION_CAPABILITY_PIN = "1";
		public final static String CARD_CAPTURE_CAPABILITY_NONE = "0";
		public final static String CARD_CAPTURE_CAPABILITY_CAPTURE = "1";
		public final static String OPERATING_ENVIRONMENT_IPT = "1";
		public final static String OPERATING_ENVIRONMENT_OPT = "2";
		public final static String CLIENTE_PRESENTE = "0";
		public final static String CLIENTE_NO_PRESENTE = "1";
		public final static String TRJ_PRESENTE = "1";
		public final static String TRJ_NO_PRESENTE = "0";
		public final static String SIN_AUTENTICACION = "0";
		public final static String CON_PIN = "1";
		public final static String FIRMA = "5";
		public final static String IDENTIFICA_AUT = "3";
		public final static String IDENTIFICA_COMERCIO = "4";
		public final static String NO_ACTUALIZA_TARJETA = "1";
		public final static String DISPLAY_IMPRESORA = "4";
		public final static String LENGTH_PIN = "4";
		public static final Object CAPTURA_MANUAL = 6;
		public static final Object CAPTURA_LECTOR = 2;
	}
	
	static public class DATOS_SERVICIO_BIPDRIVE{
		public final static String INPUT_CAPABILITY_CARD = "C";
		public final static String AUTHENTICATION_CAPABILITY_PIN = "5";
		public final static String CARD_CAPTURE_CAPABILITY_NONE = "0";
		public final static String CARD_CAPTURE_CAPABILITY_CAPTURE = "1";
		public final static String OPERATING_ENVIRONMENT_IPT = "1";
		public final static String OPERATING_ENVIRONMENT_OPT = "2";
		public final static String CLIENTE_PRESENTE = "0";
		public final static String CLIENTE_NO_PRESENTE = "1";
		public final static String TRJ_PRESENTE = "1";
		public final static String TRJ_NO_PRESENTE = "0";
		public final static String SIN_AUTENTICACION = "0";
		public final static String CON_PIN = "1";
		public final static String FIRMA = "5";
		public final static String IDENTIFICA_AUT = "3";
		public final static String IDENTIFICA_COMERCIO = "4";
		public final static String NO_ACTUALIZA_TARJETA = "1";
		public final static String DISPLAY_IMPRESORA = "4";
		public final static String LENGTH_PIN = "0";
		public static final Object CAPTURA_MANUAL = 6;
		public static final Object CAPTURA_LECTOR = 2;
	}
	
	static public class DATOS_SERVICIO_VALCARCE{
		public final static String INPUT_CAPABILITY_CARD = "C";
		public final static String AUTHENTICATION_CAPABILITY_PIN = "5";
		public final static String CARD_CAPTURE_CAPABILITY_NONE = "0";
		public final static String CARD_CAPTURE_CAPABILITY_CAPTURE = "1";
		public final static String OPERATING_ENVIRONMENT_IPT = "1";
		public final static String OPERATING_ENVIRONMENT_OPT = "2";
		public final static String CLIENTE_PRESENTE = "0";
		public final static String CLIENTE_NO_PRESENTE = "1";
		public final static String TRJ_PRESENTE = "1";
		public final static String TRJ_NO_PRESENTE = "0";
		public final static String SIN_AUTENTICACION = "0";
		public final static String CON_PIN = "1";
		public final static String FIRMA = "5";
		public final static String IDENTIFICA_AUT = "3";
		public final static String IDENTIFICA_COMERCIO = "4";
		public final static String NO_ACTUALIZA_TARJETA = "1";
		public final static String DISPLAY_IMPRESORA = "4";
		public final static String LENGTH_PIN = "0";
		public static final Object CAPTURA_MANUAL = 6;
		public static final Object CAPTURA_LECTOR = 2;
	}
	
	static public class DATOS_SERVICIO_NECTAR{
		public final static String INPUT_CAPABILITY_CARD = "C";
		public final static String AUTHENTICATION_CAPABILITY_PIN = "5";
		public final static String CARD_CAPTURE_CAPABILITY_NONE = "0";
		public final static String CARD_CAPTURE_CAPABILITY_CAPTURE = "1";
		public final static String OPERATING_ENVIRONMENT_IPT = "1";
		public final static String OPERATING_ENVIRONMENT_OPT = "2";
		public final static String CLIENTE_PRESENTE = "0";
		public final static String CLIENTE_NO_PRESENTE = "1";
		public final static String TRJ_PRESENTE = "1";
		public final static String TRJ_NO_PRESENTE = "0";
		public final static String SIN_AUTENTICACION = "0";
		public final static String CON_PIN = "1";
		public final static String FIRMA = "5";
		public final static String IDENTIFICA_AUT = "3";
		public final static String IDENTIFICA_COMERCIO = "4";
		public final static String NO_ACTUALIZA_TARJETA = "1";
		public final static String DISPLAY_IMPRESORA = "4";
		public final static String LENGTH_PIN = "0";
		public static final Object CAPTURA_MANUAL = 6;
		public static final Object CAPTURA_LECTOR = 2;
	}
	static public class DATOS_SERVICIO_E100{
		public final static String INPUT_CAPABILITY_CARD = "B";
		public final static String AUTHENTICATION_CAPABILITY_PIN = "1";
		public final static String CARD_CAPTURE_CAPABILITY_NONE = "0";
		public final static String CARD_CAPTURE_CAPABILITY_CAPTURE = "T";
		public final static String OPERATING_ENVIRONMENT_IPT = "1";
		public final static String OPERATING_ENVIRONMENT_OPT = "2";
		public final static String CLIENTE_PRESENTE = "0";
		public final static String TRJ_PRESENTE = "1";
		public static final String CAPTURA_MANUAL = "6";
		public static final String CAPTURA_LECTOR = "2";
		public final static String CON_PIN = "1";
		public final static String FIRMA = "5";
		public final static String IDENTIFICA_AUT = "3";
		public final static String NO_ACTUALIZA_TARJETA = "1";
		public final static String DISPLAY_IMPRESORA = "4";
		public final static String LENGTH_PIN = "C";
	}
	static public class DATOS_SERVICIO_EUROWAG{
		public final static String INPUT_CAPABILITY_CARD = "B";
		public final static String AUTHENTICATION_CAPABILITY_PIN = "1";
		public final static String CARD_CAPTURE_CAPABILITY_NONE = "0";
		public final static String CARD_CAPTURE_CAPABILITY_CAPTURE = "1";
		public final static String OPERATING_ENVIRONMENT_IPT = "1";
		public final static String OPERATING_ENVIRONMENT_OPT = "2";
		public final static String CLIENTE_PRESENTE = "0";
		public final static String TRJ_PRESENTE = "1";
		public static final String CAPTURA_MANUAL = "6";
		public static final String CAPTURA_LECTOR = "2";
		public final static String CON_PIN = "1";
		public final static String FIRMA = "5";
		public final static String IDENTIFICA_AUT = "2";
		public final static String NO_ACTUALIZA_TARJETA = "1";
		public final static String DISPLAY_IMPRESORA = "4";
		public final static String LENGTH_PIN = "C";
		public final static String CARDID = "CARDID";
	}
	
	static public class DATOS_SERVICIO_LOGPAY{
		public final static String INPUT_CAPABILITY_CARD = "C";
		public final static String AUTHENTICATION_CAPABILITY_PIN = "1";
		public final static String CARD_CAPTURE_CAPABILITY_NONE = "0";
		public final static String CARD_CAPTURE_CAPABILITY_CAPTURE = "1";
		public final static String OPERATING_ENVIRONMENT_IPT = "1";
		public final static String OPERATING_ENVIRONMENT_OPT = "2";
		public final static String CLIENTE_PRESENTE = "0";
		public final static String CLIENTE_NO_PRESENTE = "1";
		public final static String TRJ_PRESENTE = "1";
		public final static String TRJ_NO_PRESENTE = "0";
		public final static String SIN_AUTENTICACION = "0";
		public final static String CON_PIN = "1";
		public final static String FIRMA = "5";
		public final static String IDENTIFICA_AUT = "3";
		public final static String IDENTIFICA_COMERCIO = "4";
		public final static String IDENTIFICA_SIGNATURE = "5";
		public final static String NO_ACTUALIZA_TARJETA = "0";
//		public final static String NO_ACTUALIZA_TARJETA = "1";
		public final static String DISPLAY_IMPRESORA = "0";
//		public final static String DISPLAY_IMPRESORA = "4";
		public final static String LENGTH_PIN = "4";
		public static final Object CAPTURA_MANUAL = 6;
		public static final Object CAPTURA_LECTOR = 2;
	}
	static public class ID_DATO_ADICIONAL_IFSF{
		public final static String ID_NUMBER	= "0";
		public final static String ID_VEHICULO	= "1";
		public final static String ID_CONDUCTOR = "3";
		public final static String ID_KM	= "4";
		public final static String ID_UNIT_OR_FLEET	= "B";
		public final static String ID_ALPHANUMERIC_DATA = "G";
	}

	static public class TIPO_PRODUCTO_IFSF{
		public final static String LITROS = "L";
		public final static String PESO = "W";
		public final static String OTROS = " ";
		public final static String UNIDADES = "U";
	}	
	
	static public class COD_PROCESO_IFSF{
		public final static String SALE = "000000";
		public final static String REFUND = "200000";
		public final static String BONUS_BALANCE_ENQUIRY = "380000";
		public final static String RECHARGE_BALANCE = "180000";
		public final static String REFUND_RECHARGE_BALANCE = "280000";
		public final static String BALANCE_ENQUIRY = "390000";
		public final static String FIDELITY_BALANCE_ENQUIRY = "390000";
		public final static String FIDELITY_SALE = "190000";
		public final static String FIDELITY_REFUND = "290000";
	}	

	static public class COD_RAZON_IFSF{
		public final static String DEVOLUCION = "4000";
		public final static String TIMEOUT = "4021";
		public final static String FIRMA_NO_COINCIDE = "4351";
		public final static String ANULACION_GENERAL = "4007";
		public final static String TERMINAL_PROCESSED = "1004";
		public final static String STAND_IN = "1003";
	}
	
	static public class COD_PROCESO_CEPSA_IFSF{
		public final static String PREAUT = "000000";
		public final static String SALE = "190000";
		public final static String REFUND = "200000";
		public final static String BALANCE_INQUIRY = "390000";
		public final static String PET_CONT_COMER = "100000";
		public final static String BONUS_RECHARGAE_BALANCE = "180000";
		public final static String REFOUND_BONUS_RECHARGAE_BALANCE = "280000";
	}
	
	static public class COD_FUNCION_CEPSA_IFSF{
		public final static String PET_CONT_COMER = "100";
		public final static String SALES = "200";
		public final static String ORIGINAL_REQUEST = "290";
		public final static String PREVIUS_AUTH_APPROVED = "291";
		public final static String CANCEL_PREAUT = "400";
		public final static String TRANSACTION_FAILED = "490";
		public final static String BALANCE_INQUIRY = "900";
	}
	
	static public class COD_RAZON_CEPSA_IFSF{
		public final static String DEVOLUCION = "4000";
		public final static String TIMEOUT = "4021";
		//public final static String FIRMA_NO_COINCIDE = "4351";
		public final static String MAC_ERRONEO_PETICION = "4020";
		public final static String ANULACION_GENERAL = "4354";
		public final static String TERMINAL_PROCESSED = "1004";
		//public final static String STAND_IN = "1003";
	}
	
	static public class COD_RAZON_DKV_IFSF{
		public final static String DEVOLUCION = "4000";
		public final static String TIMEOUT = "4021";
		//public final static String FIRMA_NO_COINCIDE = "4351";
		public final static String MAC_ERRONEO_PETICION = "4020";
		public final static String ANULACION_GENERAL = "4354";
		public final static String TERMINAL_PROCESSED = "1004";
		//public final static String STAND_IN = "1003";
	}
	
	static public class COD_RAZON_UTA_IFSF{
		public final static String DEVOLUCION = "4000";
		public final static String TIMEOUT = "4021";
		//public final static String FIRMA_NO_COINCIDE = "4351";
		public final static String MAC_ERRONEO_PETICION = "4020";
		public final static String ANULACION_GENERAL = "4354";
		public final static String TERMINAL_PROCESSED = "1004";
		//public final static String STAND_IN = "1003";
	}
	
	static public class COD_RAZON_BIPDRIVE_IFSF{
		public final static String DEVOLUCION = "4000";
		public final static String TIMEOUT = "4021";
		//public final static String FIRMA_NO_COINCIDE = "4351";
		public final static String MAC_ERRONEO_PETICION = "4020";
		public final static String ANULACION_GENERAL = "4354";
		public final static String TERMINAL_PROCESSED = "1004";
		//public final static String STAND_IN = "1003";
	}
	
	static public class COD_RAZON_VALCARCE_IFSF{
		public final static String DEVOLUCION = "4000";
		public final static String TIMEOUT = "4021";
		//public final static String FIRMA_NO_COINCIDE = "4351";
		public final static String MAC_ERRONEO_PETICION = "4020";
		public final static String ANULACION_GENERAL = "4354";
		public final static String TERMINAL_PROCESSED = "1004";
		//public final static String STAND_IN = "1003";
	}
	
	static public class COD_RAZON_NECTAR_IFSF{
		public final static String DEVOLUCION = "4000";
		public final static String TIMEOUT = "4021";
		//public final static String FIRMA_NO_COINCIDE = "4351";
		public final static String MAC_ERRONEO_PETICION = "4020";
		public final static String ANULACION_GENERAL = "4354";
		public final static String TERMINAL_PROCESSED = "1004";
		//public final static String STAND_IN = "1003";
	}
	static public class COD_RAZON_MOVEUP{
		public final static String DEVOLUCION = "4000";
		public final static String TIMEOUT = "4021";
		//public final static String FIRMA_NO_COINCIDE = "4351";
		public final static String MAC_ERRONEO_PETICION = "4020";
		public final static String ANULACION_GENERAL = "4354";
		public final static String TERMINAL_PROCESSED = "1004";
		//public final static String STAND_IN = "1003";
	}
	
	static public class COD_ACCION_IFSF{
		public final static String RESPUESTA_DEVOLUCION_OK_2 = "901";
		public final static String RESPUESTA_DEVOLUCION_OK_1 = "900";
		public final static String RESPUESTA_ANULACION_OK = "400";
		public final static String RESPUESTA_CIERRE_OK = "500";
		public final static String RESPUESTA_CIERRE_DESCUADRE = "500";
	}
	
	static public class COD_DISCOUNT_MEASUREMENT_IFSF{
		public final static String NOT_PRESENT = "00";
		public final static String CURRENCY_AMOUNT = "01";
	}

	static public class COD_PROPCESO_RESSA{
		public final static String SALE = "000000";
		public final static String REFUND = "200000";
		public final static String CONSULTA_SALDO = "000030";
	}
	
	// Constantes DISA
	public final static String NEMO_IFSF_DISA = "DISAEXT";
	public final static String TIPO_BONIFICACION = "TIP_BON";
	public final static String DESCUENTO_NETO = "DES_NETO";
	public final static String ACU_MONEDERO = "ACU_IMP_CRD_MONEDERO";
	public final static String ACU_FECHA_CAD_SALDO = "FECHA_CAD_SALDO"; //BERNA 20171003 DISA_MONEDERO
	
	// Codigos de proceso
	static public class COD_PROCESO_DISA{
		public final static String SALE = "000000";
		public final static String REFUND = "200000";
		public final static String VALE_SALE = "180000";
		public final static String VALE_REFUND = "180000";
		public final static String BONUS_SALE = "170000";
		public final static String BONUS_REFUND = "170000";
		public final static String BONUS_RESCUE_SALE = "190000";
		public final static String BONUS_RESCUE_REFUND = "190000";
		public final static String BONUS_BALANCE_ENQUIRY = "380000";		
	}
	
	static public class COD_RAZON_LOGPAY_IFSF{
		public final static String DEVOLUCION = "4000";
		public final static String TIMEOUT = "4021";
		//public final static String FIRMA_NO_COINCIDE = "4351";
		public final static String MAC_ERRONEO_PETICION = "4020";
		public final static String ANULACION_GENERAL = "4354";
		public final static String TERMINAL_PROCESSED = "1004";
		//public final static String STAND_IN = "1003";
	}
	static public class INFORMATION_MONITOR{
		static public class CODIGOS_DE_RAZON {
			public final static int ERRCTX = 800; // Error de conexion
			public final static int ERRTMO = 801; // Error de timeout esperando la respuesta
			public final static int ERRTOR = 802; // Error de timeout esperando la respuesta, se reintenta el envio de la peticion
			public final static int ERRPAR = 803; // Error de parseo de la respuesta
			public final static int ERRGEN = 804; // Error generico en envio / recepcion con el autorizador
			public final static int ERRMSG = 805; // Error de mensaje invalido
			public final static int ERRSTP = 806; // Error, proxy en proceso de detencion
		}
		static public class MSG_ERROR {
			public final static String ERRCTX = "ERRCTX"; // Error de conexion
			public final static String ERRTMO = "ERRTMO"; // Error de timeout esperando la respuesta
			public final static String ERRTOR = "ERRTOR"; // Error de timeout esperando la respuesta, se reintenta el envio de la peticion
			public final static String ERRPAR = "ERRPAR"; // Error de parseo de la respuesta
			public final static String ERRGEN = "ERRGEN"; // Error generico en envio / recepcion con el autorizador
			public final static String ERRMSG = "ERRMSG"; // Error de mensaje invalido
			public final static String ERRSTP = "ERRSTP"; // Error, proxy en proceso de detencion	
		}		
		/**
		 * Enumerado que asocia CODIGOS_DE_RAZON con su MSG_ERROR
		 * @author jorge.puig
		 */
		public enum ErrorMonitor
		{
			CONEXION( CODIGOS_DE_RAZON.ERRCTX, 
			          MSG_ERROR.ERRCTX ),
			TIMEOUT_RESPUESTA( CODIGOS_DE_RAZON.ERRTMO, 
			 		           MSG_ERROR.ERRTMO ),
			TIMEOUT_RESP_REINTENTAR( CODIGOS_DE_RAZON.ERRTOR, 
			 		           MSG_ERROR.ERRTOR ),
			PARSEO_RESPUESTA( CODIGOS_DE_RAZON.ERRPAR, 
			 		           MSG_ERROR.ERRPAR ),
			ERROR_DESCONOCIDO( CODIGOS_DE_RAZON.ERRGEN, 
			 		           MSG_ERROR.ERRGEN ),
			MENSAJE_INVALIDO( CODIGOS_DE_RAZON.ERRMSG, 
			 		           MSG_ERROR.ERRMSG ),
			PROXY_DETENIENDOSE( CODIGOS_DE_RAZON.ERRSTP, 
			 		           MSG_ERROR.ERRSTP );
			
			public Integer codigoRazon;
			public String msgError;		
			
			private ErrorMonitor ( Integer codigoRazon, String msgError )
			{
				this.codigoRazon = codigoRazon;
				this.msgError = msgError;
			}
			
			/**
			 * @param codigo el codigo de razon segun {@link AuthConstants}.INFORMATION_MONITOR.CODIGOS_DE_RAZON
			 * @return el {@link ErrorMonitor} cuyo codigo de razon se pasa por parametro, null si no existe
			 */
			public static ErrorMonitor getByCodigoRazon( Integer codigo )
			{
				ErrorMonitor resultado = null;
				for ( ErrorMonitor error : ErrorMonitor.values() )
				{
					if ( error.codigoRazon.equals( codigo ) )
					{
						resultado = error;
						break;
					}
				}
				return resultado;
			}
			/**
			 * @param mensaje el mensaje de error segun {@link AuthConstants}.INFORMATION_MONITOR.MSG_ERROR
			 * @return el {@link ErrorMonitor} cuyo mensaje de error se pasa por parametro, null si no existe
			 */
			public static ErrorMonitor getByMensajeError( String mensaje )
			{
				ErrorMonitor resultado = null;
				if ( mensaje != null )
				{
					for ( ErrorMonitor error : ErrorMonitor.values() )
					{
						if ( error.msgError.equals( mensaje ) )
						{
							resultado = error;
							break;
						}
					}
				}
				return resultado;
			}
		}
	}
	
	static public class VILAMALLA{
		
		static public class MENSAJES {
			public final static String CODIGO_ACCION_ACP    = "00001";
			
			public final static String NUMERO_CIFRAS_PIN    = "4";
			public final static String CARACTER_FIN_PIN     = "*";
			
			public final static byte SEPARADOR_HASH        = '#';
			public final static byte SEPARADOR_SCORE       = '-';
			public final static byte SEPARADOR_EXCL        = '!';
			public final static byte SEPARADOR_AMP         = '&';
			public final static byte SEPARADOR_PERC        = '%';
			public final static byte SEPARADOR_AST         = '*';
			public final static byte SEPARADOR_DOLL        = '$';
			public final static byte STX                   = 0X02;
			public final static byte ETX                   = 0X03;
			public final static byte EOT 				   = 0X04;
			public final static byte ENQ 				   = 0X05;
			public final static byte ACK 				   = 0X06;
			public final static byte NAK 				   = 0X21;
			

			public final static String ID_VERSION_PROTO    = "0";
			public final static String VERSION_MEMORIA     = "00";
			public final static String VERSION_CLAVES      = "000";
			public final static String FILLER		       = "00";
			
			public final static String MSG_PET_CONEXION    = "S";
			public final static String MSG_PETICION        = "R";
			public final static String MSG_RESPUESTA       = "L";
			public final static String MSG_RESPUESTA_REQ   = "D";			
			public final static String MSG_AUTORIZACION    = "03";
					
			public final static String TIPO_MSG_PETICION_VENTA  		= "1000";
			public final static String TIPO_MSG_RESPUESTA_VENTA 		= "1001";
			public final static String TIPO_MSG_PETICION_DEVOLUCION  	= "1010";
			public final static String TIPO_MSG_RESPUESTA_DEVOLUCION	= "1011";			
			
			public final static String CODIGO_PROCESO_MSG_VENTA 	 = "00";
			public final static String CODIGO_PROCESO_MSG_DEVOLUCION = "01";
			
			public final static String CAB_PET_MSG_AUTOR   = MSG_AUTORIZACION + MSG_PETICION;
			public final static String PIE_PET_MSG_AUTOR   = MSG_PETICION + MSG_AUTORIZACION;
			public final static String CAB_RES_MSG_AUTOR   = MSG_AUTORIZACION + MSG_RESPUESTA;
			public final static String PIE_RES_MSG_AUTOR   = MSG_RESPUESTA + MSG_AUTORIZACION;
			
			public final static String CAB_PET_MSG_CONEX   = MSG_AUTORIZACION + MSG_PET_CONEXION;
			public final static String PIE_PET_MSG_CONEX   = MSG_PET_CONEXION + MSG_AUTORIZACION;
			
			
		}
	}	
	
	static public class CODIGO_MENSAJE_EFI_PETRONIEVES{
		public final static String MSG_PREAUTORIZACION = "27";
		public final static String MSG_CONFIRMACION = "28";
		public final static String MSG_ANULACION_SUMINISTRO = "26";
		public final static String MSG_CIERRE_TURNO = "09";
		public final static String MONEDA = "EUR";
		public final static String MONEDA_CIERRE = "978";
	}
	
	static public class MENSAJE_EFI_PETRONIEVES{

		public final static byte STX = 0X02;
		public final static byte ETX = 0X03;
		public final static byte CR = 0X0D;
		public final static byte LF = 0X0A;
		public final static byte SEPARATOR = (byte)';';
	}
	

	
	static public class POPULAR_PAYMENTS {
		
			static public class COD_MSGS {
				public final static String CODIGO_MSG_VENTA = "0200";
				public final static String CODIGO_MSG_RESPUESTA_VENTA = "0210";

				public final static String CODIGO_MSG_DEVOLUCION = "0220";
				public final static String CODIGO_MSG_CONFIRMACION = "0220";
				public final static String CODIGO_MSG_RESPUESTA_DEVOLUCION = "0230";
				public final static String CODIGO_MSG_REPETICION_DEVOLUCION = "0221";
			
				public final static String CODIGO_MSG_DEVOLUCION_ONLINE = "0200";
				public final static String CODIGO_MSG_RESPUESTA_DEVOLUCION_ONLINE = "0210";

				public final static String CODIGO_MSG_ANULACION = "0420";
				public final static String CODIGO_MSG_RESPUESTA_ANULACION = "0430";
				public final static String CODIGO_MSG_REPETICION_ANULACION = "0421";

				public final static String CODIGO_MSG_CIERRE = "0520";
				public final static String CODIGO_MSG_RESPUESTA_CIERRE = "0530";
				public final static String CODIGO_MSG_REPETICION_CIERRE = "0521";

				public final static String CODIGO_MSG_NO_RECONOCIBLE = "0644";

				public final static String CODIGO_MSG_PREAUTORIZACION = "0100";
				public final static String CODIGO_MSG_RESPUESTA_PREAUT = "0110";
			}	
	
			public final static String CODIGO_RAZON_ANULACION_SALTO_NSM_POPULARPAYMENTS     = "4013";
			public final static String CODIGO_RAZON_ANULACION_TIMEOUT_POPULARPAYMENTS       = "4021";
			public final static String CODIGO_RAZON_ANULACION_ERROR_GENER_POPULARPAYMENTS   = "4017";
	
			static public class LONG_CAMPOS_MSGS{
				public final static int LENGTH_IMPORTE_OUT = 12;
				public final static int LENGTH_IMPORTE_TASA = 9;
				public final static int LENGTH_PROCESO = 6;
				public final static int LENGTH_FECHA_TRANSMISION = 10;
				public final static int LENGTH_RATIO_CONVERSION = 8;
				public final static int LENGTH_TASAS_POR_CONVERSION = 8;
				public final static int LENGTH_TASA_CONVERSION = 8;
				public final static int LENGTH_IMPORTE_TASA_CONVERSION = 8;
				//public final static int LENGTH_FECHA_RECONCILIACION = 6;
				public final static int LENGTH_LON_NUM_AUTOR_ESPERADO_EN_RESP = 1;
				public final static int LENGTH_TRANSACCION = 6;
				public final static int LENGTH_FECHA_TRANSACCION = 4;
				public final static int LENGTH_FECHA_CADUCIDAD = 4;
				public final static int LENGTH_FECHA_CIERRE = 4;
				public final static int LENGTH_FECHA_CONVERSION = 4;
				public final static int LENGTH_MERCHANT_TYPE = 4;
				public final static int LENGTH_COD_PAIS_ADQUIRIENTE = 3;
				public final static int LENGTH_HORA_TRANSACCION = 6;
				public final static int LENGTH_IMPORTE_IN = 24;
				public final static int LENGTH_CODIGO_REFERENCIA = 12;
				public final static int LENGTH_CODIGO_AUTORIZACION = 6;
				public final static int LENGTH_CODIGO_DE_RESPUESTA = 2;
				public final static int LENGTH_CODIGO_RESTRICCION_SERVICIO = 3;
				public final static int LENGTH_CODIGO_MONEDA = 3;
				public final static int LENGTH_NUM_OPERACIONES = 10;
				public final static int LENGTH_SUMA_OPERACIONES = 16;
				public final static int LENGTH_TOTAL_CRED_DEB = 17;
				public final static int LENGTH_POS_ENTRY_MODE = 3;
				public final static int LENGTH_POS_CONDITION_CODE = 2;
				public final static int LENGTH_POS_PIN_CAPTURE_CODE = 2;
				public final static int LENGTH_LONG_NUM_AUTOR = 1;
				public final static int LENGTH_NUM_SEQ_TARJETA = 3;
				public final static int LENGTH_RAZON = 4;
				public final static int LENGTH_ID_TERMINAL = 8;
				public final static int LENGTH_ID_COMERCIO = 15;
				public final static int LENGTH_NOMBRE_Y_UBICACION_COMERCIO = 40;
				public final static int LENGTH_INFO_SEC_Y_CONTROL = 48;
				public final static int LENGTH_PINBLOCK = 8;
				public final static int LENGTH_MAC = 8;
				public final static int LENGTH_CODIGO_DE_RAZON = 4;
				public final static int LENGTH_CODIGO_DE_PAGO_APLAZADO = 2;
				public final static int LENGTH_DATOS_ELEMENTOS_ORIGINALES = 42;
				public final static int LENGTH_IMPORTES_REEMPLAZO = 42;
				public final static int LENGTH_IMPORTES_NETOS_CIERRE = 1+16; // Signo + importe neto
				public final static int LENGTH_S98  = 25;
				public final static int LENGTH_LONG_S127 = 6;
				public final static int LENGTH_SWITCH_KEY = 32;
				public final static int LENGTH_LONG_S127_14 = 8;
				public final static int LENGTH_LONG_S127_25 = 5;
			}
			
			static public class COD_PROCESO {
				public final static String VENTA 		= "000000";
				public final static String DEVOLUCION	= "200000";
				public final static String ANUL_VENTA   = "000000";
				public final static String ANUL_DEV     = "200000";
			}
	
			static public class POS_ENTRY_MODE{
				public final static String MANUAL 		 = "01";
				public final static String STRIPE_NOCVV  = "02";
				public final static String STRIPE_CVV 	 = "90";
				public final static String CLS_STRIPE    = "91";
				public final static String CLS_CHIP      = "07";
				public final static String CHIP_NOCVV    = "95";
				public final static String CHIP_CVV      = "05";
				public final static String UNKNOWN       = "00";
				public final static String SAME_AS_ORIGINAL  = "99";
				public final static String SOPORTE_PIN_DESCONOCIDO  = "0";
				public final static String SOPORTE_PIN_SI  = "1";
				public final static String SOPORTE_PIN_NO  = "2";
			}
	
			static public class POS_CONDITION_CODE{
				public final static String PRESENTACION_NORMAL    = "00";
				public final static String CLIENTE_NO_PRESENTE    = "01";
				public final static String TERMINAL_DESATENDIDO_RETEN  = "02";		
				public final static String PETICION_PREAUTORIZADA = "06";
				public final static String ITEM_DEVUELTO          = "17";
				public final static String ANULACION_MANUAL       = "21";
				public final static String TERMINAL_DESATENDIDO_NO_RETEN  = "27";
				public final static String VENTA_IMPORTE_CERO  = "51";
				public final static String OPERACION_MOTO  = "08";
			}
			
			public final static String S127_25_ICCDATA_HEADER = "17IccData";
			
			public final static String CODIGO_ACCION_RESPUESTA_ANULACION_OK  = "00";
			public final static String CODIGO_ACCION_RESPUESTA_DEVOLUCION_OK = "00";
			public final static String CODIGO_ACCION_RESPUESTA_CIERRE_OK 	 = "00";
	}
	
	static public class SANTANDER_PAGO_SUBV {
		
		static public class COD_MSGS {
			public final static String CODIGO_MSG_VENTA = "0200";
			public final static String CODIGO_MSG_RESPUESTA_VENTA = "0210";

			public final static String CODIGO_MSG_DEVOLUCION = "0220";
			public final static String CODIGO_MSG_CONFIRMACION = "0220";
			public final static String CODIGO_MSG_RESPUESTA_DEVOLUCION = "0230";
			public final static String CODIGO_MSG_REPETICION_DEVOLUCION = "0221";
		
			public final static String CODIGO_MSG_ANULACION = "0420";
			public final static String CODIGO_MSG_RESPUESTA_ANULACION = "0430";
			public final static String CODIGO_MSG_REPETICION_ANULACION = "0421";

			public final static String CODIGO_MSG_CIERRE = "0520";
			public final static String CODIGO_MSG_RESPUESTA_CIERRE = "0530";
			public final static String CODIGO_MSG_REPETICION_CIERRE = "0521";

			public final static String CODIGO_MSG_NO_RECONOCIBLE = "0644";

			public final static String CODIGO_MSG_PREAUTORIZACION = "0100";
			public final static String CODIGO_MSG_RESPUESTA_PREAUT = "0110";
		}

		public final static String CODIGO_RAZON_ANULACION_SALTO_NSM     = "4013";
		public final static String CODIGO_RAZON_ANULACION_TIMEOUT       = "4021";
		public final static String CODIGO_RAZON_ANULACION_ERROR_GENER   = "4017";
	}
	
	static public class ABERTISOFFLINE {
		
		static public class COD_MSGS {
			public final static String CODIGO_MSG_VENTA = "1200";
			public final static String CODIGO_MSG_RESPUESTA_VENTA = "1210";

			public final static String CODIGO_MSG_DEVOLUCION = "1220";
			public final static String CODIGO_MSG_CONFIRMACION = "1220";
			public final static String CODIGO_MSG_RESPUESTA_DEVOLUCION = "1230";
			public final static String CODIGO_MSG_REPETICION_DEVOLUCION = "1221";
		
			public final static String CODIGO_MSG_ANULACION = "1420";
			public final static String CODIGO_MSG_RESPUESTA_ANULACION = "1430";
			public final static String CODIGO_MSG_REPETICION_ANULACION = "1421";

			public final static String CODIGO_MSG_CIERRE = "1520";
			public final static String CODIGO_MSG_RESPUESTA_CIERRE = "1530";
			public final static String CODIGO_MSG_REPETICION_CIERRE = "1521";

			public final static String CODIGO_MSG_NO_RECONOCIBLE = "1644";

			public final static String CODIGO_MSG_PREAUTORIZACION = "1100";
			public final static String CODIGO_MSG_RESPUESTA_PREAUT = "1110";
		}

		public final static String CODIGO_RAZON_ANULACION_SALTO_NSM     = "4013";
		public final static String CODIGO_RAZON_ANULACION_TIMEOUT       = "4021";
		public final static String CODIGO_RAZON_ANULACION_ERROR_GENER   = "4017";
	}
	
	
	
	
	
	public final static String SOLRED_BIT_53_INFO_SEGURIDAD = "0102000002000000";
	
public final static String NEMO_ATOS ="ATOS";
	
	static public class ATOS {
		
		static public class MENSAJES {
			
			static public class MSG_TYPE {
				public final static String SALE_WITH_MAGSTRIPE 		= "10";
				public final static String SALE_WITH_PKE 	   		= "20";
				public final static String SALE_WITH_CNP 	   		= "09";
				public final static String REFUND_WITH_MAGSTRIPE 	= "58";
				public final static String REFUND_WITH_PKE 	   		= "61";
				public final static String REFUND_WITH_CNP 	   		= "47";
			}
			
			static public class SEPARADOR {	
				
				public final static byte HASH        = '#';
				public final static byte SCORE       = '-';
				public final static byte EXCL        = '!';
				public final static byte AMP         = '&';
				public final static byte PERC        = '%';
				public final static byte AST         = '*';
				public final static byte DOLL        = '$';
				public final static byte FS			 = 0x1C;
				public final static byte STX         = 0X02;
				public final static byte ETX         = 0X03;
				public final static byte EOT 		 = 0X04;
				public final static byte ENQ 		 = 0X05;
				public final static byte ACK 		 = 0X06;
				public final static byte NAK 		 = 0X21;
			}
			
			static public class DIAL_INDICATOR {
				// Supported values for Atos are 1-4
				public final static String RESERVED_FOR_UK_CARD_ASSOC	= "0";
				public final static String FIRST_ATTEMPT				= "1";
				public final static String SECOND_ATTEMPT   		 	= "2";
				public final static String THIRD_ATTEMPT				= "3";
				public final static String NO_DIALLING					= "4";
				public final static String RFU_1						= "5";
				public final static String RFU_2						= "6";
				public final static String RFU_3						= "7";
				public final static String RFU_4						= "8";
				public final static String RFU_5						= "9";
			} 
			
			static public class TERMINAL_CAPABILITIES {
				public final static byte [] ICC_READER 				= {0x08,0x00,0x00,0x00};
				public final static byte [] MAGSTRIPE_READER 		= {0x04,0x00,0x00,0x00};
				public final static byte [] PAN_KEY_ENTRY 			= {0x02,0x00,0x00,0x00};
				public final static byte [] EXTENDED_CAPABILITIES 	= {0x01,0x00,0x00,0x00};
				
				// Lineas de display disponibles
				public final static byte [] ZERO_LINES_DISPLAY		= {0x00,0x00,0x00,0x00};
				public final static byte [] ONE_LINE_DISPLAY 		= {0x00,0x01,0x00,0x00};
				public final static byte [] TWO_LINES_DISPLAY 		= {0x00,0x02,0x00,0x00};
				public final static byte [] THREE_LINES_DISPLAY		= {0x00,0x04,0x00,0x00};
				public final static byte [] FOUR_LINES_DISPLAY 		= {0x00,0x08,0x00,0x00};
			
				
			}
			
			public final static String CODIGO_ACCION_ACP    = "00001";
			
			public final static String NUMERO_CIFRAS_PIN    = "4";
			public final static String CARACTER_FIN_PIN     = "*";

			public final static String ID_VERSION_PROTO    = "0";
			public final static String VERSION_MEMORIA     = "00";
			public final static String VERSION_CLAVES      = "000";
			public final static String FILLER		       = "00";
				
			public final static String TIPO_MSG_VENTA_BANDA    		= "10";
			public final static String TIPO_MSG_VENTA_PKE      		= "20";
			public final static String TIPO_MSG_VENTA_MOTO     		= "09";
			
			public final static String TIPO_MSG_DEVOLUCION_BANDA    = "58";
			public final static String TIPO_MSG_DEVOLUCION_PKE      = "61";
			public final static String TIPO_MSG_DEVOLUCION_MOTO     = "47";
			
			public final static String CODIGO_PROCESO_MSG_VENTA 	 = "00";
			public final static String CODIGO_PROCESO_MSG_DEVOLUCION = "01";
		}
	}

	
	static public class DATOS_SERVICIO_ALLSTAR{
		public final static String INPUT_CAPAB_CARD_CHIP_AND_PKE = "C";
		public final static String AUTHENTICATION_CAPABILITY_PIN = "1";
		public final static String CARD_CAPTURE_CAPABILITY_NONE = "0";
		public final static String CARD_CAPTURE_CAPABILITY_CAPTURE_SDA_DDA = "V";
		public final static String OPERATING_ENVIRONMENT_IPT = "1";
		public final static String OPERATING_ENVIRONMENT_OPT = "2";
		public final static String CLIENTE_PRESENTE = "0";
		public final static String CLIENTE_NO_PRESENTE = "1";
		public final static String TRJ_PRESENTE = "1";
		public final static String TRJ_NO_PRESENTE = "0";
		public final static String SIN_AUTENTICACION = "0";
		public final static String CON_PIN = "1";
		public final static String FIRMA = "5";
		
		public final static String IDENTIFICA_CHIP = "1";
		public final static String IDENTIFICA_AUT = "3";
		public final static String IDENTIFICA_COMERCIO = "4";
		
		public final static String NO_ACTUALIZA_TARJETA = "1";
		public final static String DISPLAY_IMPRESORA = "4";
		public final static String LENGTH_PIN = "4";
		
		public static final String CAPTURA_MANUAL    = "6";
		public static final String CAPTURA_BANDA     = "2";
		public static final String CAPTURA_CHIP      = "5";
		public static final String CAPTURA_FALLBACK  = "D";
	}	
	
	// longitud campos protocolo Prosa. 
		static public class L_CAMPOS_PROSA{
			public final static int LENGTH_FECHA_TRANSACCION = 6;
			public final static int LENGTH_FECHA_L_TRANSACCION = 4;
			public final static int LENGTH_RASTREO_AUD_SISTEMAS = 6;
			public final static int LENGTH_FECHA_CAPTURA = 4;
			public final static int LENGTH_TIPO_MERCHANT = 4;
			public final static int LENGTH_DATOS_SERVICIO = 3;
			public final static int LENGTH_CONDI_PUNTO_SERVICIO = 2;
			public final static int LENGTH_CODI_ADQUIRIENTE = 11;
			public final static int LENGTH_REF_RECU = 12;
			public final static int LENGTH_RESP_AUT = 6;
			public final static int LENGTH_COD_RESP = 2;
			public final static int LENGTH_ID_TERMINAL_CARD_ACCEPTOR = 16;
			public final static int LENGTH_CODIGO_CARD_ACCEPTOR = 15;
			public final static int LENGTH_NOMBRE_CARD_ACCEPTOR = 40;
			public final static int LENGTH_ADICIONALES_RESP = 4;
			public final static int LENGTH_RETAILER_DATA = 30;
			public final static int LENGTH_CODIGO_TRANSACCION_ACTUAL = 3;
			public final static int LENGTH_ADDITIONAL_AMOUNTS = 15;
			public final static int LENGTH_DATOS_TERMINAL = 19;
			public final static int LENGTH_CARD_IS_CAT_RESP_CODE_DATA = 22;
			public final static int LENGTH_NETW_MNG_INF_CODE = 3; //S70
			public final static int LENGTH_ORI_DATA_ELEM = 42; //S-90
			public final static int LENGTH_REPLACE_AMOUNTS = 42; // S-95
		}
		
	
	static public class ID_DATO_ADICIONAL_TOTAL 
	{
		
		public final static String ID_VEHICULO = "1";
		public final static String COD_CONDUCTOR = "3";
		public final static String KILOMETRAJE = "4";
		public final static String ID_CLIENTE = "R";
		
	}
	static public class COD_RAZON_TOTAL{
		public final static String DEVOLUCION = "4000";
		public final static String DENIEGA_TERMINAL = "4007";
		public final static String INVALID_RESPONSE_MAC = "4020";
		public final static String TIMEOUT = "4021";
		public final static String FIRMA_NO_COINCIDE = "4351";
		public final static String DENIEGA_TARJETA = "4352";
		public final static String ERROR_CHIP = "4353";
		public final static String ERROR_SYSTEM = "4354";
	}
	
	static public class COD_PROCESO_TOTAL_IFSF{
		public final static String SALE = "000000";
		public final static String PREAUT = "000000";
		public final static String REFUND = "200000";
		public final static String BALANCE_INQUIRY = "390000";
		public final static String PET_CONT_COMER = "100000";
		public final static String BONUS_RECHARGAE_BALANCE = "180000";
		public final static String REFOUND_BONUS_RECHARGAE_BALANCE = "280000";
	}
	
	static public class MASH 
	{	
		static public class COD_PETICION 
		{
			public final static String ORDER_CREATION = "0";
			public final static String ORDER_STATUS   = "1";
			public final static String CHARGE_ORDER   = "2";
			public final static String CANCEL_ORDER   = "3";
			public final static String REFUND_ORDER   = "4";
		}
	}
	
	
	static public class REDSYSCC63 
	{	
//		//DATOS EXTRA CLAVE	DX	
		//CSACT-3892 [B&A] APOS with CSACT connection (ISO 8583): Preauthorization
		public static final String DX_ID_TRANSACCION_SUTITUIR	 = "idTxSustituir";
		public static final String DX_IMPORTE_ORIGINAL			 = "ImporteOriginal";
		
		// REDSYS P24 DCC
		//CSACT-3893 [B&A] APOS with CSACT connection (ISO 8583): DCC
		
		public static final String REDSYS_P24_PREAUT_CONSULTA_DCC					= "181";
		public static final String REDSYS_P24_PREAUT_MONEDA_TPV						= "101";
		public static final String REDSYS_P24_PREAUT_MONEDA_TARJETA					= "185";
		public static final String REDSYS_P24_REPLACE_PREAUT_CONSULTA_DCC			= "183";
		public static final String REDSYS_P24_REPLACE_PREAUT_MONEDA_TPV				= "103";
		public static final String REDSYS_P24_REPLACE_PREAUT_MONEDA_TARJETA			= "187";
		public static final String REDSYS_P24_CONFIRM_PREAUT_CONSULTA_DCC			= "286";
		public static final String REDSYS_P24_CONFIRM_PREAUT_MONEDA_TPV				= "201";
		public static final String REDSYS_P24_CONFIRM_PREAUT_MONEDA_TARJETA			= "288";
		public static final String REDSYS_P24_CONFIRM_PREAUT_CONSULTA_DCC_DIST		= "287";
		public static final String REDSYS_P24_CONFIRM_PREAUT_MONEDA_TPV_DIST		= "202";
		public static final String REDSYS_P24_CONFIRM_PREAUT_MONEDA_TARJETA_DIST	= "289";
		
		// REDSYS P25 reason code
		// CSACT-5143 requested change in anulation messages
	
		public static final String REDSYS_P25_ANULACION_PREAUT_VENTA				= "4001";
		public static final String REDSYS_P25_ANULACION_TIMEOUT						= "4006";
		public static final String REDSYS_P25_ANULACION_GENERAL						= "4007";
		public static final String REDSYS_P25_ANULACION_EMV 						= "4352";
		public static final String REDSYS_P25_ANULACION_ERROR_CHIP					= "4353";			
	}
}
