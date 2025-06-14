package umg.edu.gt.mapper;
public interface IMapper<E, D> {
    E toEntity(D dto);
    D toDto(E entity);
}
 //Se aplica el principio de open/close al permitir múltiples implementaciones
// sin modificar esta interfaz