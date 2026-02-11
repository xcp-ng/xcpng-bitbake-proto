
PN = "qt6-qtlocation"
PE = "0"
PV = "6.8.1"
PR = "1.el10"
PACKAGES = "qt6-qtlocation qt6-qtlocation-devel qt6-qtlocation-examples qt6-qtlocation-tests"


URI_qt6-qtlocation = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtlocation-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlocation = " \
 qt6-qtdeclarative \
 qt6-qtbase \
 qt6-qtpositioning \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtlocation-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtlocation-devel-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlocation-devel = " \
 qt6-qtdeclarative-devel \
 cmake-filesystem \
 qt6-qtlocation \
 pkgconf-pkg-config \
 qt6-qtpositioning-devel \
 qt6-qtbase-devel \
"

URI_qt6-qtlocation-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtlocation-examples-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlocation-examples = " \
 qt6-qtdeclarative \
 qt6-qtlocation \
 libgcc \
 qt6-qtbase \
 qt6-qtpositioning \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtlocation-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtlocation-tests-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
RDEPENDS:qt6-qtlocation-tests = " \
 qt6-qtdeclarative \
 qt6-qtlocation \
 libgcc \
 qt6-qtbase \
 qt6-qtpositioning \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"
