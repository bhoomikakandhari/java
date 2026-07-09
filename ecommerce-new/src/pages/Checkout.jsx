import { useState } from 'react';
import { useNavigate } from 'react-router-dom';
import { useCart } from '../context/CartContext';

const Checkout = () => {
  const navigate = useNavigate();
  const { clearCart } = useCart();
  const [name, setName] = useState('');

  const handleSubmit = (e) => {
    e.preventDefault();
    clearCart(); // Empty the cart after buying
    navigate('/orderconfirmation', { state: { customerName: name } });
  };

  return (
    <div>
      <h2>Finalize Order</h2>
      <form onSubmit={handleSubmit}>
        <input placeholder="Your Name" required onChange={(e) => setName(e.target.value)} />
        <br/><br/>
        <button type="submit">Place Order</button>
      </form>
    </div>
  );
};
export default Checkout;