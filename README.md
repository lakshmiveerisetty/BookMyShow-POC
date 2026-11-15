# 🎬 BookMyShow – Movie Ticket Booking POC

## 📌 Project Description
BookMyShow POC is a Java-based movie ticket booking application that demonstrates multithreading and synchronization. Multiple customers attempt to book movie tickets simultaneously, while the application manages ticket availability and prevents multiple threads from accessing the shared booking resource at the same time.

## 🛠️ Technologies Used
- ☕ Java
- 🧵 Multithreading
- 🔒 Synchronization
- 🧩 Thread Class
- 💻 Object-Oriented Programming (OOP)

## ✨ Features
- 🎟️ Multiple customers can book tickets simultaneously.
- 📊 Maintains a shared ticket availability count.
- 🔐 Uses synchronized methods to prevent concurrent booking conflicts.
- ✅ Checks ticket availability before confirming a booking.
- 📝 Displays successful booking details.
- ❌ Displays an error message when tickets are sold out.

## 📚 Concepts Implemented
1. 🧵 **Multithreading:** Multiple customer threads execute ticket booking operations.
2. 🔒 **Synchronization:** The `synchronized` keyword ensures that only one thread can execute the booking method at a time.
3. 🧑‍💻 **Thread Class:** Customer class extends the Thread class to perform booking operations.
4. 🔄 **Shared Resource:** All customers access the same BookMyShow object.
5. ⏳ **Thread.sleep():** Simulates a delay during the ticket booking process.

## 🎫 Booking Scenario
- 🎟️ Total Available Tickets: 10
- 👤 Customer Lakshmi requests: 6 tickets.
- 👤 Customer Lucky requests: 4 tickets.
- 👤 Customer Surya requests: 8 tickets.
- 👤 Customer Sukshmi requests: 4 tickets.

The application processes booking requests using synchronized methods. Once all 10 tickets are booked, subsequent customers receive a sold-out message.

## 📂 Project Structure
```text
BookMyShow-POC
│
└── src
    └── com
        └── BookMyShow
            └── TestBookMyShowDemo.java
```

## ▶️ How to Run
1. 📥 Clone or download this repository.
2. 💻 Open the project in Eclipse IDE.
3. 📂 Locate `TestBookMyShowDemo.java`.
4. ▶️ Run the Java program.
5. 📊 Observe the ticket booking process in the console.

## 🎯 Learning Outcome
Through this project, I gained practical knowledge of Java multithreading, synchronization, shared resources, and concurrent ticket booking operations.

## 👩‍💻 Author
**Veerisetty Venkata Lakshmi**
