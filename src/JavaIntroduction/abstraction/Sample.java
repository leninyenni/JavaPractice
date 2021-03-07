package JavaIntroduction.abstraction;

public class Sample {
	public static void main(String[] args) {
		Sample sample = new Sample();
		TextSample[] samples = new TextSample[] { sample.new TextSample(1),
				sample.new TextSample(2) };
	}

	class TextSample {
		public TextSample(int i) {
			System.out.println("Cons" + i);
		}
	}
}
