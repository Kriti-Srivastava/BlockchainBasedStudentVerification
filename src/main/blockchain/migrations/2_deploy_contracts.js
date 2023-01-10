const ArtifactValidator = artifacts.require("ArtifactValidator");

module.exports = function(deployer) {
    deployer.deploy(ArtifactValidator);
};

// takes compiled .json code