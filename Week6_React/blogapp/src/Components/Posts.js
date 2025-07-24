import React from "react";

class Posts extends React.Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: [],
    };
  }

  loadPosts() {
    fetch("https://jsonplaceholder.typicode.com/posts")
      .then((res) => {
        if (!res.ok) throw new Error("HTTP Error!! Status: " + res.status);
        return res.json();
      })
      .then((data) => {
        this.setState({ posts: data });
        console.log("Posts Loaded: " + data);
      })
      .catch((err) => {
        console.err("Errors: " + err);
      });
  }

  componentDidMount() {
    this.loadPosts();
  }

  render() {
    return (
      <div>
        <h1>Posts</h1>
        {this.state.posts.length > 0 ? (
          <ul>
            {this.state.posts.map((post) => (
              <li key={post.id}>
                <h3>{post.title}</h3>
                <p>{post.body}</p>
              </li>
            ))}
          </ul>
        ) : (
          <p>Loading Posts...</p>
        )}
      </div>
    );
  }

  componentDidCatch(err, info) {
    alert(`An Error Occurred ${err.toString()}\n${info.componentStack}`);
  }
}

export default Posts;
