var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":43,"id":4960,"methods":[{"el":31,"sc":5,"sl":29},{"el":38,"sc":5,"sl":33},{"el":42,"sc":5,"sl":40}],"name":"ExtraSamplesType","sl":22}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_180":{"methods":[{"sl":33}],"name":"testNonIndexColorModel","pass":true,"statements":[{"sl":34},{"sl":37}]},"test_33":{"methods":[{"sl":33}],"name":"testGrayImage","pass":true,"statements":[{"sl":34},{"sl":37}]},"test_50":{"methods":[{"sl":29},{"sl":33}],"name":"testNonIndexColorModelWithNumBandsGreaterThan1","pass":true,"statements":[{"sl":30},{"sl":34},{"sl":37}]},"test_99":{"methods":[{"sl":33}],"name":"testTileWidthHeight","pass":true,"statements":[{"sl":34},{"sl":37}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [50], [50], [], [], [50, 99, 33, 180], [50, 99, 33, 180], [], [], [50, 99, 33, 180], [], [], [], [], [], []]
