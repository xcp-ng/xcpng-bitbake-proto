
inherit dnf-bridge

PN = "qt6-qtcharts"
PE = "0"
PV = "6.8.1"
PR = "2.el10"
PACKAGES = "qt6-qtcharts qt6-qtcharts-devel qt6-qtcharts-examples qt6-qtcharts-tests"


URI_src = "https://vault.almalinux.org/10.0/AppStream/Source/Packages/qt6-qtcharts-6.8.1-2.el10.src.rpm;unpack=0"
SRC_URI += "${URI_src}"

URI_qt6-qtcharts = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtcharts-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtcharts}"
RDEPENDS:qt6-qtcharts = " \
 qt6-qtdeclarative \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
"

URI_qt6-qtcharts-devel = "https://vault.almalinux.org/10.0/AppStream/x86_64_v2/os/Packages/qt6-qtcharts-devel-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtcharts-devel}"
RDEPENDS:qt6-qtcharts-devel = " \
 qt6-qtdeclarative-devel \
 cmake-filesystem \
 pkgconf-pkg-config \
 qt6-qtbase-devel \
 qt6-qtcharts \
 qt6-qtcharts-devel \
"

URI_qt6-qtcharts-examples = "https://vault.almalinux.org/10.0/CRB/x86_64_v2/os/Packages/qt6-qtcharts-examples-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtcharts-examples}"
RDEPENDS:qt6-qtcharts-examples = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 qt6-qtcharts \
"

URI_qt6-qtcharts-tests = "https://vault.almalinux.org/10.0/devel/x86_64_v2/os/Packages/qt6-qtcharts-tests-6.8.1-2.el10.x86_64_v2.rpm;unpack=0"
SRC_URI += "${URI_qt6-qtcharts-tests}"
RDEPENDS:qt6-qtcharts-tests = " \
 qt6-qtdeclarative \
 libgcc \
 qt6-qtbase \
 libstdc++ \
 qt6-qtbase-gui \
 glibc \
 qt6-qtcharts \
"
