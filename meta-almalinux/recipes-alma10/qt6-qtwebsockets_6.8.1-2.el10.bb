
PN = "qt6-qtwebsockets"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtwebsockets qt6-qtwebsockets-devel qt6-qtwebsockets-examples qt6-qtwebsockets-tests"


URI_qt6-qtwebsockets = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtwebsockets-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtwebsockets = "rtld(GNU_HASH) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Core.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) libQt6Network.so.6()(64bit) ( ) libQt6Network.so.6(Qt_6)(64bit) ( ) libQt6Network.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) qt6-qtbase(x86-64) ( =  6.8.1)"
RPROVIDES:qt6-qtwebsockets = "libQt6WebSockets.so.6()(64bit) ( ) libQt6WebSockets.so.6(Qt_6)(64bit) ( ) libQt6WebSockets.so.6(NonQt)(64bit) ( ) libQt6WebSockets.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) qt6-qtwebsockets(x86-64) ( =  6.8.1-2.el10) qt6-qtwebsockets ( =  6.8.1-2.el10)"

URI_qt6-qtwebsockets-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtwebsockets-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtwebsockets-devel = "rtld(GNU_HASH) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) /usr/bin/pkg-config ( ) libc.so.6(GLIBC_2.4)(64bit) ( ) cmake-filesystem(x86-64) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) qt6-qtbase-devel(x86-64) ( ) pkgconfig(Qt6Core) ( ) libQt6Network.so.6()(64bit) ( ) libQt6Qml.so.6()(64bit) ( ) libQt6Qml.so.6(Qt_6)(64bit) ( ) libQt6Network.so.6(Qt_6)(64bit) ( ) pkgconfig(Qt6Network) ( ) libQt6WebSockets.so.6()(64bit) ( ) libQt6WebSockets.so.6(Qt_6)(64bit) ( ) qt6-qtwebsockets(x86-64) ( =  6.8.1-2.el10)"
RPROVIDES:qt6-qtwebsockets-devel = "cmake(Qt6WebSockets) ( ) cmake(Qt6qmlwebsockets) ( ) cmake(QtWebSocketsTests) ( ) cmake(qt6qmlwebsockets) ( ) cmake(qt6websockets) ( ) cmake(qtwebsocketstests) ( ) qt6qml(QtWebSockets) ( ) pkgconfig(Qt6WebSockets) ( =  6.8.1) qt6-qtwebsockets-devel ( =  6.8.1-2.el10) qt6-qtwebsockets-devel(x86-64) ( =  6.8.1-2.el10)"

URI_qt6-qtwebsockets-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtwebsockets-examples-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtwebsockets-examples = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libQt6Network.so.6()(64bit) ( ) libQt6Network.so.6(Qt_6)(64bit) ( ) libQt6Quick.so.6()(64bit) ( ) libQt6Quick.so.6(Qt_6)(64bit) ( ) libQt6WebSockets.so.6()(64bit) ( ) libQt6WebSockets.so.6(Qt_6)(64bit) ( ) qt6-qtwebsockets(x86-64) ( =  6.8.1-2.el10)"
RPROVIDES:qt6-qtwebsockets-examples = "qt6-qtwebsockets-examples ( =  6.8.1-2.el10) qt6-qtwebsockets-examples(x86-64) ( =  6.8.1-2.el10)"

URI_qt6-qtwebsockets-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtwebsockets-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtwebsockets-tests = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Test.so.6()(64bit) ( ) libQt6Test.so.6(Qt_6)(64bit) ( ) libQt6QuickTest.so.6()(64bit) ( ) libQt6QuickTest.so.6(Qt_6)(64bit) ( ) libQt6Network.so.6()(64bit) ( ) libQt6Network.so.6(Qt_6)(64bit) ( ) libQt6WebSockets.so.6()(64bit) ( ) libQt6WebSockets.so.6(Qt_6)(64bit) ( ) qt6-qtwebsockets(x86-64) ( =  6.8.1-2.el10)"
RPROVIDES:qt6-qtwebsockets-tests = "qt6-qtwebsockets-tests ( =  6.8.1-2.el10) qt6-qtwebsockets-tests(x86-64) ( =  6.8.1-2.el10)"
