import { BrowserRouter, Routes, Route } from "react-router-dom";
import Navbar from "./components/Navbar";
import Home from "./pages/Home";
import Products from "./pages/Products";
import ProductView from "./pages/ProductView";
import Cart from "./pages/Cart";
import Checkout from "./pages/Checkout";
import About from "./pages/About";
import Contact from "./pages/Contact";
import Search from "./pages/Search";
import OrderConfirmation from "./pages/OrderConfirmation";


 function App() {
   return (
     <BrowserRouter>
     <Navbar />
       <Routes>
         <Route path="/" element={<Home />} />
         <Route path="/products" element={<Products />} />
         <Route path="/product/:id" element={<ProductView/>} />
         <Route path="/cart" element={<Cart />} />
         <Route path="/checkout" element={<Checkout />} />
         <Route path="/about" element={<About />} />
         <Route path="/contact" element={<Contact />} />
         <Route path="/search" element={<Search />} />
         <Route path="/order" element={<OrderConfirmation />} />
       </Routes>
     </BrowserRouter>
   );
 }
 export default App;
// import { BrowserRouter, Routes, Route } from "react-router-dom";
// import Navbar from "./components/Navbar";

// import Home from "./pages/Home";
// import Products from "./pages/Products";
// import ProductView from "./pages/ProductView";
// import Cart from "./pages/Cart ";
// import Checkout from "./pages/Checkout";
// import OrderConfirmation from "./pages/OrderConfirmation";
// import Search from "./pages/Search";
// import About from "./pages/About";
// import Contact from "./pages/Contact";

// function App() {
//   return (
//     <BrowserRouter>
//       <Navbar />
//       <Routes>
//         <Route path="/" element={<Home />} />
//         <Route path="/products" element={<Products />} />
//         <Route path="/product/:id" element={<ProductView />} />
//         <Route path="/cart" element={<Cart />} />
//         <Route path="/checkout" element={<Checkout />} />
//         <Route path="/order" element={<OrderConfirmation />} />
//         <Route path="/search" element={<Search />} />
//         <Route path="/about" element={<About />} />
//         <Route path="/contact" element={<Contact />} />
//       </Routes>
//     </BrowserRouter>
//   );
// }

// export default App;