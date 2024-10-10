package info.reinput.folder.presentation;

import info.reinput.folder.application.FolderService;
import info.reinput.folder.domain.dto.req.FolderCreateReq;
import info.reinput.folder.domain.dto.res.FolderRes;
import info.reinput.folder.domain.dto.res.FoldersRes;
import info.reinput.member.domain.Member;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/folder")
public class FolderApiController {
    private final FolderService folderService;

    @PostMapping("/v1")
    public ResponseEntity<FolderRes> createFolder(final @RequestBody FolderCreateReq folderCreateReq){
        log.info("createFolder folderName : {}", folderCreateReq.folderName());
        //todo Principal로 교체

        return ResponseEntity.ok().body(folderService.createFolder(folderCreateReq, null));
    }
}
