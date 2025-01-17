import {createItem} from "./services/item.js";
import * as CartService from "./services/cart.js";

const myCart = [];
const myWhishList = [];

console.log(`Welcome to your cart!`);

const item1 = await createItem("Mouse gamer", 10.99, 1);
const item2 = await createItem("Monitor XF232", 299.99, 2);
const item3 = await createItem("Teclado", 59.99, 2);

await CartService.addItem(myCart, item1);
await CartService.addItem(myWhishList, item2);
await CartService.addItem(myCart, item2);
await CartService.addItem(myCart, item3);

console.log(`Cart TOTAL IS: `);
console.log(await CartService.calcularTotal(myCart));

CartService.deleteItem(myCart, item3.name);

console.log(`Cart TOTAL IS: `);
console.log(await CartService.calcularTotal(myCart));

CartService.displayItens(myCart);

await CartService.removeItem(myCart, item2.name, 1);

CartService.displayItens(myCart);