const BlogDetails=(props)=>
{
    return(
       <div>
        <h1>Blog Details</h1>
        {
            props.blogs.map((blog)=>(
                <div key={blog.id}>
                    <h2>{blog.name}</h2>
                    <b>{blog.author}</b><br/><br/>
                    {blog.description}
                </div>
            ))
        }
       </div> 
    );
}

export default BlogDetails;