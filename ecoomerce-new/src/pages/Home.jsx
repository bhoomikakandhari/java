import { Link } from 'react-router-dom';

const Home = () => (
  <div style={{ textAlign: 'center', marginTop: '50px' }}>
    <h1>Welcome to My Store</h1>
    <Link to="/products">
      <button style={{ padding: '10px 20px', fontSize: '18px' }}>Shop Now</button>
    </Link>
  </div>
);
export default Home;