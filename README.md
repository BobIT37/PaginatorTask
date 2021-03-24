[![N|Solid](https://www.bobit.us/images/bobit-logo.png)](https://bobit37.github.io/Resume/)

# Pagination Helper Task

This project has been created using Maven and TestNG is used for unit test. 
Download or clone the project on your local system after that in the terminal execute following commands.

## Specify project path on the terminal
- cd project path

## to execute all test cases
- mvn -Dtest=PaginationHelperTest test

## to execute specific test case
- mvn -Dtest=PaginationHelperTest#getItemCount test
- mvn -Dtest=PaginationHelperTest#getPageIndex test
- mvn -Dtest=PaginationHelperTest#getPageCount test
- mvn -Dtest=PaginationHelperTest#getPageItemCount test

## without command line
- go to test resources and find runner package, then execute runnertest.xml file
