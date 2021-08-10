package roppa.apibackend.investing.model.mapper;

import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.springframework.boot.test.context.TestComponent;
import roppa.apibackend.database.tables.pojos.Watchlist;
import roppa.apibackend.investing.model.dto.WatchlistDTO;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestComponent
public class WatchlistMapperTest {
    private final WatchlistMapper mapper = Mappers.getMapper(WatchlistMapper.class);

    @Test
    public void watchlistBidirectionalMappingTest() {
        WatchlistDTO dto = new WatchlistDTO();
        dto.setCompanyName("Test Company");
        dto.setPerValue(10);

        Watchlist entity = mapper.watchlistDTOtoWatchlist(dto);

        assertEquals("Test Company", entity.getCompanyName());
        assertEquals(Integer.valueOf(10), entity.getPer());

        entity.setCompanyName("Tset Company");
        entity.setPer(20);
        dto = mapper.watchlistToWatchlistDTO(entity);

        assertEquals("Tset Company", dto.getCompanyName());
        assertEquals(20, dto.getPerValue());
    }
}
