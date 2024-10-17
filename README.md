# Shopping Cart System

This is a simple Java-based Shopping Cart System that allows users to add items to their cart, specify quantities, and calculate the total price using different pricing strategies (e.g., regular price, with discount, and with tax). The system is designed to allow for the addition of new pricing strategies without modifying the core logic, using the Strategy Design Pattern.

## Features

- Add items to the cart by providing item name and quantity.
- Calculate total price using:
  - Regular pricing.
  - Discount pricing (e.g., 10% discount).
  - Tax pricing (e.g., 5% tax).
- Easily extendable to support new pricing strategies.

## Prerequisites

- Java Development Kit (JDK) installed.
- A Java IDE (like IntelliJ IDEA, Eclipse) or a text editor.
- Basic knowledge of Java and object-oriented programming concepts.

## How to Run

### 1. Clone the repository

Clone the project files to your local machine:

```bash
git clone https://github.com/your-username/shopping-cart-system.git
cd shopping-cart-system
```

## 2. Compile and Run

To compile the Java files, navigate to the project directory and use the following command:

```bash
javac *.java
```

Then, to run the application:

```bash

java ShoppingCartApp
```

## 3. Application Usage
Once the application is running, you will be prompted to:

- Enter the item name: Choose from the available items (e.g., Apple, Banana, Orange).
- Enter the quantity: Provide the number of units for that item.
- Exit: Type exit when you're done adding items.
- After the input process, the system will display the total price calculated under different pricing strategies.
