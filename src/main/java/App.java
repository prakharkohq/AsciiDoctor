public class App {
    public static void main(String[] args) {
        final AsciidoctorDemo asciidoctorDemo = new AsciidoctorDemo();
       // asciidoctorDemo.genratePdfFromString("");
        System.out.println(asciidoctorDemo.generateHTMLFromString("hi"));
    }
}
