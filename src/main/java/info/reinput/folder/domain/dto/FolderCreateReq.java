package info.reinput.folder.domain.dto;

import info.reinput.folder.domain.Folder;
import info.reinput.global.domain.Color;
import jakarta.validation.constraints.NotEmpty;

public record FolderCreateReq(
        @NotEmpty(message = "폴더명은 필수입니다.")
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
