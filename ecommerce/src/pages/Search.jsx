// import { useState } from "react";

// const Search = () => {
//   const [query, setQuery] = useState("");

//   return (
//     <div className="page">
//       <h1>Search Products</h1>

//       <input
//         type="text"
//         placeholder="Search here..."
//         value={query}
//         onChange={(e) => setQuery(e.target.value)}
//       />

//       <p>Searching for: <strong>{query}</strong></p>
//     </div>
//   );
// };

// export default Search;


// const Search = () => {
//   return <h1>Search Page</h1>;
// };

// export default Search;

import { useState } from "react";

const Search = () => {
  const [text, setText] = useState("");

  return (
    <div className="page">
      <h1>Search</h1>
      <input
        type="text"
        placeholder="Search products..."
        value={text}
        onChange={(e) => setText(e.target.value)}
      />
      <p>You searched: {text}</p>
    </div>
  );
};

export default Search;