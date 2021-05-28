package com.santander.bootcamp.exception;

import com.santander.bootcamp.util.MensagemUtil;

public class NotFoundException extends RuntimeException {

	public NotFoundException() {
		super(MensagemUtil.NAO_TEM);
	}
}
