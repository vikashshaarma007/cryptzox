<h1 align="center">💹 Cryptzox — Real-Time Crypto Tracker using Spring Boot 🚀</h1>

<p align="center"><i>Get all the crypto-related information on a single platform — fast, simple, and dynamic.</i></p>

---

### 🌐 **Live Demo**
🔗 **[Visit Cryptzox Live](https://cryptzox-4odh.onrender.com)**

---

## 🌍 **Project Overview**
**Cryptzox** is a full-stack web application inspired by **HodlInfo**, built using **Spring Boot**, **Thymeleaf**, **HTML**, **CSS**, and **JavaScript**.  
It enables users to view live cryptocurrency prices fetched from the **WazirX API**, updating data every **60 seconds** and displaying it dynamically via the frontend.

---

### 📸 **Project Screenshots**

<img width="1867" height="827" alt="image" src="https://github.com/user-attachments/assets/bcc53b98-043a-4f50-96a2-6c4b30b3c41e" />
<img width="1853" height="372" alt="image" src="https://github.com/user-attachments/assets/844ba62e-cab4-4b65-b689-6394c41c7222" />

---

### 📡 **API Integration**
The application fetches top 10 cryptocurrencies from:  
🔗 [https://api.wazirx.com/api/v2/tickers](https://api.wazirx.com/api/v2/tickers)

Data is parsed and stored in the **PostgreSQL** database.

![image](https://github.com/user-attachments/assets/84bfaaf8-dfbe-4941-b6a2-a0fbd4fdc2eb)

---

## ⚙️ **Key Features**

1. **All-in-One Cryptocurrency Dashboard**  
   View and monitor real-time prices of various cryptocurrencies in one place.

2. **Backend Integration with WazirX API**  
   - Fetches latest market data every **60 seconds**.  
   - Stores and updates data in **PostgreSQL**.  
   - Reflects changes dynamically on the frontend.

3. **Database Management with Spring Data JPA**  
   - Efficient persistence and retrieval of data.  
   - Auto schema creation and update using Hibernate.

---

## 🧩 **Tech Stack**

| Layer | Technology |
|:------|:------------|
| **Frontend** | HTML, CSS, Bootstrap, JavaScript, Thymeleaf |
| **Backend** | Spring Boot (Java 17) |
| **Database** | PostgreSQL |
| **API Source** | WazirX Public API |
| **Deployment** | Render (Free Cloud Hosting) |
| **Build Tool** | Maven |

---

## 🐳 **Run Locally (with Docker)**

```bash
# Clone repository
git clone https://github.com/your-username/cryptzox.git
cd cryptzox

# Build and run with Docker Compose
docker-compose up --build
