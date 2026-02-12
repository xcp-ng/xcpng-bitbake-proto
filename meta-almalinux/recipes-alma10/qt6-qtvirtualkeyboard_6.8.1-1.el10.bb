
inherit dnf-bridge

PN = "qt6-qtvirtualkeyboard"
PE = "0"
PV = "6.8.1"
PR = "1.el10"
PACKAGES = "qt6-qtvirtualkeyboard qt6-qtvirtualkeyboard-devel qt6-qtvirtualkeyboard-examples qt6-qtvirtualkeyboard-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/qt6-qtvirtualkeyboard-6.8.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_qt6-qtvirtualkeyboard = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtvirtualkeyboard-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtvirtualkeyboard}"
RDEPENDS:qt6-qtvirtualkeyboard = " \
 qt6-qtdeclarative \
 qt6-qtsvg \
 qt6-qtbase \
 hunspell \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtvirtualkeyboard-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtvirtualkeyboard-devel-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtvirtualkeyboard-devel}"
RDEPENDS:qt6-qtvirtualkeyboard-devel = " \
 qt6-qtdeclarative-devel \
 cmake-filesystem \
 pkgconf-pkg-config \
 qt6-qtvirtualkeyboard \
 qt6-qtvirtualkeyboard-devel \
 qt6-qtbase-devel \
"

URI_qt6-qtvirtualkeyboard-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtvirtualkeyboard-examples-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtvirtualkeyboard-examples}"
RDEPENDS:qt6-qtvirtualkeyboard-examples = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 qt6-qtvirtualkeyboard \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtvirtualkeyboard-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtvirtualkeyboard-tests-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtvirtualkeyboard-tests}"
RDEPENDS:qt6-qtvirtualkeyboard-tests = " \
 python3 \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 qt6-qtvirtualkeyboard \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"
