export async function getCart(){

}

export async function addItem(userCart,item){
    userCart.push(item);
}

export async function calcularTotal(userCart){
    return userCart.reduce((total, item) => total + item.subtotal(), 0);
}

export async function deleteItem(userCart, name){
    const index = userCart.findIndex((item) => item.name === name);

    if(index !== -1)
        userCart.splice(index, 1)
}

export async function removeItem(userCart, name, quantity){
    const index = userCart.findIndex((item) => item.name === name);

    if(index >= 0){
        userCart[index].quantity -= quantity;
        userCart[index].quantity <= 0 ? await deleteItem(userCart, name): null;
    }
}

export async function displayItens(userCart){
    console.log(`\nYOUR CART : `);
    console.log(`--------------------`);
    
    userCart.forEach((item, index) => {
        console.log(
            `${index + 1}. ${item.name} ->\tPrice: ${item.price}, Quantity: ${item.quantity} \tSubtotal: ${item.subtotal()}`);
    });

    console.log(`\nTotal: ${await calcularTotal(userCart)}$`);
    console.log(`--------------------`);
}
