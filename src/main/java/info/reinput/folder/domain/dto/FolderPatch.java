package info.reinput.folder.domain.dto;

import info.reinput.folder.domain.Folder;
import info.reinput.global.domain.Color;
import lombok.Builder;

@Builder
public record FolderPatch(
        Long id,
        String folderName,
        Color folderColor
) {
    public Folder toEntity() {
        return Folder.builder()
                .name(folderName)
                .color(folderColor)
                .build();
    }
}
