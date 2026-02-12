
inherit dnf-bridge

PN = "qt6-qtwebchannel"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtwebchannel qt6-qtwebchannel-devel qt6-qtwebchannel-examples qt6-qtwebchannel-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/qt6-qtwebchannel-6.8.1-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_qt6-qtwebchannel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtwebchannel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtwebchannel}"
RDEPENDS:qt6-qtwebchannel = " \
 glibc \
 qt6-qtdeclarative \
 libstdc++ \
 qt6-qtbase \
"

URI_qt6-qtwebchannel-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtwebchannel-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtwebchannel-devel}"
RDEPENDS:qt6-qtwebchannel-devel = " \
 qt6-qtdeclarative-devel \
 cmake-filesystem \
 pkgconf-pkg-config \
 qt6-qtwebchannel \
 qt6-qtbase-devel \
"

URI_qt6-qtwebchannel-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtwebchannel-examples-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtwebchannel-examples}"
RDEPENDS:qt6-qtwebchannel-examples = " \
 libgcc \
 qt6-qtbase \
 qt6-qtwebchannel \
 libstdc++ \
 qt6-qtwebsockets \
 glibc \
"

URI_qt6-qtwebchannel-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtwebchannel-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtwebchannel-tests}"
RDEPENDS:qt6-qtwebchannel-tests = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 qt6-qtwebchannel \
 libstdc++ \
 glibc \
"
