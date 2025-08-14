package roppa.apibackend.investing.model.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import roppa.apibackend.database.tables.pojos.Watchlist;
import roppa.apibackend.investing.model.dto.WatchlistDTO;

@Mapper(componentModel = "spring")
public interface WatchlistMapper {

    @Mapping(target = "perValue", source = "entity.per")
    WatchlistDTO watchlistToWatchlistDTO(Watchlist entity);

    @Mapping(target = "per", source = "dto.perValue")
    Watchlist watchlistDTOtoWatchlist(WatchlistDTO dto);
}
