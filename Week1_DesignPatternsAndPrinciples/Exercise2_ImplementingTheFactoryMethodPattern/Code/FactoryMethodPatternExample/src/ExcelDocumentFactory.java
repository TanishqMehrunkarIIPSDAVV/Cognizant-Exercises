public class ExcelDocumentFactory extends DocumentFactory
{
    @Override
    public ExcelDocumentInterface createDocument()
    {
        System.out.println("Creating Excel document");
        return new ExcelDocument();
    }
}
