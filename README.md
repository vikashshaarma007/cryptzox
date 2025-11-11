<h1 align="center">💹 Cryptzox — Real-Time Crypto Tracker using Spring Boot 🚀</h1>

<p align="center"><i>Get all the crypto-related information on a single platform — fast, simple, and dynamic.</i></p>

---

### 🌐 **Live Demo**
🔗 **[Visit Cryptzox Live](https://cryptzox-4odh.onrender.com)**

---


<h1 align="center">💹 Cryptzox Application 👨🏽‍💻</h1>
<p align="center"><i>A Spring Boot–powered platform inspired by HodlInfo — track, trade, and explore cryptocurrencies effortlessly.</i></p>

---

### 🌍 **Project Overview**
**Cryptzox** is a full-stack web application that replicates the features of **hodlinfo.com**, built using **Spring Boot**, **Thymeleaf**, **HTML**, **CSS**, and **JavaScript**.  
It allows users to view live cryptocurrency prices, fetched directly from the **WazirX API**, and displays them in an intuitive and responsive interface.

---

<img width="1867" height="827" alt="image" src="https://github.com/user-attachments/assets/bcc53b98-043a-4f50-96a2-6c4b30b3c41e" />
 <img width="1853" height="372" alt="image" src="https://github.com/user-attachments/assets/844ba62e-cab4-4b65-b689-6394c41c7222" />



## Fetch top 10 results from API(https://api.wazirx.com/api/v2/tickers) in the Database (PostgreSQL).
![image](https://github.com/user-attachments/assets/84bfaaf8-dfbe-4941-b6a2-a0fbd4fdc2eb)

### ⚙️ **Key Features**

1. **All-in-One Cryptocurrency Dashboard**  
   View and monitor real-time prices of various cryptocurrencies in one place.

2. **Backend Integration with WazirX API**  
   - The backend periodically fetches the latest market data from the WazirX public API.  
   - Data is stored and updated in the PostgreSQL database every **60 seconds**.  
   - The frontend dynamically reflects the updated prices.

3. **Efficient Database Management with PostgreSQL**  
   - All fetched data is saved using **Spring Data JPA** for persistence.  
   - PostgreSQL ensures fast and reliable data retrieval.

---

### 🧩 **Tech Stack**
| Layer | Technology |
|:------|:------------|
| **Frontend** | HTML, CSS, Bootstrap, JavaScript, Thymeleaf |
| **Backend** | Spring Boot (Java 17) |
| **Database** | PostgreSQL |
| **API Source** | WazirX Public API |
| **Deployment** | Render (Free Cloud Hosting) |
| **Build Tool** | Maven |

---

### 🐳 **Run Locally (with Docker)**
```bash
# Clone repository
git clone https://github.com/your-username/cryptzox.git
cd cryptzox

# Build and run with Docker Compose
docker-compose up --build

<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-with">Built With</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>>
  </ol>
</details>

  Built With : 
  * Java 
  * Spring-Boot
  * PostgreSQL
  * HTML
  * CSS
  * JavaScript
  * Thymeleaf
  * Spring Jpa
  * PostgreSQL database Hosted on : 
  * Sequelize : to interact with the PostgreSQL database

  ## Dependencies
  ```sh
    * dependencies : 
    * Spring Boot DevTools
    * Spring Data Jpa
    * PostgreSQL Driver
    * Thymeleaf
    * Spring Web
    * Spring Web Services
   ```
  
 <!-- GETTING STARTED -->
  ## Getting Started
  ```sh
       Instructions to set up the project locally.
       To get a local copy up and running follow these simple example steps.
 ```

   ## Prerequisites
   ```sh
     1. Ensure the following tools are installed on your machine:
     2. Java Development Kit (JDK) (preferably JDK 11 or higher).
     3. Maven or Gradle (based on your project's build tool).
     4. Git for cloning the repository.
     5. IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).
   ```
   ## To build the project for production
   ```sh
     1. Go to start.spring.io.
     2. Choose Maven, set Group and Artifact names.
     3. Pick Java version and add any dependencies (e.g., Spring Web, Spring JPA).
     4. Click Generate to download the project as a .zip file.
     5. Extract and import it into your IDE.
     6. Run the main method in DemoApplication.java to start the app.
   ```
   ## Installation 
     Follow these simple steps to get the server up and running 👾🧮🚀✅.
   1. Clone the repo
     
   ```sh
         git clone https://github.com/your_username_/Project-Name.git
   ```
     
   2. Run the Project
  ```sh
     1. API Used : https://api.wazirx.com/api/v2/tickers
     2. Create Database -> cryptzox
     3. Open project in preferred IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).
     4. Run the project as a Spring Boot app.
     5. Locate the class annotated with @SpringBootApplication.
     6. Right-click and select "Run" or "Debug".
     7. Hibernate will automatically create a table -> cryptzox
     8. Add sample data to the table using Postgresql pgadmin tools
     9. Ren web browser at localhost: 8080/
     10. Express server and store name, latest of each of the top 10 results of the database, buy, sell, volume and base_unit in the database (PostgreSQL).
   ```



  
