package PolymorphismDemo;

public class CustomerManager {
	private BaseLogger baseLogger;
	public CustomerManager(BaseLogger logger) {
		this.baseLogger = logger;
	}
	public void Add() {
		System.out.println("Müþteri Eklendi");
		this.baseLogger.Log("Log Mesajý");
	}
}
