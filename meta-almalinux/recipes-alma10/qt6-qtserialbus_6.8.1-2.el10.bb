
PN = "qt6-qtserialbus"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtserialbus qt6-qtserialbus-devel qt6-qtserialbus-examples qt6-qtserialbus-tests"


URI_qt6-qtserialbus = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtserialbus-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtserialbus = "
 glibc
 libstdc++
 qt6-qtserialport
 qt6-qtbase
"

URI_qt6-qtserialbus-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtserialbus-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtserialbus-devel = "
 cmake-filesystem
 pkgconf-pkg-config
 qt6-qtbase-devel
 qt6-qtserialbus
 qt6-qtserialport-devel
"

URI_qt6-qtserialbus-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtserialbus-examples-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtserialbus-examples = "
 libgcc
 qt6-qtbase
 libstdc++
 qt6-qtbase-gui
 glibc
 qt6-qtserialbus
 qt6-qtserialport
"

URI_qt6-qtserialbus-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtserialbus-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtserialbus-tests = "
 libgcc
 qt6-qtbase
 libstdc++
 glibc
 qt6-qtserialbus
"
