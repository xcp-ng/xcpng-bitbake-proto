
inherit dnf-bridge

PN = "qt6-qtquicktimeline"
PE = "0"
PV = "6.8.1"
PR = "1.el10"
PACKAGES = "qt6-qtquicktimeline qt6-qtquicktimeline-devel qt6-qtquicktimeline-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/qt6-qtquicktimeline-6.8.1-1.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_qt6-qtquicktimeline = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtquicktimeline-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtquicktimeline}"
RDEPENDS:qt6-qtquicktimeline = " \
 qt6-qtdeclarative \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtquicktimeline-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtquicktimeline-devel-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtquicktimeline-devel}"
RDEPENDS:qt6-qtquicktimeline-devel = " \
 qt6-qtdeclarative-devel \
 cmake-filesystem \
 pkgconf-pkg-config \
 qt6-qtbase-devel \
 qt6-qtquicktimeline \
 qt6-qtquicktimeline-devel \
"

URI_qt6-qtquicktimeline-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtquicktimeline-tests-6.8.1-1.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtquicktimeline-tests}"
RDEPENDS:qt6-qtquicktimeline-tests = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 qt6-qtquicktimeline \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"
