import './App.css';
import BookDetails from './Components/BookDetails';
import CourseDetails from './Components/CourseDetails';
import BlogDetails from './Components/BlogDetails';

function App() {
  const courses = [
    {id: 1, name: "Angular", date: "4/5/2021"},
    {id: 2, name: "React", date: "6/3/2020"}
  ];
  const books = [
    {id: 1, name: "Master React", price: 670},
    {id: 2, name: "Deep Dive into Angular 11", price: 800},
    {id: 3, name: "Mongo Essentials", price: 450}
  ];
  const blogs = [
    {id: 1, name: "React Learning", author: "Stephen Biz", description: "Welcome to learning React!"},
    {id: 2, name: "Installation", author: "Schewzdenier", description: "You can install React from npm"}
  ];
  return (
    <div className='mydiv'>
      <CourseDetails courses={courses}/>
      <div className='greendiv'></div>
      <BookDetails books={books}/>
      <div className='greendiv'></div>
      <BlogDetails blogs={blogs}/>
    </div>
  );
}

export default App;
