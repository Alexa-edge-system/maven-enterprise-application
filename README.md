# maven-enterprise-application

For a **Java Enterprise (Jakarta EE) Maven-based banking application**, 

### ✅ Features

* Account summary page
* JavaScript for frontend interactivity (e.g., balance visibility, simple animation)
* Uses Maven for build
* Java Servlet backend
* JSP frontend
* JavaScript used to enhance user experience on the client side

---

### 📁 Maven Project Structure

```
banking-app/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com.bank/
│   │   │       └── servlet/
│   │   │           └── AccountServlet.java
│   │   ├── resources/
│   │   └── webapp/
│   │       ├── WEB-INF/
│   │       │   └── web.xml
│   │       ├── js/
│   │       │   └── banking.js
│   │       └── index.jsp
├── pom.xml

### ✅ To Run:

1. Package it: `mvn clean package`
2. Deploy the WAR to a server (e.g., Apache Tomcat 10+ that supports Jakarta EE 9/10)
3. Access via: `http://localhost:8080/banking-app/account`

---

Task we will add:

* Login with session management?
* Transaction history page?
* Backend database (MySQL/PostgreSQL) connection?


