// SPDX-License-Identifier: MIT
pragma solidity ^0.8.0;

// NFT contract to inherit from.
import "@openzeppelin/contracts/token/ERC721/ERC721.sol";

// Helper functions OpenZeppelin provides.
import "@openzeppelin/contracts/utils/Counters.sol";
import "@openzeppelin/contracts/utils/Strings.sol";

import "hardhat/console.sol";

import "./libraries/Base64.sol";

contract NotAxie is ERC721 {
    struct characterAttributes {
        uint256 characterIndex;
        string name;
        string imageURI;
        uint256 hp;
        uint256 maxHp;
        uint256 attackDamage;
    }

    using Counters for Counters.Counter;
    Counters.Counter private _tokenIds;

    characterAttributes[] defaultCharacters;

    mapping(uint256 => characterAttributes) public nftHolderAttributes;
    mapping(address => uint256) public nftHolders;

    constructor(
        string[] memory characterNames,
        string[] memory characterImageURIs,
        uint256[] memory characterHp,
        uint256[] memory characterAttackDmg
    ) ERC721("Players", "PLAYER") {
        for (uint256 i = 0; i < characterNames.length; i += 1) {
            defaultCharacters.push(
                characterAttributes({
                    characterIndex: i,
                    name: characterNames[i],
                    imageURI: characterImageURIs[i],
                    hp: characterHp[i],
                    maxHp: characterHp[i],
                    attackDamage: characterAttackDmg[i]
                })
            );

            characterAttributes memory c = defaultCharacters[i];
            console.log(
                "Done initializing %s w/ HP %s, img %s",
                c.name,
                c.hp,
                c.imageURI
            );
        }
        _tokenIds.increment();
    }

    function mintCharacterNFT(uint256 _characterIndex) external {
        // Get current tokenId (starts at 1 since we incremented in the constructor).
        uint256 newItemId = _tokenIds.current();

        // The magical function! Assigns the tokenId to the caller's wallet address.
        _safeMint(msg.sender, newItemId);

        // We map the tokenId => their character attributes. More on this in
        // the lesson below.
        nftHolderAttributes[newItemId] = characterAttributes({
            characterIndex: _characterIndex,
            name: defaultCharacters[_characterIndex].name,
            imageURI: defaultCharacters[_characterIndex].imageURI,
            hp: defaultCharacters[_characterIndex].hp,
            maxHp: defaultCharacters[_characterIndex].maxHp,
            attackDamage: defaultCharacters[_characterIndex].attackDamage
        });

        console.log(
            "Minted NFT w/ tokenId %s and characterIndex %s",
            newItemId,
            _characterIndex
        );

        // Keep an easy way to see who owns what NFT.
        nftHolders[msg.sender] = newItemId;

        // Increment the tokenId for the next person that uses it.
        _tokenIds.increment();
    }

    function tokenURI(uint256 _tokenId)
        public
        view
        override
        returns (string memory)
    {
        characterAttributes memory charAttributes = nftHolderAttributes[
            _tokenId
        ];

        string memory strHp = Strings.toString(charAttributes.hp);
        string memory strMaxHp = Strings.toString(charAttributes.maxHp);
        string memory strAttackDamage = Strings.toString(
            charAttributes.attackDamage
        );

        string memory json = Base64.encode(
            abi.encodePacked(
                '{"name": "',
                charAttributes.name,
                " -- NFT #: ",
                Strings.toString(_tokenId),
                '", "description": "This is an NFT of a Player", "image": "',
                charAttributes.imageURI,
                '", "attributes": [ { "trait_type": "Health Points", "value": ',
                strHp,
                ', "max_value":',
                strMaxHp,
                '}, { "trait_type": "Attack Damage", "value": ',
                strAttackDamage,
                "} ]}"
            )
        );

        string memory output = string(
            abi.encodePacked("data:application/json;base64,", json)
        );

        return output;
    }
}

contract NotAxieMap is ERC721 {
    struct mapAttributes {
        uint256 mapIndex;
        string name;
        string imageURI;
    }
    using Counters for Counters.Counter;
    Counters.Counter private _tokenIds;

    mapAttributes[] defaultMaps;

    mapping(uint256 => mapAttributes) public nftHolderAttributes;
    mapping(address => uint256) public nftHolders;

    constructor(string[] memory mapNames, string[] memory mapImageURIs)
        ERC721("Maps", "MAP")
    {
        for (uint256 i = 0; i < mapNames.length; i += 1) {
            defaultMaps.push(
                mapAttributes({
                    mapIndex: i,
                    name: mapNames[i],
                    imageURI: mapImageURIs[i]
                })
            );

            mapAttributes memory c = defaultMaps[i];
            console.log("Done initializing %s, img %s", c.name, c.imageURI);
        }
        _tokenIds.increment();
    }

    function mintMapNFT(uint256 _mapIndex) external {
        // Get current tokenId (starts at 1 since we incremented in the constructor).
        uint256 newItemId = _tokenIds.current();

        // The magical function! Assigns the tokenId to the caller's wallet address.
        _safeMint(msg.sender, newItemId);

        // We map the tokenId => their character attributes. More on this in
        // the lesson below.
        nftHolderAttributes[newItemId] = mapAttributes({
            mapIndex: _mapIndex,
            name: defaultMaps[_mapIndex].name,
            imageURI: defaultMaps[_mapIndex].imageURI
        });

        console.log(
            "Minted NFT w/ tokenId %s and mapIndex %s",
            newItemId,
            _mapIndex
        );

        // Keep an easy way to see who owns what NFT.
        nftHolders[msg.sender] = newItemId;

        // Increment the tokenId for the next person that uses it.
        _tokenIds.increment();
    }

    function tokenURI(uint256 _tokenId)
        public
        view
        override
        returns (string memory)
    {
        mapAttributes memory charAttributes = nftHolderAttributes[_tokenId];

        string memory json = Base64.encode(
            abi.encodePacked(
                '{"name": "',
                charAttributes.name,
                " -- NFT #: ",
                Strings.toString(_tokenId),
                '", "description": "This is an NFT of a Map", "image": "',
                charAttributes.imageURI,'"}'
            )
        );

        string memory output = string(
            abi.encodePacked("data:application/json;base64,", json)
        );

        return output;
    }
}
