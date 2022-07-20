import org.xhtmlrenderer.pdf.ITextRenderer
import java.io.FileOutputStream


fun main() {
    val inputFile = "samples/firstdoc.xhtml"
    val url = App::class.java.getResource(inputFile)?.toString()
    val outputFile = "firstdoc.pdf"
    val os = FileOutputStream(outputFile)

    val renderer = ITextRenderer()
    renderer.setDocument(url)
    renderer.layout()
    renderer.createPDF(os)

    os.close()
}

class App {

}
