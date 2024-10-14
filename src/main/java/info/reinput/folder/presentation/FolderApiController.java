package info.reinput.folder.presentation;

import info.reinput.folder.application.FolderService;
import info.reinput.folder.domain.dto.FolderCreateReq;
import info.reinput.folder.domain.dto.res.FolderRes;
import info.reinput.global.domain.auth.PrincipalDetails;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/folder")
public class FolderApiController {
    private final FolderService folderService;

    @PostMapping("/create/v1")
    public ResponseEntity<FolderRes> createFolder(
            final @AuthenticationPrincipal PrincipalDetails principalDetails,
            final @RequestBody FolderCreateReq folderCreateReq) {

        log.info("createFolder folderName : {}", folderCreateReq.folderName());
        return new ResponseEntity<>(
                folderService.createFolder(folderCreateReq, principalDetails.getMember()),
                HttpStatus.CREATED);
    }

    @PatchMapping("/update/v1")
    public ResponseEntity<FolderRes> editFolder(
            final @AuthenticationPrincipal PrincipalDetails principalDetails,
            final @RequestBody FolderCreateReq folderCreateReq) {

        log.info("editFolder folderName : {}", folderCreateReq.folderName());
        return new ResponseEntity<>(

        )
    }


}
