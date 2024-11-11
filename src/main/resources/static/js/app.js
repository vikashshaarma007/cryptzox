// app.js
document.addEventListener("DOMContentLoaded", () => {
  function showLoader() {
    // Show loader when data is loading
    document.getElementById('loader').style.display = 'block';
  }

  function hideLoader() {
    // Hide loader when data is loaded
    document.getElementById('loader').style.display = 'none';
  }

  const fetchAndRender = async () => {
    try {
      showLoader();
      const response = await fetch("/");

      if (!response.ok) {
        throw new Error(`HTTP error! status ${response.status}`);
      }

      hideLoader();
      const tickers = await response.json();

      const bestPrice = document.getElementById("best-price-info");
      const avgBuy = tickers[0].buy;
      bestPrice.innerHTML = "₹" + avgBuy;

    } catch (err) {
      console.error("Error fetching tickers:", err);
    }
  };

  let count = 60;
  const updateTimer = () => {
    const timerDisplay = document.getElementById("indicator");

    if (timerDisplay) {
      timerDisplay.textContent = count + " seconds remaining";
      count--;
      if (count === 0) {
        count = 60;
      }
    }
  };

  fetchAndRender();
  setInterval(fetchAndRender, 60000);
  setInterval(updateTimer,  1000);
});

const modeSwitch = document.getElementById('modeSwitch');
modeSwitch.addEventListener('change', () => {
  document.body.classList.toggle('light-mode');
});
