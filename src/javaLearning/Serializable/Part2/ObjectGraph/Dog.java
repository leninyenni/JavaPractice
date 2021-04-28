package javaLearning.Serializable.Part2.ObjectGraph;
import java.io.Serializable;
public class Dog implements Serializable {
	Cat c = new Cat();
}
