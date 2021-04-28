package javaLearning.Serializable.Part1;

import java.io.Serializable;

public class Dog implements Serializable {
	int i=10;
	int j=20;
	transient int a=5;
	static transient int k=30;
	final transient int l=40;
}
