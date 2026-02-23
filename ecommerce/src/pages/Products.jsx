// import {Link, link} from "react-router-dom";

// const products = [
//     {id:1, name: "Shoes", price:2000},
//     {id:2, name: "Watch", price:3500},
//     {id:3, name: "Headphones", price:1500},   
// ];

// const Products =() =>{
//       return(
//         <div>
//             <h1>Products</h1>
//             {products.map((p) =>(
//                 <div key={p.id}>
//                     <h3>{p.name}</h3>
//                     <p>${p.price}</p>
//                     <Link to ={'/product/${p.id}'}>View</Link>
//                     </div>
//             ))}
//         </div>
//       );
// };


// export default Products;

import { Link } from "react-router-dom";

const Products = () => {
  const products = [
    { id: 1, name: "Shoes", price: 2000 },
    { id: 2, name: "Watch", price: 3500 },
    { id: 3, name: "Headphones", price: 1500 },
  ];

  return (
    <div className="page">
      <h1>Products</h1>
      {products.map((p) => (
        <div key={p.id}>
          <h3>{p.name}</h3>
          <p>₹{p.price}</p>
          <Link to={`/product/${p.id}`}>View</Link>
        </div>
      ))}
    </div>
  );
};

export default Products;

