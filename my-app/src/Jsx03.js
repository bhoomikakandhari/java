import React from 'react'

const Jsx03 = () => {
    const isAdmin=false;
  return (
    <div>
 {
        isAdmin
        ?
      <>
      <ul>
        <li>add user </li>
        <li>delete user</li>
      </ul>
      </>
      :
      <>
      <h1>you are not the admin</h1>
      </>
 }
    </div>
  )
}

export default Jsx03;
