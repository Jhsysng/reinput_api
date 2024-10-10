package info.reinput.folder.domain.dto.res;

import info.reinput.folder.domain.Folder;
import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record FolderRes(
        Long id,
        String name,
        String color
) {
    public static FolderRes of(Folder folder) {
        return FolderRes.builder()
                .id(folder.getId())
                .name(folder.getName())
                .color(folder.getColor().toString())
                .build();
    }
}
