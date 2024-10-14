package info.reinput.folder.application;

import info.reinput.folder.domain.Folder;
import info.reinput.folder.domain.dto.FolderCreateReq;
import info.reinput.folder.domain.dto.res.FolderRes;
import info.reinput.folder.domain.dto.res.FoldersRes;
import info.reinput.folder.infra.FolderRepository;
import info.reinput.member.domain.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class FolderService {

    private final FolderRepository folderRepository;

    @Transactional
    public FolderRes createFolder(final FolderCreateReq folderCreateReq, final Member member) {
        log.info("[FolderService] createFolder folderName : {}", folderCreateReq.folderName());

        Folder folder = Folder.createFolder(folderCreateReq, member);

        return FolderRes.of(folderRepository.save(folder));
    }

}
