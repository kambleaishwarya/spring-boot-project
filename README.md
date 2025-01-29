# spring-boot-project

IPL Project & Social Media API
This repository contains two projects:

IPL Project: Manages entities such as Match, Performance, Team, and Player for tracking the Indian Premier League (IPL) events and performances.
Social Media API: A simple API for managing Location, Post, and User data, with functionality for interacting with social media posts.
 # IPL Project
# Overview
The IPL Project models entities related to the Indian Premier League. It allows you to:

Track matches, teams, and players.
Record and analyze player performance in matches.
# Entities
Match: Represents a match between two teams.
Performance: Represents the performance of a player in a match.
Team: Represents a cricket team participating in the IPL.
Player: Represents an individual player in the IPL.
# Setup Instructions
Clone the repository:
git clone https://github.com/kambleaishwarya/spring-boot-project.git

# Run the project:

mvn spring-boot:run
The application will be accessible at http://localhost:8080.

# Social Media API
# Overview
The Social Media API allows you to manage posts and user interactions with locations, posts, and user data. This project provides endpoints for interacting with user data and posting content, along with location-based posts.

# Entities
Location: Represents a geographical location where posts are made.
Post: Represents a social media post made by a user.
User: Represents a user of the social media platform.

# Setup Instructions
Clone the repository:
git clone https://github.com/kambleaishwarya/spring-boot-project.git
Set up your local database and update the connection settings in application.properties.

# Run the project:

mvn spring-boot:run
The API will be accessible at http://localhost:8080.

# Endpoints (Both Projects)
IPL Project
Create Match: POST /match
Get Matches: GET /match
Create Performance: POST /performance
Get Performance: GET /performance
Create Team: POST /team
Get Teams: GET /team
Create Player: POST /player
Get Players: GET /player
# Social Media API
Create Post: POST /post
Get Posts: GET /post
Create User: POST /user
Get Users: GET /user
Create Location: POST /location
Get Locations: GET /location
# Project Structure

src/
├── main/
│   ├── java/
│   │   └── com/
│   │       └── yourpackage/
│   │           ├── ipl/
│   │           │   └── entities/        # Match, Performance, Team, Player
│   │           ├── socialmedia/          # Location, Post, User
│   │           └── repositories/
│   │           └── services/
│   ├── resources/
│   │   └── application.properties         # Database and other configurations
└── pom.xml

# Technologies Used
Spring Boot: For creating REST APIs.
JPA/Hibernate: For interacting with the database.
Maven: Dependency management and build tool.

# License
This project is licensed under the MIT License.

