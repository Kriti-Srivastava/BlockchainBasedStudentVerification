package org.ctemc.BlockchainBasedStudentVerification;

import org.ctemc.BlockchainBasedStudentVerification.contract.ArtifactValidator;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.http.HttpService;
import org.web3j.tx.RawTransactionManager;
import org.web3j.tx.TransactionManager;

import java.math.BigInteger;

import static org.web3j.tx.Transfer.GAS_LIMIT;
import static org.web3j.tx.gas.DefaultGasProvider.GAS_PRICE;

public class BlockchainService {

    private Web3j web3j;
    private final String BLOCKCHAIN_ADDRESS = "HTTP://127.0.0.1:7545";
    private TransactionManager txmManager;
    private Credentials credentials;

    private String PRIVATE_KEY = "ca90b7b80ebf30830bb756d8aee6a4d0e067051bdb77c9a72d2e8e88aa8f71d7";
    private String CONTRACT_ADDRESS = "0x06f4D38A9e3239Ce4D06F385e7B1D307249E3288";
    private ArtifactValidator artifactValidator;

    private BigInteger GAS_PRICE = BigInteger.valueOf(20000000000L);
    private BigInteger GAS_LIMIT = BigInteger.valueOf(6721975L);


    public BlockchainService() {
        //Step 1: connect to blockchain
        this.web3j = Web3j.build(new HttpService(BLOCKCHAIN_ADDRESS));//Web3j now knows where to connect and where the blockchain service is running
//        System.out.println("Step 1: Connected to Blockchain. Web3j instance is: " + this.web3j);

        //Step 2: Create Credential Object From Private Key
        this.credentials = Credentials.create(this.PRIVATE_KEY);
//        System.out.println("Step 2: Credentials created object is: " + this.credentials);

        //Step 3: Create Transaction Manager
        this.txmManager = new RawTransactionManager(this.web3j, this.credentials);
//        System.out.println("Step 3: Create a Transaction Manager: " + this.txmManager);

        //Step 4: Load Contract
        this.artifactValidator = ArtifactValidator.load(this.CONTRACT_ADDRESS, this.web3j, this.credentials, GAS_PRICE, GAS_LIMIT);
//        System.out.println("Step 4: Contract Loaded: " + this.artifactValidator);
    }
    public void addArtifact(String studentIdentifier, String hash) throws Exception {
        //Step 5: Add Artifact
        this.artifactValidator.setArtifact(studentIdentifier,hash).send();
        Thread.sleep(1000);
//        System.out.println("Step 5: Artifact Added to Blockchain" );
    }
    public String getArtifact(String studentIdentifier) throws Exception {
        //Step 6: Get Artifact Hash
        String hashFromBlockchain = this.artifactValidator.getArtifact(studentIdentifier).send();
        return hashFromBlockchain;

    }



}
