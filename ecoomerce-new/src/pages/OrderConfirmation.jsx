import { useLocation, Link } from 'react-router-dom';

const OrderConfirmation = () => {
  const location = useLocation();
  const name = location.state?.customerName || "Customer";

  return (
    <div style={{ textAlign: 'center' }}>
      <h1>🎉 Thank you, {name}!</h1>
      <p>Your order has been placed successfully.</p>
      <Link to="/">Go back to Home</Link>
    </div>
  );
};
export default OrderConfirmation;