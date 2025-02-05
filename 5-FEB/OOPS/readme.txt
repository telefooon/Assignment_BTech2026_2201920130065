# Railway Ticket Booking System

This is a simple Railway Ticket Booking System implemented in Java using Object-Oriented Programming (OOP) principles. The system allows users to book and cancel train tickets, manage customer details, and view available trains.

## Features

1. **Train Management**:
   - View available trains and their routes.
   - Check the number of available seats for each train.
   - Book and cancel seats for a specific train.

2. **Customer Management**:
   - Collect and store customer details such as name, age, gender, and contact number.
   - Ensure unique customer identification using contact numbers.

3. **Ticket Management**:
   - Generate a unique PNR number for each ticket.
   - Book a specific seat in a coach for a selected train.
   - Cancel a booked ticket and refund the seat.

4. **User Interaction**:
   - Interactive command-line interface for booking and canceling tickets.
   - Option to exit the system after completing the booking process.

## Classes and Their Responsibilities

1. **Train**:
   - Represents a train with its route and available seats.
   - Provides methods to book and cancel seats.

2. **Customer**:
   - Represents a customer with their personal details (name, age, gender, contact number).

3. **Ticket**:
   - Represents a ticket with a unique PNR number, seat details, and customer information.
   - Handles ticket cancellation.

4. **RailwaySystem**:
   - Manages the overall system, including trains, tickets, and customer interactions.
   - Handles user input and provides options for booking and canceling tickets.