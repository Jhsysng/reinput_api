package info.reinput.folder.domain.dto.res;

import info.reinput.folder.domain.Folder;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record FolderRes(
        Long id,
        String name,
        String color,
        int insightCount
) {
    public static FolderRes of(Folder folder) {
        return FolderRes.builder()
                .id(folder.getId())
                .name(folder.getName())
                .color(folder.getColor().toString())
                .insightCount(folder.getInsights().size())
                .build();
    }

    //todo folder request queryDsl dto 추가
}
