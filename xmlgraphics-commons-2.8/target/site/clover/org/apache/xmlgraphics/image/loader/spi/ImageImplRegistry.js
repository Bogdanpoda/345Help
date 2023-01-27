var clover = new Object();

// JSON: {classes : [{name, id, sl, el,  methods : [{sl, el}, ...]}, ...]}
clover.pageData = {"classes":[{"el":428,"id":12398,"methods":[{"el":83,"sc":5,"sl":79},{"el":90,"sc":5,"sl":88},{"el":98,"sc":5,"sl":96},{"el":121,"sc":5,"sl":103},{"el":133,"sc":5,"sl":127},{"el":140,"sc":5,"sl":135},{"el":172,"sc":17,"sl":156},{"el":177,"sc":5,"sl":152},{"el":216,"sc":5,"sl":183},{"el":224,"sc":5,"sl":222},{"el":233,"sc":5,"sl":231},{"el":245,"sc":5,"sl":239},{"el":258,"sc":5,"sl":251},{"el":313,"sc":5,"sl":288},{"el":349,"sc":5,"sl":322},{"el":399,"sc":5,"sl":384},{"el":415,"sc":5,"sl":408},{"el":426,"sc":5,"sl":423}],"name":"ImageImplRegistry","sl":44},{"el":150,"id":12434,"methods":[{"el":149,"sc":9,"sl":147}],"name":"ImageImplRegistry.PreloaderHolder","sl":143},{"el":279,"id":12504,"methods":[{"el":264,"sc":9,"sl":262},{"el":273,"sc":9,"sl":266},{"el":277,"sc":9,"sl":275}],"name":"ImageImplRegistry.MyIterator","sl":260},{"el":375,"id":12574,"methods":[{"el":358,"sc":9,"sl":356},{"el":373,"sc":9,"sl":360}],"name":"ImageImplRegistry.ImageLoaderFactoryComparator","sl":352}]}

// JSON: {test_ID : {"methods": [ID1, ID2, ID3...], "name" : "testXXX() void"}, ...};
clover.testTargets = {"test_10":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":222},{"sl":231},{"sl":239},{"sl":322},{"sl":356},{"sl":360},{"sl":384},{"sl":408},{"sl":423}],"name":"testPipelineFactoryAdditionalPenalty","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":223},{"sl":232},{"sl":240},{"sl":241},{"sl":242},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":332},{"sl":333},{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":344},{"sl":345},{"sl":347},{"sl":357},{"sl":361},{"sl":362},{"sl":363},{"sl":364},{"sl":366},{"sl":367},{"sl":369},{"sl":372},{"sl":385},{"sl":386},{"sl":387},{"sl":388},{"sl":389},{"sl":390},{"sl":392},{"sl":393},{"sl":394},{"sl":409},{"sl":410},{"sl":414},{"sl":424},{"sl":425}]},"test_101":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testEPSAscii","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_105":{"methods":[{"sl":152},{"sl":231},{"sl":251},{"sl":262},{"sl":266},{"sl":322},{"sl":356},{"sl":360},{"sl":423}],"name":"testEPSBinary","pass":true,"statements":[{"sl":153},{"sl":232},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":332},{"sl":333},{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":344},{"sl":347},{"sl":357},{"sl":361},{"sl":362},{"sl":363},{"sl":364},{"sl":366},{"sl":367},{"sl":369},{"sl":372},{"sl":424},{"sl":425}]},"test_107":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":239}],"name":"testColorTypeTwoPNG","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":240},{"sl":241},{"sl":242}]},"test_111":{"methods":[{"sl":96},{"sl":384}],"name":"testICCProfiles","pass":true,"statements":[{"sl":97},{"sl":385},{"sl":386},{"sl":387},{"sl":388},{"sl":389},{"sl":390},{"sl":392},{"sl":393},{"sl":394}]},"test_112":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testJPEG2","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_113":{"methods":[{"sl":152},{"sl":231},{"sl":251},{"sl":262},{"sl":266},{"sl":322},{"sl":356},{"sl":360},{"sl":423}],"name":"testBrokenIccPng","pass":true,"statements":[{"sl":153},{"sl":232},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":332},{"sl":333},{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":344},{"sl":347},{"sl":357},{"sl":361},{"sl":362},{"sl":363},{"sl":364},{"sl":366},{"sl":367},{"sl":369},{"sl":372},{"sl":424},{"sl":425}]},"test_12":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testTIFF","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_121":{"methods":[{"sl":152},{"sl":231},{"sl":251},{"sl":262},{"sl":266},{"sl":322},{"sl":356},{"sl":360},{"sl":423}],"name":"testEPSASCII","pass":true,"statements":[{"sl":153},{"sl":232},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":332},{"sl":333},{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":344},{"sl":347},{"sl":357},{"sl":361},{"sl":362},{"sl":363},{"sl":364},{"sl":366},{"sl":367},{"sl":369},{"sl":372},{"sl":424},{"sl":425}]},"test_126":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testEMF","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_128":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testJPEG3","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_135":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":222},{"sl":231},{"sl":239},{"sl":322},{"sl":356},{"sl":360},{"sl":384},{"sl":423}],"name":"testPipelineFactoryImageInfoDependency","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":223},{"sl":232},{"sl":240},{"sl":241},{"sl":242},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":332},{"sl":333},{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":344},{"sl":345},{"sl":347},{"sl":357},{"sl":361},{"sl":362},{"sl":363},{"sl":364},{"sl":366},{"sl":367},{"sl":369},{"sl":372},{"sl":385},{"sl":386},{"sl":387},{"sl":388},{"sl":389},{"sl":390},{"sl":392},{"sl":393},{"sl":394},{"sl":424},{"sl":425}]},"test_14":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":239}],"name":"testLoadImageImageInfoMapImageSessionContext","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":240},{"sl":241},{"sl":242}]},"test_142":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testBMP","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_146":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testPipelineWithLoader","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_153":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":239}],"name":"testLoadImageBadMime","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":240},{"sl":241},{"sl":242}]},"test_156":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testEPSBinary","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_159":{"methods":[{"sl":152},{"sl":231},{"sl":251},{"sl":262},{"sl":266},{"sl":322},{"sl":356},{"sl":360},{"sl":423}],"name":"testGIF","pass":true,"statements":[{"sl":153},{"sl":232},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":332},{"sl":333},{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":344},{"sl":347},{"sl":357},{"sl":361},{"sl":362},{"sl":363},{"sl":364},{"sl":366},{"sl":367},{"sl":369},{"sl":372},{"sl":424},{"sl":425}]},"test_164":{"methods":[{"sl":288}],"name":"testImageLoaderFactory","pass":true,"statements":[{"sl":289},{"sl":290},{"sl":291},{"sl":292},{"sl":293},{"sl":294},{"sl":295},{"sl":296},{"sl":297},{"sl":298},{"sl":299},{"sl":302},{"sl":303},{"sl":304},{"sl":305},{"sl":306},{"sl":309}]},"test_165":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testBMPNoResolution","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_173":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testPNG","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_177":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":239}],"name":"testColorTypeSixPNG","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":240},{"sl":241},{"sl":242}]},"test_182":{"methods":[{"sl":231},{"sl":423}],"name":"testPipelineWithoutURIThroughManager","pass":true,"statements":[{"sl":232},{"sl":424},{"sl":425}]},"test_183":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":239}],"name":"testTransparentPNG","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":240},{"sl":241},{"sl":242}]},"test_2":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testGIF","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_23":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":239}],"name":"testColorTypeFourPNG","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":240},{"sl":241},{"sl":242}]},"test_25":{"methods":[{"sl":152},{"sl":231},{"sl":251},{"sl":262},{"sl":266},{"sl":322},{"sl":356},{"sl":384},{"sl":423}],"name":"testPipelineFromURIThroughManager","pass":true,"statements":[{"sl":153},{"sl":232},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":332},{"sl":333},{"sl":334},{"sl":335},{"sl":336},{"sl":344},{"sl":345},{"sl":357},{"sl":385},{"sl":386},{"sl":387},{"sl":388},{"sl":389},{"sl":390},{"sl":392},{"sl":393},{"sl":394},{"sl":424},{"sl":425}]},"test_26":{"methods":[{"sl":152},{"sl":156},{"sl":251},{"sl":262},{"sl":266},{"sl":423}],"name":"testImageInfoCache","pass":true,"statements":[{"sl":153},{"sl":154},{"sl":157},{"sl":158},{"sl":159},{"sl":161},{"sl":162},{"sl":163},{"sl":165},{"sl":166},{"sl":167},{"sl":169},{"sl":170},{"sl":175},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269},{"sl":424},{"sl":425}]},"test_28":{"methods":[{"sl":152},{"sl":231},{"sl":251},{"sl":262},{"sl":266},{"sl":322},{"sl":356},{"sl":360},{"sl":423}],"name":"testPNG","pass":true,"statements":[{"sl":153},{"sl":232},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":332},{"sl":333},{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":344},{"sl":347},{"sl":357},{"sl":361},{"sl":362},{"sl":363},{"sl":364},{"sl":366},{"sl":367},{"sl":369},{"sl":372},{"sl":424},{"sl":425}]},"test_29":{"methods":[{"sl":152},{"sl":222},{"sl":231},{"sl":251},{"sl":262},{"sl":266},{"sl":322},{"sl":356},{"sl":360},{"sl":423}],"name":"testImageCache1","pass":true,"statements":[{"sl":153},{"sl":223},{"sl":232},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":332},{"sl":333},{"sl":334},{"sl":335},{"sl":336},{"sl":337},{"sl":344},{"sl":347},{"sl":357},{"sl":361},{"sl":362},{"sl":363},{"sl":364},{"sl":366},{"sl":367},{"sl":369},{"sl":372},{"sl":424},{"sl":425}]},"test_34":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":222},{"sl":231},{"sl":239},{"sl":322},{"sl":356},{"sl":384},{"sl":423}],"name":"testPipelineFactoryPlain","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":223},{"sl":232},{"sl":240},{"sl":241},{"sl":242},{"sl":323},{"sl":324},{"sl":325},{"sl":326},{"sl":327},{"sl":328},{"sl":329},{"sl":330},{"sl":331},{"sl":344},{"sl":345},{"sl":357},{"sl":385},{"sl":386},{"sl":387},{"sl":388},{"sl":389},{"sl":390},{"sl":392},{"sl":393},{"sl":394},{"sl":424},{"sl":425}]},"test_38":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testSAXSourceWithSystemID","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_43":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testSAXSourceWithInputStream","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_44":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testJPEG1","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_47":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":239}],"name":"testColorTypeZeroPNG","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":240},{"sl":241},{"sl":242}]},"test_48":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":239}],"name":"testPreloaderRawPNG","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":240},{"sl":241},{"sl":242}]},"test_5":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testTIFFNoResolution","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_55":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":239}],"name":"testColorTypeThreePNG","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":240},{"sl":241},{"sl":242}]},"test_85":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":239}],"name":"testCorruptPNG","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":240},{"sl":241},{"sl":242}]},"test_93":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":239}],"name":"testLoadImage","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":240},{"sl":241},{"sl":242}]},"test_94":{"methods":[{"sl":152},{"sl":251},{"sl":262},{"sl":266}],"name":"testPNGNoResolution","pass":true,"statements":[{"sl":153},{"sl":252},{"sl":253},{"sl":255},{"sl":256},{"sl":257},{"sl":263},{"sl":267},{"sl":268},{"sl":269}]},"test_96":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":239}],"name":"testGrayPNGWithCMYKProfile","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":240},{"sl":241},{"sl":242}]},"test_97":{"methods":[{"sl":79},{"sl":127},{"sl":135},{"sl":183},{"sl":239}],"name":"testLoadImageGoodMime","pass":true,"statements":[{"sl":80},{"sl":128},{"sl":132},{"sl":136},{"sl":137},{"sl":138},{"sl":139},{"sl":184},{"sl":191},{"sl":192},{"sl":193},{"sl":194},{"sl":195},{"sl":196},{"sl":197},{"sl":200},{"sl":201},{"sl":202},{"sl":203},{"sl":204},{"sl":205},{"sl":207},{"sl":209},{"sl":240},{"sl":241},{"sl":242}]}}

// JSON: { lines : [{tests : [testid1, testid2, testid3, ...]}, ...]};
clover.srcFileLines = [[], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [111], [111], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [], [], [], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [], [], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [], [], [], [], [], [], [], [], [], [], [], [], [44, 142, 26, 112, 5, 165, 159, 12, 173, 43, 126, 105, 121, 28, 38, 25, 113, 146, 29, 128, 2, 94, 101, 156], [44, 142, 26, 112, 5, 165, 159, 12, 173, 43, 126, 105, 121, 28, 38, 25, 113, 146, 29, 128, 2, 94, 101, 156], [26], [], [26], [26], [26], [26], [], [26], [26], [26], [], [26], [26], [26], [], [26], [26], [], [], [], [], [26], [], [], [], [], [], [], [], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [], [], [], [], [], [], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [], [], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [], [], [], [], [], [], [], [], [], [], [], [], [34, 135, 10, 29], [34, 135, 10, 29], [], [], [], [], [], [], [], [159, 34, 135, 105, 121, 28, 25, 113, 10, 29, 182], [159, 34, 135, 105, 121, 28, 25, 113, 10, 29, 182], [], [], [], [], [], [], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [55, 153, 96, 85, 47, 34, 93, 135, 23, 97, 177, 48, 14, 107, 10, 183], [], [], [], [], [], [], [], [], [44, 142, 26, 112, 5, 165, 159, 12, 173, 43, 126, 105, 121, 28, 38, 25, 113, 146, 29, 128, 2, 94, 101, 156], [44, 142, 26, 112, 5, 165, 159, 12, 173, 43, 126, 105, 121, 28, 38, 25, 113, 146, 29, 128, 2, 94, 101, 156], [44, 142, 26, 112, 5, 165, 159, 12, 173, 43, 126, 105, 121, 28, 38, 25, 113, 146, 29, 128, 2, 94, 101, 156], [], [44, 142, 26, 112, 5, 165, 159, 12, 173, 43, 126, 105, 121, 28, 38, 25, 113, 146, 29, 128, 2, 94, 101, 156], [44, 142, 26, 112, 5, 165, 159, 12, 173, 43, 126, 105, 121, 28, 38, 25, 113, 146, 29, 128, 2, 94, 101, 156], [44, 142, 26, 112, 5, 165, 159, 12, 173, 43, 126, 105, 121, 28, 38, 25, 113, 146, 29, 128, 2, 94, 101, 156], [], [], [], [], [44, 142, 26, 112, 5, 165, 159, 12, 173, 43, 126, 105, 121, 28, 38, 25, 113, 146, 29, 128, 2, 94, 101, 156], [44, 142, 26, 112, 5, 165, 159, 12, 173, 43, 126, 105, 121, 28, 38, 25, 113, 146, 29, 128, 2, 94, 101, 156], [], [], [44, 142, 26, 112, 5, 165, 159, 12, 173, 43, 126, 105, 121, 28, 38, 25, 113, 146, 29, 128, 2, 94, 101, 156], [44, 142, 26, 112, 5, 165, 159, 12, 173, 43, 126, 105, 121, 28, 38, 25, 113, 146, 29, 128, 2, 94, 101, 156], [44, 142, 26, 112, 5, 165, 159, 12, 173, 43, 126, 105, 121, 28, 38, 25, 113, 146, 29, 128, 2, 94, 101, 156], [44, 142, 26, 112, 5, 165, 159, 12, 173, 43, 126, 105, 121, 28, 38, 25, 113, 146, 29, 128, 2, 94, 101, 156], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [], [164], [164], [164], [164], [164], [164], [164], [164], [164], [164], [164], [164], [], [], [164], [164], [164], [164], [164], [], [], [164], [], [], [], [], [], [], [], [], [], [], [], [], [159, 34, 135, 105, 121, 28, 25, 113, 10, 29], [159, 34, 135, 105, 121, 28, 25, 113, 10, 29], [159, 34, 135, 105, 121, 28, 25, 113, 10, 29], [159, 34, 135, 105, 121, 28, 25, 113, 10, 29], [159, 34, 135, 105, 121, 28, 25, 113, 10, 29], [159, 34, 135, 105, 121, 28, 25, 113, 10, 29], [159, 34, 135, 105, 121, 28, 25, 113, 10, 29], [159, 34, 135, 105, 121, 28, 25, 113, 10, 29], [159, 34, 135, 105, 121, 28, 25, 113, 10, 29], [159, 34, 135, 105, 121, 28, 25, 113, 10, 29], [159, 135, 105, 121, 28, 25, 113, 10, 29], [159, 135, 105, 121, 28, 25, 113, 10, 29], [159, 135, 105, 121, 28, 25, 113, 10, 29], [159, 135, 105, 121, 28, 25, 113, 10, 29], [159, 135, 105, 121, 28, 25, 113, 10, 29], [159, 135, 105, 121, 28, 113, 10, 29], [], [], [], [], [], [], [159, 34, 135, 105, 121, 28, 25, 113, 10, 29], [34, 135, 25, 10], [], [159, 135, 105, 121, 28, 113, 10, 29], [], [], [], [], [], [], [], [], [159, 34, 135, 105, 121, 28, 25, 113, 10, 29], [159, 34, 135, 105, 121, 28, 25, 113, 10, 29], [], [], [159, 135, 105, 121, 28, 113, 10, 29], [159, 135, 105, 121, 28, 113, 10, 29], [159, 135, 105, 121, 28, 113, 10, 29], [159, 135, 105, 121, 28, 113, 10, 29], [159, 135, 105, 121, 28, 113, 10, 29], [], [159, 135, 105, 121, 28, 113, 10, 29], [159, 135, 105, 121, 28, 113, 10, 29], [], [159, 135, 105, 121, 28, 113, 10, 29], [], [], [159, 135, 105, 121, 28, 113, 10, 29], [], [], [], [], [], [], [], [], [], [], [], [111, 34, 135, 25, 10], [111, 34, 135, 25, 10], [111, 34, 135, 25, 10], [111, 34, 135, 25, 10], [111, 34, 135, 25, 10], [111, 34, 135, 25, 10], [111, 34, 135, 25, 10], [], [111, 34, 135, 25, 10], [111, 34, 135, 25, 10], [111, 34, 135, 25, 10], [], [], [], [], [], [], [], [], [], [], [], [], [], [10], [10], [10], [], [], [], [10], [], [], [], [], [], [], [], [], [26, 159, 34, 135, 105, 121, 28, 25, 113, 10, 29, 182], [26, 159, 34, 135, 105, 121, 28, 25, 113, 10, 29, 182], [26, 159, 34, 135, 105, 121, 28, 25, 113, 10, 29, 182], [], [], []]
