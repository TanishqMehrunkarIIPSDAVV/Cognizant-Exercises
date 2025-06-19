public class WordDocumentFactory extends DocumentFactory
{
    @Override
    public WordDocumentInterface createDocument()
    {
        System.out.println("Creating Word document");
        return new WordDocument();
    }
}
