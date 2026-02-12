
inherit dnf-bridge

PN = "qt6-qtnetworkauth"
PE = "0"
PV = "6.8.1"
PR = "1.el10"
PACKAGES = "qt6-qtnetworkauth qt6-qtnetworkauth-devel qt6-qtnetworkauth-examples qt6-qtnetworkauth-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/qt6-qtnetworkauth-6.8.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_qt6-qtnetworkauth = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtnetworkauth-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtnetworkauth}"
RDEPENDS:qt6-qtnetworkauth = " \
 glibc \
 libstdc++ \
 qt6-qtbase-gui \
 qt6-qtbase \
"

URI_qt6-qtnetworkauth-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtnetworkauth-devel-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtnetworkauth-devel}"
RDEPENDS:qt6-qtnetworkauth-devel = " \
 qt6-qtnetworkauth \
 qt6-qtbase-devel \
 cmake-filesystem \
 pkgconf-pkg-config \
"

URI_qt6-qtnetworkauth-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtnetworkauth-examples-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtnetworkauth-examples}"
RDEPENDS:qt6-qtnetworkauth-examples = " \
 libgcc \
 qt6-qtnetworkauth \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtnetworkauth-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtnetworkauth-tests-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtnetworkauth-tests}"
RDEPENDS:qt6-qtnetworkauth-tests = " \
 libgcc \
 qt6-qtnetworkauth \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"
