package com.santander.bootcamp.exception;

public class ExceptionResponse {
	
	private String mensagem;

	public ExceptionResponse(String message) {
		this.mensagem = message;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

}
