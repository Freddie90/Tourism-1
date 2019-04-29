package za.ac.cput.repository.impl.TourDestination;

import za.ac.cput.domain.TourDestination.Destination;
import za.ac.cput.repository.TourDestination.DestinationRepository;


import java.util.HashSet;
import java.util.Set;


    public class DestinationRepositoryImpl implements DestinationRepository {

        private static DestinationRepository repository = null;
        private Set<Destination> destination;

        private DestinationRepositoryImpl() {
            this.destination = new HashSet<>();
        }

        public static DestinationRepository getRepository(){
            if(repository == null) repository = new DestinationRepositoryImpl();
            return repository;
        }

        public Destination create(Destination destination){
            this.destination.add(destination);
            return destination;
        }

        public Destination read(String destType){
            return null;
        }

        public Destination update(Destination destination) {
           return null;
        }

        public void delete(String destType) {

        }

        public Set<Destination> getAll(){
            return this.destination;
        }
}
