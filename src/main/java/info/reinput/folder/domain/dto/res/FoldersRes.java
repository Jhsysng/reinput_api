package info.reinput.folder.domain.dto.res;

import info.reinput.folder.domain.Folder;
import lombok.Builder;

import java.util.List;
@Builder
public record FoldersRes(
        int size,
        List<FolderRes> createdFolder
) {
    public static FoldersRes of(List<FolderRes> folderRes){
        return FoldersRes.builder()
                .size(folderRes.size())
                .createdFolder(folderRes)
                .build();
    }
}
