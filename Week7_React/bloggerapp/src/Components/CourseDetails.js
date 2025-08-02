const CourseDetails=(props)=>
{
    return(
        <div>
            <h1>Course Details</h1>
            {
                props.courses.map((course)=>(
                    <div key={course.id}>
                        <h2>{course.name}</h2>
                        <b>{course.date}</b>
                    </div>
                ))
            }
        </div>
    );
}

export default CourseDetails;