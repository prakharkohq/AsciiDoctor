import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.asciidoctor.Asciidoctor;
import static org.asciidoctor.OptionsBuilder.options;
import static org.asciidoctor.internal.JRubyAsciidoctor.create;

public class AsciidoctorDemo {
    private final Asciidoctor asciidoctor;

    public AsciidoctorDemo() {
        asciidoctor = create();
    }

    public void genratePdfFromString(String string) {
        final Map<String, Object> options = options().inPlace(true).backend("pdf").asMap();
        final String outfile = asciidoctor.convertFile(new File("sample.adoc"), options);
    }

    String generateHTMLFromString(final String input) {
        return asciidoctor.convert("Hello Prakhar !", new HashMap<String, Object>());
    }
}

