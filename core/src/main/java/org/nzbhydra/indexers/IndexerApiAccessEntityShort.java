package org.nzbhydra.indexers;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;


/**
 * Stores indexer API accesses that will only be kept in the database for no more than 24 hours. Makes
 * checking for API hit limits much faster
 */
@Data
@Entity
@NoArgsConstructor
@Table(name = "indexerapiaccess_short")
public class IndexerApiAccessEntityShort {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    protected int id;

    @Column(name = "INDEXER_ID")
    private int indexerId;

    @Convert(converter = org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters.InstantConverter.class)
    private Instant time;

    private boolean successful;

    @Enumerated(EnumType.STRING)
    @Column(name = "API_ACCESS_TYPE")
    private IndexerApiAccessType apiAccessType;

    public IndexerApiAccessEntityShort(IndexerEntity indexerEntity, boolean successsful, IndexerApiAccessType apiAccessType) {
        this.indexerId = indexerEntity.getId();
        time = Instant.now();
        this.successful = successsful;
        this.apiAccessType = apiAccessType;
    }


}
