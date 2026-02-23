// import { useParams } from "react-router-dom";

// const ProductView =() =>{
//     const {id} = useParams();

// return(
//     <div>
//         <h2>Product Details</h2>
//         <p>Product ID:{id}</p>
//         <button>Add to Cart</button>
//     </div>
// );
// };


// export default ProductView;


import { useParams } from "react-router-dom";

const ProductView = () => {
  const { id } = useParams();

  return (
    <div className="page">
      <h1>Product Details</h1>
      <p>Product ID: {id}</p>
      <button>Add to Cart</button>
    </div>
  );
};

export default ProductView;