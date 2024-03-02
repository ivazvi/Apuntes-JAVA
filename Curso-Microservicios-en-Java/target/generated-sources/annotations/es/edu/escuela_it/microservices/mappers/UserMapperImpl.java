package es.edu.escuela_it.microservices.mappers;

import es.edu.escuela_it.microservices.dao.entities.UserEntity;
import es.edu.escuela_it.microservices.model.UserDTO;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-02-25T16:09:19+0100",
    comments = "version: 1.3.1.Final, compiler: Eclipse JDT (IDE) 3.37.0.v20240206-1609, environment: Java 17.0.10 (Eclipse Adoptium)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public UserEntity getUserEntity(UserDTO userDTO) {
        if ( userDTO == null ) {
            return null;
        }

        UserEntity userEntity = new UserEntity();

        userEntity.setEdad( userDTO.getEdad() );
        userEntity.setId( userDTO.getId() );
        userEntity.setLastname( userDTO.getLastname() );
        userEntity.setName( userDTO.getName() );

        return userEntity;
    }

    @Override
    public UserDTO getUserDTO(UserEntity userEntity) {
        if ( userEntity == null ) {
            return null;
        }

        UserDTO userDTO = new UserDTO();

        userDTO.setEdad( userEntity.getEdad() );
        userDTO.setId( userEntity.getId() );
        userDTO.setLastname( userEntity.getLastname() );
        userDTO.setName( userEntity.getName() );

        return userDTO;
    }

    @Override
    public List<UserDTO> getUsersDtos(List<UserEntity> usersEntities) {
        if ( usersEntities == null ) {
            return null;
        }

        List<UserDTO> list = new ArrayList<UserDTO>( usersEntities.size() );
        for ( UserEntity userEntity : usersEntities ) {
            list.add( getUserDTO( userEntity ) );
        }

        return list;
    }
}
