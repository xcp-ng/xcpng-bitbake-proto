
PN = "qt6-qtnetworkauth"
PE = "0"
PV = "6.8.1"
PR = "1.el10"
PACKAGES = "qt6-qtnetworkauth qt6-qtnetworkauth-devel qt6-qtnetworkauth-examples qt6-qtnetworkauth-tests"


URI_qt6-qtnetworkauth = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtnetworkauth-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtnetworkauth = "rtld(GNU_HASH) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) libQt6Network.so.6()(64bit) ( ) libQt6Network.so.6(Qt_6)(64bit) ( ) qt6-qtbase(x86-64) ( =  6.8.1)"
RPROVIDES:qt6-qtnetworkauth = "libQt6NetworkAuth.so.6()(64bit) ( ) libQt6NetworkAuth.so.6(NonQt)(64bit) ( ) libQt6NetworkAuth.so.6(Qt_6)(64bit) ( ) libQt6NetworkAuth.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) qt6-qtnetworkauth(x86-64) ( =  6.8.1-1.el10) qt6-qtnetworkauth ( =  6.8.1-1.el10)"

URI_qt6-qtnetworkauth-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtnetworkauth-devel-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtnetworkauth-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) qt6-qtbase-devel(x86-64) ( ) pkgconfig(Qt6Core) ( ) pkgconfig(Qt6Network) ( ) libQt6NetworkAuth.so.6()(64bit) ( ) qt6-qtnetworkauth(x86-64) ( =  6.8.1-1.el10)"
RPROVIDES:qt6-qtnetworkauth-devel = "cmake(Qt6NetworkAuth) ( ) cmake(QtNetworkAuthTests) ( ) cmake(qt6networkauth) ( ) cmake(qtnetworkauthtests) ( ) pkgconfig(Qt6NetworkAuth) ( =  6.8.1) qt6-qtnetworkauth-devel ( =  6.8.1-1.el10) qt6-qtnetworkauth-devel(x86-64) ( =  6.8.1-1.el10)"

URI_qt6-qtnetworkauth-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtnetworkauth-examples-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtnetworkauth-examples = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libQt6Widgets.so.6()(64bit) ( ) libQt6Widgets.so.6(Qt_6)(64bit) ( ) libQt6Network.so.6()(64bit) ( ) libQt6Network.so.6(Qt_6)(64bit) ( ) libQt6NetworkAuth.so.6()(64bit) ( ) libQt6NetworkAuth.so.6(Qt_6)(64bit) ( ) qt6-qtnetworkauth(x86-64) ( =  6.8.1-1.el10)"
RPROVIDES:qt6-qtnetworkauth-examples = "qt6-qtnetworkauth-examples ( =  6.8.1-1.el10) qt6-qtnetworkauth-examples(x86-64) ( =  6.8.1-1.el10)"

URI_qt6-qtnetworkauth-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtnetworkauth-tests-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtnetworkauth-tests = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Test.so.6()(64bit) ( ) libQt6Test.so.6(Qt_6)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.15)(64bit) ( ) libQt6Network.so.6()(64bit) ( ) libQt6Network.so.6(Qt_6)(64bit) ( ) libQt6NetworkAuth.so.6()(64bit) ( ) libQt6NetworkAuth.so.6(Qt_6)(64bit) ( ) qt6-qtnetworkauth(x86-64) ( =  6.8.1-1.el10)"
RPROVIDES:qt6-qtnetworkauth-tests = "qt6-qtnetworkauth-tests ( =  6.8.1-1.el10) qt6-qtnetworkauth-tests(x86-64) ( =  6.8.1-1.el10)"
