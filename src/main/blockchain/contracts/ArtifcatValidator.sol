pragma solidity ^0.8.17;
contract ArtifactValidator {

    mapping (string => string ) artifactDictionary;

//    sets the students unique identifier, key(input), and this is then paired to the student's unique hash, value(output)
    function setArtifact(string memory student_artifact_identifier, string memory artifact_hash) public {
        artifactDictionary [student_artifact_identifier] = artifact_hash;
    }
//    returns the student's hash value by passing the student's unique identifier
    function getArtifact(string memory student_artifact_identifier) public view returns (string memory){
        return artifactDictionary [student_artifact_identifier];
    }
}
