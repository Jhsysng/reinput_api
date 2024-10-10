package info.reinput.folder.infra;

import info.reinput.folder.domain.Folder;
import info.reinput.folder.infra.custom.CustomFolderRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long>, CustomFolderRepository {
}
