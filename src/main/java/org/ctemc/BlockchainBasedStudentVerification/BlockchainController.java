package org.ctemc.BlockchainBasedStudentVerification;

import org.ctemc.BlockchainBasedStudentVerification.domain.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BlockchainController {
    @PostMapping("/api/ethblock")
    @ResponseBody
    public Block createBlock(@RequestBody Block block) throws Exception {
        System.out.println("Add Block Request is " + block);
        String uniqueStudentIdentifier = block.getGradClass() + "-" + block.getHsCountry() + "-" + block.getHsState()  + "-" + block.getHighSchoolIdentifier() + "-" + block.getStudentIdentifier() + "-" + block.getDocType();
        System.out.println(uniqueStudentIdentifier);
        BlockchainService blockchainService = new BlockchainService();
        blockchainService.addArtifact(uniqueStudentIdentifier, block.getFileHash());
        return block;
    }

    @PostMapping("/api/getBlockHash")
    @ResponseBody
    public String getBlockHash(@RequestBody Block block) throws Exception {
        System.out.println("getBlockHash  Request is " + block);
        String uniqueStudentIdentifier = block.getGradClass() + "-" + block.getHsCountry() + "-" + block.getHsState()  + "-" + block.getHighSchoolIdentifier() + "-" + block.getStudentIdentifier() + "-" + block.getDocType();
        System.out.println("STUDENT IDENTIFIER IS "+uniqueStudentIdentifier);
        BlockchainService blockchainService = new BlockchainService();
        String hashFromEth = blockchainService.getArtifact(uniqueStudentIdentifier);
        return hashFromEth;
    }

    //    @GetMapping("/api/ethblock")
//    @ResponseBody
//    public String getBlock(@RequestParam(name = "gradClass") String gradClass,
//                          @RequestParam(name = "hsCountry") String hsCountry,
//                          @RequestParam(name = "hsState") String hsState,
//                          @RequestParam(name = "highSchoolIdentifier") String highSchoolIdentifier,
//                          @RequestParam(name = "studentIdentifier") String studentIdentifier,
//                          @RequestParam(name = "docType") String docType) throws Exception {
//        String uniqueStudentIdentifier = gradClass + "-" + hsCountry + "-" + hsState  + "-" + highSchoolIdentifier + "-" + studentIdentifier + "-" + docType;
//        System.out.println("STUDENT IDENTIFIER IS "+uniqueStudentIdentifier);
//        BlockchainService blockchainService = new BlockchainService();
//        String hashFromEth = blockchainService.getArtifact(uniqueStudentIdentifier);
//        return hashFromEth;
//    }

}
