<h1 align="center">Cryptzox using Spring Boot 🧮🚀</h1>
<p align="center"><i>Now get all the crypto related information on a single platform</i></p>

<br>

<p></i> 👨🏽‍💻 </p>
<br>

##  To create this webpage hodlinfo.com by using HTML, CSS, JavaScript and backend using Spring Boot.
 1. All-in-One Cryptocurrency Platform: The Hodlinfo website enables users to easily purchase, trade cryptocurrency, and access updated information in a single location.
2.  Backend Integration with WazirX API: The platform's backend fetches data from the WazirX API, stores it in the database, and ensures the frontend is updated with the latest data every 60 seconds.
3.  Database Setup with PostgreSQL: PostgreSQL is being installed on Cryptzox to manage and retrieve the cryptocurrency data efficiently.

![image](https://github.com/user-attachments/assets/775c20c1-7de6-4af6-933c-7946a7593964)
![image](https://github.com/user-attachments/assets/65b1e0ea-f023-4f15-9c16-4efcf6fc2b2e)



## Fetch top 10 results from API(https://api.wazirx.com/api/v2/tickers) in the Database (PostgreSQL).
![image](https://github.com/user-attachments/assets/84bfaaf8-dfbe-4941-b6a2-a0fbd4fdc2eb)
 

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



  
