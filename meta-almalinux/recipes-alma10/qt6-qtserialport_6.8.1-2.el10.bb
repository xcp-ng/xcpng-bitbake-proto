
PN = "qt6-qtserialport"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtserialport qt6-qtserialport-devel qt6-qtserialport-examples qt6-qtserialport-tests"


URI_qt6-qtserialport = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtserialport-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtserialport = "rtld(GNU_HASH) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.30)(64bit) ( ) libc.so.6(GLIBC_2.14)(64bit) ( ) libudev.so.1()(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libudev.so.1(LIBUDEV_183)(64bit) ( ) libQt6Core.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) qt6-qtbase(x86-64) ( =  6.8.1)"
RPROVIDES:qt6-qtserialport = "libQt6SerialPort.so.6()(64bit) ( ) libQt6SerialPort.so.6(Qt_6)(64bit) ( ) libQt6SerialPort.so.6(NonQt)(64bit) ( ) libQt6SerialPort.so.6(Qt_6.8_PRIVATE_API)(64bit) ( ) qt6-qtserialport(x86-64) ( =  6.8.1-2.el10) qt6-qtserialport ( =  6.8.1-2.el10)"

URI_qt6-qtserialport-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtserialport-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtserialport-devel = "/usr/bin/pkg-config ( ) cmake-filesystem(x86-64) ( ) qt6-qtbase-devel(x86-64) ( ) pkgconfig(Qt6Core) ( ) libQt6SerialPort.so.6()(64bit) ( ) qt6-qtserialport(x86-64) ( =  6.8.1-2.el10)"
RPROVIDES:qt6-qtserialport-devel = "cmake(Qt6SerialPort) ( ) cmake(QtSerialPortTests) ( ) cmake(qt6serialport) ( ) cmake(qtserialporttests) ( ) pkgconfig(Qt6SerialPort) ( =  6.8.1) qt6-qtserialport-devel ( =  6.8.1-2.el10) qt6-qtserialport-devel(x86-64) ( =  6.8.1-2.el10)"

URI_qt6-qtserialport-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtserialport-examples-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtserialport-examples = "rtld(GNU_HASH) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Gui.so.6()(64bit) ( ) libQt6Gui.so.6(Qt_6)(64bit) ( ) libQt6Widgets.so.6()(64bit) ( ) libQt6Widgets.so.6(Qt_6)(64bit) ( ) libQt6SerialPort.so.6()(64bit) ( ) libQt6SerialPort.so.6(Qt_6)(64bit) ( ) qt6-qtserialport(x86-64) ( =  6.8.1-2.el10)"
RPROVIDES:qt6-qtserialport-examples = "qt6-qtserialport-examples ( =  6.8.1-2.el10) qt6-qtserialport-examples(x86-64) ( =  6.8.1-2.el10)"

URI_qt6-qtserialport-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtserialport-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtserialport-tests = "rtld(GNU_HASH) ( ) libgcc_s.so.1()(64bit) ( ) libgcc_s.so.1(GCC_3.0)(64bit) ( ) libgcc_s.so.1(GCC_3.3.1)(64bit) ( ) libc.so.6(GLIBC_2.34)(64bit) ( ) libstdc++.so.6()(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4)(64bit) ( ) libstdc++.so.6(CXXABI_1.3)(64bit) ( ) libstdc++.so.6(CXXABI_1.3.9)(64bit) ( ) libstdc++.so.6(GLIBCXX_3.4.14)(64bit) ( ) libQt6Core.so.6()(64bit) ( ) libQt6Core.so.6(Qt_6)(64bit) ( ) libQt6Core.so.6(Qt_6.8)(64bit) ( ) libQt6Test.so.6()(64bit) ( ) libQt6Test.so.6(Qt_6)(64bit) ( ) libQt6SerialPort.so.6()(64bit) ( ) libQt6SerialPort.so.6(Qt_6)(64bit) ( ) qt6-qtserialport(x86-64) ( =  6.8.1-2.el10)"
RPROVIDES:qt6-qtserialport-tests = "qt6-qtserialport-tests ( =  6.8.1-2.el10) qt6-qtserialport-tests(x86-64) ( =  6.8.1-2.el10)"
