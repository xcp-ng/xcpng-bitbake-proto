
PN = "qt6-qtconnectivity"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtconnectivity qt6-qtconnectivity-devel qt6-qtconnectivity-examples qt6-qtconnectivity-tests"


URI_qt6-qtconnectivity = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtconnectivity-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtconnectivity = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.38)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.29)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Network.so.6()(64bit) ( ) libQt6Network.so.6(Qt_6)(64bit) ( ) libQt6DBus.so.6()(64bit) ( ) libQt6DBus.so.6(Qt_6)(64bit) ( ) libbluetooth.so.3()(64bit) ( ) qt6-qtbase(x86-64) ( =  6.8.1)"
RPROVIDES:qt6-qtconnectivity = "libQt6Bluetooth.so.6()(64bit) ( ) libQt6Nfc.so.6()(64bit) ( ) libQt6Bluetooth.so.6(Qt_6)(64bit) ( ) libQt6Nfc.so.6(Qt_6)(64bit) ( ) libQt6Bluetooth.so.6(NonQt)(64bit) ( ) libQt6Bluetooth.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) libQt6Nfc.so.6(NonQt)(64bit) ( ) libQt6Nfc.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) qt6-qtconnectivity(x86-64) ( =  6.8.1-2.el10) qt6-qtconnectivity ( =  6.8.1-2.el10)"

URI_qt6-qtconnectivity-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtconnectivity-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtconnectivity-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) qt6-qtbase-devel(x86-64) ( ) pkgconfig(Qt6Core) ( ) pkgconfig(Qt6Network) ( ) libQt6Bluetooth.so.6()(64bit) ( ) libQt6Nfc.so.6()(64bit) ( ) pkgconfig(Qt6DBus) ( ) qt6-qtconnectivity(x86-64) ( =  6.8.1-2.el10)"
RPROVIDES:qt6-qtconnectivity-devel = "cmake(Qt6Bluetooth) ( ) cmake(Qt6Nfc) ( ) cmake(QtConnectivityTests) ( ) cmake(qt6bluetooth) ( ) cmake(qt6nfc) ( ) cmake(qtconnectivitytests) ( ) pkgconfig(Qt6Bluetooth) ( =  6.8.1) pkgconfig(Qt6Nfc) ( =  6.8.1) qt6-qtconnectivity-devel ( =  6.8.1-2.el10) qt6-qtconnectivity-devel(x86-64) ( =  6.8.1-2.el10)"

URI_qt6-qtconnectivity-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtconnectivity-examples-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtconnectivity-examples = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libm.so.6()(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libm.so.6(GLIBC_2.38)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libQt6Widgets.so.6()(64bit) ( ) libQt6Widgets.so.6(Qt_6)(64bit) ( ) libQt6Qml.so.6()(64bit) ( ) libQt6Qml.so.6(Qt_6)(64bit) ( ) libQt6Bluetooth.so.6()(64bit) ( ) libQt6Bluetooth.so.6(Qt_6)(64bit) ( ) libQt6Nfc.so.6()(64bit) ( ) libQt6Nfc.so.6(Qt_6)(64bit) ( ) qt6-qtconnectivity(x86-64) ( =  6.8.1-2.el10)"
RPROVIDES:qt6-qtconnectivity-examples = "qt6-qtconnectivity-examples ( =  6.8.1-2.el10) qt6-qtconnectivity-examples(x86-64) ( =  6.8.1-2.el10)"

URI_qt6-qtconnectivity-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtconnectivity-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtconnectivity-tests = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Test.so.6()(64bit) ( ) libQt6Test.so.6(Qt_6)(64bit) ( ) libQt6Bluetooth.so.6()(64bit) ( ) libQt6Bluetooth.so.6(Qt_6)(64bit) ( ) libQt6Nfc.so.6()(64bit) ( ) libQt6Nfc.so.6(Qt_6)(64bit) ( ) qt6-qtconnectivity(x86-64) ( =  6.8.1-2.el10)"
RPROVIDES:qt6-qtconnectivity-tests = "qt6-qtconnectivity-tests ( =  6.8.1-2.el10) qt6-qtconnectivity-tests(x86-64) ( =  6.8.1-2.el10)"
