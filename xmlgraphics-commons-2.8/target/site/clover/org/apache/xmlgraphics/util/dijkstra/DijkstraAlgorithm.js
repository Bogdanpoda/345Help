var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":215,"id":20357,"methods":[{"el":51,"sc":9,"sl":41},{"el":79,"sc":5,"sl":77},{"el":90,"sc":5,"sl":88},{"el":99,"sc":5,"sl":97},{"el":107,"sc":5,"sl":101},{"el":141,"sc":5,"sl":116},{"el":167,"sc":5,"sl":148},{"el":171,"sc":5,"sl":169},{"el":180,"sc":5,"sl":178},{"el":192,"sc":5,"sl":182},{"el":203,"sc":5,"sl":200},{"el":213,"sc":5,"sl":211}],"name":"DijkstraAlgorithm","sl":34}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":41},{"sl":77},{"sl":88},{"sl":97},{"sl":101},{"sl":116},{"sl":148},{"sl":169},{"sl":178},{"sl":182},{"sl":200},{"sl":211}],"name":"testPipelineFactoryAdditionalPenalty","pass":true,"statements":[{"sl":42},{"sl":43},{"sl":44},{"sl":46},{"sl":47},{"sl":78},{"sl":89},{"sl":98},{"sl":102},{"sl":103},{"sl":105},{"sl":106},{"sl":117},{"sl":121},{"sl":122},{"sl":123},{"sl":126},{"sl":129},{"sl":130},{"sl":131},{"sl":133},{"sl":135},{"sl":138},{"sl":139},{"sl":149},{"sl":150},{"sl":151},{"sl":153},{"sl":157},{"sl":159},{"sl":161},{"sl":164},{"sl":170},{"sl":179},{"sl":185},{"sl":188},{"sl":191},{"sl":201},{"sl":202},{"sl":212}]},"test_135":{"methods":[{"sl":41},{"sl":77},{"sl":88},{"sl":97},{"sl":101},{"sl":116},{"sl":148},{"sl":169},{"sl":178},{"sl":182},{"sl":200},{"sl":211}],"name":"testPipelineFactoryImageInfoDependency","pass":true,"statements":[{"sl":42},{"sl":43},{"sl":44},{"sl":46},{"sl":47},{"sl":78},{"sl":89},{"sl":98},{"sl":102},{"sl":103},{"sl":105},{"sl":106},{"sl":117},{"sl":121},{"sl":122},{"sl":123},{"sl":126},{"sl":129},{"sl":130},{"sl":131},{"sl":133},{"sl":135},{"sl":138},{"sl":139},{"sl":149},{"sl":150},{"sl":151},{"sl":153},{"sl":154},{"sl":157},{"sl":159},{"sl":161},{"sl":164},{"sl":170},{"sl":179},{"sl":185},{"sl":188},{"sl":191},{"sl":201},{"sl":202},{"sl":212}]},"test_182":{"methods":[{"sl":41},{"sl":77},{"sl":88},{"sl":97},{"sl":101},{"sl":116},{"sl":148},{"sl":169},{"sl":178},{"sl":182},{"sl":200},{"sl":211}],"name":"testPipelineWithoutURIThroughManager","pass":true,"statements":[{"sl":42},{"sl":43},{"sl":44},{"sl":46},{"sl":47},{"sl":78},{"sl":89},{"sl":98},{"sl":102},{"sl":103},{"sl":105},{"sl":106},{"sl":117},{"sl":121},{"sl":122},{"sl":123},{"sl":126},{"sl":129},{"sl":130},{"sl":131},{"sl":133},{"sl":135},{"sl":138},{"sl":139},{"sl":149},{"sl":150},{"sl":151},{"sl":153},{"sl":154},{"sl":157},{"sl":159},{"sl":161},{"sl":164},{"sl":170},{"sl":179},{"sl":185},{"sl":188},{"sl":191},{"sl":201},{"sl":202},{"sl":212}]},"test_25":{"methods":[{"sl":41},{"sl":77},{"sl":88},{"sl":97},{"sl":101},{"sl":116},{"sl":148},{"sl":169},{"sl":178},{"sl":182},{"sl":200},{"sl":211}],"name":"testPipelineFromURIThroughManager","pass":true,"statements":[{"sl":42},{"sl":43},{"sl":44},{"sl":46},{"sl":47},{"sl":49},{"sl":78},{"sl":89},{"sl":98},{"sl":102},{"sl":103},{"sl":105},{"sl":106},{"sl":117},{"sl":121},{"sl":122},{"sl":123},{"sl":126},{"sl":129},{"sl":130},{"sl":131},{"sl":133},{"sl":135},{"sl":138},{"sl":139},{"sl":149},{"sl":150},{"sl":151},{"sl":153},{"sl":154},{"sl":157},{"sl":159},{"sl":161},{"sl":164},{"sl":170},{"sl":179},{"sl":185},{"sl":188},{"sl":191},{"sl":201},{"sl":202},{"sl":212}]},"test_34":{"methods":[{"sl":41},{"sl":77},{"sl":88},{"sl":97},{"sl":101},{"sl":116},{"sl":148},{"sl":169},{"sl":178},{"sl":182},{"sl":200},{"sl":211}],"name":"testPipelineFactoryPlain","pass":true,"statements":[{"sl":42},{"sl":43},{"sl":44},{"sl":46},{"sl":47},{"sl":78},{"sl":89},{"sl":98},{"sl":102},{"sl":103},{"sl":105},{"sl":106},{"sl":117},{"sl":121},{"sl":122},{"sl":123},{"sl":126},{"sl":129},{"sl":130},{"sl":131},{"sl":133},{"sl":135},{"sl":138},{"sl":139},{"sl":149},{"sl":150},{"sl":151},{"sl":153},{"sl":157},{"sl":159},{"sl":161},{"sl":164},{"sl":170},{"sl":179},{"sl":185},{"sl":188},{"sl":191},{"sl":201},{"sl":202},{"sl":212}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [25], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [], [], [], [], [], [], [], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [], [], [], [], [], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [], [], [], [], [], [], [], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [], [25, 10, 34, 135, 182], [], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [25, 10, 34, 135, 182], [], [25, 10, 34, 135, 182], [], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [], [], [], [], [], [], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [25, 10, 34, 135, 182], [25, 135, 182], [], [], [25, 10, 34, 135, 182], [], [25, 10, 34, 135, 182], [], [25, 10, 34, 135, 182], [], [], [25, 10, 34, 135, 182], [], [], [], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [], [], [], [], [], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [], [25, 10, 34, 135, 182], [], [], [25, 10, 34, 135, 182], [], [], [25, 10, 34, 135, 182], [], [], [25, 10, 34, 135, 182], [], [], [], [], [], [], [], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [], [], [], [], [], [], [], [25, 10, 34, 135, 182], [25, 10, 34, 135, 182], [], [], []]
