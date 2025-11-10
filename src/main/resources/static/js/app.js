document.addEventListener("DOMContentLoaded", () => {
  const loader = document.getElementById("loader");
  const bestPrice = document.getElementById("best-price-info");
  const tbody = document.querySelector(".tbody-scroll");
  const timerDisplay = document.getElementById("indicator");
  const modeSwitch = document.getElementById("modeSwitch");

  let count = 60;

  // 🔹 Show/hide loader
  function showLoader() {
    if (loader) loader.style.display = "block";
  }
  function hideLoader() {
    if (loader) loader.style.display = "none";
  }

  // 🔹 Render table rows
  function renderTable(tickers) {
    if (!tickers || tickers.length === 0) return;

    // Update best price
    bestPrice.textContent = "₹" + tickers[0].buy.toFixed(2);

    // Render all table rows
    tbody.innerHTML = tickers.map((t, i) => `
      <tr>
      
        <td>${i + 1}</td>
        
        <td>${t.name}</td>
        <td>₹${t.last.toFixed(2)}</td>
        <td>₹${t.buy.toFixed(2)} / ₹${t.sell.toFixed(2)}</td>
        <td class="${t.sell - t.buy > 0 ? 'positive' : 'negative'}">
          ₹${((t.sell - t.buy) / 100).toFixed(2)}
        </td>
        <td class="${t.sell - t.buy > 0 ? 'positive' : 'negative'}">
          ${t.sell - t.buy > 0 ? '▲' : '▼'} ₹${(t.sell - t.buy).toFixed(2)}
        </td>
      </tr>
    `).join('');
  }

  // 🔹 Fetch tickers from DB
  async function fetchFromDatabase() {
    try {
      console.log("Fetching DB data:", new Date().toLocaleTimeString());
      showLoader();

      const response = await fetch(`/api/tickers?ts=${Date.now()}`, {
        cache: "no-store",
        headers: { "Cache-Control": "no-cache" }
      });

      if (!response.ok) throw new Error(`HTTP error: ${response.status}`);
      const tickers = await response.json();

      renderTable(tickers);
    } catch (err) {
      console.error("Error fetching DB data:", err);
    } finally {
      hideLoader();
    }
  }

  // 🔹 Fetch fresh data from WazirX and update DB
  async function updateDataFromWazirx() {
    try {
      console.log("Fetching fresh data from WazirX...");
      showLoader();

      const response = await fetch(`/fetch?ts=${Date.now()}`, {
        cache: "no-store",
        headers: { "Cache-Control": "no-cache" }
      });

      if (!response.ok) throw new Error(`Fetch failed: ${response.status}`);
      const updatedTickers = await response.json();

      console.log("DB updated, refreshing frontend...");
      renderTable(updatedTickers); // show new data instantly
    } catch (err) {
      console.error("Error updating data:", err);
    } finally {
      hideLoader();
    }
  }

  // 🔹 Countdown timer
  function updateTimer() {
    if (timerDisplay) {
      timerDisplay.textContent = `${count} seconds remaining`;
      count = (count === 0) ? 60 : count - 1;
    }
  }

  // 🔹 Initial data load
  fetchFromDatabase();

  // 🔹 Every 60s → fetch new data from WazirX and refresh UI
  setInterval(async () => {
    await updateDataFromWazirx();
    await fetchFromDatabase();
    count = 60; // reset countdown
  }, 60000);

  // 🔹 Every second → update countdown
  setInterval(updateTimer, 1000);

  // 🔹 Optional: Auto-refresh UI every 15s to reflect DB changes quickly
  setInterval(fetchFromDatabase, 15000);

  // 🔹 Theme toggle
  if (modeSwitch) {
    modeSwitch.addEventListener("change", () => {
      document.body.classList.toggle("light-mode");
    });
  }
});
