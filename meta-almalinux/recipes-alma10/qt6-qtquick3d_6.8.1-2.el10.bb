
inherit dnf-bridge

PN = "qt6-qtquick3d"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtquick3d qt6-qtquick3d-devel qt6-qtquick3d-examples qt6-qtquick3d-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/qt6-qtquick3d-6.8.1-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_qt6-qtquick3d = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtquick3d-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtquick3d}"
RDEPENDS:qt6-qtquick3d = " \
 qt6-qtdeclarative \
 zlib-ng-compat \
 libgcc \
 qt6-qtbase \
 qt6-qtquicktimeline \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 qt6-qtshadertools \
"

URI_qt6-qtquick3d-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtquick3d-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtquick3d-devel}"
RDEPENDS:qt6-qtquick3d-devel = " \
 qt6-qtdeclarative \
 qt6-qtdeclarative-devel \
 cmake-filesystem \
 pkgconf-pkg-config \
 qt6-qtbase \
 qt6-qtquick3d \
 qt6-qtquick3d-devel \
 qt6-qtbase-devel \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 qt6-qtshadertools \
 qt6-qtshadertools-devel \
"

URI_qt6-qtquick3d-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtquick3d-examples-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtquick3d-examples}"
RDEPENDS:qt6-qtquick3d-examples = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 libgomp \
 qt6-qtquick3d \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtquick3d-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtquick3d-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtquick3d-tests}"
RDEPENDS:qt6-qtquick3d-tests = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 qt6-qtquick3d \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 qt6-qtshadertools \
"
