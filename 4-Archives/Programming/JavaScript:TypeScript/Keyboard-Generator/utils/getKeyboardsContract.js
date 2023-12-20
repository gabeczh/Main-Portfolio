import { ethers } from "ethers";

import abi from "../utils/Keyboards.json"

const contractAddress = '0x2b93B9d961dC84cbda8EF97F825C8129C036Cb60';
const contractABI = abi.abi;

export default function getKeyboardsContract(ethereum) {
  if(ethereum) {
    const provider = new ethers.providers.Web3Provider(ethereum);
    const signer = provider.getSigner();
    return new ethers.Contract(contractAddress, contractABI, signer);
  } else {
    return undefined;
  }
}
