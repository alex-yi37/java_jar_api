package com.jar_api.jar_api.repositories;

import com.jar_api.jar_api.models.User;

import org.springframework.data.repository.CrudRepository;

// choosing between @CrudRepository (mentioned in spring guide) https://spring.io/guides/gs/accessing-data-jpa
// and @JpaRepository (mentioned in twilio guide) https://www.twilio.com/en-us/blog/beginner-mysql-database-java-spring-boot#Create-the-repository-class
// is explained here:
// https://stackoverflow.com/questions/14014086/what-is-difference-between-crudrepository-and-jparepository-interfaces-in-spring
// seems @CrudRepository is the most barebones, while @JpaRepository has more functionality
// there is also @PagingAndSortingRepository which exposes functionality for pagination

// I imagine will need sorting and pagination for users in the future, but for now think I will
// use the simplest implementation with @CrudRepository
public interface UserRepository extends CrudRepository<User, Long> {
}
