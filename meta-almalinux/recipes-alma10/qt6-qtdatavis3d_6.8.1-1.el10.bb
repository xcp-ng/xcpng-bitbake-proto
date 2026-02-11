
inherit dnf-bridge

PN = "qt6-qtdatavis3d"
PE = "0"
PV = "6.8.1"
PR = "1.el10"
PACKAGES = "qt6-qtdatavis3d qt6-qtdatavis3d-devel qt6-qtdatavis3d-examples qt6-qtdatavis3d-tests"


URI_qt6-qtdatavis3d = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtdatavis3d-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtdatavis3d = " \
 qt6-qtdeclarative \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtdatavis3d-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtdatavis3d-devel-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtdatavis3d-devel = " \
 qt6-qtdeclarative-devel \
 cmake-filesystem \
 pkgconf-pkg-config \
 qt6-qtbase-devel \
 qt6-qtdatavis3d \
"

URI_qt6-qtdatavis3d-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtdatavis3d-examples-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtdatavis3d-examples = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 qt6-qtdatavis3d \
"

URI_qt6-qtdatavis3d-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtdatavis3d-tests-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtdatavis3d-tests = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 qt6-qtdatavis3d \
"
