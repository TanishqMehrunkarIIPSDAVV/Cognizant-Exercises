import React from "react";

class Cart extends React.Component {
  render() {
    return (
      <center>
        <table border="2" className="table">
          <thead>
            <tr>
              <th>Name</th>
              <th>Price</th>
            </tr>
          </thead>
          <tbody>
            {this.props.item.map((item, index) => {
              return (
                <tr key={index}>
                  <td>{item.itemname}</td>
                  <td>{item.price}</td>
                </tr>
              );
            })}
          </tbody>
        </table>
      </center>
    );
  }
}

export default Cart;
