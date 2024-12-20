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

  <!-- GETTING STARTED -->
## Getting Started

 Instructions to set up the project locally.
 To get a local copy up and running follow these simple example steps.

### Prerequisites

* dependencies
  ```sh
  
  dependencies : 
  Spring Boot DevTools
  Spring Data Jpa
  PostgreSQL Driver
  Thymeleaf
  Spring Web
  Spring Web Services
  ```
* to run the project
  ```sh
  intellij/eclipse
  ```
  * to build the project for production
  ```sh
  Go to start.spring.io.
  Choose Maven, set Group and Artifact names.
  Pick Java version and add any dependencies (e.g., Spring Web, Spring JPA).
  Click Generate to download the project as a .zip file.
  Extract and import it into your IDE.
  Run the main method in DemoApplication.java to start the app.
  https://start.spring.io/
  ```
### Installation 

_Follow these simple steps to get the server up and running 👾🧮🚀✅._

1.  API Used : https://api.wazirx.com/api/v2/tickers
2.  Create Database -> cryptzox
3.  Open project in preferred IDE (I used SpringToolsSuite4)
4.  Run the project as a Spring Boot app.
5.  Hibernate will automatically create a table -> student
6.  Add sample data to the table using Postgresql pgadmin tools
7.  Open web browser at localhost: 8080/
8.  Express server and store name, latest of each of the top 10 results of the database, buy, sell, volume and base_unit in the database (PostgreSQL).
  
