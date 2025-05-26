function initPage() {
  console.log("Welcome to the Community Portal");
  alert("Page fully loaded");
}

document.addEventListener("DOMContentLoaded", () => {
  const btn = document.getElementById("registerBtn");
  btn.onclick = () => alert("Registration successful!");
});
