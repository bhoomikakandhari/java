// import {link} from "react-router-dom";

// const Navbar =() =>{
//     return(
//         <nav className="navbar">
//             <h2>MyShop</h2>
//             <div>
//                 <link to="/">Home</link>
//                 <link to="/products">Products</link>
//                 <link to="/cart">Cart</link>
//                 <link to="/about">About</link>
//                 <link to="/contact">Contact</link>

//             </div>
//         </nav>
//     );
// };


// export default Navbar;



import { Link } from "react-router-dom";

const Navbar = () => {
  return (
    <nav className="navbar">
      <h2>MyShop</h2>
      <div>
        <Link to="/">Home</Link>
        <Link to="/products">Products</Link>
        <Link to="/cart">Cart</Link>
        <Link to="/about">About</Link>
        <Link to="/contact">Contact</Link>
      </div>
    </nav>
  );
};

export default Navbar;