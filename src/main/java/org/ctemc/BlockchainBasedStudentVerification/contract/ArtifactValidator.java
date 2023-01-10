package org.ctemc.BlockchainBasedStudentVerification.contract;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import org.web3j.abi.TypeReference;
import org.web3j.abi.datatypes.Function;
import org.web3j.abi.datatypes.Type;
import org.web3j.abi.datatypes.Utf8String;
import org.web3j.crypto.Credentials;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.RemoteCall;
import org.web3j.protocol.core.methods.response.TransactionReceipt;
import org.web3j.tx.Contract;
import org.web3j.tx.TransactionManager;

/**
 * <p>Auto generated code.
 * <p><strong>Do not modify!</strong>
 * <p>Please use the <a href="https://docs.web3j.io/command_line.html">web3j command line tools</a>,
 * or the org.web3j.codegen.SolidityFunctionWrapperGenerator in the 
 * <a href="https://github.com/web3j/web3j/tree/master/codegen">codegen module</a> to update.
 *
 * <p>Generated with web3j version 3.3.1.
 */
public class ArtifactValidator extends Contract {
    private static final String BINARY = "0x608060405234801561001057600080fd5b50610794806100206000396000f3fe608060405234801561001057600080fd5b50600436106100365760003560e01c806372e3157d1461003b578063c4c4a8a114610057575b600080fd5b610055600480360381019061005091906102c1565b610087565b005b610071600480360381019061006c9190610339565b6100b7565b60405161007e9190610401565b60405180910390f35b80600083604051610098919061045f565b908152602001604051809103902090816100b2919061068c565b505050565b60606000826040516100c9919061045f565b908152602001604051809103902080546100e2906104a5565b80601f016020809104026020016040519081016040528092919081815260200182805461010e906104a5565b801561015b5780601f106101305761010080835404028352916020019161015b565b820191906000526020600020905b81548152906001019060200180831161013e57829003601f168201915b50505050509050919050565b6000604051905090565b600080fd5b600080fd5b600080fd5b600080fd5b6000601f19601f8301169050919050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052604160045260246000fd5b6101ce82610185565b810181811067ffffffffffffffff821117156101ed576101ec610196565b5b80604052505050565b6000610200610167565b905061020c82826101c5565b919050565b600067ffffffffffffffff82111561022c5761022b610196565b5b61023582610185565b9050602081019050919050565b82818337600083830152505050565b600061026461025f84610211565b6101f6565b9050828152602081018484840111156102805761027f610180565b5b61028b848285610242565b509392505050565b600082601f8301126102a8576102a761017b565b5b81356102b8848260208601610251565b91505092915050565b600080604083850312156102d8576102d7610171565b5b600083013567ffffffffffffffff8111156102f6576102f5610176565b5b61030285828601610293565b925050602083013567ffffffffffffffff81111561032357610322610176565b5b61032f85828601610293565b9150509250929050565b60006020828403121561034f5761034e610171565b5b600082013567ffffffffffffffff81111561036d5761036c610176565b5b61037984828501610293565b91505092915050565b600081519050919050565b600082825260208201905092915050565b60005b838110156103bc5780820151818401526020810190506103a1565b60008484015250505050565b60006103d382610382565b6103dd818561038d565b93506103ed81856020860161039e565b6103f681610185565b840191505092915050565b6000602082019050818103600083015261041b81846103c8565b905092915050565b600081905092915050565b600061043982610382565b6104438185610423565b935061045381856020860161039e565b80840191505092915050565b600061046b828461042e565b915081905092915050565b7f4e487b7100000000000000000000000000000000000000000000000000000000600052602260045260246000fd5b600060028204905060018216806104bd57607f821691505b6020821081036104d0576104cf610476565b5b50919050565b60008190508160005260206000209050919050565b60006020601f8301049050919050565b600082821b905092915050565b6000600883026105387fffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffffff826104fb565b61054286836104fb565b95508019841693508086168417925050509392505050565b6000819050919050565b6000819050919050565b600061058961058461057f8461055a565b610564565b61055a565b9050919050565b6000819050919050565b6105a38361056e565b6105b76105af82610590565b848454610508565b825550505050565b600090565b6105cc6105bf565b6105d781848461059a565b505050565b5b818110156105fb576105f06000826105c4565b6001810190506105dd565b5050565b601f82111561064057610611816104d6565b61061a846104eb565b81016020851015610629578190505b61063d610635856104eb565b8301826105dc565b50505b505050565b600082821c905092915050565b600061066360001984600802610645565b1980831691505092915050565b600061067c8383610652565b9150826002028217905092915050565b61069582610382565b67ffffffffffffffff8111156106ae576106ad610196565b5b6106b882546104a5565b6106c38282856105ff565b600060209050601f8311600181146106f657600084156106e4578287015190505b6106ee8582610670565b865550610756565b601f198416610704866104d6565b60005b8281101561072c57848901518255600182019150602085019450602081019050610707565b868310156107495784890151610745601f891682610652565b8355505b6001600288020188555050505b50505050505056fea26469706673582212201726b9acf1cfd7e93927abc5043917349237c823a53911615c86bc0125e848d664736f6c63430008110033";

    protected static final HashMap<String, String> _addresses;

    static {
        _addresses = new HashMap<>();
        _addresses.put("5777", "0xEDe6B75bFD1A3705a655468395987e629a3374B0");
    }

    protected ArtifactValidator(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    protected ArtifactValidator(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        super(BINARY, contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    public RemoteCall<TransactionReceipt> setArtifact(String student_artifact_identifier, String artifact_hash) {
        final Function function = new Function(
                "setArtifact", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(student_artifact_identifier), 
                new org.web3j.abi.datatypes.Utf8String(artifact_hash)), 
                Collections.<TypeReference<?>>emptyList());
        return executeRemoteCallTransaction(function);
    }

    public RemoteCall<String> getArtifact(String student_artifact_identifier) {
        final Function function = new Function("getArtifact", 
                Arrays.<Type>asList(new org.web3j.abi.datatypes.Utf8String(student_artifact_identifier)), 
                Arrays.<TypeReference<?>>asList(new TypeReference<Utf8String>() {}));
        return executeRemoteCallSingleValueReturn(function, String.class);
    }

    public static RemoteCall<ArtifactValidator> deploy(Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ArtifactValidator.class, web3j, credentials, gasPrice, gasLimit, BINARY, "");
    }

    public static RemoteCall<ArtifactValidator> deploy(Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return deployRemoteCall(ArtifactValidator.class, web3j, transactionManager, gasPrice, gasLimit, BINARY, "");
    }

    public static ArtifactValidator load(String contractAddress, Web3j web3j, Credentials credentials, BigInteger gasPrice, BigInteger gasLimit) {
        return new ArtifactValidator(contractAddress, web3j, credentials, gasPrice, gasLimit);
    }

    public static ArtifactValidator load(String contractAddress, Web3j web3j, TransactionManager transactionManager, BigInteger gasPrice, BigInteger gasLimit) {
        return new ArtifactValidator(contractAddress, web3j, transactionManager, gasPrice, gasLimit);
    }

    protected String getStaticDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }

    public static String getPreviouslyDeployedAddress(String networkId) {
        return _addresses.get(networkId);
    }
}
