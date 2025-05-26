// =============================
// Module 1 - JavaScript Tasks
// =============================

// 1. JavaScript Basics & Setup
console.log("Welcome to the Community Portal");
window.onload = () => alert("Page fully loaded");

// 2. Syntax, Data Types, and Operators
const eventName = "Music Festival";
const eventDate = "2025-07-15";
let seats = 50;
console.log(`Event: ${eventName}, Date: ${eventDate}, Seats: ${seats}`);
seats--;

// 3. Conditionals, Loops, and Error Handling
const events = [
  { name: "Yoga Class", date: "2025-06-01", seats: 5 },
  { name: "Tech Talk", date: "2023-01-01", seats: 10 },
  { name: "Art Workshop", date: "2025-08-10", seats: 0 }
];

const today = new Date("2025-05-26");
events.forEach(e => {
  const eventDate = new Date(e.date);
  if (eventDate > today && e.seats > 0) {
    console.log(`Available: ${e.name}`);
  } else {
    console.log(`Unavailable: ${e.name}`);
  }
});

try {
  if (seats < 1) throw new Error("No seats left");
  console.log("Registration successful");
} catch (err) {
  console.error(err.message);
}

// 4. Functions, Scope, Closures, Higher-Order Functions
function addEvent(event) {
  events.push(event);
}

function registerUser(eventName) {
  console.log(`${eventName}: User registered`);
}

function filterEventsByCategory(events, category) {
  return events.filter(e => e.category === category);
}

function registrationTracker() {
  let count = 0;
  return function () {
    count++;
    console.log(`Total registrations: ${count}`);
  };
}
const track = registrationTracker();
track();

// 5. Objects and Prototypes
function Event(name, date, seats) {
  this.name = name;
  this.date = date;
  this.seats = seats;
}
Event.prototype.checkAvailability = function () {
  return this.seats > 0;
};

const art = new Event("Art Show", "2025-09-01", 20);
console.log(Object.entries(art));

// 6. Arrays and Methods
let communityEvents = [];
communityEvents.push({ name: "Music", category: "music" });
const musicEvents = communityEvents.filter(e => e.category === "music");
const titles = communityEvents.map(e => `Workshop on ${e.name}`);

// 7. DOM Manipulation
const container = document.querySelector("#eventContainer");
function renderEvent(event) {
  const div = document.createElement("div");
  div.textContent = `${event.name} - ${event.date}`;
  container.appendChild(div);
}

// 8. Event Handling
document.querySelector("#registerBtn").onclick = () => alert("Registered");
document.querySelector("#categoryFilter").onchange = e => console.log(e.target.value);
document.querySelector("#searchInput").onkeydown = e => console.log(e.key);

// 9. Async JS, Promises, Async/Await
fetch("https://mockapi.io/events")
  .then(res => res.json())
  .then(data => console.log(data))
  .catch(err => console.error("Error fetching events", err));

async function getEvents() {
  console.log("Loading...");
  const res = await fetch("https://mockapi.io/events");
  const data = await res.json();
  console.log(data);
}

// 10. Modern JavaScript Features
function greet(name = "Guest") {
  console.log(`Hello, ${name}`);
}
const { name: eName, date: eDate } = art;
const clonedEvents = [...communityEvents];

// 11. Working with Forms
document.querySelector("#registrationForm").addEventListener("submit", function (e) {
  e.preventDefault();
  const name = this.elements["name"].value;
  const email = this.elements["email"].value;
  const event = this.elements["event"].value;
  if (!name || !email || !event) {
    alert("All fields required");
  } else {
    console.log("Form submitted", { name, email, event });
  }
});

// 12. AJAX & Fetch API
function submitRegistration(data) {
  setTimeout(() => {
    fetch("https://mockapi.io/register", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(data)
    })
      .then(res => res.json())
      .then(resp => alert("Success!"))
      .catch(() => alert("Failed"));
  }, 1000);
}

// 13. Debugging and Testing
console.log("Submitting form...");
// Add breakpoints in browser for inspection

// 14. jQuery and JS Frameworks
$("#registerBtn").click(() => alert("jQuery Register Clicked"));
$(".eventCard").fadeIn();
$(".eventCard").fadeOut();
// Frameworks like React simplify state management and UI reactivity
