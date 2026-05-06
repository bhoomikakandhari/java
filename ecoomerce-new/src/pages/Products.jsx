import { useCart } from '../context/CartContext';

const dummyProducts = [
  { id: 1, name: "Cool Sneakers", price: 80 },
  { id: 2, name: "Cotton T-Shirt", price: 25 },
  { id: 3, name: "Blue Jeans", price: 45 },
];

const Products = () => {
  const { addToCart } = useCart();

  return (
    <div>
      <h2>Our Products</h2>
      <div style={{ display: 'flex', gap: '20px' }}>
        {dummyProducts.map(product => (
          <div key={product.id} style={{ border: '1px solid #ccc', padding: '15px' }}>
            <h3>{product.name}</h3>
            <p>${product.price}</p>
            <button onClick={() => addToCart(product)}>Add to Cart</button>
          </div>
        ))}
      </div>
    </div>
  );
};
export default Products;