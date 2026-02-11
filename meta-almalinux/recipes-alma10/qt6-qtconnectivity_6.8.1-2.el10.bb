
PN = "qt6-qtconnectivity"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtconnectivity qt6-qtconnectivity-devel qt6-qtconnectivity-examples qt6-qtconnectivity-tests"


URI_qt6-qtconnectivity = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtconnectivity-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtconnectivity = "
 glibc
 bluez-libs
 libstdc++
 qt6-qtbase
"

URI_qt6-qtconnectivity-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtconnectivity-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtconnectivity-devel = "
 qt6-qtconnectivity
 qt6-qtbase-devel
 cmake-filesystem
 pkgconf-pkg-config
"

URI_qt6-qtconnectivity-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtconnectivity-examples-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtconnectivity-examples = "
 qt6-qtdeclarative
 libgcc
 qt6-qtbase
 libstdc++
 qt6-qtbase-gui
 glibc
 qt6-qtconnectivity
"

URI_qt6-qtconnectivity-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtconnectivity-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtconnectivity-tests = "
 libgcc
 qt6-qtbase
 libstdc++
 glibc
 qt6-qtconnectivity
"
