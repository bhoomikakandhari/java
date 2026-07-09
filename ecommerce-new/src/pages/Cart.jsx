import { useCart } from '../context/CartContext';
import { useNavigate } from 'react-router-dom';

const Cart = () => {
  const { cart, removeFromCart } = useCart();
  const navigate = useNavigate();
  const total = cart.reduce((sum, item) => sum + item.price, 0);

  return (
    <div>
      <h2>Shopping Cart ({cart.length} items)</h2>
      {cart.map(item => (
        <div key={item.cartId} style={{ marginBottom: '10px' }}>
          <span>{item.name} - ${item.price}</span>
          <button onClick={() => removeFromCart(item.cartId)} style={{ marginLeft: '10px' }}>Remove</button>
        </div>
      ))}
      <h3>Total: ${total}</h3>
      {cart.length > 0 && (
        <button onClick={() => navigate('/checkout')}>Proceed to Checkout</button>
      )}
    </div>
  );
};
export default Cart;