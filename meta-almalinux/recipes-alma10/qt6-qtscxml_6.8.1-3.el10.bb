
inherit dnf-bridge

PN = "qt6-qtscxml"
PE = "0"
PV = "6.8.1"
PR = "3.el10"
PACKAGES = "qt6-qtscxml qt6-qtscxml-devel qt6-qtscxml-examples qt6-qtscxml-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/qt6-qtscxml-6.8.1-3.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_qt6-qtscxml = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtscxml-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtscxml}"
RDEPENDS:qt6-qtscxml = " \
 qt6-qtdeclarative \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtscxml-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtscxml-devel-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtscxml-devel}"
RDEPENDS:qt6-qtscxml-devel = " \
 qt6-qtdeclarative-devel \
 cmake-filesystem \
 pkgconf-pkg-config \
 qt6-qtbase-devel \
 qt6-qtscxml \
 qt6-qtscxml-devel \
"

URI_qt6-qtscxml-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtscxml-examples-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtscxml-examples}"
RDEPENDS:qt6-qtscxml-examples = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 qt6-qtscxml \
 glibc \
"

URI_qt6-qtscxml-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtscxml-tests-6.8.1-3.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtscxml-tests}"
RDEPENDS:qt6-qtscxml-tests = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 qt6-qtscxml \
 glibc \
"
