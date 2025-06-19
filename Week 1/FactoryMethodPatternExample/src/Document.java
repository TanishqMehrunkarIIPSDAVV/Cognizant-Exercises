public class Document
{
    public static void main(String[] args)
    {
        DocumentFactory wordFactory = new WordDocumentFactory();
        WordDocumentInterface wordDoc = (WordDocumentInterface) wordFactory.createDocument();
        wordDoc.printDocument();

        DocumentFactory pdfFactory = new PDFDocumentFactory();
        PDFDocumentInterface pdfDoc = (PDFDocumentInterface) pdfFactory.createDocument();
        pdfDoc.printDocument();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        ExcelDocumentInterface excelDoc = (ExcelDocumentInterface) excelFactory.createDocument();
        excelDoc.printDocument();

        System.out.println("All documents created and printed successfully.");
    }
}