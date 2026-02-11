
PN = "qt6-qtlanguageserver"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtlanguageserver qt6-qtlanguageserver-devel qt6-qtlanguageserver-tests"


URI_qt6-qtlanguageserver = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtlanguageserver-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlanguageserver = "qt6-qtbase(x86-64) ( =  6.8.1)"
RPROVIDES:qt6-qtlanguageserver = "qt6-qtlanguageserver(x86-64) ( =  6.8.1-2.el10) qt6-qtlanguageserver ( =  6.8.1-2.el10)"

URI_qt6-qtlanguageserver-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtlanguageserver-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlanguageserver-devel = "cmake-filesystem(x86-64) ( ) qt6-qtbase-devel(x86-64) ( ) qt6-qtlanguageserver(x86-64) ( =  6.8.1-2.el10)"
RPROVIDES:qt6-qtlanguageserver-devel = "cmake(Qt6JsonRpcPrivate) ( ) cmake(Qt6LanguageServerPrivate) ( ) cmake(QtLanguageServerTests) ( ) cmake(qt6jsonrpcprivate) ( ) cmake(qt6languageserverprivate) ( ) cmake(qtlanguageservertests) ( ) qt6-qtlanguageserver-devel ( =  6.8.1-2.el10) qt6-qtlanguageserver-devel(x86-64) ( =  6.8.1-2.el10)"

URI_qt6-qtlanguageserver-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtlanguageserver-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlanguageserver-tests = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.32)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.18)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.5)(64bit) ( ) libQt6Test.so.6()(64bit) ( ) libQt6Test.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) qt6-qtlanguageserver(x86-64) ( =  6.8.1-2.el10)"
RPROVIDES:qt6-qtlanguageserver-tests = "qt6-qtlanguageserver-tests ( =  6.8.1-2.el10) qt6-qtlanguageserver-tests(x86-64) ( =  6.8.1-2.el10)"
