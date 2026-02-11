
PN = "qt6-qtlottie"
PE = "0"
PV = "6.8.1"
PR = "1.el10"
PACKAGES = "qt6-qtlottie qt6-qtlottie-devel qt6-qtlottie-tests"


URI_qt6-qtlottie = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtlottie-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlottie = "rtld(GNU_HASH) ( ) libm.so.6()(64bit) ( ) libm.so.6(GLIBC_2.2.5)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libQt6Qml.so.6()(64bit) ( ) libQt6Qml.so.6(Qt_6)(64bit) ( ) libQt6Quick.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) libQt6Quick.so.6(Qt_6)(64bit) ( ) qt6-qtbase(x86-64) ( =  6.8.1)"
RPROVIDES:qt6-qtlottie = "libQt6Bodymovin.so.6()(64bit) ( ) libQt6Bodymovin.so.6(NonQt)(64bit) ( ) libQt6Bodymovin.so.6(Qt_6)(64bit) ( ) libQt6Bodymovin.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) liblottieqtplugin.so()(64bit) ( ) liblottieqtplugin.so(NonQt)(64bit) ( ) liblottieqtplugin.so(Qt_6)(64bit) ( ) liblottieqtplugin.so(Qt_6.8_PRIVATE_API)(64bit) ( ) qt6qml(Qt.labs.lottieqt) ( ) qt6-qtlottie(x86-64) ( =  6.8.1-1.el10) qt6-qtlottie ( =  6.8.1-1.el10)"

URI_qt6-qtlottie-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtlottie-devel-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlottie-devel = "cmake-filesystem(x86-64) ( ) qt6-qtbase-devel(x86-64) ( ) libQt6Bodymovin.so.6()(64bit) ( ) qt6-qtlottie(x86-64) ( =  6.8.1-1.el10)"
RPROVIDES:qt6-qtlottie-devel = "cmake(Qt6BodymovinPrivate) ( ) cmake(Qt6lottieqtplugin) ( ) cmake(QtLottieTests) ( ) cmake(qt6bodymovinprivate) ( ) cmake(qt6lottieqtplugin) ( ) cmake(qtlottietests) ( ) qt6-qtlottie-devel ( =  6.8.1-1.el10) qt6-qtlottie-devel(x86-64) ( =  6.8.1-1.el10)"

URI_qt6-qtlottie-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtlottie-tests-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlottie-tests = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Test.so.6()(64bit) ( ) libQt6Test.so.6(Qt_6)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libQt6QuickTest.so.6()(64bit) ( ) libQt6QuickTest.so.6(Qt_6)(64bit) ( ) libQt6Bodymovin.so.6()(64bit) ( ) libQt6Bodymovin.so.6(Qt_6)(64bit) ( ) qt6-qtlottie(x86-64) ( =  6.8.1-1.el10)"
RPROVIDES:qt6-qtlottie-tests = "qt6-qtlottie-tests ( =  6.8.1-1.el10) qt6-qtlottie-tests(x86-64) ( =  6.8.1-1.el10)"
