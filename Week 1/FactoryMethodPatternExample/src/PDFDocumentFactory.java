public class PDFDocumentFactory extends DocumentFactory
{
    @Override
    public PDFDocumentInterface createDocument()
    {
        System.out.println("Creating PDF document");
        return new PDFDocument();
    }
}
