/*
 * Proyecto: ASIC Admin Usuarios
 *
 * Copyriht (C) 2003-2010 Asic S.A. Bogotá, Colombia.
 * All rigths Reserved.
 *
 * $Id: UserForm.java,v 1.1 2019/12/18 17:31:05 Alfonso Exp $
 *
 */
package com.asic.transacciones.forms;

import java.sql.Timestamp;

import com.asic.framework.exception.ServiceException;
import com.asic.framework.factory.ServiceLocator;
import com.asic.framework.forms.BaseForm;
import com.asic.transacciones.vo.USUARIO;


/**
 * JDOC Class Def
 *
 * @author $Author: Alfonso $
 * @version $Revision: 1.1 $
 */

public class UserForm extends BaseForm {
	
    /** JDOC Field Def */
    //private String login = null;

    /** JDOC Field Def */
    //private String nombre = null;

    /** JDOC Field Def */
    //private String apellido = null;
    
    /*
    private String id = null;
    
	private String mail = null;
	
	private String estado = null;
	
	private String fechaIngreso = null;
	
	private String fechaRetiro = null;
	
	private String password = null;
    
    private String next = null;
    
    */  
          
    /**
     * Constructor
     */
    public UserForm() throws ServiceException {

    	super();
        setVO((USUARIO)ServiceLocator.getVO(USUARIO.class));
    }

    /**
     * Get login
     *
     * @return String
     */
    public String getLogin() {
		return ((USUARIO)vo).getLOGIN();
        //return login;
    }

	/**
	 * @return
	 */
	public String getNombre() {
		return ((USUARIO)vo).getNOMBRE();
		//return nombre;
	}

	/**
	 * @return
	 */
	public String getApellido() {
		return ((USUARIO)vo).getAPELLIDO();
		//return apellido;
	}

	/**
	 * @return
	 */
	public String getId() {
		return String.valueOf(((USUARIO)vo).getID());
		//return id;
	}

	/**
	 * @return
	 */
	public String getMail() {
		return ((USUARIO)vo).getEMAIL();
		//return mail;
	}

	/**
	 * @return
	 */
	public String getEstado() {
		return ((USUARIO)vo).getESTADO();
		//return estado;
	}

	/**
	 * @return
	 */
	public String getFechaIngreso() {
		return String.valueOf(((USUARIO)vo).getINGRDATE());
		//return fechaIngreso;
	}

	/**
	 * @return
	 */
	public String getFechaRetiro() {
		return String.valueOf(((USUARIO)vo).getRETIDATE());
		//return fechaRetiro;
	}

	/**
	 * @return
	 */
	public String getPassword() {
		return ((USUARIO)vo).getPASSWORD();
		//return password;
	}

	/**
	 * @return
	 *
	public String getNext() {
		return 
		return next;
	}*/

    /**
     * Set login
     *
     * @param lString </code>
     */
    public void setLogin(String l) {
    	((USUARIO)vo).setLOGIN(l);
      //  login = l;
    }

	/**
	 * @param string
	 */
	public void setNombre(String pNombre) {
		((USUARIO)vo).setNOMBRE(pNombre);
		//nombre = pNombre;
	}

	/**
	 * @param string
	 */
	public void setApellido(String pApellido) {
		((USUARIO)vo).setAPELLIDO(pApellido);
		//apellido = pApellido;
	}

	/**
	 * @param string
	 */
	public void setId(String pID) {
		((USUARIO)vo).setID(Integer.valueOf(pID));
		//id = pID;
	}

	/**
	 * @param string
	 */
	public void setMail(String pMail) {
		((USUARIO)vo).setEMAIL(pMail);
		//mail = pMail;
	}

	/**
	 * @param string
	 */
	public void setEstado(String pEstado ) {
		((USUARIO)vo).setESTADO(pEstado);
		//estado = pEstado;
	}

	/**
	 * @param string
	 */
	public void setFechaIngreso(String pFechaIngreso) {
		((USUARIO)vo).setINGRDATE(Timestamp.valueOf(pFechaIngreso));
		//fechaIngreso = pFechaIngreso;
	}

	/**
	 * @param string
	 */
	public void setFechaRetiro(String pFechaRetiro) {
		
		// TODO: en la jsp se debe asegurar la conversión de la fecha antes del submit
		((USUARIO)vo).setRETIDATE(Timestamp.valueOf(pFechaRetiro));
		//fechaRetiro = pFechaRetiro;
	}

	/**
	 * @param string
	 */
	public void setPassword(String pPassword) {
		((USUARIO)vo).setPASSWORD(pPassword);
		//password = pPassword;
	}

	/**
	 * @param string
	 *
	public void setNext(String string) {
		next = string;
	}*/
	
	/*public ActionErrors validate(ActionMapping mapping,
			HttpServletRequest request) {
			ActionErrors errors = new ActionErrors();

			// TODO (P!) WEB:C7:MCC: Validar datos

			// Validate the fields in your form, adding
			// adding each error to this.errors as found, e.g.
			// if ((field == null) || (field.length() == 0)) {
			//   errors.add("field", new ActionError("error.field.required"));
			// }
			if ((getLogin() == null) || (getLogin().length() == 0)) {
				errors.add("login", new ActionError("error.loginUsuario.required"));
			}

			if ((getNombre() == null) || (getNombre().trim().length() == 0)) {
				errors.add("nombre", new ActionError("error.nombreUsuario.required"));
			}
			
			if ((getApellido() == null) || (getApellido().trim().length() == 0)) {
				errors.add("apellido", new ActionError("error.apellidoUsuario.required"));
			}
			
			if (( getPassword() == null) || (getPassword().length() == 0)) {
				errors.add("password", new ActionError("error.password.alfanum"));
			}
		
			if(validarAlfanumeric(getLogin()) == false ){
				errors.add("login", new ActionError("error.login.alfanum"));
			}
			if(validarComillas(getLogin()) ){
				errors.add("login", new ActionError("error.string.comillas"));
			}
			if(validarComillas(getNombre()) ){
				errors.add("nombre", new ActionError("error.string.comillas"));
			}
			if(validarComillas(getApellido()) ){
				errors.add("apellido", new ActionError("error.string.comillas"));
			}
			if(request.getParameter("asociar")==null 
				&& validarAlfanumeric(getPassword()) == false ){
				errors.add("password", new ActionError("error.password.alfanum"));
			}
		
		//PEGR: 12/10/2004 Verificación de mail
			if (getMail()!=null && getMail().length()>0 && !isValidEmailAddr(getMail())){
				errors.add("mail", new ActionError("error.mail.invalid"));
			}
		
			if (errors.size()>0)
			{
				request.getSession(false).setAttribute("usuarioForm",this);
			}
			
			return errors;
		}
		*/
	/**
	 * @param string
	 * @return
	 */
	private boolean validarComillas(String string) {
		boolean res_ = false;
		if (string != null && (string.indexOf("'")!=-1 || string.indexOf("\"")!=-1))
		{
			res_ = true;
		}
		return res_;
	}

	/**
     * Returns true if the email string contains an at sign ("@") and
     * at least one dot ("."), i.e. "hans@gefionsoftware.com" is accepted
     * but "hans@gefionsoftware" is not. Note! This rule is not always
     * correct (e.g. on an intranet it may be okay with just a name) and
     * does not gurantee a valid Internet email address but it takes
     * care of the most obvious Internet mail address format errors.
     *
     * @param emailAddrString a String representing an email address
     * @return true if valid, false otherwise
     */
    public boolean isValidEmailAddr(String emailAddrString) {
        boolean isValid = false;
        if (emailAddrString != null && 
            emailAddrString.indexOf("@") != -1 &&
            emailAddrString.indexOf(".") != -1 && 
            (emailAddrString.indexOf("@") < emailAddrString.lastIndexOf(".")-1)) {
            isValid = true;
        }
        return isValid;
    }


	public boolean validarAlfanumeric(String pCadena){
			boolean existe_ = true;
			String letras = "abcdefghijklmnñopqrstuvwxyz1234567890ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
			for(int i = 0; i<pCadena.length(); i++){
				if(letras.indexOf(pCadena.charAt(i)) == -1 && (existe_ == true)){
					existe_  = false;
				}
			}
			return existe_;
		}




}
