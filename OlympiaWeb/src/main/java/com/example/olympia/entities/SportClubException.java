package com.example.olympia.entities;

import java.io.IOException;

public class SportClubException extends RuntimeException {

	public SportClubException(String message) {
		super(message);
	}

	public SportClubException(String message, Exception e) {
		super(message, e);
	}

}
