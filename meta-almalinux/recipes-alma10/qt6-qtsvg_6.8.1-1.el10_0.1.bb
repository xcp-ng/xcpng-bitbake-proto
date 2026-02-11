
inherit dnf-bridge

PN = "qt6-qtsvg"
PE = "0"
PV = "6.8.1"
PR = "1.el10_0.1"
PACKAGES = "qt6-qtsvg qt6-qtsvg-devel qt6-qtsvg-examples qt6-qtsvg-tests"


URI_qt6-qtsvg = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtsvg-6.8.1-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsvg = " \
 zlib-ng-compat \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtsvg-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtsvg-devel-6.8.1-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsvg-devel = " \
 qt6-qtsvg \
 cmake-filesystem \
 qt6-qtsvg-devel \
 pkgconf-pkg-config \
 qt6-qtbase-devel \
"

URI_qt6-qtsvg-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtsvg-examples-6.8.1-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsvg-examples = " \
 qt6-qtsvg \
"

URI_qt6-qtsvg-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtsvg-tests-6.8.1-1.el10_0.1.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtsvg-tests = " \
 qt6-qtsvg \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"
