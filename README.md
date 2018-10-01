# Simple StackOverflow

### Description 
This application is intended to be used as part of openclassrooms course available on this URL. 
It is a working solution for loading the StackOverflow questions tagged with `android` into the list.

### Goal
Goal of this application is delivered to you via openclassroom course activity. 

All required details related to the API can be found in the documentation of StackExchange API: https://api.stackexchange.com/docs. Implementation details can be found in the project itself.

### MVP Architecture
Application is developed in MVP architecture in mind with heavy usage of RxJava. Specific operations with RxJava aren't required. By following the example with questions loading, it is possible to implement the same logic for the answers loading as well.
Although, the RxJava is part of the course this project belongs to, implementation related to RxJava won't be evaluated due to its complexity. 
This project doesn't use architecture components like Room, LiveData or ViewModel. However, this project is organized in MVP architecture and its architecture should be followed in the future implementations as well.

