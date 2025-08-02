const BookDetails=(props)=>
{
    return(
        <div>
            <h1>Book Details</h1>
            {
                props.books.map((book)=>(
                    <div key={book.id}>
                        <h2>{book.name}</h2>
                        <b>{book.price}</b>
                    </div>
                ))
            }
        </div>
    );
}

export default BookDetails;