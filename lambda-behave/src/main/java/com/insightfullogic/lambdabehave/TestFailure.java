package com.insightfullogic.lambdabehave;

public class TestFailure extends RuntimeException {
    private static final long serialVersionUID = -4114485410147624963L;

	public TestFailure(String message) {
        super(message);
    }
}