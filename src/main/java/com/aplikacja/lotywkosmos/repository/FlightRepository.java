package com.aplikacja.lotywkosmos.repository;


import com.aplikacja.lotywkosmos.model.Flight;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends CrudRepository<Flight, Long> {

    List<Flight> findAll();

    Flight findFlightById(Long id);

    Flight getFlightById(Long id);

    List<Flight> findFlightsByDestination(String destination);

    List<Flight> findFlightsByTicketPrice(Integer ticketPrice);

    List<Flight> findFlightsByDestinationAndTicketPrice(String destination, Integer ticketPrice);

    Flight save(Flight flight);

    Flight deleteFlightById(Long id);

}
