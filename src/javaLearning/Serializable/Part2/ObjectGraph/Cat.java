package javaLearning.Serializable.Part2.ObjectGraph;
import java.io.Serializable;
public class Cat implements Serializable {
	Rat r = new Rat();
}