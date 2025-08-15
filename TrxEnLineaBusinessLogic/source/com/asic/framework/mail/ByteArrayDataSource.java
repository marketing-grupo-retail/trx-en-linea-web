/*
 * Creado el 31/05/2004
 *
 * Para cambiar la plantilla para este archivo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
package com.asic.framework.mail;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

import javax.activation.DataSource;

/**
 * @author Administrador
 *
 * Para cambiar la plantilla para este comentario de tipo generado vaya a
 * Ventana&gt;Preferencias&gt;Java&gt;Generación de código&gt;Código y comentarios
 */
public class ByteArrayDataSource implements DataSource {

	private byte[] data; // data
	private String type; // content-type

	/* Create a datasource from an input stream */
	ByteArrayDataSource(InputStream is, String type) {
		this.type = type;
		try {
			ByteArrayOutputStream os = new ByteArrayOutputStream();
			int ch;

			while ((ch = is.read()) != -1)
				os.write(ch);
			data = os.toByteArray();

		} catch (IOException ioex) {
		}
	}

	/* Create a datasource from a byte array */
	ByteArrayDataSource(byte[] data, String type) {
		this.data = data;
		this.type = type;
	}

	/* Create a datasource from a String */
	ByteArrayDataSource(String data, String type) {
		try {
			// Assumption that the string contains only ascii
			// characters ! Else just pass in a charset into this
			// constructor and use it in getBytes()
			this.data = data.getBytes("iso-8859-1");
		} catch (UnsupportedEncodingException uex) {
		}
		this.type = type;
	}

	public InputStream getInputStream() throws IOException {
		if (data == null)
			throw new IOException("no data");
		return new ByteArrayInputStream(data);
	}

	public OutputStream getOutputStream() throws IOException {
		throw new IOException("cannot do this");
	}

	public String getContentType() {
		return type;
	}

	public String getName() {
		return "dummy";
	}
}
