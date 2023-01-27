var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":100,"id":12612,"methods":[{"el":45,"sc":5,"sl":42},{"el":50,"sc":5,"sl":48},{"el":55,"sc":5,"sl":53},{"el":60,"sc":5,"sl":58},{"el":65,"sc":5,"sl":63},{"el":71,"sc":5,"sl":68},{"el":83,"sc":5,"sl":74},{"el":88,"sc":5,"sl":86},{"el":93,"sc":5,"sl":91},{"el":98,"sc":5,"sl":96}],"name":"ImageInputStreamAdapter","sl":32}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_101":{"methods":[{"sl":42},{"sl":48},{"sl":86},{"sl":96}],"name":"testEPSAscii","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":49},{"sl":87},{"sl":97}]},"test_105":{"methods":[{"sl":42},{"sl":48},{"sl":63},{"sl":68},{"sl":86}],"name":"testEPSBinary","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":49},{"sl":64},{"sl":69},{"sl":70},{"sl":87}]},"test_111":{"methods":[{"sl":42}],"name":"testICCProfiles","pass":true,"statements":[{"sl":43},{"sl":44}]},"test_121":{"methods":[{"sl":42},{"sl":48},{"sl":53},{"sl":68},{"sl":86},{"sl":96}],"name":"testEPSASCII","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":49},{"sl":54},{"sl":69},{"sl":70},{"sl":87},{"sl":97}]},"test_149":{"methods":[{"sl":68}],"name":"testFill","pass":true,"statements":[{"sl":69},{"sl":70}]},"test_154":{"methods":[{"sl":42}],"name":"testGetInputStream","pass":true,"statements":[{"sl":43},{"sl":44}]},"test_156":{"methods":[{"sl":42},{"sl":48},{"sl":86}],"name":"testEPSBinary","pass":true,"statements":[{"sl":43},{"sl":44},{"sl":49},{"sl":87}]},"test_157":{"methods":[{"sl":42}],"name":"testHasInputStream","pass":true,"statements":[{"sl":43},{"sl":44}]},"test_93":{"methods":[{"sl":42}],"name":"testLoadImage","pass":true,"statements":[{"sl":43},{"sl":44}]},"test_95":{"methods":[{"sl":42}],"name":"testNeedInputStream","pass":true,"statements":[{"sl":43},{"sl":44}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [93, 157, 95, 111, 105, 121, 154, 101, 156], [93, 157, 95, 111, 105, 121, 154, 101, 156], [93, 157, 95, 111, 105, 121, 154, 101, 156], [], [], [], [105, 121, 101, 156], [105, 121, 101, 156], [], [], [], [121], [121], [], [], [], [], [], [], [], [], [105], [105], [], [], [], [149, 105, 121], [149, 105, 121], [149, 105, 121], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [105, 121, 101, 156], [105, 121, 101, 156], [], [], [], [], [], [], [], [], [121, 101], [121, 101], [], [], []]
