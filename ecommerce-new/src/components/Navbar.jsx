import { Link } from 'react-router-dom';
import { useCart } from '../context/CartContext';

const Navbar = () => {
  const { cart } = useCart();

  return (
    <nav style={{ display: 'flex', gap: '20px', background: '#333', color: '#fff', padding: '15px' }}>
      <Link to="/" style={{ color: '#fff' }}>Home</Link>
      <Link to="/products" style={{ color: '#fff' }}>Products</Link>
      <Link to="/cart" style={{ color: '#fff' }}>Cart ({cart.length})</Link>
    </nav>
  );
};
export default Navbar;