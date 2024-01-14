# Kaiburr Task Management API

This Java REST API is developed for managing "task" objects as part of the Kaiburr assessment project. It provides endpoints for creating, retrieving, updating, and deleting tasks, as well as additional functionality to search tasks by various criteria.

## Features

- Create new tasks with unique IDs.
- Retrieve all tasks or a single task by its ID.
- Update existing tasks.
- Delete tasks by ID.
- Search tasks by name and assignee.
- Sort tasks by start time.

## Prerequisites

Before running this project, you must have the following installed:
- Java JDK 11 or newer
- Maven 3.6 or newer
- MongoDB 4.0 or newer

## Setup and Installation

1. **Clone the repository:**

   ```sh
   git clone https://github.com/YourUsername/kaiburr_task1.git
   cd kaiburr_task1
   ```

2. **Compile the project:**

   ```sh
   mvn clean install
   ```

## REST API Endpoints

### Get All Tasks

- **URL:** `/api/tasks`
- **Method:** `GET`
- **Success Response:** Code: 200 | Content: `[tasks]`

### Get Task by ID

- **URL:** `/api/tasks/{id}`
- **Method:** `GET`
- **URL Params:** `id=[string]`
- **Success Response:** Code: 200 | Content: `{task}`
- **Error Response:** Code: 404 | Content: `Not Found`

### Create Task

- **URL:** `/api/tasks`
- **Method:** `POST`
- **Data Params:** `{ "name": "task name", "assignee": "assignee name", "project": "project name", "startTime": "ISO date-time" }`
- **Success Response:** Code: 201 | Content: `{task}`

### Update Task

- **URL:** `/api/tasks/{id}`
- **Method:** `PUT`
- **URL Params:** `id=[string]`
- **Data Params:** `{ "name": "task name", "assignee": "assignee name", "project": "project name", "startTime": "ISO date-time" }`
- **Success Response:** Code: 200 | Content: `{task}`
- **Error Response:** Code: 404 | Content: `Not Found`

### Delete Task

- **URL:** `/api/tasks/{id}`
- **Method:** `DELETE`
- **URL Params:** `id=[string]`
- **Success Response:** Code: 204 | Content: `No Content`
- **Error Response:** Code: 404 | Content: `Not Found`



## Testing


curl -X GET http://localhost:8080/api/tasks

![image](https://github.com/Niscent/kaiburr_task1/assets/93217751/6c442ff0-b6bd-461a-a53c-58c172036d59)



![image](https://github.com/Niscent/kaiburr_task1/assets/93217751/c3ba721d-e4a0-4d86-8ed6-db703a45a630)


